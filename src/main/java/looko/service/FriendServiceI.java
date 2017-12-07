package looko.service;

import java.util.List;

import looko.model.Friend;

public interface FriendServiceI {

	public List<Friend> db_GetOnesFriends(String steamid);
	public int db_FriendsCount(String steamid);
	public int db_FriendsAveFriends(String steamid);
	public int db_FriendsAveGames(String steamid);
	public int db_FriendsAveLevel(String steamid);
	
	public boolean db_UpdateFriends(List<Friend> friends);
	public boolean db_DeleteFriend(String steamid);
}
