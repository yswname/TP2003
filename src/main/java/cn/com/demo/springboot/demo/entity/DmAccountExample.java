package cn.com.demo.springboot.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class DmAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmAccountExample() {
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

        public Criteria andAccIdIsNull() {
            addCriterion("acc_id is null");
            return (Criteria) this;
        }

        public Criteria andAccIdIsNotNull() {
            addCriterion("acc_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccIdEqualTo(Integer value) {
            addCriterion("acc_id =", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotEqualTo(Integer value) {
            addCriterion("acc_id <>", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdGreaterThan(Integer value) {
            addCriterion("acc_id >", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("acc_id >=", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdLessThan(Integer value) {
            addCriterion("acc_id <", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdLessThanOrEqualTo(Integer value) {
            addCriterion("acc_id <=", value, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdIn(List<Integer> values) {
            addCriterion("acc_id in", values, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotIn(List<Integer> values) {
            addCriterion("acc_id not in", values, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdBetween(Integer value1, Integer value2) {
            addCriterion("acc_id between", value1, value2, "accId");
            return (Criteria) this;
        }

        public Criteria andAccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("acc_id not between", value1, value2, "accId");
            return (Criteria) this;
        }

        public Criteria andAccCodeIsNull() {
            addCriterion("acc_code is null");
            return (Criteria) this;
        }

        public Criteria andAccCodeIsNotNull() {
            addCriterion("acc_code is not null");
            return (Criteria) this;
        }

        public Criteria andAccCodeEqualTo(String value) {
            addCriterion("acc_code =", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeNotEqualTo(String value) {
            addCriterion("acc_code <>", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeGreaterThan(String value) {
            addCriterion("acc_code >", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeGreaterThanOrEqualTo(String value) {
            addCriterion("acc_code >=", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeLessThan(String value) {
            addCriterion("acc_code <", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeLessThanOrEqualTo(String value) {
            addCriterion("acc_code <=", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeLike(String value) {
            addCriterion("acc_code like", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeNotLike(String value) {
            addCriterion("acc_code not like", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeIn(List<String> values) {
            addCriterion("acc_code in", values, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeNotIn(List<String> values) {
            addCriterion("acc_code not in", values, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeBetween(String value1, String value2) {
            addCriterion("acc_code between", value1, value2, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeNotBetween(String value1, String value2) {
            addCriterion("acc_code not between", value1, value2, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccPasswordIsNull() {
            addCriterion("acc_password is null");
            return (Criteria) this;
        }

        public Criteria andAccPasswordIsNotNull() {
            addCriterion("acc_password is not null");
            return (Criteria) this;
        }

        public Criteria andAccPasswordEqualTo(String value) {
            addCriterion("acc_password =", value, "accPassword");
            return (Criteria) this;
        }

        public Criteria andAccPasswordNotEqualTo(String value) {
            addCriterion("acc_password <>", value, "accPassword");
            return (Criteria) this;
        }

        public Criteria andAccPasswordGreaterThan(String value) {
            addCriterion("acc_password >", value, "accPassword");
            return (Criteria) this;
        }

        public Criteria andAccPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("acc_password >=", value, "accPassword");
            return (Criteria) this;
        }

        public Criteria andAccPasswordLessThan(String value) {
            addCriterion("acc_password <", value, "accPassword");
            return (Criteria) this;
        }

        public Criteria andAccPasswordLessThanOrEqualTo(String value) {
            addCriterion("acc_password <=", value, "accPassword");
            return (Criteria) this;
        }

        public Criteria andAccPasswordLike(String value) {
            addCriterion("acc_password like", value, "accPassword");
            return (Criteria) this;
        }

        public Criteria andAccPasswordNotLike(String value) {
            addCriterion("acc_password not like", value, "accPassword");
            return (Criteria) this;
        }

        public Criteria andAccPasswordIn(List<String> values) {
            addCriterion("acc_password in", values, "accPassword");
            return (Criteria) this;
        }

        public Criteria andAccPasswordNotIn(List<String> values) {
            addCriterion("acc_password not in", values, "accPassword");
            return (Criteria) this;
        }

        public Criteria andAccPasswordBetween(String value1, String value2) {
            addCriterion("acc_password between", value1, value2, "accPassword");
            return (Criteria) this;
        }

        public Criteria andAccPasswordNotBetween(String value1, String value2) {
            addCriterion("acc_password not between", value1, value2, "accPassword");
            return (Criteria) this;
        }

        public Criteria andAccMoneyIsNull() {
            addCriterion("acc_money is null");
            return (Criteria) this;
        }

        public Criteria andAccMoneyIsNotNull() {
            addCriterion("acc_money is not null");
            return (Criteria) this;
        }

        public Criteria andAccMoneyEqualTo(Double value) {
            addCriterion("acc_money =", value, "accMoney");
            return (Criteria) this;
        }

        public Criteria andAccMoneyNotEqualTo(Double value) {
            addCriterion("acc_money <>", value, "accMoney");
            return (Criteria) this;
        }

        public Criteria andAccMoneyGreaterThan(Double value) {
            addCriterion("acc_money >", value, "accMoney");
            return (Criteria) this;
        }

        public Criteria andAccMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("acc_money >=", value, "accMoney");
            return (Criteria) this;
        }

        public Criteria andAccMoneyLessThan(Double value) {
            addCriterion("acc_money <", value, "accMoney");
            return (Criteria) this;
        }

        public Criteria andAccMoneyLessThanOrEqualTo(Double value) {
            addCriterion("acc_money <=", value, "accMoney");
            return (Criteria) this;
        }

        public Criteria andAccMoneyIn(List<Double> values) {
            addCriterion("acc_money in", values, "accMoney");
            return (Criteria) this;
        }

        public Criteria andAccMoneyNotIn(List<Double> values) {
            addCriterion("acc_money not in", values, "accMoney");
            return (Criteria) this;
        }

        public Criteria andAccMoneyBetween(Double value1, Double value2) {
            addCriterion("acc_money between", value1, value2, "accMoney");
            return (Criteria) this;
        }

        public Criteria andAccMoneyNotBetween(Double value1, Double value2) {
            addCriterion("acc_money not between", value1, value2, "accMoney");
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