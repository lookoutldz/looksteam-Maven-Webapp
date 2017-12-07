package looko.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import looko.model.SteamApp;

public class API_SteamApp {

	public List<SteamApp> getAsSteamApps()
	{
		List<SteamApp> steamApps = new ArrayList<SteamApp>();
		try 
		{
			String url_getAppList = "http://api.steampowered.com/ISteamApps/GetAppList/v2";
			URL url = new URL(url_getAppList);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			if(200 != connection.getResponseCode())
				return steamApps;
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			JsonParser parser = new JsonParser();
			JsonObject root = (JsonObject) parser.parse(isr);
			JsonObject applist = root.get("applist").getAsJsonObject();
			JsonArray apps = applist.get("apps").getAsJsonArray();
			
			SteamApp sApp;
			for (JsonElement jsonElement : apps)
			{
				JsonObject appObject =jsonElement.getAsJsonObject();
				sApp = new SteamApp();
				sApp.setAppid(appObject.get("appid").getAsInt());
				sApp.setName(appObject.get("name").getAsString());
				steamApps.add(sApp);
			}
		} 
		catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return steamApps;
	}
}
