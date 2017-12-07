package looko.thread_db;

import java.util.List;

import looko.model.OwnedGame;
import looko.service.OwnedGameServiceI;
import looko.tool.ApplicationContextHelper;

public class Thread_OwnedGames extends Thread 
{
	private List<OwnedGame> oGames;
	private static OwnedGameServiceI oGameService = ApplicationContextHelper.getBean(OwnedGameServiceI.class);
	
	public List<OwnedGame> getoGames() {
		return oGames;
	}
	public void setoGames(List<OwnedGame> oGames) {
		this.oGames = oGames;
	}
	
	@Override
	public void run() 
	{
		oGameService.db_UpdateGames(oGames);
	}
	
}
