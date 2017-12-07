package looko.thread_db;

import java.util.List;

import looko.model.Friend;
import looko.service.FriendServiceI;
import looko.tool.ApplicationContextHelper;

public class Thread_Friend extends Thread 
{
	private List<Friend> friends;
	private static FriendServiceI friendService = ApplicationContextHelper.getBean(FriendServiceI.class);
	
	public List<Friend> getFriends() {
		return friends;
	}
	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}
	
	@Override
	public void run() 
	{
		friendService.db_UpdateFriends(friends);
	}
	
	
}
