package looko.service;

import java.util.List;

import looko.model.GameSchame;

public interface GameSchameServiceI {

	public List<GameSchame> db_GetSchames(int appid);
	public int db_SchameCount(int appid);
	
	public boolean db_UpdateSchames(List<GameSchame> gameSchames);
}
