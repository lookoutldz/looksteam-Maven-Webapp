package looko.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import looko.model.Player;

public class API_Player {

	public Player getAsPlayer(String steamid)
	{
		Player player = new Player();
		try 
		{
			String getPlayerSummaries = "http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key="+PARM.key+"&steamids="+steamid;
			URL url = new URL(getPlayerSummaries);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			if(200 != connection.getResponseCode())
				return player;
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			JsonParser parser = new JsonParser();
			JsonObject root = parser.parse(isr).getAsJsonObject();
			JsonObject responseObject = root.get("response").getAsJsonObject();
			JsonArray players = responseObject.get("players").getAsJsonArray();
			JsonObject playerObject = players.get(0).getAsJsonObject();
			
			player.setSteamid(playerObject.get("steamid").getAsString());
			player.setCommunityvisibilitystate(playerObject.get("communityvisibilitystate").getAsInt());
			player.setProfilestate(playerObject.get("profilestate").getAsInt());
			player.setPersonaname(playerObject.get("personaname").getAsString());
			player.setProfileurl(playerObject.get("profileurl").getAsString());
			player.setAvatar(playerObject.get("avatar").getAsString());
			player.setAvatarmedium(playerObject.get("avatarmedium").getAsString());
			player.setAvatarfull(playerObject.get("avatarfull").getAsString());
			
			if(playerObject.has("lastlogoff"));
				player.setLastlogoff(playerObject.get("lastlogoff").getAsInt());
			if(playerObject.has("commentpermission"))
				player.setCommentpermission(playerObject.get("commentpermission").getAsInt());
			if(playerObject.has("personastate"))
				player.setPersonastate(playerObject.get("personastate").getAsInt());
			if(playerObject.has("realname"))
				player.setRealname(playerObject.get("realname").getAsString());
			if(playerObject.has("primaryclanid"))
				player.setPrimaryclanid(playerObject.get("primaryclanid").getAsString());
			if(playerObject.has("timecreated"))
				player.setTimecreated(playerObject.get("timecreated").getAsInt());
			if(playerObject.has("personastateflags"))
				player.setPersonastateflags(playerObject.get("personastateflags").getAsInt());
			if(playerObject.has("gameextrainfo"))
				player.setGameextrainfo(playerObject.get("gameextrainfo").getAsString());
			if(playerObject.has("gameserverip"))
				player.setGameserverip(playerObject.get("gameserverip").getAsString());
			if(playerObject.has("gameid"))
				player.setGameid(playerObject.get("gameid").getAsString());
			if(playerObject.has("loccountrycode"))
				player.setLoccountrycode(playerObject.get("loccountrycode").getAsString());
			if(playerObject.has("locstatecode"))
				player.setLocstatecode(playerObject.get("locstatecode").getAsString());	
			if(playerObject.has("loccityid"))
				player.setLoccityid(playerObject.get("loccityid").getAsString());	
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
		return player;
	}
	
	public boolean visibilityState(String steamid)
	{
		int state = 0;
		try 
		{
			String getPlayerSummaries = "http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key="+PARM.key+"&steamids="+steamid;
			URL url = new URL(getPlayerSummaries);
			URLConnection connection = url.openConnection();
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			JsonParser parser = new JsonParser();
			JsonObject root = parser.parse(isr).getAsJsonObject();
			JsonObject responseObject = root.get("response").getAsJsonObject();
			JsonArray players = responseObject.get("players").getAsJsonArray();
			JsonObject playerObject = players.get(0).getAsJsonObject();
			
			state = playerObject.get("communityvisibilitystate").getAsInt();
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
		return state==3 ? true : false;
	}
	
	public boolean existState(String steamid)
	{
		boolean state = false;
		String getPlayerSummaries = "http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key="+PARM.key+"&steamids="+steamid;
		try 
		{
			URL url = new URL(getPlayerSummaries);
			URLConnection connection = url.openConnection();
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			JsonParser parser = new JsonParser();
			JsonObject root = parser.parse(isr).getAsJsonObject();
			JsonObject responseObject = root.get("response").getAsJsonObject();
			JsonArray players = responseObject.get("players").getAsJsonArray();
			if(players.size() > 0)
				state = true;
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
		return state;
	}
}
