package looko.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class API_ServerTime 
{
	public int getAsInt()
	{
		int time = 0;
		try 
		{
			String getServerTime = "https://api.steampowered.com/ISteamWebAPIUtil/GetServerInfo/v1/";
			URL url = new URL(getServerTime);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			if(200 != connection.getResponseCode())
				return time;
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			JsonParser parser = new JsonParser();
			JsonObject root = parser.parse(isr).getAsJsonObject();
			time = root.get("servertime").getAsInt();
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return time;
	}
	
	public String getAsString()
	{
		String timeString = "";
		try 
		{
			String getServerTime = "https://api.steampowered.com/ISteamWebAPIUtil/GetServerInfo/v1/";
			URL url = new URL(getServerTime);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			if(200 != connection.getResponseCode())
				return timeString;
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			JsonParser parser = new JsonParser();
			JsonObject root = parser.parse(isr).getAsJsonObject();
			timeString = root.get("servertimestring").getAsString();
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return timeString;
	}
	
}
