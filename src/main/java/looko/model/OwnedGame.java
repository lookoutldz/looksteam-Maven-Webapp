package looko.model;

public class OwnedGame extends OwnedGameKey {
    private String name;

    private Integer playtime2weeks;

    private Integer playtimeForever;

    private String imgIconUrl;

    private String imgLogoUrl;

    private String hasCommunityVisibleStats;

    private String extra1;

    private String extra2;

    private Integer extra3;

    private Integer extra4;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPlaytime2weeks() {
        return playtime2weeks;
    }

    public void setPlaytime2weeks(Integer playtime2weeks) {
        this.playtime2weeks = playtime2weeks;
    }

    public Integer getPlaytimeForever() {
        return playtimeForever;
    }

    public void setPlaytimeForever(Integer playtimeForever) {
        this.playtimeForever = playtimeForever;
    }

    public String getImgIconUrl() {
        return imgIconUrl;
    }

    public void setImgIconUrl(String imgIconUrl) {
        this.imgIconUrl = imgIconUrl == null ? null : imgIconUrl.trim();
    }

    public String getImgLogoUrl() {
        return imgLogoUrl;
    }

    public void setImgLogoUrl(String imgLogoUrl) {
        this.imgLogoUrl = imgLogoUrl == null ? null : imgLogoUrl.trim();
    }

    public String getHasCommunityVisibleStats() {
        return hasCommunityVisibleStats;
    }

    public void setHasCommunityVisibleStats(String hasCommunityVisibleStats) {
        this.hasCommunityVisibleStats = hasCommunityVisibleStats == null ? null : hasCommunityVisibleStats.trim();
    }

    public String getExtra1() {
        return extra1;
    }

    public void setExtra1(String extra1) {
        this.extra1 = extra1 == null ? null : extra1.trim();
    }

    public String getExtra2() {
        return extra2;
    }

    public void setExtra2(String extra2) {
        this.extra2 = extra2 == null ? null : extra2.trim();
    }

    public Integer getExtra3() {
        return extra3;
    }

    public void setExtra3(Integer extra3) {
        this.extra3 = extra3;
    }

    public Integer getExtra4() {
        return extra4;
    }

    public void setExtra4(Integer extra4) {
        this.extra4 = extra4;
    }
}