package looko.dao;

import java.util.List;
import looko.model.SteamApp;
import looko.model.SteamAppExample;
import org.apache.ibatis.annotations.Param;

public interface SteamAppMapper {
    int countByExample(SteamAppExample example);

    int deleteByExample(SteamAppExample example);

    int deleteByPrimaryKey(Integer appid);

    int insert(SteamApp record);

    int insertSelective(SteamApp record);

    List<SteamApp> selectByExample(SteamAppExample example);

    SteamApp selectByPrimaryKey(Integer appid);

    int updateByExampleSelective(@Param("record") SteamApp record, @Param("example") SteamAppExample example);

    int updateByExample(@Param("record") SteamApp record, @Param("example") SteamAppExample example);

    int updateByPrimaryKeySelective(SteamApp record);

    int updateByPrimaryKey(SteamApp record);
}