package looko.thread_db;

import java.util.List;

import looko.model.SteamApp;
import looko.service.SteamAppServiceI;
import looko.tool.ApplicationContextHelper;

public class Thread_SteamApp extends Thread 
{
	private List<SteamApp> steamApps;
	private static SteamAppServiceI sAppService = ApplicationContextHelper.getBean(SteamAppServiceI.class);
	
	public List<SteamApp> getSteamApps() {
		return steamApps;
	}
	public void setSteamApps(List<SteamApp> steamApps) {
		this.steamApps = steamApps;
	}
	
	@Override
	public void run() 
	{
		sAppService.db_UpdateApps(steamApps);
	}
	
}
