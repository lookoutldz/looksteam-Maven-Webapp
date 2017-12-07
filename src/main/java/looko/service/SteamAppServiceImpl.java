package looko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import looko.dao.SteamAppMapper;
import looko.model.SteamApp;
import looko.model.SteamAppExample;
import looko.model.SteamAppExample.Criteria;
import looko.tool.GetNowTime;

@Service("steamAppService")
public class SteamAppServiceImpl implements SteamAppServiceI {

	SteamAppMapper sAppMapper;
	
	public SteamAppMapper getsAppMapper() {
		return sAppMapper;
	}

	@Autowired
	public void setsAppMapper(SteamAppMapper sAppMapper) {
		this.sAppMapper = sAppMapper;
	}

	@Override
	public List<SteamApp> db_GetApps() 
	{
		SteamAppExample sAppExample = new SteamAppExample();
		return sAppMapper.selectByExample(sAppExample);
	}

	@Override
	public List<SteamApp> db_GetApps_SortByName() 
	{
		SteamAppExample sAppExample = new SteamAppExample();
		sAppExample.setOrderByClause("name asc");
		return sAppMapper.selectByExample(sAppExample);
	}

	@Override
	public List<SteamApp> db_GetAppsByName(String name) 
	{
		SteamAppExample sAppExample = new SteamAppExample();
		Criteria criteria = sAppExample.createCriteria();
		criteria.andNameLike("%"+name+"%");
		return sAppMapper.selectByExample(sAppExample);
	}

	@Override
	public SteamApp db_GetAppById(int appid) 
	{
		return sAppMapper.selectByPrimaryKey(appid);
	}

	@Override
	public int db_AppsCount() 
	{
		return sAppMapper.countByExample(null);
	}

	@Override
	public boolean db_UpdateApps(List<SteamApp> steamApps) 
	{
		int row = 0;
		if(null != steamApps && steamApps.size() > 0)
		{
			for (SteamApp steamApp : steamApps) 
			{
				if(null == sAppMapper.selectByPrimaryKey(steamApp.getAppid()))
				{
					steamApp.setExtra1(GetNowTime.getAsString());
					row += sAppMapper.insert(steamApp);
				}
			}
		}
		return row > 0 ? true : false;
	}

}
