package looko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import looko.api.API_SteamLevel;
import looko.dao.FriendMapper;
import looko.dao.OwnedGameMapper;
import looko.model.Friend;
import looko.model.FriendExample;
import looko.model.FriendExample.Criteria;
import looko.model.FriendKey;
import looko.model.OwnedGameExample;
import looko.tool.GetNowTime;

@Service("friendService")
public class FriendServiceImpl implements FriendServiceI {

	private FriendMapper friendMapper;
	private OwnedGameMapper ownedGameMapper;
	
	public FriendMapper getFriendMapper() {
		return friendMapper;
	}

	@Autowired
	public void setFriendMapper(FriendMapper friendMapper) {
		this.friendMapper = friendMapper;
	}

	public OwnedGameMapper getOwnedGameMapper() {
		return ownedGameMapper;
	}

	@Autowired
	public void setOwnedGameMapper(OwnedGameMapper ownedGameMapper) {
		this.ownedGameMapper = ownedGameMapper;
	}

	@Override
	public List<Friend> db_GetOnesFriends(String steamid) 
	{
		FriendExample friendExample = new FriendExample();
		Criteria criteria = friendExample.createCriteria();
		criteria.andSteamidEqualTo(steamid);
		return friendMapper.selectByExample(friendExample);
	}

	@Override
	public int db_FriendsCount(String steamid) 
	{
		FriendExample friendExample = new FriendExample();
		Criteria criteria = friendExample.createCriteria();
		criteria.andSteamidEqualTo(steamid);
		return friendMapper.countByExample(friendExample);
	}

	@Override
	public int db_FriendsAveFriends(String steamid) 
	{
		int total = 0;
		List<Friend> friends = db_GetOnesFriends(steamid);
		if(0 != friends.size())
		{
			for (Friend friend : friends) 
			{
				total += db_FriendsCount(friend.getSteamid());
			}
			return total/friends.size();
		}
		
		return 0;
	}

	@Override
	public int db_FriendsAveGames(String steamid) 
	{
		int total = 0;
		List<Friend> friends = db_GetOnesFriends(steamid);
		if(0 != friends.size())
		{
			OwnedGameExample oGameExample;
			for (Friend friend : friends) 
			{
				oGameExample = new OwnedGameExample();
				looko.model.OwnedGameExample.Criteria oCriteria = oGameExample.createCriteria();
				oCriteria.andSteamidEqualTo(friend.getFriendSteamid());
				total += ownedGameMapper.countByExample(oGameExample);
			}
			return total/friends.size();
		}
		
		return 0;
	}

	@Override
	public int db_FriendsAveLevel(String steamid) 
	{
		int total = 0;
		List<Friend> friends = db_GetOnesFriends(steamid);
		if(0 != friends.size())
		{
			API_SteamLevel sLevel = new API_SteamLevel();
			for (Friend friend : friends) 
			{
				total += sLevel.getLevel(friend.getFriendSteamid());
			}
			return total/friends.size();
		}
		
		return 0;
	}

	@Override
	public boolean db_UpdateFriends(List<Friend> friends) 
	{
		int row = 0;
		if(null != friends && friends.size() > 0)
		{
			FriendKey friendKey = new FriendKey();
			for (Friend friend : friends) 
			{
				friendKey.setSteamid(friend.getSteamid());
				friendKey.setFriendSteamid(friend.getFriendSteamid());
				if(null == friendMapper.selectByPrimaryKey(friendKey))
				{
					friend.setExtra1(GetNowTime.getAsString());
					row += friendMapper.insert(friend);
				}
			}
		}
		return row > 0 ? true : false;
	}

	@Override
	public boolean db_DeleteFriend(String steamid) 
	{
		int row = 0;
		FriendExample friendExample = new FriendExample();
		Criteria criteria = friendExample.createCriteria();
		criteria.andSteamidEqualTo(steamid);
		row = friendMapper.deleteByExample(friendExample);
		return row > 0 ? true : false;
	}

}
