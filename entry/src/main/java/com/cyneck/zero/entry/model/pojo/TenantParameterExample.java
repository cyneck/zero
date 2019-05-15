package com.cyneck.zero.entry.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class TenantParameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TenantParameterExample() {
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

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("tenant_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("tenant_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("tenant_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("tenant_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("tenant_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("tenant_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("tenant_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("tenant_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("tenant_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("tenant_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("tenant_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitIsNull() {
            addCriterion("read_decimal_digit is null");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitIsNotNull() {
            addCriterion("read_decimal_digit is not null");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitEqualTo(String value) {
            addCriterion("read_decimal_digit =", value, "readDecimalDigit");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitNotEqualTo(String value) {
            addCriterion("read_decimal_digit <>", value, "readDecimalDigit");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitGreaterThan(String value) {
            addCriterion("read_decimal_digit >", value, "readDecimalDigit");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitGreaterThanOrEqualTo(String value) {
            addCriterion("read_decimal_digit >=", value, "readDecimalDigit");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitLessThan(String value) {
            addCriterion("read_decimal_digit <", value, "readDecimalDigit");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitLessThanOrEqualTo(String value) {
            addCriterion("read_decimal_digit <=", value, "readDecimalDigit");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitLike(String value) {
            addCriterion("read_decimal_digit like", value, "readDecimalDigit");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitNotLike(String value) {
            addCriterion("read_decimal_digit not like", value, "readDecimalDigit");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitIn(List<String> values) {
            addCriterion("read_decimal_digit in", values, "readDecimalDigit");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitNotIn(List<String> values) {
            addCriterion("read_decimal_digit not in", values, "readDecimalDigit");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitBetween(String value1, String value2) {
            addCriterion("read_decimal_digit between", value1, value2, "readDecimalDigit");
            return (Criteria) this;
        }

        public Criteria andReadDecimalDigitNotBetween(String value1, String value2) {
            addCriterion("read_decimal_digit not between", value1, value2, "readDecimalDigit");
            return (Criteria) this;
        }

        public Criteria andSettleModelIsNull() {
            addCriterion("settle_model is null");
            return (Criteria) this;
        }

        public Criteria andSettleModelIsNotNull() {
            addCriterion("settle_model is not null");
            return (Criteria) this;
        }

        public Criteria andSettleModelEqualTo(String value) {
            addCriterion("settle_model =", value, "settleModel");
            return (Criteria) this;
        }

        public Criteria andSettleModelNotEqualTo(String value) {
            addCriterion("settle_model <>", value, "settleModel");
            return (Criteria) this;
        }

        public Criteria andSettleModelGreaterThan(String value) {
            addCriterion("settle_model >", value, "settleModel");
            return (Criteria) this;
        }

        public Criteria andSettleModelGreaterThanOrEqualTo(String value) {
            addCriterion("settle_model >=", value, "settleModel");
            return (Criteria) this;
        }

        public Criteria andSettleModelLessThan(String value) {
            addCriterion("settle_model <", value, "settleModel");
            return (Criteria) this;
        }

        public Criteria andSettleModelLessThanOrEqualTo(String value) {
            addCriterion("settle_model <=", value, "settleModel");
            return (Criteria) this;
        }

        public Criteria andSettleModelLike(String value) {
            addCriterion("settle_model like", value, "settleModel");
            return (Criteria) this;
        }

        public Criteria andSettleModelNotLike(String value) {
            addCriterion("settle_model not like", value, "settleModel");
            return (Criteria) this;
        }

        public Criteria andSettleModelIn(List<String> values) {
            addCriterion("settle_model in", values, "settleModel");
            return (Criteria) this;
        }

        public Criteria andSettleModelNotIn(List<String> values) {
            addCriterion("settle_model not in", values, "settleModel");
            return (Criteria) this;
        }

        public Criteria andSettleModelBetween(String value1, String value2) {
            addCriterion("settle_model between", value1, value2, "settleModel");
            return (Criteria) this;
        }

        public Criteria andSettleModelNotBetween(String value1, String value2) {
            addCriterion("settle_model not between", value1, value2, "settleModel");
            return (Criteria) this;
        }

        public Criteria andApiUrlIsNull() {
            addCriterion("api_url is null");
            return (Criteria) this;
        }

        public Criteria andApiUrlIsNotNull() {
            addCriterion("api_url is not null");
            return (Criteria) this;
        }

        public Criteria andApiUrlEqualTo(String value) {
            addCriterion("api_url =", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotEqualTo(String value) {
            addCriterion("api_url <>", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlGreaterThan(String value) {
            addCriterion("api_url >", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlGreaterThanOrEqualTo(String value) {
            addCriterion("api_url >=", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlLessThan(String value) {
            addCriterion("api_url <", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlLessThanOrEqualTo(String value) {
            addCriterion("api_url <=", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlLike(String value) {
            addCriterion("api_url like", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotLike(String value) {
            addCriterion("api_url not like", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlIn(List<String> values) {
            addCriterion("api_url in", values, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotIn(List<String> values) {
            addCriterion("api_url not in", values, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlBetween(String value1, String value2) {
            addCriterion("api_url between", value1, value2, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotBetween(String value1, String value2) {
            addCriterion("api_url not between", value1, value2, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIsNull() {
            addCriterion("business_model is null");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIsNotNull() {
            addCriterion("business_model is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessModelEqualTo(String value) {
            addCriterion("business_model =", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelNotEqualTo(String value) {
            addCriterion("business_model <>", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelGreaterThan(String value) {
            addCriterion("business_model >", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelGreaterThanOrEqualTo(String value) {
            addCriterion("business_model >=", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelLessThan(String value) {
            addCriterion("business_model <", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelLessThanOrEqualTo(String value) {
            addCriterion("business_model <=", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelLike(String value) {
            addCriterion("business_model like", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelNotLike(String value) {
            addCriterion("business_model not like", value, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelIn(List<String> values) {
            addCriterion("business_model in", values, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelNotIn(List<String> values) {
            addCriterion("business_model not in", values, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelBetween(String value1, String value2) {
            addCriterion("business_model between", value1, value2, "businessModel");
            return (Criteria) this;
        }

        public Criteria andBusinessModelNotBetween(String value1, String value2) {
            addCriterion("business_model not between", value1, value2, "businessModel");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyIsNull() {
            addCriterion("alarm_frequency is null");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyIsNotNull() {
            addCriterion("alarm_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyEqualTo(String value) {
            addCriterion("alarm_frequency =", value, "alarmFrequency");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyNotEqualTo(String value) {
            addCriterion("alarm_frequency <>", value, "alarmFrequency");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyGreaterThan(String value) {
            addCriterion("alarm_frequency >", value, "alarmFrequency");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_frequency >=", value, "alarmFrequency");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyLessThan(String value) {
            addCriterion("alarm_frequency <", value, "alarmFrequency");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyLessThanOrEqualTo(String value) {
            addCriterion("alarm_frequency <=", value, "alarmFrequency");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyLike(String value) {
            addCriterion("alarm_frequency like", value, "alarmFrequency");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyNotLike(String value) {
            addCriterion("alarm_frequency not like", value, "alarmFrequency");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyIn(List<String> values) {
            addCriterion("alarm_frequency in", values, "alarmFrequency");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyNotIn(List<String> values) {
            addCriterion("alarm_frequency not in", values, "alarmFrequency");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyBetween(String value1, String value2) {
            addCriterion("alarm_frequency between", value1, value2, "alarmFrequency");
            return (Criteria) this;
        }

        public Criteria andAlarmFrequencyNotBetween(String value1, String value2) {
            addCriterion("alarm_frequency not between", value1, value2, "alarmFrequency");
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