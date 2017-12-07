package looko.service;

import java.util.List;

import looko.model.OwnedGame;

public interface OwnedGameServiceI {

	public List<OwnedGame> db_GetGames(String steamid);
	public List<OwnedGame> db_GetGamesSortByTime(String steamid);
	public List<OwnedGame> db_GetPlayedGames(String steamid);
	public List<OwnedGame> db_GetUnplayGames(String steamid);
	public List<OwnedGame> db_Get2weeksGames(String steamid);
	public List<OwnedGame> db_GetFullAchGames(String steamid);
	
	public OwnedGame db_GetGameByAppid(String steamid, int appid);
	public OwnedGame db_GetLongestGame(String steamid);
	public int db_GamesCount(String steamid);
	
	public boolean db_UpdateGames(List<OwnedGame> ownedGames);
	public boolean db_DeleteOnesGames(String steamid);
}
