package looko.dao;

import java.util.List;
import looko.model.GameSchame;
import looko.model.GameSchameExample;
import looko.model.GameSchameKey;
import org.apache.ibatis.annotations.Param;

public interface GameSchameMapper {
    int countByExample(GameSchameExample example);

    int deleteByExample(GameSchameExample example);

    int deleteByPrimaryKey(GameSchameKey key);

    int insert(GameSchame record);

    int insertSelective(GameSchame record);

    List<GameSchame> selectByExample(GameSchameExample example);

    GameSchame selectByPrimaryKey(GameSchameKey key);

    int updateByExampleSelective(@Param("record") GameSchame record, @Param("example") GameSchameExample example);

    int updateByExample(@Param("record") GameSchame record, @Param("example") GameSchameExample example);

    int updateByPrimaryKeySelective(GameSchame record);

    int updateByPrimaryKey(GameSchame record);
}