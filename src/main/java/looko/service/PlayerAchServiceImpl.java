package looko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import looko.dao.PlayerAchievementMapper;
import looko.model.PlayerAchievement;
import looko.model.PlayerAchievementExample;
import looko.model.PlayerAchievementExample.Criteria;
import looko.tool.GetNowTime;
import looko.model.PlayerAchievementKey;

@Service("playerAchService")
public class PlayerAchServiceImpl implements PlayerAchServiceI {

	PlayerAchievementMapper playerAchMapper;
	
	public PlayerAchievementMapper getPlayerAchMapper() {
		return playerAchMapper;
	}

	@Autowired
	public void setPlayerAchMapper(PlayerAchievementMapper playerAchMapper) {
		this.playerAchMapper = playerAchMapper;
	}

	@Override
	public List<PlayerAchievement> db_GetAchievements(String steamid, int appid) 
	{
		PlayerAchievementExample playerAchExample = new PlayerAchievementExample();
		Criteria criteria = playerAchExample.createCriteria();
		criteria.andSteamidEqualTo(steamid);
		criteria.andAppidEqualTo(appid);
		return playerAchMapper.selectByExample(playerAchExample);
	}

	@Override
	public List<PlayerAchievement> db_GetAchieved(String steamid, int appid) 
	{
		PlayerAchievementExample playerAchExample = new PlayerAchievementExample();
		Criteria criteria = playerAchExample.createCriteria();
		criteria.andSteamidEqualTo(steamid);
		criteria.andAppidEqualTo(appid);
		criteria.andAchievedEqualTo(1);
		return playerAchMapper.selectByExample(playerAchExample);
	}

	@Override
	public boolean db_UpdateAchievements(List<PlayerAchievement> playerAchs) 
	{
		int row = 0;
		if(null != playerAchs && playerAchs.size() > 0)
		{
			PlayerAchievementKey playerAchKey = new PlayerAchievementKey();
			for (PlayerAchievement playerAchievement : playerAchs) 
			{
				playerAchKey.setSteamid(playerAchievement.getSteamid());
				playerAchKey.setAppid(playerAchievement.getAppid());
				playerAchKey.setAchievementname(playerAchievement.getAchievementname());
				playerAchievement.setExtra1(GetNowTime.getAsString());
				if(null != playerAchMapper.selectByPrimaryKey(playerAchKey))
				{
					row += playerAchMapper.updateByPrimaryKey(playerAchievement);
				}
				else 
				{
					row += playerAchMapper.insert(playerAchievement);
				}
			}
		}
		return row > 0 ? true : false;
	}

}
