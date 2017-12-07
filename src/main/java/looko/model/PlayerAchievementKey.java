package looko.model;

public class PlayerAchievementKey {
    private String steamid;

    private Integer appid;

    private String achievementname;

    public String getSteamid() {
        return steamid;
    }

    public void setSteamid(String steamid) {
        this.steamid = steamid == null ? null : steamid.trim();
    }

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