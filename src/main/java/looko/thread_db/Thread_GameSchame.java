package looko.thread_db;

import java.util.List;

import looko.model.GameSchame;
import looko.service.GameSchameServiceI;
import looko.tool.ApplicationContextHelper;

public class Thread_GameSchame extends Thread 
{
	private List<GameSchame> gSchames;
	private static GameSchameServiceI gSchameService = ApplicationContextHelper.getBean(GameSchameServiceI.class);
	
	public List<GameSchame> getgSchames() {
		return gSchames;
	}
	public void setgSchames(List<GameSchame> gSchames) {
		this.gSchames = gSchames;
	}
	
	@Override
	public void run() 
	{
		gSchameService.db_UpdateSchames(gSchames);
	}
	
}
