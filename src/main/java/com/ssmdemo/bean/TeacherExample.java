package com.ssmdemo.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeNameIsNull() {
            addCriterion("te_name is null");
            return (Criteria) this;
        }

        public Criteria andTeNameIsNotNull() {
            addCriterion("te_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeNameEqualTo(String value) {
            addCriterion("te_name =", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameNotEqualTo(String value) {
            addCriterion("te_name <>", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameGreaterThan(String value) {
            addCriterion("te_name >", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameGreaterThanOrEqualTo(String value) {
            addCriterion("te_name >=", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameLessThan(String value) {
            addCriterion("te_name <", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameLessThanOrEqualTo(String value) {
            addCriterion("te_name <=", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameLike(String value) {
            addCriterion("te_name like", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameNotLike(String value) {
            addCriterion("te_name not like", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameIn(List<String> values) {
            addCriterion("te_name in", values, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameNotIn(List<String> values) {
            addCriterion("te_name not in", values, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameBetween(String value1, String value2) {
            addCriterion("te_name between", value1, value2, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameNotBetween(String value1, String value2) {
            addCriterion("te_name not between", value1, value2, "teName");
            return (Criteria) this;
        }

        public Criteria andTeSexIsNull() {
            addCriterion("te_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeSexIsNotNull() {
            addCriterion("te_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeSexEqualTo(String value) {
            addCriterion("te_sex =", value, "teSex");
            return (Criteria) this;
        }

        public Criteria andTeSexNotEqualTo(String value) {
            addCriterion("te_sex <>", value, "teSex");
            return (Criteria) this;
        }

        public Criteria andTeSexGreaterThan(String value) {
            addCriterion("te_sex >", value, "teSex");
            return (Criteria) this;
        }

        public Criteria andTeSexGreaterThanOrEqualTo(String value) {
            addCriterion("te_sex >=", value, "teSex");
            return (Criteria) this;
        }

        public Criteria andTeSexLessThan(String value) {
            addCriterion("te_sex <", value, "teSex");
            return (Criteria) this;
        }

        public Criteria andTeSexLessThanOrEqualTo(String value) {
            addCriterion("te_sex <=", value, "teSex");
            return (Criteria) this;
        }

        public Criteria andTeSexLike(String value) {
            addCriterion("te_sex like", value, "teSex");
            return (Criteria) this;
        }

        public Criteria andTeSexNotLike(String value) {
            addCriterion("te_sex not like", value, "teSex");
            return (Criteria) this;
        }

        public Criteria andTeSexIn(List<String> values) {
            addCriterion("te_sex in", values, "teSex");
            return (Criteria) this;
        }

        public Criteria andTeSexNotIn(List<String> values) {
            addCriterion("te_sex not in", values, "teSex");
            return (Criteria) this;
        }

        public Criteria andTeSexBetween(String value1, String value2) {
            addCriterion("te_sex between", value1, value2, "teSex");
            return (Criteria) this;
        }

        public Criteria andTeSexNotBetween(String value1, String value2) {
            addCriterion("te_sex not between", value1, value2, "teSex");
            return (Criteria) this;
        }

        public Criteria andTeSalaryIsNull() {
            addCriterion("te_salary is null");
            return (Criteria) this;
        }

        public Criteria andTeSalaryIsNotNull() {
            addCriterion("te_salary is not null");
            return (Criteria) this;
        }

        public Criteria andTeSalaryEqualTo(BigDecimal value) {
            addCriterion("te_salary =", value, "teSalary");
            return (Criteria) this;
        }

        public Criteria andTeSalaryNotEqualTo(BigDecimal value) {
            addCriterion("te_salary <>", value, "teSalary");
            return (Criteria) this;
        }

        public Criteria andTeSalaryGreaterThan(BigDecimal value) {
            addCriterion("te_salary >", value, "teSalary");
            return (Criteria) this;
        }

        public Criteria andTeSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("te_salary >=", value, "teSalary");
            return (Criteria) this;
        }

        public Criteria andTeSalaryLessThan(BigDecimal value) {
            addCriterion("te_salary <", value, "teSalary");
            return (Criteria) this;
        }

        public Criteria andTeSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("te_salary <=", value, "teSalary");
            return (Criteria) this;
        }

        public Criteria andTeSalaryIn(List<BigDecimal> values) {
            addCriterion("te_salary in", values, "teSalary");
            return (Criteria) this;
        }

        public Criteria andTeSalaryNotIn(List<BigDecimal> values) {
            addCriterion("te_salary not in", values, "teSalary");
            return (Criteria) this;
        }

        public Criteria andTeSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("te_salary between", value1, value2, "teSalary");
            return (Criteria) this;
        }

        public Criteria andTeSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("te_salary not between", value1, value2, "teSalary");
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