package looko.model;

import java.util.ArrayList;
import java.util.List;

public class FriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FriendExample() {
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

        public Criteria andFriendSteamidIsNull() {
            addCriterion("friend_steamid is null");
            return (Criteria) this;
        }

        public Criteria andFriendSteamidIsNotNull() {
            addCriterion("friend_steamid is not null");
            return (Criteria) this;
        }

        public Criteria andFriendSteamidEqualTo(String value) {
            addCriterion("friend_steamid =", value, "friendSteamid");
            return (Criteria) this;
        }

        public Criteria andFriendSteamidNotEqualTo(String value) {
            addCriterion("friend_steamid <>", value, "friendSteamid");
            return (Criteria) this;
        }

        public Criteria andFriendSteamidGreaterThan(String value) {
            addCriterion("friend_steamid >", value, "friendSteamid");
            return (Criteria) this;
        }

        public Criteria andFriendSteamidGreaterThanOrEqualTo(String value) {
            addCriterion("friend_steamid >=", value, "friendSteamid");
            return (Criteria) this;
        }

        public Criteria andFriendSteamidLessThan(String value) {
            addCriterion("friend_steamid <", value, "friendSteamid");
            return (Criteria) this;
        }

        public Criteria andFriendSteamidLessThanOrEqualTo(String value) {
            addCriterion("friend_steamid <=", value, "friendSteamid");
            return (Criteria) this;
        }

        public Criteria andFriendSteamidLike(String value) {
            addCriterion("friend_steamid like", value, "friendSteamid");
            return (Criteria) this;
        }

        public Criteria andFriendSteamidNotLike(String value) {
            addCriterion("friend_steamid not like", value, "friendSteamid");
            return (Criteria) this;
        }

        public Criteria andFriendSteamidIn(List<String> values) {
            addCriterion("friend_steamid in", values, "friendSteamid");
            return (Criteria) this;
        }

        public Criteria andFriendSteamidNotIn(List<String> values) {
            addCriterion("friend_steamid not in", values, "friendSteamid");
            return (Criteria) this;
        }

        public Criteria andFriendSteamidBetween(String value1, String value2) {
            addCriterion("friend_steamid between", value1, value2, "friendSteamid");
            return (Criteria) this;
        }

        public Criteria andFriendSteamidNotBetween(String value1, String value2) {
            addCriterion("friend_steamid not between", value1, value2, "friendSteamid");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNull() {
            addCriterion("relationship is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNotNull() {
            addCriterion("relationship is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipEqualTo(String value) {
            addCriterion("relationship =", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotEqualTo(String value) {
            addCriterion("relationship <>", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThan(String value) {
            addCriterion("relationship >", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("relationship >=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThan(String value) {
            addCriterion("relationship <", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThanOrEqualTo(String value) {
            addCriterion("relationship <=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLike(String value) {
            addCriterion("relationship like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotLike(String value) {
            addCriterion("relationship not like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipIn(List<String> values) {
            addCriterion("relationship in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotIn(List<String> values) {
            addCriterion("relationship not in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipBetween(String value1, String value2) {
            addCriterion("relationship between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotBetween(String value1, String value2) {
            addCriterion("relationship not between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andFriendSinceIsNull() {
            addCriterion("friend_since is null");
            return (Criteria) this;
        }

        public Criteria andFriendSinceIsNotNull() {
            addCriterion("friend_since is not null");
            return (Criteria) this;
        }

        public Criteria andFriendSinceEqualTo(Integer value) {
            addCriterion("friend_since =", value, "friendSince");
            return (Criteria) this;
        }

        public Criteria andFriendSinceNotEqualTo(Integer value) {
            addCriterion("friend_since <>", value, "friendSince");
            return (Criteria) this;
        }

        public Criteria andFriendSinceGreaterThan(Integer value) {
            addCriterion("friend_since >", value, "friendSince");
            return (Criteria) this;
        }

        public Criteria andFriendSinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("friend_since >=", value, "friendSince");
            return (Criteria) this;
        }

        public Criteria andFriendSinceLessThan(Integer value) {
            addCriterion("friend_since <", value, "friendSince");
            return (Criteria) this;
        }

        public Criteria andFriendSinceLessThanOrEqualTo(Integer value) {
            addCriterion("friend_since <=", value, "friendSince");
            return (Criteria) this;
        }

        public Criteria andFriendSinceIn(List<Integer> values) {
            addCriterion("friend_since in", values, "friendSince");
            return (Criteria) this;
        }

        public Criteria andFriendSinceNotIn(List<Integer> values) {
            addCriterion("friend_since not in", values, "friendSince");
            return (Criteria) this;
        }

        public Criteria andFriendSinceBetween(Integer value1, Integer value2) {
            addCriterion("friend_since between", value1, value2, "friendSince");
            return (Criteria) this;
        }

        public Criteria andFriendSinceNotBetween(Integer value1, Integer value2) {
            addCriterion("friend_since not between", value1, value2, "friendSince");
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