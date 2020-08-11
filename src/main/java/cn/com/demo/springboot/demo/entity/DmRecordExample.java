package cn.com.demo.springboot.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class DmRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmRecordExample() {
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

        public Criteria andRdPhoneIsNull() {
            addCriterion("rd_phone is null");
            return (Criteria) this;
        }

        public Criteria andRdPhoneIsNotNull() {
            addCriterion("rd_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRdPhoneEqualTo(String value) {
            addCriterion("rd_phone =", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneNotEqualTo(String value) {
            addCriterion("rd_phone <>", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneGreaterThan(String value) {
            addCriterion("rd_phone >", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("rd_phone >=", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneLessThan(String value) {
            addCriterion("rd_phone <", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneLessThanOrEqualTo(String value) {
            addCriterion("rd_phone <=", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneLike(String value) {
            addCriterion("rd_phone like", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneNotLike(String value) {
            addCriterion("rd_phone not like", value, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneIn(List<String> values) {
            addCriterion("rd_phone in", values, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneNotIn(List<String> values) {
            addCriterion("rd_phone not in", values, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneBetween(String value1, String value2) {
            addCriterion("rd_phone between", value1, value2, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdPhoneNotBetween(String value1, String value2) {
            addCriterion("rd_phone not between", value1, value2, "rdPhone");
            return (Criteria) this;
        }

        public Criteria andRdUpIsNull() {
            addCriterion("rd_up is null");
            return (Criteria) this;
        }

        public Criteria andRdUpIsNotNull() {
            addCriterion("rd_up is not null");
            return (Criteria) this;
        }

        public Criteria andRdUpEqualTo(Long value) {
            addCriterion("rd_up =", value, "rdUp");
            return (Criteria) this;
        }

        public Criteria andRdUpNotEqualTo(Long value) {
            addCriterion("rd_up <>", value, "rdUp");
            return (Criteria) this;
        }

        public Criteria andRdUpGreaterThan(Long value) {
            addCriterion("rd_up >", value, "rdUp");
            return (Criteria) this;
        }

        public Criteria andRdUpGreaterThanOrEqualTo(Long value) {
            addCriterion("rd_up >=", value, "rdUp");
            return (Criteria) this;
        }

        public Criteria andRdUpLessThan(Long value) {
            addCriterion("rd_up <", value, "rdUp");
            return (Criteria) this;
        }

        public Criteria andRdUpLessThanOrEqualTo(Long value) {
            addCriterion("rd_up <=", value, "rdUp");
            return (Criteria) this;
        }

        public Criteria andRdUpIn(List<Long> values) {
            addCriterion("rd_up in", values, "rdUp");
            return (Criteria) this;
        }

        public Criteria andRdUpNotIn(List<Long> values) {
            addCriterion("rd_up not in", values, "rdUp");
            return (Criteria) this;
        }

        public Criteria andRdUpBetween(Long value1, Long value2) {
            addCriterion("rd_up between", value1, value2, "rdUp");
            return (Criteria) this;
        }

        public Criteria andRdUpNotBetween(Long value1, Long value2) {
            addCriterion("rd_up not between", value1, value2, "rdUp");
            return (Criteria) this;
        }

        public Criteria andRdDownIsNull() {
            addCriterion("rd_down is null");
            return (Criteria) this;
        }

        public Criteria andRdDownIsNotNull() {
            addCriterion("rd_down is not null");
            return (Criteria) this;
        }

        public Criteria andRdDownEqualTo(Long value) {
            addCriterion("rd_down =", value, "rdDown");
            return (Criteria) this;
        }

        public Criteria andRdDownNotEqualTo(Long value) {
            addCriterion("rd_down <>", value, "rdDown");
            return (Criteria) this;
        }

        public Criteria andRdDownGreaterThan(Long value) {
            addCriterion("rd_down >", value, "rdDown");
            return (Criteria) this;
        }

        public Criteria andRdDownGreaterThanOrEqualTo(Long value) {
            addCriterion("rd_down >=", value, "rdDown");
            return (Criteria) this;
        }

        public Criteria andRdDownLessThan(Long value) {
            addCriterion("rd_down <", value, "rdDown");
            return (Criteria) this;
        }

        public Criteria andRdDownLessThanOrEqualTo(Long value) {
            addCriterion("rd_down <=", value, "rdDown");
            return (Criteria) this;
        }

        public Criteria andRdDownIn(List<Long> values) {
            addCriterion("rd_down in", values, "rdDown");
            return (Criteria) this;
        }

        public Criteria andRdDownNotIn(List<Long> values) {
            addCriterion("rd_down not in", values, "rdDown");
            return (Criteria) this;
        }

        public Criteria andRdDownBetween(Long value1, Long value2) {
            addCriterion("rd_down between", value1, value2, "rdDown");
            return (Criteria) this;
        }

        public Criteria andRdDownNotBetween(Long value1, Long value2) {
            addCriterion("rd_down not between", value1, value2, "rdDown");
            return (Criteria) this;
        }

        public Criteria andRdSumIsNull() {
            addCriterion("rd_sum is null");
            return (Criteria) this;
        }

        public Criteria andRdSumIsNotNull() {
            addCriterion("rd_sum is not null");
            return (Criteria) this;
        }

        public Criteria andRdSumEqualTo(Long value) {
            addCriterion("rd_sum =", value, "rdSum");
            return (Criteria) this;
        }

        public Criteria andRdSumNotEqualTo(Long value) {
            addCriterion("rd_sum <>", value, "rdSum");
            return (Criteria) this;
        }

        public Criteria andRdSumGreaterThan(Long value) {
            addCriterion("rd_sum >", value, "rdSum");
            return (Criteria) this;
        }

        public Criteria andRdSumGreaterThanOrEqualTo(Long value) {
            addCriterion("rd_sum >=", value, "rdSum");
            return (Criteria) this;
        }

        public Criteria andRdSumLessThan(Long value) {
            addCriterion("rd_sum <", value, "rdSum");
            return (Criteria) this;
        }

        public Criteria andRdSumLessThanOrEqualTo(Long value) {
            addCriterion("rd_sum <=", value, "rdSum");
            return (Criteria) this;
        }

        public Criteria andRdSumIn(List<Long> values) {
            addCriterion("rd_sum in", values, "rdSum");
            return (Criteria) this;
        }

        public Criteria andRdSumNotIn(List<Long> values) {
            addCriterion("rd_sum not in", values, "rdSum");
            return (Criteria) this;
        }

        public Criteria andRdSumBetween(Long value1, Long value2) {
            addCriterion("rd_sum between", value1, value2, "rdSum");
            return (Criteria) this;
        }

        public Criteria andRdSumNotBetween(Long value1, Long value2) {
            addCriterion("rd_sum not between", value1, value2, "rdSum");
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