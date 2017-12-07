package looko.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import looko.api.API_Friend;
import looko.api.API_OwnedGames;
import looko.api.API_Player;
import looko.api.API_PlayerAchievement;
import looko.api.API_SteamLevel;
import looko.model.Friend;
import looko.model.OwnedGame;
import looko.model.Player;
import looko.model.PlayerAchievement;
import looko.service.FriendServiceI;
import looko.service.OwnedGameServiceI;
import looko.service.PlayerAchServiceI;
import looko.service.PlayerServiceI;

@Controller
@RequestMapping("/LoginController")
public class LoginController 
{
	private PlayerServiceI playerService;
	private FriendServiceI friendService;
	private OwnedGameServiceI oGameService;
	private PlayerAchServiceI playerAchService;
	
	public PlayerServiceI getPlayerService() {
		return playerService;
	}
	@Autowired
	public void setPlayerService(PlayerServiceI playerService) {
		this.playerService = playerService;
	}
	public FriendServiceI getFriendService() {
		return friendService;
	}
	@Autowired
	public void setFriendService(FriendServiceI friendService) {
		this.friendService = friendService;
	}
	public OwnedGameServiceI getoGameService() {
		return oGameService;
	}
	@Autowired
	public void setoGameService(OwnedGameServiceI oGameService) {
		this.oGameService = oGameService;
	}
	public PlayerAchServiceI getPlayerAchService() {
		return playerAchService;
	}
	@Autowired
	public void setPlayerAchService(PlayerAchServiceI playerAchService) {
		this.playerAchService = playerAchService;
	}
	
	@RequestMapping("/login")
	public String login (HttpServletRequest request, HttpServletResponse response)
	{
		int validateCode = validator(request);
		if(3 == validateCode)
		{
			String steamid = request.getParameter("steamid");
			String[] checkboxs = request.getParameterValues("checkbox");
			if(checkboxs != null)
				if(null != checkboxs[0])
				{
					Cookie cookie = new Cookie("steamid", steamid);
					cookie.setMaxAge(3600);
					cookie.setPath("/looksteam");
					response.addCookie(cookie);
				}
			
			Player player = playerService.db_GetPlayerById(steamid);
			if(null != player)
			{
				return "/HomeController/homePage.do";//高危地区，测试注意
			}
			else
			{
				API_Player aPlayer = new API_Player();
				API_OwnedGames aGames = new API_OwnedGames();
				API_Friend aFriend = new API_Friend();
				API_SteamLevel aLevel = new API_SteamLevel();
				API_PlayerAchievement aPlayerAch = new API_PlayerAchievement();
				
				player = aPlayer.getAsPlayer(steamid);
				List<OwnedGame> oGames = aGames.getAsOwnedGames(steamid);
				List<Friend> friends = aFriend.getAsFriends(steamid);
				List<PlayerAchievement> playerAchs = aPlayerAch.getPlayerAllAchs(steamid, oGames);
				
				request.setAttribute("player", player);
			}
			
		}
		else if(2 == validateCode)
		{
			
		}
		else if(1 == validateCode)
		{
			
		}
		else
		{
			
		}
		
		
		
		
		
		
		
		return null;
	}
	
	private int validator(HttpServletRequest request)
	{
		String steamid = request.getParameter("steamid");
		API_Player api_Player = new API_Player();
		String regex = "7656\\d{13}";
		if(null == steamid) 	//无输入
			return 0;
		else if(!steamid.matches(regex) || !api_Player.existState(steamid)) 	//用户不存在
			return 1;
		else if(!api_Player.visibilityState(steamid))		//用户资料私密
			return 2;
		else		//登录通过
			return 3;
	}
}
