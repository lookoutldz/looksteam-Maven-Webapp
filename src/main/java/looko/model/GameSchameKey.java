package looko.model;

public class GameSchameKey {
    private Integer appid;

    private String achievementname;

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getAchievementname() {
        return achievementname;
    }

    public void setAchievementname(String achievementname) {
        this.achievementname = achievementname == null ? null : achievementname.trim();
    }
}