package com.ryj.yuyue.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassOrderExample() {
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

        public Criteria andClaIdIsNull() {
            addCriterion("cla_id is null");
            return (Criteria) this;
        }

        public Criteria andClaIdIsNotNull() {
            addCriterion("cla_id is not null");
            return (Criteria) this;
        }

        public Criteria andClaIdEqualTo(Integer value) {
            addCriterion("cla_id =", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdNotEqualTo(Integer value) {
            addCriterion("cla_id <>", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdGreaterThan(Integer value) {
            addCriterion("cla_id >", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cla_id >=", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdLessThan(Integer value) {
            addCriterion("cla_id <", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdLessThanOrEqualTo(Integer value) {
            addCriterion("cla_id <=", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdIn(List<Integer> values) {
            addCriterion("cla_id in", values, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdNotIn(List<Integer> values) {
            addCriterion("cla_id not in", values, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdBetween(Integer value1, Integer value2) {
            addCriterion("cla_id between", value1, value2, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cla_id not between", value1, value2, "claId");
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

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Integer value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Integer value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Integer value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Integer value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Integer> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Integer> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Integer value1, Integer value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andOrdTimeIsNull() {
            addCriterion("ord_time is null");
            return (Criteria) this;
        }

        public Criteria andOrdTimeIsNotNull() {
            addCriterion("ord_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrdTimeEqualTo(Date value) {
            addCriterion("ord_time =", value, "ordTime");
            return (Criteria) this;
        }

        public Criteria andOrdTimeNotEqualTo(Date value) {
            addCriterion("ord_time <>", value, "ordTime");
            return (Criteria) this;
        }

        public Criteria andOrdTimeGreaterThan(Date value) {
            addCriterion("ord_time >", value, "ordTime");
            return (Criteria) this;
        }

        public Criteria andOrdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ord_time >=", value, "ordTime");
            return (Criteria) this;
        }

        public Criteria andOrdTimeLessThan(Date value) {
            addCriterion("ord_time <", value, "ordTime");
            return (Criteria) this;
        }

        public Criteria andOrdTimeLessThanOrEqualTo(Date value) {
            addCriterion("ord_time <=", value, "ordTime");
            return (Criteria) this;
        }

        public Criteria andOrdTimeIn(List<Date> values) {
            addCriterion("ord_time in", values, "ordTime");
            return (Criteria) this;
        }

        public Criteria andOrdTimeNotIn(List<Date> values) {
            addCriterion("ord_time not in", values, "ordTime");
            return (Criteria) this;
        }

        public Criteria andOrdTimeBetween(Date value1, Date value2) {
            addCriterion("ord_time between", value1, value2, "ordTime");
            return (Criteria) this;
        }

        public Criteria andOrdTimeNotBetween(Date value1, Date value2) {
            addCriterion("ord_time not between", value1, value2, "ordTime");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andIsScoreIsNull() {
            addCriterion("is_score is null");
            return (Criteria) this;
        }

        public Criteria andIsScoreIsNotNull() {
            addCriterion("is_score is not null");
            return (Criteria) this;
        }

        public Criteria andIsScoreEqualTo(Integer value) {
            addCriterion("is_score =", value, "isScore");
            return (Criteria) this;
        }

        public Criteria andIsScoreNotEqualTo(Integer value) {
            addCriterion("is_score <>", value, "isScore");
            return (Criteria) this;
        }

        public Criteria andIsScoreGreaterThan(Integer value) {
            addCriterion("is_score >", value, "isScore");
            return (Criteria) this;
        }

        public Criteria andIsScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_score >=", value, "isScore");
            return (Criteria) this;
        }

        public Criteria andIsScoreLessThan(Integer value) {
            addCriterion("is_score <", value, "isScore");
            return (Criteria) this;
        }

        public Criteria andIsScoreLessThanOrEqualTo(Integer value) {
            addCriterion("is_score <=", value, "isScore");
            return (Criteria) this;
        }

        public Criteria andIsScoreIn(List<Integer> values) {
            addCriterion("is_score in", values, "isScore");
            return (Criteria) this;
        }

        public Criteria andIsScoreNotIn(List<Integer> values) {
            addCriterion("is_score not in", values, "isScore");
            return (Criteria) this;
        }

        public Criteria andIsScoreBetween(Integer value1, Integer value2) {
            addCriterion("is_score between", value1, value2, "isScore");
            return (Criteria) this;
        }

        public Criteria andIsScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("is_score not between", value1, value2, "isScore");
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