package looko.dao;

import java.util.List;
import looko.model.OwnedGame;
import looko.model.OwnedGameExample;
import looko.model.OwnedGameKey;
import org.apache.ibatis.annotations.Param;

public interface OwnedGameMapper {
    int countByExample(OwnedGameExample example);

    int deleteByExample(OwnedGameExample example);

    int deleteByPrimaryKey(OwnedGameKey key);

    int insert(OwnedGame record);

    int insertSelective(OwnedGame record);

    List<OwnedGame> selectByExample(OwnedGameExample example);

    OwnedGame selectByPrimaryKey(OwnedGameKey key);

    int updateByExampleSelective(@Param("record") OwnedGame record, @Param("example") OwnedGameExample example);

    int updateByExample(@Param("record") OwnedGame record, @Param("example") OwnedGameExample example);

    int updateByPrimaryKeySelective(OwnedGame record);

    int updateByPrimaryKey(OwnedGame record);
}