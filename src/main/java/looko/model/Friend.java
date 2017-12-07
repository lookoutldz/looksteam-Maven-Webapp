package looko.model;

public class Friend extends FriendKey {
    private String relationship;

    private Integer friendSince;

    private String extra1;

    private String extra2;

    private Integer extra3;

    private Integer extra4;

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship == null ? null : relationship.trim();
    }

    public Integer getFriendSince() {
        return friendSince;
    }

    public void setFriendSince(Integer friendSince) {
        this.friendSince = friendSince;
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