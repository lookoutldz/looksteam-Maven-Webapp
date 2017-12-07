package looko.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class Test_URLConnection 
{
	@Test
	public void test1()
	{
		String key = "177A5CAFEDAE3B23DA10115A4C95C9B9";
		String steamid = "76561198367830998";
		String appid = "502800";
		String getPlayerAchs = "http://api.steampowered.com/ISteamUserStats/GetPlayerAchievements/v0001/?key="+key+"&appid="+appid+"&steamid="+steamid;
		String getSteamLevel = "https://api.steampowered.com/IPlayerService/GetSteamLevel/v1/?&key="+key+"&steamid="+steamid;
		String getSchameForGame = " http://api.steampowered.com/ISteamUserStats/GetSchemaForGame/v2/?key="+key+"&appid="+appid;

		try 
		{
			URL url = new URL(getPlayerAchs);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			//URLConnection connection = url.openConnection();
			System.out.println(connection.getResponseCode());
			if(200 != connection.getResponseCode())
				return;
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			while(-1 != br.read())
			{
				System.out.println(br.readLine());
			}
		} 
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
