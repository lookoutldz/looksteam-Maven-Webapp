package looko.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import looko.api.PARM;
import looko.tool.GetNowTime;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class Test_Speed 
{
	private static String key = "177A5CAFEDAE3B23DA10115A4C95C9B9";
	private static String steamid = "76561198367830998";
	private static String appid = "502800";
	
	@Test
	public void test1_1()
	{
		int i = 0;
		long time1 = System.currentTimeMillis();
		while (i < 1000000)
		{
			i++;
		}
		long time2 = System.currentTimeMillis();
		System.out.println((time2-time1) + "ms");	
	}
	@Test
	public void test1_2()
	{
		int i = 0;
		long time1 = System.currentTimeMillis();
		for (; i < 1000000; i++) {
		}
		long time2 = System.currentTimeMillis();
		System.out.println((time2-time1) + "ms");
	}
	
	
	class A{
		public int x;
		public void grow() { x += 1;}
	}
	
	//是否使用匿名类对程序速率影响不大
	@Test
	public void test2_1()
	{
		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			new A().grow();
		}
		long time2 = System.currentTimeMillis();
		System.out.println((time2-time1) + "ms");
	}
	@Test
	public void test2_2()
	{
		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			A aa = new A();
			aa.grow();
		}
		long time2 = System.currentTimeMillis();
		System.out.println((time2-time1) + "ms");
	}
	
	@Test
	public void test3_1()
	{
		long time1 = System.currentTimeMillis();
		System.out.println(GetNowTime.getAsString());
		long time2 = System.currentTimeMillis();
		System.out.println((time2-time1) + "ms");
	}
	@Test
	public void test3_2()
	{
		long time1 = System.currentTimeMillis();
		System.out.println(GetNowTime.getAsString());
		long time2 = System.currentTimeMillis();
		System.out.println((time2-time1) + "ms");
	}
	
	@Test
	public void test4_1()
	{
		try 
		{
			long totaltime = 0;
			String getPlayerSummaries = "http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key="+key+"&steamids="+steamid;
			for(int i = 0; i < 20; i++)
			{
				long time1 = System.currentTimeMillis();
				URL url = new URL(getPlayerSummaries);
				URLConnection connection = url.openConnection();
				InputStream is = connection.getInputStream();
				long time2  = System.currentTimeMillis();
				totaltime += (time2 - time1);
			}
			System.out.println("average : " + (totaltime/20) + "ms");
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test4_2()
	{
		try 
		{
			long totaltime = 0;
			String getPlayerSummaries = "http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key="+key+"&steamids="+steamid;
			for(int i = 0; i < 20; i++)
			{
				long time1 = System.currentTimeMillis();
				URL url = new URL(getPlayerSummaries);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				InputStream is = connection.getInputStream();
				long time2  = System.currentTimeMillis();
				totaltime += (time2 - time1);
			}
			System.out.println("average : " + (totaltime/20) + "ms");
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
