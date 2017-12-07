package looko.model;

public class FriendKey {
    private String steamid;

    private String friendSteamid;

    public String getSteamid() {
        return steamid;
    }

    public void setSteamid(String steamid) {
        this.steamid = steamid == null ? null : steamid.trim();
    }

    public String getFriendSteamid() {
        return friendSteamid;
    }

    public void setFriendSteamid(String friendSteamid) {
        this.friendSteamid = friendSteamid == null ? null : friendSteamid.trim();
    }
}