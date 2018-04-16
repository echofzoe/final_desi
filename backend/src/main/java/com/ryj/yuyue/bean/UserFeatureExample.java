package com.ryj.yuyue.bean;

import java.util.ArrayList;
import java.util.List;

public class UserFeatureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserFeatureExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andIllneseIsNull() {
            addCriterion("illnese is null");
            return (Criteria) this;
        }

        public Criteria andIllneseIsNotNull() {
            addCriterion("illnese is not null");
            return (Criteria) this;
        }

        public Criteria andIllneseEqualTo(Integer value) {
            addCriterion("illnese =", value, "illnese");
            return (Criteria) this;
        }

        public Criteria andIllneseNotEqualTo(Integer value) {
            addCriterion("illnese <>", value, "illnese");
            return (Criteria) this;
        }

        public Criteria andIllneseGreaterThan(Integer value) {
            addCriterion("illnese >", value, "illnese");
            return (Criteria) this;
        }

        public Criteria andIllneseGreaterThanOrEqualTo(Integer value) {
            addCriterion("illnese >=", value, "illnese");
            return (Criteria) this;
        }

        public Criteria andIllneseLessThan(Integer value) {
            addCriterion("illnese <", value, "illnese");
            return (Criteria) this;
        }

        public Criteria andIllneseLessThanOrEqualTo(Integer value) {
            addCriterion("illnese <=", value, "illnese");
            return (Criteria) this;
        }

        public Criteria andIllneseIn(List<Integer> values) {
            addCriterion("illnese in", values, "illnese");
            return (Criteria) this;
        }

        public Criteria andIllneseNotIn(List<Integer> values) {
            addCriterion("illnese not in", values, "illnese");
            return (Criteria) this;
        }

        public Criteria andIllneseBetween(Integer value1, Integer value2) {
            addCriterion("illnese between", value1, value2, "illnese");
            return (Criteria) this;
        }

        public Criteria andIllneseNotBetween(Integer value1, Integer value2) {
            addCriterion("illnese not between", value1, value2, "illnese");
            return (Criteria) this;
        }

        public Criteria andSurgeryIsNull() {
            addCriterion("surgery is null");
            return (Criteria) this;
        }

        public Criteria andSurgeryIsNotNull() {
            addCriterion("surgery is not null");
            return (Criteria) this;
        }

        public Criteria andSurgeryEqualTo(Integer value) {
            addCriterion("surgery =", value, "surgery");
            return (Criteria) this;
        }

        public Criteria andSurgeryNotEqualTo(Integer value) {
            addCriterion("surgery <>", value, "surgery");
            return (Criteria) this;
        }

        public Criteria andSurgeryGreaterThan(Integer value) {
            addCriterion("surgery >", value, "surgery");
            return (Criteria) this;
        }

        public Criteria andSurgeryGreaterThanOrEqualTo(Integer value) {
            addCriterion("surgery >=", value, "surgery");
            return (Criteria) this;
        }

        public Criteria andSurgeryLessThan(Integer value) {
            addCriterion("surgery <", value, "surgery");
            return (Criteria) this;
        }

        public Criteria andSurgeryLessThanOrEqualTo(Integer value) {
            addCriterion("surgery <=", value, "surgery");
            return (Criteria) this;
        }

        public Criteria andSurgeryIn(List<Integer> values) {
            addCriterion("surgery in", values, "surgery");
            return (Criteria) this;
        }

        public Criteria andSurgeryNotIn(List<Integer> values) {
            addCriterion("surgery not in", values, "surgery");
            return (Criteria) this;
        }

        public Criteria andSurgeryBetween(Integer value1, Integer value2) {
            addCriterion("surgery between", value1, value2, "surgery");
            return (Criteria) this;
        }

        public Criteria andSurgeryNotBetween(Integer value1, Integer value2) {
            addCriterion("surgery not between", value1, value2, "surgery");
            return (Criteria) this;
        }

        public Criteria andBalanceDietIsNull() {
            addCriterion("balance_diet is null");
            return (Criteria) this;
        }

        public Criteria andBalanceDietIsNotNull() {
            addCriterion("balance_diet is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceDietEqualTo(Integer value) {
            addCriterion("balance_diet =", value, "balanceDiet");
            return (Criteria) this;
        }

        public Criteria andBalanceDietNotEqualTo(Integer value) {
            addCriterion("balance_diet <>", value, "balanceDiet");
            return (Criteria) this;
        }

        public Criteria andBalanceDietGreaterThan(Integer value) {
            addCriterion("balance_diet >", value, "balanceDiet");
            return (Criteria) this;
        }

        public Criteria andBalanceDietGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_diet >=", value, "balanceDiet");
            return (Criteria) this;
        }

        public Criteria andBalanceDietLessThan(Integer value) {
            addCriterion("balance_diet <", value, "balanceDiet");
            return (Criteria) this;
        }

        public Criteria andBalanceDietLessThanOrEqualTo(Integer value) {
            addCriterion("balance_diet <=", value, "balanceDiet");
            return (Criteria) this;
        }

        public Criteria andBalanceDietIn(List<Integer> values) {
            addCriterion("balance_diet in", values, "balanceDiet");
            return (Criteria) this;
        }

        public Criteria andBalanceDietNotIn(List<Integer> values) {
            addCriterion("balance_diet not in", values, "balanceDiet");
            return (Criteria) this;
        }

        public Criteria andBalanceDietBetween(Integer value1, Integer value2) {
            addCriterion("balance_diet between", value1, value2, "balanceDiet");
            return (Criteria) this;
        }

        public Criteria andBalanceDietNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_diet not between", value1, value2, "balanceDiet");
            return (Criteria) this;
        }

        public Criteria andLimitIntakeIsNull() {
            addCriterion("limit_intake is null");
            return (Criteria) this;
        }

        public Criteria andLimitIntakeIsNotNull() {
            addCriterion("limit_intake is not null");
            return (Criteria) this;
        }

        public Criteria andLimitIntakeEqualTo(Integer value) {
            addCriterion("limit_intake =", value, "limitIntake");
            return (Criteria) this;
        }

        public Criteria andLimitIntakeNotEqualTo(Integer value) {
            addCriterion("limit_intake <>", value, "limitIntake");
            return (Criteria) this;
        }

        public Criteria andLimitIntakeGreaterThan(Integer value) {
            addCriterion("limit_intake >", value, "limitIntake");
            return (Criteria) this;
        }

        public Criteria andLimitIntakeGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_intake >=", value, "limitIntake");
            return (Criteria) this;
        }

        public Criteria andLimitIntakeLessThan(Integer value) {
            addCriterion("limit_intake <", value, "limitIntake");
            return (Criteria) this;
        }

        public Criteria andLimitIntakeLessThanOrEqualTo(Integer value) {
            addCriterion("limit_intake <=", value, "limitIntake");
            return (Criteria) this;
        }

        public Criteria andLimitIntakeIn(List<Integer> values) {
            addCriterion("limit_intake in", values, "limitIntake");
            return (Criteria) this;
        }

        public Criteria andLimitIntakeNotIn(List<Integer> values) {
            addCriterion("limit_intake not in", values, "limitIntake");
            return (Criteria) this;
        }

        public Criteria andLimitIntakeBetween(Integer value1, Integer value2) {
            addCriterion("limit_intake between", value1, value2, "limitIntake");
            return (Criteria) this;
        }

        public Criteria andLimitIntakeNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_intake not between", value1, value2, "limitIntake");
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