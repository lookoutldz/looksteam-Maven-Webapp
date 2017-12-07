package looko.service;

import java.util.List;

import looko.model.SteamApp;

public interface SteamAppServiceI {

	public List<SteamApp> db_GetApps();
	public List<SteamApp> db_GetApps_SortByName();
	public List<SteamApp> db_GetAppsByName(String name);
	public SteamApp db_GetAppById(int id);
	public int db_AppsCount();
	
	//public boolean update(SteamApp steamApp);
	public boolean db_UpdateApps(List<SteamApp> steamApps);
	
}
