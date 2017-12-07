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

import looko.model.Friend;

public class API_Friend {

	public List<Friend> getAsFriends(String steamid)
	{
		List<Friend> friends = new ArrayList<Friend>();
		try 
		{
			String url_getFriends = "http://api.steampowered.com/ISteamUser/GetFriendList/v0001/?key="+PARM.key+"&steamid="+steamid+"&relationship=friend";
			URL url = new URL(url_getFriends);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			if(200 != connection.getResponseCode())
				return friends;
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			
			JsonParser parser = new JsonParser();
			JsonObject root = parser.parse(isr).getAsJsonObject();
			JsonObject friendslist = root.get("friendslist").getAsJsonObject();
			JsonArray friendsArray = friendslist.get("friends").getAsJsonArray();
			if(0 == friends.size())
				return friends;
			
			Friend friend;
			for (JsonElement jsonElement : friendsArray)
			{
				JsonObject friendObject = jsonElement.getAsJsonObject();
				friend = new Friend();
				friend.setSteamid(steamid);
				friend.setFriendSteamid(friendObject.get("steamid").getAsString());
				friend.setRelationship(friendObject.get("relationship").getAsString());
				friend.setFriendSince(friendObject.get("friend_since").getAsInt());
				friends.add(friend);
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
		return friends;
	}
	
	
}
