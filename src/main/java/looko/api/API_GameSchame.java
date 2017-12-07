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

import looko.model.GameSchame;

public class API_GameSchame 
{
	public List<GameSchame> getAsGameSchames(int appid)
	{
		List<GameSchame> gSchames = new ArrayList<GameSchame>();
		try 
		{
			String getSchameForGame = " http://api.steampowered.com/ISteamUserStats/GetSchemaForGame/v2/?key="+PARM.key+"&appid="+appid;
			URL url = new URL(getSchameForGame);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			if(200 != connection.getResponseCode())
				return gSchames;
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			JsonParser parser = new JsonParser();
			JsonObject root = parser.parse(isr).getAsJsonObject();
			JsonObject gameObject = root.get("game").getAsJsonObject();
			JsonObject availableGameStats = null;
			JsonArray achievements = null;
			if(gameObject.has("availableGameStats"))
				availableGameStats = gameObject.get("availableGameStats").getAsJsonObject();
			if(null != availableGameStats)
				achievements = availableGameStats.get("achievements").getAsJsonArray();
			if(0 == achievements.size())
				return gSchames;
			
			GameSchame gameSchame = new GameSchame();
			for (JsonElement jsonElement : achievements) 
			{
				JsonObject achievement = jsonElement.getAsJsonObject();
				gameSchame.setAppid(appid);
				gameSchame.setAchievementname(achievement.get("name").getAsString());
				gameSchame.setDefaultvalue(achievement.get("defaultvalue").getAsInt());
				gameSchame.setDisplayname(achievement.get("displayname").getAsString());
				gameSchame.setHidden(achievement.get("hidden").getAsInt());
				gameSchame.setIcon(achievement.get("icon").getAsString());
				gameSchame.setIcongray(achievement.get("icongray").getAsString());
				gSchames.add(gameSchame);
			}
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gSchames;
	}
	
	public boolean hasAchievement(int appid)
	{
		boolean result = false;
		try 
		{
			String getSchameForGame = " http://api.steampowered.com/ISteamUserStats/GetSchemaForGame/v2/?key="+PARM.key+"&appid="+appid;
			URL url = new URL(getSchameForGame);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			if(200 != connection.getResponseCode())
				return result;
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			JsonParser parser = new JsonParser();
			JsonObject root = parser.parse(isr).getAsJsonObject();
			JsonObject gameObject = root.get("game").getAsJsonObject();
			if(gameObject.has("availableGameStats"))
				result = true;
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
		return result;
	}
}
