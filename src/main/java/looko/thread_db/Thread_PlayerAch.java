package looko.thread_db;

import java.util.List;

import looko.model.PlayerAchievement;
import looko.service.PlayerAchServiceI;
import looko.tool.ApplicationContextHelper;

public class Thread_PlayerAch extends Thread 
{
	private List<PlayerAchievement> playerAchs;
	private static PlayerAchServiceI playerAchService = ApplicationContextHelper.getBean(PlayerAchServiceI.class);
	
	public List<PlayerAchievement> getPlayerAchs() {
		return playerAchs;
	}
	public void setPlayerAchs(List<PlayerAchievement> playerAchs) {
		this.playerAchs = playerAchs;
	}
	
	@Override
	public void run() 
	{
		playerAchService.db_UpdateAchievements(playerAchs);
	}
	
}
