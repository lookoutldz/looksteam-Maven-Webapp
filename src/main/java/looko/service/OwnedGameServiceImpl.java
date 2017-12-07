package looko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import looko.dao.OwnedGameMapper;
import looko.model.OwnedGame;
import looko.model.OwnedGameExample;
import looko.model.OwnedGameExample.Criteria;
import looko.model.OwnedGameKey;
import looko.tool.GetNowTime;

@Service("ownedGameService")
public class OwnedGameServiceImpl implements OwnedGameServiceI {

	OwnedGameMapper oGameMapper;
	
	public OwnedGameMapper getoGameMapper() {
		return oGameMapper;
	}

	@Autowired
	public void setoGameMapper(OwnedGameMapper oGameMapper) {
		this.oGameMapper = oGameMapper;
	}

	@Override
	public List<OwnedGame> db_GetGames(String steamid) 
	{
		OwnedGameExample oGameExample = new OwnedGameExample();
		Criteria criteria = oGameExample.createCriteria();
		criteria.andSteamidEqualTo(steamid);
		return oGameMapper.selectByExample(oGameExample);
	}

	@Override
	public List<OwnedGame> db_GetGamesSortByTime(String steamid) 
	{
		OwnedGameExample oGameExample = new OwnedGameExample();
		Criteria criteria = oGameExample.createCriteria();
		criteria.andSteamidEqualTo(steamid);
		oGameExample.setOrderByClause("playtime_forever desc,playtime_2weeks desc");
		return oGameMapper.selectByExample(oGameExample);
	}

	@Override
	public List<OwnedGame> db_GetPlayedGames(String steamid) 
	{
		OwnedGameExample oGameExample = new OwnedGameExample();
		Criteria criteria = oGameExample.createCriteria();
		criteria.andSteamidEqualTo(steamid);
		criteria.andPlaytimeForeverGreaterThan(0);
		//oGameExample.setOrderByClause("playtime_forever desc,playtime_2weeks desc");
		return oGameMapper.selectByExample(oGameExample);
	}

	@Override
	public List<OwnedGame> db_GetUnplayGames(String steamid) 
	{
		OwnedGameExample oGameExample = new OwnedGameExample();
		Criteria criteria = oGameExample.createCriteria();
		criteria.andSteamidEqualTo(steamid);
		criteria.andPlaytimeForeverEqualTo(0);
		return oGameMapper.selectByExample(oGameExample);
	}

	@Override
	public List<OwnedGame> db_Get2weeksGames(String steamid) 
	{
		OwnedGameExample oGameExample = new OwnedGameExample();
		Criteria criteria = oGameExample.createCriteria();
		criteria.andSteamidEqualTo(steamid);
		criteria.andPlaytime2weeksIsNotNull();
		oGameExample.setOrderByClause("playtime_2weeks desc,playtime_forever desc");
		return oGameMapper.selectByExample(oGameExample);
	}

	@Override
	public List<OwnedGame> db_GetFullAchGames(String steamid) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OwnedGame db_GetGameByAppid(String steamid, int appid) 
	{
		OwnedGameKey oGameKey = new OwnedGameKey();
		oGameKey.setSteamid(steamid);
		oGameKey.setAppid(appid);
		return oGameMapper.selectByPrimaryKey(oGameKey);
	}

	@Override
	public OwnedGame db_GetLongestGame(String steamid) 
	{
		return db_GetGamesSortByTime(steamid).get(0);
	}

	@Override
	public int db_GamesCount(String steamid) 
	{
		OwnedGameExample oGameExample = new OwnedGameExample();
		Criteria criteria = oGameExample.createCriteria();
		criteria.andSteamidEqualTo(steamid);
		return oGameMapper.countByExample(oGameExample);
	}

	@Override
	public boolean db_UpdateGames(List<OwnedGame> ownedGames) 
	{
		int row = 0;
		if(null != ownedGames && ownedGames.size() > 0)
		{
			OwnedGameKey oGameKey = new OwnedGameKey();
			for (OwnedGame ownedGame : ownedGames) 
			{
				oGameKey.setSteamid(ownedGame.getSteamid());
				oGameKey.setAppid(ownedGame.getAppid());
				ownedGame.setExtra1(GetNowTime.getAsString());
				if(null != oGameMapper.selectByPrimaryKey(oGameKey))
				{
					row += oGameMapper.updateByPrimaryKey(ownedGame);
				}
				else 
				{
					row += oGameMapper.insert(ownedGame);
				}
			}
		}
		return row > 0 ? true : false;
	}

	@Override
	public boolean db_DeleteOnesGames(String steamid) 
	{
		int row = 0;
		OwnedGameExample oGameExample = new OwnedGameExample();
		Criteria criteria = oGameExample.createCriteria();
		criteria.andSteamidEqualTo(steamid);
		row = oGameMapper.deleteByExample(oGameExample);
		return row > 0 ? true : false;
	}

}
