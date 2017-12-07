package looko.dao;

import java.util.List;
import looko.model.PlayerAchievement;
import looko.model.PlayerAchievementExample;
import looko.model.PlayerAchievementKey;
import org.apache.ibatis.annotations.Param;

public interface PlayerAchievementMapper {
    long countByExample(PlayerAchievementExample example);

    int deleteByExample(PlayerAchievementExample example);

    int deleteByPrimaryKey(PlayerAchievementKey key);

    int insert(PlayerAchievement record);

    int insertSelective(PlayerAchievement record);

    List<PlayerAchievement> selectByExample(PlayerAchievementExample example);

    PlayerAchievement selectByPrimaryKey(PlayerAchievementKey key);

    int updateByExampleSelective(@Param("record") PlayerAchievement record, @Param("example") PlayerAchievementExample example);

    int updateByExample(@Param("record") PlayerAchievement record, @Param("example") PlayerAchievementExample example);

    int updateByPrimaryKeySelective(PlayerAchievement record);

    int updateByPrimaryKey(PlayerAchievement record);
}