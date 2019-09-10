package com.ssmdemo.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStIdIsNull() {
            addCriterion("st_id is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("st_id is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(Integer value) {
            addCriterion("st_id =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(Integer value) {
            addCriterion("st_id <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(Integer value) {
            addCriterion("st_id >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_id >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(Integer value) {
            addCriterion("st_id <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(Integer value) {
            addCriterion("st_id <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<Integer> values) {
            addCriterion("st_id in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<Integer> values) {
            addCriterion("st_id not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(Integer value1, Integer value2) {
            addCriterion("st_id between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(Integer value1, Integer value2) {
            addCriterion("st_id not between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStNameIsNull() {
            addCriterion("st_name is null");
            return (Criteria) this;
        }

        public Criteria andStNameIsNotNull() {
            addCriterion("st_name is not null");
            return (Criteria) this;
        }

        public Criteria andStNameEqualTo(String value) {
            addCriterion("st_name =", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotEqualTo(String value) {
            addCriterion("st_name <>", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThan(String value) {
            addCriterion("st_name >", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThanOrEqualTo(String value) {
            addCriterion("st_name >=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThan(String value) {
            addCriterion("st_name <", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThanOrEqualTo(String value) {
            addCriterion("st_name <=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLike(String value) {
            addCriterion("st_name like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotLike(String value) {
            addCriterion("st_name not like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameIn(List<String> values) {
            addCriterion("st_name in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotIn(List<String> values) {
            addCriterion("st_name not in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameBetween(String value1, String value2) {
            addCriterion("st_name between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotBetween(String value1, String value2) {
            addCriterion("st_name not between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStSexIsNull() {
            addCriterion("st_sex is null");
            return (Criteria) this;
        }

        public Criteria andStSexIsNotNull() {
            addCriterion("st_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStSexEqualTo(String value) {
            addCriterion("st_sex =", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexNotEqualTo(String value) {
            addCriterion("st_sex <>", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexGreaterThan(String value) {
            addCriterion("st_sex >", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexGreaterThanOrEqualTo(String value) {
            addCriterion("st_sex >=", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexLessThan(String value) {
            addCriterion("st_sex <", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexLessThanOrEqualTo(String value) {
            addCriterion("st_sex <=", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexLike(String value) {
            addCriterion("st_sex like", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexNotLike(String value) {
            addCriterion("st_sex not like", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexIn(List<String> values) {
            addCriterion("st_sex in", values, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexNotIn(List<String> values) {
            addCriterion("st_sex not in", values, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexBetween(String value1, String value2) {
            addCriterion("st_sex between", value1, value2, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexNotBetween(String value1, String value2) {
            addCriterion("st_sex not between", value1, value2, "stSex");
            return (Criteria) this;
        }

        public Criteria andStEmailIsNull() {
            addCriterion("st_email is null");
            return (Criteria) this;
        }

        public Criteria andStEmailIsNotNull() {
            addCriterion("st_email is not null");
            return (Criteria) this;
        }

        public Criteria andStEmailEqualTo(String value) {
            addCriterion("st_email =", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailNotEqualTo(String value) {
            addCriterion("st_email <>", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailGreaterThan(String value) {
            addCriterion("st_email >", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailGreaterThanOrEqualTo(String value) {
            addCriterion("st_email >=", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailLessThan(String value) {
            addCriterion("st_email <", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailLessThanOrEqualTo(String value) {
            addCriterion("st_email <=", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailLike(String value) {
            addCriterion("st_email like", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailNotLike(String value) {
            addCriterion("st_email not like", value, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailIn(List<String> values) {
            addCriterion("st_email in", values, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailNotIn(List<String> values) {
            addCriterion("st_email not in", values, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailBetween(String value1, String value2) {
            addCriterion("st_email between", value1, value2, "stEmail");
            return (Criteria) this;
        }

        public Criteria andStEmailNotBetween(String value1, String value2) {
            addCriterion("st_email not between", value1, value2, "stEmail");
            return (Criteria) this;
        }

        public Criteria andTeIdIsNull() {
            addCriterion("te_id is null");
            return (Criteria) this;
        }

        public Criteria andTeIdIsNotNull() {
            addCriterion("te_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeIdEqualTo(Integer value) {
            addCriterion("te_id =", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotEqualTo(Integer value) {
            addCriterion("te_id <>", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdGreaterThan(Integer value) {
            addCriterion("te_id >", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("te_id >=", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdLessThan(Integer value) {
            addCriterion("te_id <", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdLessThanOrEqualTo(Integer value) {
            addCriterion("te_id <=", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdIn(List<Integer> values) {
            addCriterion("te_id in", values, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotIn(List<Integer> values) {
            addCriterion("te_id not in", values, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdBetween(Integer value1, Integer value2) {
            addCriterion("te_id between", value1, value2, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("te_id not between", value1, value2, "teId");
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