package looko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import looko.dao.GameSchameMapper;
import looko.model.GameSchame;
import looko.model.GameSchameExample;
import looko.model.GameSchameExample.Criteria;
import looko.model.GameSchameKey;
import looko.tool.GetNowTime;

@Service("gameSchameService")
public class GameSchameServiceImpl implements GameSchameServiceI {

	GameSchameMapper gSchameMapper;
	
	public GameSchameMapper getgSchameMapper() {
		return gSchameMapper;
	}

	@Autowired
	public void setgSchameMapper(GameSchameMapper gSchameMapper) {
		this.gSchameMapper = gSchameMapper;
	}

	@Override
	public List<GameSchame> db_GetSchames(int appid) 
	{
		GameSchameExample gSchameExample = new GameSchameExample();
		Criteria criteria = gSchameExample.createCriteria();
		criteria.andAppidEqualTo(appid);
		return gSchameMapper.selectByExample(gSchameExample);
	}

	@Override
	public int db_SchameCount(int appid) 
	{
		GameSchameExample gSchameExample = new GameSchameExample();
		Criteria criteria = gSchameExample.createCriteria();
		criteria.andAppidEqualTo(appid);
		return gSchameMapper.countByExample(gSchameExample);
	}

	@Override
	public boolean db_UpdateSchames(List<GameSchame> gameSchames) 
	{
		int row = 0;
		if(null != gameSchames && gameSchames.size() > 0)
		{
			GameSchameKey gSchameKey = new GameSchameKey();
			for (GameSchame gameSchame : gameSchames) 
			{
				gSchameKey.setAppid(gameSchame.getAppid());
				gSchameKey.setAchievementname(gameSchame.getAchievementname());
				if(null == gSchameMapper.selectByPrimaryKey(gSchameKey))
				{
					gameSchame.setExtra1(GetNowTime.getAsString());
					row += gSchameMapper.insert(gameSchame);
				}
			}
		}
		return row > 0 ? true : false;
	}

}
