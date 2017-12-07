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

import looko.model.OwnedGame;

public class API_OwnedGames {

	public List<OwnedGame> getAsOwnedGames(String steamid)
	{
		List<OwnedGame> ownedGames = new ArrayList<OwnedGame>();
		try {
			String url_getOwnedGames = " http://api.steampowered.com/IPlayerService/GetOwnedGames/v0001/?key="+PARM.key+"&steamid="+steamid+"&include_appinfo=1";
			URL url = new URL(url_getOwnedGames);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			if(200 != connection.getResponseCode())
				return ownedGames;
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			JsonParser parser = new JsonParser();
			JsonObject root = parser.parse(isr).getAsJsonObject();
			JsonObject responseObject = root.get("response").getAsJsonObject();
			JsonArray games = responseObject.get("games").getAsJsonArray();
			if(0 == games.size())
				return ownedGames;
			
			OwnedGame ownedGame;
			for (JsonElement jsonElement : games) 
			{
				JsonObject game = jsonElement.getAsJsonObject();
				ownedGame = new OwnedGame();
				ownedGame.setSteamid(steamid);
				ownedGame.setAppid(game.get("appid").getAsInt());
				ownedGame.setName(game.get("name").getAsString());
				if(game.has("playtime_2weeks"))
					ownedGame.setPlaytime2weeks(game.get("playtime_2weeks").getAsInt());
				ownedGame.setPlaytimeForever(game.get("playtime_forever").getAsInt());
				ownedGame.setImgIconUrl(game.get("img_icon_url").getAsString());
				ownedGame.setImgLogoUrl(game.get("img_logo_url").getAsString());
				if(game.has("has_community_visible_stats"))
					ownedGame.setHasCommunityVisibleStats(game.get("has_community_visible_stats").getAsString());
				ownedGames.add(ownedGame);
			}
		} catch (JsonIOException e) {
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
		return ownedGames;
	}
}
