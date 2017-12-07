package looko.service;

import java.util.List;

import looko.model.Player;

public interface PlayerServiceI {

	public List<Player> db_GetPlayers();
	public List<Player> db_GetPlayersByName(String personaname);
	public List<Player> db_GetPlayersByRealname(String realname);
	public Player db_GetPlayerById(String steamid);
	
	public boolean db_UpdatePlayer(Player player);
}
