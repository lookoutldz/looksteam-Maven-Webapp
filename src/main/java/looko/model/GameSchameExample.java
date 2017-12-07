package looko.model;

import java.util.ArrayList;
import java.util.List;

public class GameSchameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameSchameExample() {
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

        public Criteria andAchievementnameIsNull() {
            addCriterion("achievementname is null");
            return (Criteria) this;
        }

        public Criteria andAchievementnameIsNotNull() {
            addCriterion("achievementname is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementnameEqualTo(String value) {
            addCriterion("achievementname =", value, "achievementname");
            return (Criteria) this;
        }

        public Criteria andAchievementnameNotEqualTo(String value) {
            addCriterion("achievementname <>", value, "achievementname");
            return (Criteria) this;
        }

        public Criteria andAchievementnameGreaterThan(String value) {
            addCriterion("achievementname >", value, "achievementname");
            return (Criteria) this;
        }

        public Criteria andAchievementnameGreaterThanOrEqualTo(String value) {
            addCriterion("achievementname >=", value, "achievementname");
            return (Criteria) this;
        }

        public Criteria andAchievementnameLessThan(String value) {
            addCriterion("achievementname <", value, "achievementname");
            return (Criteria) this;
        }

        public Criteria andAchievementnameLessThanOrEqualTo(String value) {
            addCriterion("achievementname <=", value, "achievementname");
            return (Criteria) this;
        }

        public Criteria andAchievementnameLike(String value) {
            addCriterion("achievementname like", value, "achievementname");
            return (Criteria) this;
        }

        public Criteria andAchievementnameNotLike(String value) {
            addCriterion("achievementname not like", value, "achievementname");
            return (Criteria) this;
        }

        public Criteria andAchievementnameIn(List<String> values) {
            addCriterion("achievementname in", values, "achievementname");
            return (Criteria) this;
        }

        public Criteria andAchievementnameNotIn(List<String> values) {
            addCriterion("achievementname not in", values, "achievementname");
            return (Criteria) this;
        }

        public Criteria andAchievementnameBetween(String value1, String value2) {
            addCriterion("achievementname between", value1, value2, "achievementname");
            return (Criteria) this;
        }

        public Criteria andAchievementnameNotBetween(String value1, String value2) {
            addCriterion("achievementname not between", value1, value2, "achievementname");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueIsNull() {
            addCriterion("defaultvalue is null");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueIsNotNull() {
            addCriterion("defaultvalue is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueEqualTo(Integer value) {
            addCriterion("defaultvalue =", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueNotEqualTo(Integer value) {
            addCriterion("defaultvalue <>", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueGreaterThan(Integer value) {
            addCriterion("defaultvalue >", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("defaultvalue >=", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueLessThan(Integer value) {
            addCriterion("defaultvalue <", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueLessThanOrEqualTo(Integer value) {
            addCriterion("defaultvalue <=", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueIn(List<Integer> values) {
            addCriterion("defaultvalue in", values, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueNotIn(List<Integer> values) {
            addCriterion("defaultvalue not in", values, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueBetween(Integer value1, Integer value2) {
            addCriterion("defaultvalue between", value1, value2, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("defaultvalue not between", value1, value2, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNull() {
            addCriterion("displayName is null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNotNull() {
            addCriterion("displayName is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameEqualTo(String value) {
            addCriterion("displayName =", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotEqualTo(String value) {
            addCriterion("displayName <>", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThan(String value) {
            addCriterion("displayName >", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThanOrEqualTo(String value) {
            addCriterion("displayName >=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThan(String value) {
            addCriterion("displayName <", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThanOrEqualTo(String value) {
            addCriterion("displayName <=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLike(String value) {
            addCriterion("displayName like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotLike(String value) {
            addCriterion("displayName not like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIn(List<String> values) {
            addCriterion("displayName in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotIn(List<String> values) {
            addCriterion("displayName not in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameBetween(String value1, String value2) {
            addCriterion("displayName between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotBetween(String value1, String value2) {
            addCriterion("displayName not between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andHiddenIsNull() {
            addCriterion("hidden is null");
            return (Criteria) this;
        }

        public Criteria andHiddenIsNotNull() {
            addCriterion("hidden is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenEqualTo(Integer value) {
            addCriterion("hidden =", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotEqualTo(Integer value) {
            addCriterion("hidden <>", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThan(Integer value) {
            addCriterion("hidden >", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThanOrEqualTo(Integer value) {
            addCriterion("hidden >=", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenLessThan(Integer value) {
            addCriterion("hidden <", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenLessThanOrEqualTo(Integer value) {
            addCriterion("hidden <=", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenIn(List<Integer> values) {
            addCriterion("hidden in", values, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotIn(List<Integer> values) {
            addCriterion("hidden not in", values, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenBetween(Integer value1, Integer value2) {
            addCriterion("hidden between", value1, value2, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotBetween(Integer value1, Integer value2) {
            addCriterion("hidden not between", value1, value2, "hidden");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIcongrayIsNull() {
            addCriterion("icongray is null");
            return (Criteria) this;
        }

        public Criteria andIcongrayIsNotNull() {
            addCriterion("icongray is not null");
            return (Criteria) this;
        }

        public Criteria andIcongrayEqualTo(String value) {
            addCriterion("icongray =", value, "icongray");
            return (Criteria) this;
        }

        public Criteria andIcongrayNotEqualTo(String value) {
            addCriterion("icongray <>", value, "icongray");
            return (Criteria) this;
        }

        public Criteria andIcongrayGreaterThan(String value) {
            addCriterion("icongray >", value, "icongray");
            return (Criteria) this;
        }

        public Criteria andIcongrayGreaterThanOrEqualTo(String value) {
            addCriterion("icongray >=", value, "icongray");
            return (Criteria) this;
        }

        public Criteria andIcongrayLessThan(String value) {
            addCriterion("icongray <", value, "icongray");
            return (Criteria) this;
        }

        public Criteria andIcongrayLessThanOrEqualTo(String value) {
            addCriterion("icongray <=", value, "icongray");
            return (Criteria) this;
        }

        public Criteria andIcongrayLike(String value) {
            addCriterion("icongray like", value, "icongray");
            return (Criteria) this;
        }

        public Criteria andIcongrayNotLike(String value) {
            addCriterion("icongray not like", value, "icongray");
            return (Criteria) this;
        }

        public Criteria andIcongrayIn(List<String> values) {
            addCriterion("icongray in", values, "icongray");
            return (Criteria) this;
        }

        public Criteria andIcongrayNotIn(List<String> values) {
            addCriterion("icongray not in", values, "icongray");
            return (Criteria) this;
        }

        public Criteria andIcongrayBetween(String value1, String value2) {
            addCriterion("icongray between", value1, value2, "icongray");
            return (Criteria) this;
        }

        public Criteria andIcongrayNotBetween(String value1, String value2) {
            addCriterion("icongray not between", value1, value2, "icongray");
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