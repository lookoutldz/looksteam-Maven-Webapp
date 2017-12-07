package looko.model;

import java.util.ArrayList;
import java.util.List;

public class OwnedGameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OwnedGameExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSteamidIsNull() {
            addCriterion("steamid is null");
            return (Criteria) this;
        }

        public Criteria andSteamidIsNotNull() {
            addCriterion("steamid is not null");
            return (Criteria) this;
        }

        public Criteria andSteamidEqualTo(String value) {
            addCriterion("steamid =", value, "steamid");
            return (Criteria) this;
        }

        public Criteria andSteamidNotEqualTo(String value) {
            addCriterion("steamid <>", value, "steamid");
            return (Criteria) this;
        }

        public Criteria andSteamidGreaterThan(String value) {
            addCriterion("steamid >", value, "steamid");
            return (Criteria) this;
        }

        public Criteria andSteamidGreaterThanOrEqualTo(String value) {
            addCriterion("steamid >=", value, "steamid");
            return (Criteria) this;
        }

        public Criteria andSteamidLessThan(String value) {
            addCriterion("steamid <", value, "steamid");
            return (Criteria) this;
        }

        public Criteria andSteamidLessThanOrEqualTo(String value) {
            addCriterion("steamid <=", value, "steamid");
            return (Criteria) this;
        }

        public Criteria andSteamidLike(String value) {
            addCriterion("steamid like", value, "steamid");
            return (Criteria) this;
        }

        public Criteria andSteamidNotLike(String value) {
            addCriterion("steamid not like", value, "steamid");
            return (Criteria) this;
        }

        public Criteria andSteamidIn(List<String> values) {
            addCriterion("steamid in", values, "steamid");
            return (Criteria) this;
        }

        public Criteria andSteamidNotIn(List<String> values) {
            addCriterion("steamid not in", values, "steamid");
            return (Criteria) this;
        }

        public Criteria andSteamidBetween(String value1, String value2) {
            addCriterion("steamid between", value1, value2, "steamid");
            return (Criteria) this;
        }

        public Criteria andSteamidNotBetween(String value1, String value2) {
            addCriterion("steamid not between", value1, value2, "steamid");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("appid is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("appid is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(Integer value) {
            addCriterion("appid =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(Integer value) {
            addCriterion("appid <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(Integer value) {
            addCriterion("appid >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(Integer value) {
            addCriterion("appid >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(Integer value) {
            addCriterion("appid <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(Integer value) {
            addCriterion("appid <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<Integer> values) {
            addCriterion("appid in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<Integer> values) {
            addCriterion("appid not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(Integer value1, Integer value2) {
            addCriterion("appid between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(Integer value1, Integer value2) {
            addCriterion("appid not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPlaytime2weeksIsNull() {
            addCriterion("playtime_2weeks is null");
            return (Criteria) this;
        }

        public Criteria andPlaytime2weeksIsNotNull() {
            addCriterion("playtime_2weeks is not null");
            return (Criteria) this;
        }

        public Criteria andPlaytime2weeksEqualTo(Integer value) {
            addCriterion("playtime_2weeks =", value, "playtime2weeks");
            return (Criteria) this;
        }

        public Criteria andPlaytime2weeksNotEqualTo(Integer value) {
            addCriterion("playtime_2weeks <>", value, "playtime2weeks");
            return (Criteria) this;
        }

        public Criteria andPlaytime2weeksGreaterThan(Integer value) {
            addCriterion("playtime_2weeks >", value, "playtime2weeks");
            return (Criteria) this;
        }

        public Criteria andPlaytime2weeksGreaterThanOrEqualTo(Integer value) {
            addCriterion("playtime_2weeks >=", value, "playtime2weeks");
            return (Criteria) this;
        }

        public Criteria andPlaytime2weeksLessThan(Integer value) {
            addCriterion("playtime_2weeks <", value, "playtime2weeks");
            return (Criteria) this;
        }

        public Criteria andPlaytime2weeksLessThanOrEqualTo(Integer value) {
            addCriterion("playtime_2weeks <=", value, "playtime2weeks");
            return (Criteria) this;
        }

        public Criteria andPlaytime2weeksIn(List<Integer> values) {
            addCriterion("playtime_2weeks in", values, "playtime2weeks");
            return (Criteria) this;
        }

        public Criteria andPlaytime2weeksNotIn(List<Integer> values) {
            addCriterion("playtime_2weeks not in", values, "playtime2weeks");
            return (Criteria) this;
        }

        public Criteria andPlaytime2weeksBetween(Integer value1, Integer value2) {
            addCriterion("playtime_2weeks between", value1, value2, "playtime2weeks");
            return (Criteria) this;
        }

        public Criteria andPlaytime2weeksNotBetween(Integer value1, Integer value2) {
            addCriterion("playtime_2weeks not between", value1, value2, "playtime2weeks");
            return (Criteria) this;
        }

        public Criteria andPlaytimeForeverIsNull() {
            addCriterion("playtime_forever is null");
            return (Criteria) this;
        }

        public Criteria andPlaytimeForeverIsNotNull() {
            addCriterion("playtime_forever is not null");
            return (Criteria) this;
        }

        public Criteria andPlaytimeForeverEqualTo(Integer value) {
            addCriterion("playtime_forever =", value, "playtimeForever");
            return (Criteria) this;
        }

        public Criteria andPlaytimeForeverNotEqualTo(Integer value) {
            addCriterion("playtime_forever <>", value, "playtimeForever");
            return (Criteria) this;
        }

        public Criteria andPlaytimeForeverGreaterThan(Integer value) {
            addCriterion("playtime_forever >", value, "playtimeForever");
            return (Criteria) this;
        }

        public Criteria andPlaytimeForeverGreaterThanOrEqualTo(Integer value) {
            addCriterion("playtime_forever >=", value, "playtimeForever");
            return (Criteria) this;
        }

        public Criteria andPlaytimeForeverLessThan(Integer value) {
            addCriterion("playtime_forever <", value, "playtimeForever");
            return (Criteria) this;
        }

        public Criteria andPlaytimeForeverLessThanOrEqualTo(Integer value) {
            addCriterion("playtime_forever <=", value, "playtimeForever");
            return (Criteria) this;
        }

        public Criteria andPlaytimeForeverIn(List<Integer> values) {
            addCriterion("playtime_forever in", values, "playtimeForever");
            return (Criteria) this;
        }

        public Criteria andPlaytimeForeverNotIn(List<Integer> values) {
            addCriterion("playtime_forever not in", values, "playtimeForever");
            return (Criteria) this;
        }

        public Criteria andPlaytimeForeverBetween(Integer value1, Integer value2) {
            addCriterion("playtime_forever between", value1, value2, "playtimeForever");
            return (Criteria) this;
        }

        public Criteria andPlaytimeForeverNotBetween(Integer value1, Integer value2) {
            addCriterion("playtime_forever not between", value1, value2, "playtimeForever");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlIsNull() {
            addCriterion("img_icon_url is null");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlIsNotNull() {
            addCriterion("img_icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlEqualTo(String value) {
            addCriterion("img_icon_url =", value, "imgIconUrl");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlNotEqualTo(String value) {
            addCriterion("img_icon_url <>", value, "imgIconUrl");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlGreaterThan(String value) {
            addCriterion("img_icon_url >", value, "imgIconUrl");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_icon_url >=", value, "imgIconUrl");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlLessThan(String value) {
            addCriterion("img_icon_url <", value, "imgIconUrl");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlLessThanOrEqualTo(String value) {
            addCriterion("img_icon_url <=", value, "imgIconUrl");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlLike(String value) {
            addCriterion("img_icon_url like", value, "imgIconUrl");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlNotLike(String value) {
            addCriterion("img_icon_url not like", value, "imgIconUrl");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlIn(List<String> values) {
            addCriterion("img_icon_url in", values, "imgIconUrl");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlNotIn(List<String> values) {
            addCriterion("img_icon_url not in", values, "imgIconUrl");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlBetween(String value1, String value2) {
            addCriterion("img_icon_url between", value1, value2, "imgIconUrl");
            return (Criteria) this;
        }

        public Criteria andImgIconUrlNotBetween(String value1, String value2) {
            addCriterion("img_icon_url not between", value1, value2, "imgIconUrl");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlIsNull() {
            addCriterion("img_logo_url is null");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlIsNotNull() {
            addCriterion("img_logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlEqualTo(String value) {
            addCriterion("img_logo_url =", value, "imgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlNotEqualTo(String value) {
            addCriterion("img_logo_url <>", value, "imgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlGreaterThan(String value) {
            addCriterion("img_logo_url >", value, "imgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_logo_url >=", value, "imgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlLessThan(String value) {
            addCriterion("img_logo_url <", value, "imgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("img_logo_url <=", value, "imgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlLike(String value) {
            addCriterion("img_logo_url like", value, "imgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlNotLike(String value) {
            addCriterion("img_logo_url not like", value, "imgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlIn(List<String> values) {
            addCriterion("img_logo_url in", values, "imgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlNotIn(List<String> values) {
            addCriterion("img_logo_url not in", values, "imgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlBetween(String value1, String value2) {
            addCriterion("img_logo_url between", value1, value2, "imgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andImgLogoUrlNotBetween(String value1, String value2) {
            addCriterion("img_logo_url not between", value1, value2, "imgLogoUrl");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsIsNull() {
            addCriterion("has_community_visible_stats is null");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsIsNotNull() {
            addCriterion("has_community_visible_stats is not null");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsEqualTo(String value) {
            addCriterion("has_community_visible_stats =", value, "hasCommunityVisibleStats");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsNotEqualTo(String value) {
            addCriterion("has_community_visible_stats <>", value, "hasCommunityVisibleStats");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsGreaterThan(String value) {
            addCriterion("has_community_visible_stats >", value, "hasCommunityVisibleStats");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsGreaterThanOrEqualTo(String value) {
            addCriterion("has_community_visible_stats >=", value, "hasCommunityVisibleStats");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsLessThan(String value) {
            addCriterion("has_community_visible_stats <", value, "hasCommunityVisibleStats");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsLessThanOrEqualTo(String value) {
            addCriterion("has_community_visible_stats <=", value, "hasCommunityVisibleStats");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsLike(String value) {
            addCriterion("has_community_visible_stats like", value, "hasCommunityVisibleStats");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsNotLike(String value) {
            addCriterion("has_community_visible_stats not like", value, "hasCommunityVisibleStats");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsIn(List<String> values) {
            addCriterion("has_community_visible_stats in", values, "hasCommunityVisibleStats");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsNotIn(List<String> values) {
            addCriterion("has_community_visible_stats not in", values, "hasCommunityVisibleStats");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsBetween(String value1, String value2) {
            addCriterion("has_community_visible_stats between", value1, value2, "hasCommunityVisibleStats");
            return (Criteria) this;
        }

        public Criteria andHasCommunityVisibleStatsNotBetween(String value1, String value2) {
            addCriterion("has_community_visible_stats not between", value1, value2, "hasCommunityVisibleStats");
            return (Criteria) this;
        }

        public Criteria andExtra1IsNull() {
            addCriterion("extra1 is null");
            return (Criteria) this;
        }

        public Criteria andExtra1IsNotNull() {
            addCriterion("extra1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra1EqualTo(String value) {
            addCriterion("extra1 =", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotEqualTo(String value) {
            addCriterion("extra1 <>", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1GreaterThan(String value) {
            addCriterion("extra1 >", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1GreaterThanOrEqualTo(String value) {
            addCriterion("extra1 >=", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1LessThan(String value) {
            addCriterion("extra1 <", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1LessThanOrEqualTo(String value) {
            addCriterion("extra1 <=", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1Like(String value) {
            addCriterion("extra1 like", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotLike(String value) {
            addCriterion("extra1 not like", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1In(List<String> values) {
            addCriterion("extra1 in", values, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotIn(List<String> values) {
            addCriterion("extra1 not in", values, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1Between(String value1, String value2) {
            addCriterion("extra1 between", value1, value2, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotBetween(String value1, String value2) {
            addCriterion("extra1 not between", value1, value2, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra2IsNull() {
            addCriterion("extra2 is null");
            return (Criteria) this;
        }

        public Criteria andExtra2IsNotNull() {
            addCriterion("extra2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra2EqualTo(String value) {
            addCriterion("extra2 =", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotEqualTo(String value) {
            addCriterion("extra2 <>", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2GreaterThan(String value) {
            addCriterion("extra2 >", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2GreaterThanOrEqualTo(String value) {
            addCriterion("extra2 >=", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2LessThan(String value) {
            addCriterion("extra2 <", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2LessThanOrEqualTo(String value) {
            addCriterion("extra2 <=", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2Like(String value) {
            addCriterion("extra2 like", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotLike(String value) {
            addCriterion("extra2 not like", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2In(List<String> values) {
            addCriterion("extra2 in", values, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotIn(List<String> values) {
            addCriterion("extra2 not in", values, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2Between(String value1, String value2) {
            addCriterion("extra2 between", value1, value2, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotBetween(String value1, String value2) {
            addCriterion("extra2 not between", value1, value2, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra3IsNull() {
            addCriterion("extra3 is null");
            return (Criteria) this;
        }

        public Criteria andExtra3IsNotNull() {
            addCriterion("extra3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra3EqualTo(Integer value) {
            addCriterion("extra3 =", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotEqualTo(Integer value) {
            addCriterion("extra3 <>", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3GreaterThan(Integer value) {
            addCriterion("extra3 >", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3GreaterThanOrEqualTo(Integer value) {
            addCriterion("extra3 >=", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3LessThan(Integer value) {
            addCriterion("extra3 <", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3LessThanOrEqualTo(Integer value) {
            addCriterion("extra3 <=", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3In(List<Integer> values) {
            addCriterion("extra3 in", values, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotIn(List<Integer> values) {
            addCriterion("extra3 not in", values, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3Between(Integer value1, Integer value2) {
            addCriterion("extra3 between", value1, value2, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotBetween(Integer value1, Integer value2) {
            addCriterion("extra3 not between", value1, value2, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra4IsNull() {
            addCriterion("extra4 is null");
            return (Criteria) this;
        }

        public Criteria andExtra4IsNotNull() {
            addCriterion("extra4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra4EqualTo(Integer value) {
            addCriterion("extra4 =", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4NotEqualTo(Integer value) {
            addCriterion("extra4 <>", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4GreaterThan(Integer value) {
            addCriterion("extra4 >", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4GreaterThanOrEqualTo(Integer value) {
            addCriterion("extra4 >=", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4LessThan(Integer value) {
            addCriterion("extra4 <", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4LessThanOrEqualTo(Integer value) {
            addCriterion("extra4 <=", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4In(List<Integer> values) {
            addCriterion("extra4 in", values, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4NotIn(List<Integer> values) {
            addCriterion("extra4 not in", values, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4Between(Integer value1, Integer value2) {
            addCriterion("extra4 between", value1, value2, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4NotBetween(Integer value1, Integer value2) {
            addCriterion("extra4 not between", value1, value2, "extra4");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}