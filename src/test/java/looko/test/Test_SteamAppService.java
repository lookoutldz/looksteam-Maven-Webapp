package looko.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import looko.model.SteamApp;
import looko.service.SteamAppServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class Test_SteamAppService 
{
	SteamAppServiceI sAppService;
	
	public SteamAppServiceI getsAppService() {
		return sAppService;
	}

	@Autowired
	public void setsAppService(SteamAppServiceI sAppService) {
		this.sAppService = sAppService;
	}

	@Test
	public void testGetApps()
	{
		long time1 = System.currentTimeMillis();
		List<SteamApp> sApps = sAppService.db_GetApps();
		long time2 = System.currentTimeMillis();
		for (SteamApp steamApp : sApps) 
		{
			System.out.println(steamApp.getAppid()+":"+steamApp.getName());
		}
		long time3 = System.currentTimeMillis();
		System.out.println((time2-time1)+"ms");
		System.out.println((time3-time2)+"ms");
	}
	
	@Test
	public void testGetAppsByName()
	{
		long time1 = System.currentTimeMillis();
		List<SteamApp> sApps = sAppService.db_GetAppsByName("Dark souls");
		long time2 = System.currentTimeMillis();
		for (SteamApp steamApp : sApps) 
		{
			System.out.println(steamApp.getAppid()+":"+steamApp.getName());
		}
		long time3 = System.currentTimeMillis();
		System.out.println((time2-time1)+"ms");
		System.out.println((time3-time2)+"ms");
	}
}
