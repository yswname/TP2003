package cn.com.demo.springboot.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class DmUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmUserExample() {
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

        public Criteria andUrIdIsNull() {
            addCriterion("ur_id is null");
            return (Criteria) this;
        }

        public Criteria andUrIdIsNotNull() {
            addCriterion("ur_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrIdEqualTo(Integer value) {
            addCriterion("ur_id =", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdNotEqualTo(Integer value) {
            addCriterion("ur_id <>", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdGreaterThan(Integer value) {
            addCriterion("ur_id >", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ur_id >=", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdLessThan(Integer value) {
            addCriterion("ur_id <", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdLessThanOrEqualTo(Integer value) {
            addCriterion("ur_id <=", value, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdIn(List<Integer> values) {
            addCriterion("ur_id in", values, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdNotIn(List<Integer> values) {
            addCriterion("ur_id not in", values, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdBetween(Integer value1, Integer value2) {
            addCriterion("ur_id between", value1, value2, "urId");
            return (Criteria) this;
        }

        public Criteria andUrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ur_id not between", value1, value2, "urId");
            return (Criteria) this;
        }

        public Criteria andUrUserNameIsNull() {
            addCriterion("ur_user_name is null");
            return (Criteria) this;
        }

        public Criteria andUrUserNameIsNotNull() {
            addCriterion("ur_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUrUserNameEqualTo(String value) {
            addCriterion("ur_user_name =", value, "urUserName");
            return (Criteria) this;
        }

        public Criteria andUrUserNameNotEqualTo(String value) {
            addCriterion("ur_user_name <>", value, "urUserName");
            return (Criteria) this;
        }

        public Criteria andUrUserNameGreaterThan(String value) {
            addCriterion("ur_user_name >", value, "urUserName");
            return (Criteria) this;
        }

        public Criteria andUrUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("ur_user_name >=", value, "urUserName");
            return (Criteria) this;
        }

        public Criteria andUrUserNameLessThan(String value) {
            addCriterion("ur_user_name <", value, "urUserName");
            return (Criteria) this;
        }

        public Criteria andUrUserNameLessThanOrEqualTo(String value) {
            addCriterion("ur_user_name <=", value, "urUserName");
            return (Criteria) this;
        }

        public Criteria andUrUserNameLike(String value) {
            addCriterion("ur_user_name like", value, "urUserName");
            return (Criteria) this;
        }

        public Criteria andUrUserNameNotLike(String value) {
            addCriterion("ur_user_name not like", value, "urUserName");
            return (Criteria) this;
        }

        public Criteria andUrUserNameIn(List<String> values) {
            addCriterion("ur_user_name in", values, "urUserName");
            return (Criteria) this;
        }

        public Criteria andUrUserNameNotIn(List<String> values) {
            addCriterion("ur_user_name not in", values, "urUserName");
            return (Criteria) this;
        }

        public Criteria andUrUserNameBetween(String value1, String value2) {
            addCriterion("ur_user_name between", value1, value2, "urUserName");
            return (Criteria) this;
        }

        public Criteria andUrUserNameNotBetween(String value1, String value2) {
            addCriterion("ur_user_name not between", value1, value2, "urUserName");
            return (Criteria) this;
        }

        public Criteria andUrNameIsNull() {
            addCriterion("ur_name is null");
            return (Criteria) this;
        }

        public Criteria andUrNameIsNotNull() {
            addCriterion("ur_name is not null");
            return (Criteria) this;
        }

        public Criteria andUrNameEqualTo(String value) {
            addCriterion("ur_name =", value, "urName");
            return (Criteria) this;
        }

        public Criteria andUrNameNotEqualTo(String value) {
            addCriterion("ur_name <>", value, "urName");
            return (Criteria) this;
        }

        public Criteria andUrNameGreaterThan(String value) {
            addCriterion("ur_name >", value, "urName");
            return (Criteria) this;
        }

        public Criteria andUrNameGreaterThanOrEqualTo(String value) {
            addCriterion("ur_name >=", value, "urName");
            return (Criteria) this;
        }

        public Criteria andUrNameLessThan(String value) {
            addCriterion("ur_name <", value, "urName");
            return (Criteria) this;
        }

        public Criteria andUrNameLessThanOrEqualTo(String value) {
            addCriterion("ur_name <=", value, "urName");
            return (Criteria) this;
        }

        public Criteria andUrNameLike(String value) {
            addCriterion("ur_name like", value, "urName");
            return (Criteria) this;
        }

        public Criteria andUrNameNotLike(String value) {
            addCriterion("ur_name not like", value, "urName");
            return (Criteria) this;
        }

        public Criteria andUrNameIn(List<String> values) {
            addCriterion("ur_name in", values, "urName");
            return (Criteria) this;
        }

        public Criteria andUrNameNotIn(List<String> values) {
            addCriterion("ur_name not in", values, "urName");
            return (Criteria) this;
        }

        public Criteria andUrNameBetween(String value1, String value2) {
            addCriterion("ur_name between", value1, value2, "urName");
            return (Criteria) this;
        }

        public Criteria andUrNameNotBetween(String value1, String value2) {
            addCriterion("ur_name not between", value1, value2, "urName");
            return (Criteria) this;
        }

        public Criteria andUrPasswordIsNull() {
            addCriterion("ur_password is null");
            return (Criteria) this;
        }

        public Criteria andUrPasswordIsNotNull() {
            addCriterion("ur_password is not null");
            return (Criteria) this;
        }

        public Criteria andUrPasswordEqualTo(String value) {
            addCriterion("ur_password =", value, "urPassword");
            return (Criteria) this;
        }

        public Criteria andUrPasswordNotEqualTo(String value) {
            addCriterion("ur_password <>", value, "urPassword");
            return (Criteria) this;
        }

        public Criteria andUrPasswordGreaterThan(String value) {
            addCriterion("ur_password >", value, "urPassword");
            return (Criteria) this;
        }

        public Criteria andUrPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ur_password >=", value, "urPassword");
            return (Criteria) this;
        }

        public Criteria andUrPasswordLessThan(String value) {
            addCriterion("ur_password <", value, "urPassword");
            return (Criteria) this;
        }

        public Criteria andUrPasswordLessThanOrEqualTo(String value) {
            addCriterion("ur_password <=", value, "urPassword");
            return (Criteria) this;
        }

        public Criteria andUrPasswordLike(String value) {
            addCriterion("ur_password like", value, "urPassword");
            return (Criteria) this;
        }

        public Criteria andUrPasswordNotLike(String value) {
            addCriterion("ur_password not like", value, "urPassword");
            return (Criteria) this;
        }

        public Criteria andUrPasswordIn(List<String> values) {
            addCriterion("ur_password in", values, "urPassword");
            return (Criteria) this;
        }

        public Criteria andUrPasswordNotIn(List<String> values) {
            addCriterion("ur_password not in", values, "urPassword");
            return (Criteria) this;
        }

        public Criteria andUrPasswordBetween(String value1, String value2) {
            addCriterion("ur_password between", value1, value2, "urPassword");
            return (Criteria) this;
        }

        public Criteria andUrPasswordNotBetween(String value1, String value2) {
            addCriterion("ur_password not between", value1, value2, "urPassword");
            return (Criteria) this;
        }

        public Criteria andUrSexIsNull() {
            addCriterion("ur_sex is null");
            return (Criteria) this;
        }

        public Criteria andUrSexIsNotNull() {
            addCriterion("ur_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUrSexEqualTo(String value) {
            addCriterion("ur_sex =", value, "urSex");
            return (Criteria) this;
        }

        public Criteria andUrSexNotEqualTo(String value) {
            addCriterion("ur_sex <>", value, "urSex");
            return (Criteria) this;
        }

        public Criteria andUrSexGreaterThan(String value) {
            addCriterion("ur_sex >", value, "urSex");
            return (Criteria) this;
        }

        public Criteria andUrSexGreaterThanOrEqualTo(String value) {
            addCriterion("ur_sex >=", value, "urSex");
            return (Criteria) this;
        }

        public Criteria andUrSexLessThan(String value) {
            addCriterion("ur_sex <", value, "urSex");
            return (Criteria) this;
        }

        public Criteria andUrSexLessThanOrEqualTo(String value) {
            addCriterion("ur_sex <=", value, "urSex");
            return (Criteria) this;
        }

        public Criteria andUrSexLike(String value) {
            addCriterion("ur_sex like", value, "urSex");
            return (Criteria) this;
        }

        public Criteria andUrSexNotLike(String value) {
            addCriterion("ur_sex not like", value, "urSex");
            return (Criteria) this;
        }

        public Criteria andUrSexIn(List<String> values) {
            addCriterion("ur_sex in", values, "urSex");
            return (Criteria) this;
        }

        public Criteria andUrSexNotIn(List<String> values) {
            addCriterion("ur_sex not in", values, "urSex");
            return (Criteria) this;
        }

        public Criteria andUrSexBetween(String value1, String value2) {
            addCriterion("ur_sex between", value1, value2, "urSex");
            return (Criteria) this;
        }

        public Criteria andUrSexNotBetween(String value1, String value2) {
            addCriterion("ur_sex not between", value1, value2, "urSex");
            return (Criteria) this;
        }

        public Criteria andUrAgeIsNull() {
            addCriterion("ur_age is null");
            return (Criteria) this;
        }

        public Criteria andUrAgeIsNotNull() {
            addCriterion("ur_age is not null");
            return (Criteria) this;
        }

        public Criteria andUrAgeEqualTo(Integer value) {
            addCriterion("ur_age =", value, "urAge");
            return (Criteria) this;
        }

        public Criteria andUrAgeNotEqualTo(Integer value) {
            addCriterion("ur_age <>", value, "urAge");
            return (Criteria) this;
        }

        public Criteria andUrAgeGreaterThan(Integer value) {
            addCriterion("ur_age >", value, "urAge");
            return (Criteria) this;
        }

        public Criteria andUrAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ur_age >=", value, "urAge");
            return (Criteria) this;
        }

        public Criteria andUrAgeLessThan(Integer value) {
            addCriterion("ur_age <", value, "urAge");
            return (Criteria) this;
        }

        public Criteria andUrAgeLessThanOrEqualTo(Integer value) {
            addCriterion("ur_age <=", value, "urAge");
            return (Criteria) this;
        }

        public Criteria andUrAgeIn(List<Integer> values) {
            addCriterion("ur_age in", values, "urAge");
            return (Criteria) this;
        }

        public Criteria andUrAgeNotIn(List<Integer> values) {
            addCriterion("ur_age not in", values, "urAge");
            return (Criteria) this;
        }

        public Criteria andUrAgeBetween(Integer value1, Integer value2) {
            addCriterion("ur_age between", value1, value2, "urAge");
            return (Criteria) this;
        }

        public Criteria andUrAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("ur_age not between", value1, value2, "urAge");
            return (Criteria) this;
        }

        public Criteria andUrPhoneIsNull() {
            addCriterion("ur_phone is null");
            return (Criteria) this;
        }

        public Criteria andUrPhoneIsNotNull() {
            addCriterion("ur_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUrPhoneEqualTo(String value) {
            addCriterion("ur_phone =", value, "urPhone");
            return (Criteria) this;
        }

        public Criteria andUrPhoneNotEqualTo(String value) {
            addCriterion("ur_phone <>", value, "urPhone");
            return (Criteria) this;
        }

        public Criteria andUrPhoneGreaterThan(String value) {
            addCriterion("ur_phone >", value, "urPhone");
            return (Criteria) this;
        }

        public Criteria andUrPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ur_phone >=", value, "urPhone");
            return (Criteria) this;
        }

        public Criteria andUrPhoneLessThan(String value) {
            addCriterion("ur_phone <", value, "urPhone");
            return (Criteria) this;
        }

        public Criteria andUrPhoneLessThanOrEqualTo(String value) {
            addCriterion("ur_phone <=", value, "urPhone");
            return (Criteria) this;
        }

        public Criteria andUrPhoneLike(String value) {
            addCriterion("ur_phone like", value, "urPhone");
            return (Criteria) this;
        }

        public Criteria andUrPhoneNotLike(String value) {
            addCriterion("ur_phone not like", value, "urPhone");
            return (Criteria) this;
        }

        public Criteria andUrPhoneIn(List<String> values) {
            addCriterion("ur_phone in", values, "urPhone");
            return (Criteria) this;
        }

        public Criteria andUrPhoneNotIn(List<String> values) {
            addCriterion("ur_phone not in", values, "urPhone");
            return (Criteria) this;
        }

        public Criteria andUrPhoneBetween(String value1, String value2) {
            addCriterion("ur_phone between", value1, value2, "urPhone");
            return (Criteria) this;
        }

        public Criteria andUrPhoneNotBetween(String value1, String value2) {
            addCriterion("ur_phone not between", value1, value2, "urPhone");
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