package looko.model;

import java.util.ArrayList;
import java.util.List;

public class PlayerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayerExample() {
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

        public Criteria andCommunityvisibilitystateIsNull() {
            addCriterion("communityvisibilitystate is null");
            return (Criteria) this;
        }

        public Criteria andCommunityvisibilitystateIsNotNull() {
            addCriterion("communityvisibilitystate is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityvisibilitystateEqualTo(Integer value) {
            addCriterion("communityvisibilitystate =", value, "communityvisibilitystate");
            return (Criteria) this;
        }

        public Criteria andCommunityvisibilitystateNotEqualTo(Integer value) {
            addCriterion("communityvisibilitystate <>", value, "communityvisibilitystate");
            return (Criteria) this;
        }

        public Criteria andCommunityvisibilitystateGreaterThan(Integer value) {
            addCriterion("communityvisibilitystate >", value, "communityvisibilitystate");
            return (Criteria) this;
        }

        public Criteria andCommunityvisibilitystateGreaterThanOrEqualTo(Integer value) {
            addCriterion("communityvisibilitystate >=", value, "communityvisibilitystate");
            return (Criteria) this;
        }

        public Criteria andCommunityvisibilitystateLessThan(Integer value) {
            addCriterion("communityvisibilitystate <", value, "communityvisibilitystate");
            return (Criteria) this;
        }

        public Criteria andCommunityvisibilitystateLessThanOrEqualTo(Integer value) {
            addCriterion("communityvisibilitystate <=", value, "communityvisibilitystate");
            return (Criteria) this;
        }

        public Criteria andCommunityvisibilitystateIn(List<Integer> values) {
            addCriterion("communityvisibilitystate in", values, "communityvisibilitystate");
            return (Criteria) this;
        }

        public Criteria andCommunityvisibilitystateNotIn(List<Integer> values) {
            addCriterion("communityvisibilitystate not in", values, "communityvisibilitystate");
            return (Criteria) this;
        }

        public Criteria andCommunityvisibilitystateBetween(Integer value1, Integer value2) {
            addCriterion("communityvisibilitystate between", value1, value2, "communityvisibilitystate");
            return (Criteria) this;
        }

        public Criteria andCommunityvisibilitystateNotBetween(Integer value1, Integer value2) {
            addCriterion("communityvisibilitystate not between", value1, value2, "communityvisibilitystate");
            return (Criteria) this;
        }

        public Criteria andProfilestateIsNull() {
            addCriterion("profilestate is null");
            return (Criteria) this;
        }

        public Criteria andProfilestateIsNotNull() {
            addCriterion("profilestate is not null");
            return (Criteria) this;
        }

        public Criteria andProfilestateEqualTo(Integer value) {
            addCriterion("profilestate =", value, "profilestate");
            return (Criteria) this;
        }

        public Criteria andProfilestateNotEqualTo(Integer value) {
            addCriterion("profilestate <>", value, "profilestate");
            return (Criteria) this;
        }

        public Criteria andProfilestateGreaterThan(Integer value) {
            addCriterion("profilestate >", value, "profilestate");
            return (Criteria) this;
        }

        public Criteria andProfilestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("profilestate >=", value, "profilestate");
            return (Criteria) this;
        }

        public Criteria andProfilestateLessThan(Integer value) {
            addCriterion("profilestate <", value, "profilestate");
            return (Criteria) this;
        }

        public Criteria andProfilestateLessThanOrEqualTo(Integer value) {
            addCriterion("profilestate <=", value, "profilestate");
            return (Criteria) this;
        }

        public Criteria andProfilestateIn(List<Integer> values) {
            addCriterion("profilestate in", values, "profilestate");
            return (Criteria) this;
        }

        public Criteria andProfilestateNotIn(List<Integer> values) {
            addCriterion("profilestate not in", values, "profilestate");
            return (Criteria) this;
        }

        public Criteria andProfilestateBetween(Integer value1, Integer value2) {
            addCriterion("profilestate between", value1, value2, "profilestate");
            return (Criteria) this;
        }

        public Criteria andProfilestateNotBetween(Integer value1, Integer value2) {
            addCriterion("profilestate not between", value1, value2, "profilestate");
            return (Criteria) this;
        }

        public Criteria andPersonanameIsNull() {
            addCriterion("personaname is null");
            return (Criteria) this;
        }

        public Criteria andPersonanameIsNotNull() {
            addCriterion("personaname is not null");
            return (Criteria) this;
        }

        public Criteria andPersonanameEqualTo(String value) {
            addCriterion("personaname =", value, "personaname");
            return (Criteria) this;
        }

        public Criteria andPersonanameNotEqualTo(String value) {
            addCriterion("personaname <>", value, "personaname");
            return (Criteria) this;
        }

        public Criteria andPersonanameGreaterThan(String value) {
            addCriterion("personaname >", value, "personaname");
            return (Criteria) this;
        }

        public Criteria andPersonanameGreaterThanOrEqualTo(String value) {
            addCriterion("personaname >=", value, "personaname");
            return (Criteria) this;
        }

        public Criteria andPersonanameLessThan(String value) {
            addCriterion("personaname <", value, "personaname");
            return (Criteria) this;
        }

        public Criteria andPersonanameLessThanOrEqualTo(String value) {
            addCriterion("personaname <=", value, "personaname");
            return (Criteria) this;
        }

        public Criteria andPersonanameLike(String value) {
            addCriterion("personaname like", value, "personaname");
            return (Criteria) this;
        }

        public Criteria andPersonanameNotLike(String value) {
            addCriterion("personaname not like", value, "personaname");
            return (Criteria) this;
        }

        public Criteria andPersonanameIn(List<String> values) {
            addCriterion("personaname in", values, "personaname");
            return (Criteria) this;
        }

        public Criteria andPersonanameNotIn(List<String> values) {
            addCriterion("personaname not in", values, "personaname");
            return (Criteria) this;
        }

        public Criteria andPersonanameBetween(String value1, String value2) {
            addCriterion("personaname between", value1, value2, "personaname");
            return (Criteria) this;
        }

        public Criteria andPersonanameNotBetween(String value1, String value2) {
            addCriterion("personaname not between", value1, value2, "personaname");
            return (Criteria) this;
        }

        public Criteria andLastlogoffIsNull() {
            addCriterion("lastlogoff is null");
            return (Criteria) this;
        }

        public Criteria andLastlogoffIsNotNull() {
            addCriterion("lastlogoff is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogoffEqualTo(Integer value) {
            addCriterion("lastlogoff =", value, "lastlogoff");
            return (Criteria) this;
        }

        public Criteria andLastlogoffNotEqualTo(Integer value) {
            addCriterion("lastlogoff <>", value, "lastlogoff");
            return (Criteria) this;
        }

        public Criteria andLastlogoffGreaterThan(Integer value) {
            addCriterion("lastlogoff >", value, "lastlogoff");
            return (Criteria) this;
        }

        public Criteria andLastlogoffGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastlogoff >=", value, "lastlogoff");
            return (Criteria) this;
        }

        public Criteria andLastlogoffLessThan(Integer value) {
            addCriterion("lastlogoff <", value, "lastlogoff");
            return (Criteria) this;
        }

        public Criteria andLastlogoffLessThanOrEqualTo(Integer value) {
            addCriterion("lastlogoff <=", value, "lastlogoff");
            return (Criteria) this;
        }

        public Criteria andLastlogoffIn(List<Integer> values) {
            addCriterion("lastlogoff in", values, "lastlogoff");
            return (Criteria) this;
        }

        public Criteria andLastlogoffNotIn(List<Integer> values) {
            addCriterion("lastlogoff not in", values, "lastlogoff");
            return (Criteria) this;
        }

        public Criteria andLastlogoffBetween(Integer value1, Integer value2) {
            addCriterion("lastlogoff between", value1, value2, "lastlogoff");
            return (Criteria) this;
        }

        public Criteria andLastlogoffNotBetween(Integer value1, Integer value2) {
            addCriterion("lastlogoff not between", value1, value2, "lastlogoff");
            return (Criteria) this;
        }

        public Criteria andCommentpermissionIsNull() {
            addCriterion("commentpermission is null");
            return (Criteria) this;
        }

        public Criteria andCommentpermissionIsNotNull() {
            addCriterion("commentpermission is not null");
            return (Criteria) this;
        }

        public Criteria andCommentpermissionEqualTo(Integer value) {
            addCriterion("commentpermission =", value, "commentpermission");
            return (Criteria) this;
        }

        public Criteria andCommentpermissionNotEqualTo(Integer value) {
            addCriterion("commentpermission <>", value, "commentpermission");
            return (Criteria) this;
        }

        public Criteria andCommentpermissionGreaterThan(Integer value) {
            addCriterion("commentpermission >", value, "commentpermission");
            return (Criteria) this;
        }

        public Criteria andCommentpermissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentpermission >=", value, "commentpermission");
            return (Criteria) this;
        }

        public Criteria andCommentpermissionLessThan(Integer value) {
            addCriterion("commentpermission <", value, "commentpermission");
            return (Criteria) this;
        }

        public Criteria andCommentpermissionLessThanOrEqualTo(Integer value) {
            addCriterion("commentpermission <=", value, "commentpermission");
            return (Criteria) this;
        }

        public Criteria andCommentpermissionIn(List<Integer> values) {
            addCriterion("commentpermission in", values, "commentpermission");
            return (Criteria) this;
        }

        public Criteria andCommentpermissionNotIn(List<Integer> values) {
            addCriterion("commentpermission not in", values, "commentpermission");
            return (Criteria) this;
        }

        public Criteria andCommentpermissionBetween(Integer value1, Integer value2) {
            addCriterion("commentpermission between", value1, value2, "commentpermission");
            return (Criteria) this;
        }

        public Criteria andCommentpermissionNotBetween(Integer value1, Integer value2) {
            addCriterion("commentpermission not between", value1, value2, "commentpermission");
            return (Criteria) this;
        }

        public Criteria andProfileurlIsNull() {
            addCriterion("profileurl is null");
            return (Criteria) this;
        }

        public Criteria andProfileurlIsNotNull() {
            addCriterion("profileurl is not null");
            return (Criteria) this;
        }

        public Criteria andProfileurlEqualTo(String value) {
            addCriterion("profileurl =", value, "profileurl");
            return (Criteria) this;
        }

        public Criteria andProfileurlNotEqualTo(String value) {
            addCriterion("profileurl <>", value, "profileurl");
            return (Criteria) this;
        }

        public Criteria andProfileurlGreaterThan(String value) {
            addCriterion("profileurl >", value, "profileurl");
            return (Criteria) this;
        }

        public Criteria andProfileurlGreaterThanOrEqualTo(String value) {
            addCriterion("profileurl >=", value, "profileurl");
            return (Criteria) this;
        }

        public Criteria andProfileurlLessThan(String value) {
            addCriterion("profileurl <", value, "profileurl");
            return (Criteria) this;
        }

        public Criteria andProfileurlLessThanOrEqualTo(String value) {
            addCriterion("profileurl <=", value, "profileurl");
            return (Criteria) this;
        }

        public Criteria andProfileurlLike(String value) {
            addCriterion("profileurl like", value, "profileurl");
            return (Criteria) this;
        }

        public Criteria andProfileurlNotLike(String value) {
            addCriterion("profileurl not like", value, "profileurl");
            return (Criteria) this;
        }

        public Criteria andProfileurlIn(List<String> values) {
            addCriterion("profileurl in", values, "profileurl");
            return (Criteria) this;
        }

        public Criteria andProfileurlNotIn(List<String> values) {
            addCriterion("profileurl not in", values, "profileurl");
            return (Criteria) this;
        }

        public Criteria andProfileurlBetween(String value1, String value2) {
            addCriterion("profileurl between", value1, value2, "profileurl");
            return (Criteria) this;
        }

        public Criteria andProfileurlNotBetween(String value1, String value2) {
            addCriterion("profileurl not between", value1, value2, "profileurl");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumIsNull() {
            addCriterion("avatarmedium is null");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumIsNotNull() {
            addCriterion("avatarmedium is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumEqualTo(String value) {
            addCriterion("avatarmedium =", value, "avatarmedium");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumNotEqualTo(String value) {
            addCriterion("avatarmedium <>", value, "avatarmedium");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumGreaterThan(String value) {
            addCriterion("avatarmedium >", value, "avatarmedium");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumGreaterThanOrEqualTo(String value) {
            addCriterion("avatarmedium >=", value, "avatarmedium");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumLessThan(String value) {
            addCriterion("avatarmedium <", value, "avatarmedium");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumLessThanOrEqualTo(String value) {
            addCriterion("avatarmedium <=", value, "avatarmedium");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumLike(String value) {
            addCriterion("avatarmedium like", value, "avatarmedium");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumNotLike(String value) {
            addCriterion("avatarmedium not like", value, "avatarmedium");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumIn(List<String> values) {
            addCriterion("avatarmedium in", values, "avatarmedium");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumNotIn(List<String> values) {
            addCriterion("avatarmedium not in", values, "avatarmedium");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumBetween(String value1, String value2) {
            addCriterion("avatarmedium between", value1, value2, "avatarmedium");
            return (Criteria) this;
        }

        public Criteria andAvatarmediumNotBetween(String value1, String value2) {
            addCriterion("avatarmedium not between", value1, value2, "avatarmedium");
            return (Criteria) this;
        }

        public Criteria andAvatarfullIsNull() {
            addCriterion("avatarfull is null");
            return (Criteria) this;
        }

        public Criteria andAvatarfullIsNotNull() {
            addCriterion("avatarfull is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarfullEqualTo(String value) {
            addCriterion("avatarfull =", value, "avatarfull");
            return (Criteria) this;
        }

        public Criteria andAvatarfullNotEqualTo(String value) {
            addCriterion("avatarfull <>", value, "avatarfull");
            return (Criteria) this;
        }

        public Criteria andAvatarfullGreaterThan(String value) {
            addCriterion("avatarfull >", value, "avatarfull");
            return (Criteria) this;
        }

        public Criteria andAvatarfullGreaterThanOrEqualTo(String value) {
            addCriterion("avatarfull >=", value, "avatarfull");
            return (Criteria) this;
        }

        public Criteria andAvatarfullLessThan(String value) {
            addCriterion("avatarfull <", value, "avatarfull");
            return (Criteria) this;
        }

        public Criteria andAvatarfullLessThanOrEqualTo(String value) {
            addCriterion("avatarfull <=", value, "avatarfull");
            return (Criteria) this;
        }

        public Criteria andAvatarfullLike(String value) {
            addCriterion("avatarfull like", value, "avatarfull");
            return (Criteria) this;
        }

        public Criteria andAvatarfullNotLike(String value) {
            addCriterion("avatarfull not like", value, "avatarfull");
            return (Criteria) this;
        }

        public Criteria andAvatarfullIn(List<String> values) {
            addCriterion("avatarfull in", values, "avatarfull");
            return (Criteria) this;
        }

        public Criteria andAvatarfullNotIn(List<String> values) {
            addCriterion("avatarfull not in", values, "avatarfull");
            return (Criteria) this;
        }

        public Criteria andAvatarfullBetween(String value1, String value2) {
            addCriterion("avatarfull between", value1, value2, "avatarfull");
            return (Criteria) this;
        }

        public Criteria andAvatarfullNotBetween(String value1, String value2) {
            addCriterion("avatarfull not between", value1, value2, "avatarfull");
            return (Criteria) this;
        }

        public Criteria andPersonastateIsNull() {
            addCriterion("personastate is null");
            return (Criteria) this;
        }

        public Criteria andPersonastateIsNotNull() {
            addCriterion("personastate is not null");
            return (Criteria) this;
        }

        public Criteria andPersonastateEqualTo(Integer value) {
            addCriterion("personastate =", value, "personastate");
            return (Criteria) this;
        }

        public Criteria andPersonastateNotEqualTo(Integer value) {
            addCriterion("personastate <>", value, "personastate");
            return (Criteria) this;
        }

        public Criteria andPersonastateGreaterThan(Integer value) {
            addCriterion("personastate >", value, "personastate");
            return (Criteria) this;
        }

        public Criteria andPersonastateGreaterThanOrEqualTo(Integer value) {
            addCriterion("personastate >=", value, "personastate");
            return (Criteria) this;
        }

        public Criteria andPersonastateLessThan(Integer value) {
            addCriterion("personastate <", value, "personastate");
            return (Criteria) this;
        }

        public Criteria andPersonastateLessThanOrEqualTo(Integer value) {
            addCriterion("personastate <=", value, "personastate");
            return (Criteria) this;
        }

        public Criteria andPersonastateIn(List<Integer> values) {
            addCriterion("personastate in", values, "personastate");
            return (Criteria) this;
        }

        public Criteria andPersonastateNotIn(List<Integer> values) {
            addCriterion("personastate not in", values, "personastate");
            return (Criteria) this;
        }

        public Criteria andPersonastateBetween(Integer value1, Integer value2) {
            addCriterion("personastate between", value1, value2, "personastate");
            return (Criteria) this;
        }

        public Criteria andPersonastateNotBetween(Integer value1, Integer value2) {
            addCriterion("personastate not between", value1, value2, "personastate");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidIsNull() {
            addCriterion("primaryclanid is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidIsNotNull() {
            addCriterion("primaryclanid is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidEqualTo(String value) {
            addCriterion("primaryclanid =", value, "primaryclanid");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidNotEqualTo(String value) {
            addCriterion("primaryclanid <>", value, "primaryclanid");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidGreaterThan(String value) {
            addCriterion("primaryclanid >", value, "primaryclanid");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidGreaterThanOrEqualTo(String value) {
            addCriterion("primaryclanid >=", value, "primaryclanid");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidLessThan(String value) {
            addCriterion("primaryclanid <", value, "primaryclanid");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidLessThanOrEqualTo(String value) {
            addCriterion("primaryclanid <=", value, "primaryclanid");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidLike(String value) {
            addCriterion("primaryclanid like", value, "primaryclanid");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidNotLike(String value) {
            addCriterion("primaryclanid not like", value, "primaryclanid");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidIn(List<String> values) {
            addCriterion("primaryclanid in", values, "primaryclanid");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidNotIn(List<String> values) {
            addCriterion("primaryclanid not in", values, "primaryclanid");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidBetween(String value1, String value2) {
            addCriterion("primaryclanid between", value1, value2, "primaryclanid");
            return (Criteria) this;
        }

        public Criteria andPrimaryclanidNotBetween(String value1, String value2) {
            addCriterion("primaryclanid not between", value1, value2, "primaryclanid");
            return (Criteria) this;
        }

        public Criteria andTimecreatedIsNull() {
            addCriterion("timecreated is null");
            return (Criteria) this;
        }

        public Criteria andTimecreatedIsNotNull() {
            addCriterion("timecreated is not null");
            return (Criteria) this;
        }

        public Criteria andTimecreatedEqualTo(Integer value) {
            addCriterion("timecreated =", value, "timecreated");
            return (Criteria) this;
        }

        public Criteria andTimecreatedNotEqualTo(Integer value) {
            addCriterion("timecreated <>", value, "timecreated");
            return (Criteria) this;
        }

        public Criteria andTimecreatedGreaterThan(Integer value) {
            addCriterion("timecreated >", value, "timecreated");
            return (Criteria) this;
        }

        public Criteria andTimecreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("timecreated >=", value, "timecreated");
            return (Criteria) this;
        }

        public Criteria andTimecreatedLessThan(Integer value) {
            addCriterion("timecreated <", value, "timecreated");
            return (Criteria) this;
        }

        public Criteria andTimecreatedLessThanOrEqualTo(Integer value) {
            addCriterion("timecreated <=", value, "timecreated");
            return (Criteria) this;
        }

        public Criteria andTimecreatedIn(List<Integer> values) {
            addCriterion("timecreated in", values, "timecreated");
            return (Criteria) this;
        }

        public Criteria andTimecreatedNotIn(List<Integer> values) {
            addCriterion("timecreated not in", values, "timecreated");
            return (Criteria) this;
        }

        public Criteria andTimecreatedBetween(Integer value1, Integer value2) {
            addCriterion("timecreated between", value1, value2, "timecreated");
            return (Criteria) this;
        }

        public Criteria andTimecreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("timecreated not between", value1, value2, "timecreated");
            return (Criteria) this;
        }

        public Criteria andPersonastateflagsIsNull() {
            addCriterion("personastateflags is null");
            return (Criteria) this;
        }

        public Criteria andPersonastateflagsIsNotNull() {
            addCriterion("personastateflags is not null");
            return (Criteria) this;
        }

        public Criteria andPersonastateflagsEqualTo(Integer value) {
            addCriterion("personastateflags =", value, "personastateflags");
            return (Criteria) this;
        }

        public Criteria andPersonastateflagsNotEqualTo(Integer value) {
            addCriterion("personastateflags <>", value, "personastateflags");
            return (Criteria) this;
        }

        public Criteria andPersonastateflagsGreaterThan(Integer value) {
            addCriterion("personastateflags >", value, "personastateflags");
            return (Criteria) this;
        }

        public Criteria andPersonastateflagsGreaterThanOrEqualTo(Integer value) {
            addCriterion("personastateflags >=", value, "personastateflags");
            return (Criteria) this;
        }

        public Criteria andPersonastateflagsLessThan(Integer value) {
            addCriterion("personastateflags <", value, "personastateflags");
            return (Criteria) this;
        }

        public Criteria andPersonastateflagsLessThanOrEqualTo(Integer value) {
            addCriterion("personastateflags <=", value, "personastateflags");
            return (Criteria) this;
        }

        public Criteria andPersonastateflagsIn(List<Integer> values) {
            addCriterion("personastateflags in", values, "personastateflags");
            return (Criteria) this;
        }

        public Criteria andPersonastateflagsNotIn(List<Integer> values) {
            addCriterion("personastateflags not in", values, "personastateflags");
            return (Criteria) this;
        }

        public Criteria andPersonastateflagsBetween(Integer value1, Integer value2) {
            addCriterion("personastateflags between", value1, value2, "personastateflags");
            return (Criteria) this;
        }

        public Criteria andPersonastateflagsNotBetween(Integer value1, Integer value2) {
            addCriterion("personastateflags not between", value1, value2, "personastateflags");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoIsNull() {
            addCriterion("gameextrainfo is null");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoIsNotNull() {
            addCriterion("gameextrainfo is not null");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoEqualTo(String value) {
            addCriterion("gameextrainfo =", value, "gameextrainfo");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoNotEqualTo(String value) {
            addCriterion("gameextrainfo <>", value, "gameextrainfo");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoGreaterThan(String value) {
            addCriterion("gameextrainfo >", value, "gameextrainfo");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoGreaterThanOrEqualTo(String value) {
            addCriterion("gameextrainfo >=", value, "gameextrainfo");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoLessThan(String value) {
            addCriterion("gameextrainfo <", value, "gameextrainfo");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoLessThanOrEqualTo(String value) {
            addCriterion("gameextrainfo <=", value, "gameextrainfo");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoLike(String value) {
            addCriterion("gameextrainfo like", value, "gameextrainfo");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoNotLike(String value) {
            addCriterion("gameextrainfo not like", value, "gameextrainfo");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoIn(List<String> values) {
            addCriterion("gameextrainfo in", values, "gameextrainfo");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoNotIn(List<String> values) {
            addCriterion("gameextrainfo not in", values, "gameextrainfo");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoBetween(String value1, String value2) {
            addCriterion("gameextrainfo between", value1, value2, "gameextrainfo");
            return (Criteria) this;
        }

        public Criteria andGameextrainfoNotBetween(String value1, String value2) {
            addCriterion("gameextrainfo not between", value1, value2, "gameextrainfo");
            return (Criteria) this;
        }

        public Criteria andGameserveripIsNull() {
            addCriterion("gameserverip is null");
            return (Criteria) this;
        }

        public Criteria andGameserveripIsNotNull() {
            addCriterion("gameserverip is not null");
            return (Criteria) this;
        }

        public Criteria andGameserveripEqualTo(String value) {
            addCriterion("gameserverip =", value, "gameserverip");
            return (Criteria) this;
        }

        public Criteria andGameserveripNotEqualTo(String value) {
            addCriterion("gameserverip <>", value, "gameserverip");
            return (Criteria) this;
        }

        public Criteria andGameserveripGreaterThan(String value) {
            addCriterion("gameserverip >", value, "gameserverip");
            return (Criteria) this;
        }

        public Criteria andGameserveripGreaterThanOrEqualTo(String value) {
            addCriterion("gameserverip >=", value, "gameserverip");
            return (Criteria) this;
        }

        public Criteria andGameserveripLessThan(String value) {
            addCriterion("gameserverip <", value, "gameserverip");
            return (Criteria) this;
        }

        public Criteria andGameserveripLessThanOrEqualTo(String value) {
            addCriterion("gameserverip <=", value, "gameserverip");
            return (Criteria) this;
        }

        public Criteria andGameserveripLike(String value) {
            addCriterion("gameserverip like", value, "gameserverip");
            return (Criteria) this;
        }

        public Criteria andGameserveripNotLike(String value) {
            addCriterion("gameserverip not like", value, "gameserverip");
            return (Criteria) this;
        }

        public Criteria andGameserveripIn(List<String> values) {
            addCriterion("gameserverip in", values, "gameserverip");
            return (Criteria) this;
        }

        public Criteria andGameserveripNotIn(List<String> values) {
            addCriterion("gameserverip not in", values, "gameserverip");
            return (Criteria) this;
        }

        public Criteria andGameserveripBetween(String value1, String value2) {
            addCriterion("gameserverip between", value1, value2, "gameserverip");
            return (Criteria) this;
        }

        public Criteria andGameserveripNotBetween(String value1, String value2) {
            addCriterion("gameserverip not between", value1, value2, "gameserverip");
            return (Criteria) this;
        }

        public Criteria andGameidIsNull() {
            addCriterion("gameid is null");
            return (Criteria) this;
        }

        public Criteria andGameidIsNotNull() {
            addCriterion("gameid is not null");
            return (Criteria) this;
        }

        public Criteria andGameidEqualTo(String value) {
            addCriterion("gameid =", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidNotEqualTo(String value) {
            addCriterion("gameid <>", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidGreaterThan(String value) {
            addCriterion("gameid >", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidGreaterThanOrEqualTo(String value) {
            addCriterion("gameid >=", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidLessThan(String value) {
            addCriterion("gameid <", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidLessThanOrEqualTo(String value) {
            addCriterion("gameid <=", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidLike(String value) {
            addCriterion("gameid like", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidNotLike(String value) {
            addCriterion("gameid not like", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidIn(List<String> values) {
            addCriterion("gameid in", values, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidNotIn(List<String> values) {
            addCriterion("gameid not in", values, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidBetween(String value1, String value2) {
            addCriterion("gameid between", value1, value2, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidNotBetween(String value1, String value2) {
            addCriterion("gameid not between", value1, value2, "gameid");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeIsNull() {
            addCriterion("loccountrycode is null");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeIsNotNull() {
            addCriterion("loccountrycode is not null");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeEqualTo(String value) {
            addCriterion("loccountrycode =", value, "loccountrycode");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeNotEqualTo(String value) {
            addCriterion("loccountrycode <>", value, "loccountrycode");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeGreaterThan(String value) {
            addCriterion("loccountrycode >", value, "loccountrycode");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeGreaterThanOrEqualTo(String value) {
            addCriterion("loccountrycode >=", value, "loccountrycode");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeLessThan(String value) {
            addCriterion("loccountrycode <", value, "loccountrycode");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeLessThanOrEqualTo(String value) {
            addCriterion("loccountrycode <=", value, "loccountrycode");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeLike(String value) {
            addCriterion("loccountrycode like", value, "loccountrycode");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeNotLike(String value) {
            addCriterion("loccountrycode not like", value, "loccountrycode");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeIn(List<String> values) {
            addCriterion("loccountrycode in", values, "loccountrycode");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeNotIn(List<String> values) {
            addCriterion("loccountrycode not in", values, "loccountrycode");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeBetween(String value1, String value2) {
            addCriterion("loccountrycode between", value1, value2, "loccountrycode");
            return (Criteria) this;
        }

        public Criteria andLoccountrycodeNotBetween(String value1, String value2) {
            addCriterion("loccountrycode not between", value1, value2, "loccountrycode");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeIsNull() {
            addCriterion("locstatecode is null");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeIsNotNull() {
            addCriterion("locstatecode is not null");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeEqualTo(String value) {
            addCriterion("locstatecode =", value, "locstatecode");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeNotEqualTo(String value) {
            addCriterion("locstatecode <>", value, "locstatecode");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeGreaterThan(String value) {
            addCriterion("locstatecode >", value, "locstatecode");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeGreaterThanOrEqualTo(String value) {
            addCriterion("locstatecode >=", value, "locstatecode");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeLessThan(String value) {
            addCriterion("locstatecode <", value, "locstatecode");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeLessThanOrEqualTo(String value) {
            addCriterion("locstatecode <=", value, "locstatecode");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeLike(String value) {
            addCriterion("locstatecode like", value, "locstatecode");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeNotLike(String value) {
            addCriterion("locstatecode not like", value, "locstatecode");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeIn(List<String> values) {
            addCriterion("locstatecode in", values, "locstatecode");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeNotIn(List<String> values) {
            addCriterion("locstatecode not in", values, "locstatecode");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeBetween(String value1, String value2) {
            addCriterion("locstatecode between", value1, value2, "locstatecode");
            return (Criteria) this;
        }

        public Criteria andLocstatecodeNotBetween(String value1, String value2) {
            addCriterion("locstatecode not between", value1, value2, "locstatecode");
            return (Criteria) this;
        }

        public Criteria andLoccityidIsNull() {
            addCriterion("loccityid is null");
            return (Criteria) this;
        }

        public Criteria andLoccityidIsNotNull() {
            addCriterion("loccityid is not null");
            return (Criteria) this;
        }

        public Criteria andLoccityidEqualTo(String value) {
            addCriterion("loccityid =", value, "loccityid");
            return (Criteria) this;
        }

        public Criteria andLoccityidNotEqualTo(String value) {
            addCriterion("loccityid <>", value, "loccityid");
            return (Criteria) this;
        }

        public Criteria andLoccityidGreaterThan(String value) {
            addCriterion("loccityid >", value, "loccityid");
            return (Criteria) this;
        }

        public Criteria andLoccityidGreaterThanOrEqualTo(String value) {
            addCriterion("loccityid >=", value, "loccityid");
            return (Criteria) this;
        }

        public Criteria andLoccityidLessThan(String value) {
            addCriterion("loccityid <", value, "loccityid");
            return (Criteria) this;
        }

        public Criteria andLoccityidLessThanOrEqualTo(String value) {
            addCriterion("loccityid <=", value, "loccityid");
            return (Criteria) this;
        }

        public Criteria andLoccityidLike(String value) {
            addCriterion("loccityid like", value, "loccityid");
            return (Criteria) this;
        }

        public Criteria andLoccityidNotLike(String value) {
            addCriterion("loccityid not like", value, "loccityid");
            return (Criteria) this;
        }

        public Criteria andLoccityidIn(List<String> values) {
            addCriterion("loccityid in", values, "loccityid");
            return (Criteria) this;
        }

        public Criteria andLoccityidNotIn(List<String> values) {
            addCriterion("loccityid not in", values, "loccityid");
            return (Criteria) this;
        }

        public Criteria andLoccityidBetween(String value1, String value2) {
            addCriterion("loccityid between", value1, value2, "loccityid");
            return (Criteria) this;
        }

        public Criteria andLoccityidNotBetween(String value1, String value2) {
            addCriterion("loccityid not between", value1, value2, "loccityid");
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