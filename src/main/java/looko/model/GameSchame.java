package looko.model;

public class GameSchame extends GameSchameKey {
    private Integer defaultvalue;

    private String displayname;

    private Integer hidden;

    private String icon;

    private String icongray;

    private String extra1;

    private String extra2;

    private Integer extra3;

    private Integer extra4;

    public Integer getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(Integer defaultvalue) {
        this.defaultvalue = defaultvalue;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname == null ? null : displayname.trim();
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getIcongray() {
        return icongray;
    }

    public void setIcongray(String icongray) {
        this.icongray = icongray == null ? null : icongray.trim();
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