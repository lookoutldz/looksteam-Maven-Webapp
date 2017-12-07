package looko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import looko.dao.PlayerMapper;
import looko.model.Player;
import looko.model.PlayerExample;
import looko.model.PlayerExample.Criteria;
import looko.tool.GetNowTime;

@Service("playerService")
public class PlayerServiceImpl implements PlayerServiceI {

	PlayerMapper playerMapper;
	
	public PlayerMapper getPlayerMapper() {
		return playerMapper;
	}

	@Autowired
	public void setPlayerMapper(PlayerMapper playerMapper) {
		this.playerMapper = playerMapper;
	}

	@Override
	public List<Player> db_GetPlayers() 
	{
		return playerMapper.selectByExample(null);
	}

	@Override
	public List<Player> db_GetPlayersByName(String personaname) 
	{
		PlayerExample playerExample = new PlayerExample();
		Criteria criteria = playerExample.createCriteria();
		criteria.andPersonanameLike("%"+personaname+"%");
		return playerMapper.selectByExample(playerExample);
	}

	@Override
	public List<Player> db_GetPlayersByRealname(String realname) 
	{
		PlayerExample playerExample = new PlayerExample();
		Criteria criteria = playerExample.createCriteria();
		criteria.andPersonanameLike("%"+realname+"%");
		return playerMapper.selectByExample(playerExample);
	}

	@Override
	public Player db_GetPlayerById(String steamid) 
	{
		return playerMapper.selectByPrimaryKey(steamid);
	}

	@Override
	public boolean db_UpdatePlayer(Player player) 
	{
		int row = 0;
		if(null != player)
		{
			player.setExtra1(GetNowTime.getAsString());
			if(null != playerMapper.selectByPrimaryKey(player.getSteamid()))
			{
				row = playerMapper.updateByPrimaryKey(player);
			}
			else 
			{
				row = playerMapper.insert(player);
			}
		}
		return row > 0 ? true : false;
	}

}
