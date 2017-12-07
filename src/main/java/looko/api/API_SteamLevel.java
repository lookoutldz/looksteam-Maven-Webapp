package looko.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class API_SteamLevel {

	public int getLevel(String steamid)
	{
		int level = 0;
		try 
		{
			String getSteamLevel = "https://api.steampowered.com/IPlayerService/GetSteamLevel/v1/?&key="+PARM.key+"&steamid="+steamid;
			URL url = new URL(getSteamLevel);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			if(200 != connection.getResponseCode())
				return level;
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			JsonParser parser = new JsonParser();
			JsonObject root = parser.parse(isr).getAsJsonObject();
			JsonObject response = root.get("response").getAsJsonObject();
			level = response.get("player_level").getAsInt();
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
		
		return level;
	}
}
