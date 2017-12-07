package looko.service;

import java.util.List;

import looko.model.PlayerAchievement;

public interface PlayerAchServiceI 
{
	public List<PlayerAchievement> db_GetAchievements(String steamid, int appid);
	public List<PlayerAchievement> db_GetAchieved(String steamid, int appid);
	
	public boolean db_UpdateAchievements(List<PlayerAchievement> playerAchs);
}
