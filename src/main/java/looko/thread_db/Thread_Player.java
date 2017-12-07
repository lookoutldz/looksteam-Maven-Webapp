package looko.thread_db;

import looko.model.Player;
import looko.service.PlayerServiceI;
import looko.tool.ApplicationContextHelper;

public class Thread_Player extends Thread 
{
	private Player player;
	private static PlayerServiceI playerService = ApplicationContextHelper.getBean(PlayerServiceI.class);
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	@Override
	public void run() 
	{
		playerService.db_UpdatePlayer(player);
	}
	
	
}
