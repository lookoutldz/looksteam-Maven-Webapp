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
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import looko.model.OwnedGame;
import looko.model.PlayerAchievement;

public class API_PlayerAchievement 
{
	public List<PlayerAchievement> getPlayerAchs(String steamid, int appid)
	{
		List<PlayerAchievement> playerAchs = new ArrayList<PlayerAchievement>();
		try 
		{
			String getPlayerAchs = "http://api.steampowered.com/ISteamUserStats/GetPlayerAchievements/v0001/?appid="+appid+"&key="+PARM.key+"&steamid="+steamid;
			URL url = new URL(getPlayerAchs);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			if(200 != connection.getResponseCode())
				return playerAchs;
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			JsonParser parser = new JsonParser();
			JsonObject root = parser.parse(isr).getAsJsonObject();
			JsonObject playerstatsObject = root.get("playerstats").getAsJsonObject();
			JsonArray achievements = playerstatsObject.get("achievements").getAsJsonArray();
			if(0 == achievements.size())
				return playerAchs;
			
			PlayerAchievement playerAch = new PlayerAchievement();
			for (JsonElement jsonElement : achievements) 
			{
				JsonObject achievement = jsonElement.getAsJsonObject();
				playerAch.setSteamid(steamid);
				playerAch.setAppid(appid);
				playerAch.setAchievementname(achievement.get("apiname").getAsString());
				playerAch.setAchieved(achievement.get("achieved").getAsInt());
				playerAch.setUnlocktime(achievement.get("achieved").getAsInt());
				playerAchs.add(playerAch);
			}
		} 
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return playerAchs;
	}
	
	public List<PlayerAchievement> getPlayerAllAchs(String steamid, List<OwnedGame> games)
	{
		List<PlayerAchievement> playerAchs = new ArrayList<PlayerAchievement>();
		try 
		{
			if(null != games && games.size() > 0)
			{
				int appid = 0;
				String getPlayerAchs;
				URL url;
				HttpURLConnection connection;
				InputStream is;
				InputStreamReader isr;
				JsonParser parser;
				JsonObject root,playerstatsObject;
				JsonArray achievements;
				PlayerAchievement playerAch = new PlayerAchievement();
				for (OwnedGame game : games) 
				{
					appid = game.getAppid();
					getPlayerAchs = "http://api.steampowered.com/ISteamUserStats/GetPlayerAchievements/v0001/?appid="+appid+"&key="+PARM.key+"&steamid="+steamid;
					url = new URL(getPlayerAchs);
					connection = (HttpURLConnection) url.openConnection();
					is = connection.getInputStream();	//高危地区。测试注意
					isr = new InputStreamReader(is);
					
					parser = new JsonParser();
					root = parser.parse(isr).getAsJsonObject();
					playerstatsObject = root.get("playerstats").getAsJsonObject();
					achievements = playerstatsObject.get("achievements").getAsJsonArray();
					if(0 == achievements.size())
						return playerAchs;
					
					for (JsonElement jsonElement : achievements) 
					{
						JsonObject achievement = jsonElement.getAsJsonObject();
						playerAch.setSteamid(steamid);
						playerAch.setAppid(appid);
						playerAch.setAchievementname(achievement.get("apiname").getAsString());
						playerAch.setAchieved(achievement.get("achieved").getAsInt());
						playerAch.setUnlocktime(achievement.get("achieved").getAsInt());
						playerAchs.add(playerAch);
					}
				}
			}
		} 
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return playerAchs;
	}
}
