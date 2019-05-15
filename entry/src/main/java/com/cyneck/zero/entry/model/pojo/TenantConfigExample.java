package com.cyneck.zero.entry.model.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TenantConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TenantConfigExample() {
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
            addCriterion("tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusIsNull() {
            addCriterion("customize_reset_surplus is null");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusIsNotNull() {
            addCriterion("customize_reset_surplus is not null");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusEqualTo(String value) {
            addCriterion("customize_reset_surplus =", value, "customizeResetSurplus");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusNotEqualTo(String value) {
            addCriterion("customize_reset_surplus <>", value, "customizeResetSurplus");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusGreaterThan(String value) {
            addCriterion("customize_reset_surplus >", value, "customizeResetSurplus");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusGreaterThanOrEqualTo(String value) {
            addCriterion("customize_reset_surplus >=", value, "customizeResetSurplus");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusLessThan(String value) {
            addCriterion("customize_reset_surplus <", value, "customizeResetSurplus");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusLessThanOrEqualTo(String value) {
            addCriterion("customize_reset_surplus <=", value, "customizeResetSurplus");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusLike(String value) {
            addCriterion("customize_reset_surplus like", value, "customizeResetSurplus");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusNotLike(String value) {
            addCriterion("customize_reset_surplus not like", value, "customizeResetSurplus");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusIn(List<String> values) {
            addCriterion("customize_reset_surplus in", values, "customizeResetSurplus");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusNotIn(List<String> values) {
            addCriterion("customize_reset_surplus not in", values, "customizeResetSurplus");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusBetween(String value1, String value2) {
            addCriterion("customize_reset_surplus between", value1, value2, "customizeResetSurplus");
            return (Criteria) this;
        }

        public Criteria andCustomizeResetSurplusNotBetween(String value1, String value2) {
            addCriterion("customize_reset_surplus not between", value1, value2, "customizeResetSurplus");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptIsNull() {
            addCriterion("print_repair_receipt is null");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptIsNotNull() {
            addCriterion("print_repair_receipt is not null");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptEqualTo(String value) {
            addCriterion("print_repair_receipt =", value, "printRepairReceipt");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptNotEqualTo(String value) {
            addCriterion("print_repair_receipt <>", value, "printRepairReceipt");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptGreaterThan(String value) {
            addCriterion("print_repair_receipt >", value, "printRepairReceipt");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptGreaterThanOrEqualTo(String value) {
            addCriterion("print_repair_receipt >=", value, "printRepairReceipt");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptLessThan(String value) {
            addCriterion("print_repair_receipt <", value, "printRepairReceipt");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptLessThanOrEqualTo(String value) {
            addCriterion("print_repair_receipt <=", value, "printRepairReceipt");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptLike(String value) {
            addCriterion("print_repair_receipt like", value, "printRepairReceipt");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptNotLike(String value) {
            addCriterion("print_repair_receipt not like", value, "printRepairReceipt");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptIn(List<String> values) {
            addCriterion("print_repair_receipt in", values, "printRepairReceipt");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptNotIn(List<String> values) {
            addCriterion("print_repair_receipt not in", values, "printRepairReceipt");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptBetween(String value1, String value2) {
            addCriterion("print_repair_receipt between", value1, value2, "printRepairReceipt");
            return (Criteria) this;
        }

        public Criteria andPrintRepairReceiptNotBetween(String value1, String value2) {
            addCriterion("print_repair_receipt not between", value1, value2, "printRepairReceipt");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyIsNull() {
            addCriterion("initial_cyc_qty is null");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyIsNotNull() {
            addCriterion("initial_cyc_qty is not null");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyEqualTo(String value) {
            addCriterion("initial_cyc_qty =", value, "initialCycQty");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyNotEqualTo(String value) {
            addCriterion("initial_cyc_qty <>", value, "initialCycQty");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyGreaterThan(String value) {
            addCriterion("initial_cyc_qty >", value, "initialCycQty");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyGreaterThanOrEqualTo(String value) {
            addCriterion("initial_cyc_qty >=", value, "initialCycQty");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyLessThan(String value) {
            addCriterion("initial_cyc_qty <", value, "initialCycQty");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyLessThanOrEqualTo(String value) {
            addCriterion("initial_cyc_qty <=", value, "initialCycQty");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyLike(String value) {
            addCriterion("initial_cyc_qty like", value, "initialCycQty");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyNotLike(String value) {
            addCriterion("initial_cyc_qty not like", value, "initialCycQty");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyIn(List<String> values) {
            addCriterion("initial_cyc_qty in", values, "initialCycQty");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyNotIn(List<String> values) {
            addCriterion("initial_cyc_qty not in", values, "initialCycQty");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyBetween(String value1, String value2) {
            addCriterion("initial_cyc_qty between", value1, value2, "initialCycQty");
            return (Criteria) this;
        }

        public Criteria andInitialCycQtyNotBetween(String value1, String value2) {
            addCriterion("initial_cyc_qty not between", value1, value2, "initialCycQty");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableIsNull() {
            addCriterion("time_split_enable is null");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableIsNotNull() {
            addCriterion("time_split_enable is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableEqualTo(String value) {
            addCriterion("time_split_enable =", value, "timeSplitEnable");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableNotEqualTo(String value) {
            addCriterion("time_split_enable <>", value, "timeSplitEnable");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableGreaterThan(String value) {
            addCriterion("time_split_enable >", value, "timeSplitEnable");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableGreaterThanOrEqualTo(String value) {
            addCriterion("time_split_enable >=", value, "timeSplitEnable");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableLessThan(String value) {
            addCriterion("time_split_enable <", value, "timeSplitEnable");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableLessThanOrEqualTo(String value) {
            addCriterion("time_split_enable <=", value, "timeSplitEnable");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableLike(String value) {
            addCriterion("time_split_enable like", value, "timeSplitEnable");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableNotLike(String value) {
            addCriterion("time_split_enable not like", value, "timeSplitEnable");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableIn(List<String> values) {
            addCriterion("time_split_enable in", values, "timeSplitEnable");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableNotIn(List<String> values) {
            addCriterion("time_split_enable not in", values, "timeSplitEnable");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableBetween(String value1, String value2) {
            addCriterion("time_split_enable between", value1, value2, "timeSplitEnable");
            return (Criteria) this;
        }

        public Criteria andTimeSplitEnableNotBetween(String value1, String value2) {
            addCriterion("time_split_enable not between", value1, value2, "timeSplitEnable");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderIsNull() {
            addCriterion("adjust_ladder is null");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderIsNotNull() {
            addCriterion("adjust_ladder is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderEqualTo(String value) {
            addCriterion("adjust_ladder =", value, "adjustLadder");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderNotEqualTo(String value) {
            addCriterion("adjust_ladder <>", value, "adjustLadder");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderGreaterThan(String value) {
            addCriterion("adjust_ladder >", value, "adjustLadder");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderGreaterThanOrEqualTo(String value) {
            addCriterion("adjust_ladder >=", value, "adjustLadder");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderLessThan(String value) {
            addCriterion("adjust_ladder <", value, "adjustLadder");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderLessThanOrEqualTo(String value) {
            addCriterion("adjust_ladder <=", value, "adjustLadder");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderLike(String value) {
            addCriterion("adjust_ladder like", value, "adjustLadder");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderNotLike(String value) {
            addCriterion("adjust_ladder not like", value, "adjustLadder");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderIn(List<String> values) {
            addCriterion("adjust_ladder in", values, "adjustLadder");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderNotIn(List<String> values) {
            addCriterion("adjust_ladder not in", values, "adjustLadder");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderBetween(String value1, String value2) {
            addCriterion("adjust_ladder between", value1, value2, "adjustLadder");
            return (Criteria) this;
        }

        public Criteria andAdjustLadderNotBetween(String value1, String value2) {
            addCriterion("adjust_ladder not between", value1, value2, "adjustLadder");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeIsNull() {
            addCriterion("cumulant_report_type is null");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeIsNotNull() {
            addCriterion("cumulant_report_type is not null");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeEqualTo(String value) {
            addCriterion("cumulant_report_type =", value, "cumulantReportType");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeNotEqualTo(String value) {
            addCriterion("cumulant_report_type <>", value, "cumulantReportType");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeGreaterThan(String value) {
            addCriterion("cumulant_report_type >", value, "cumulantReportType");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cumulant_report_type >=", value, "cumulantReportType");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeLessThan(String value) {
            addCriterion("cumulant_report_type <", value, "cumulantReportType");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeLessThanOrEqualTo(String value) {
            addCriterion("cumulant_report_type <=", value, "cumulantReportType");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeLike(String value) {
            addCriterion("cumulant_report_type like", value, "cumulantReportType");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeNotLike(String value) {
            addCriterion("cumulant_report_type not like", value, "cumulantReportType");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeIn(List<String> values) {
            addCriterion("cumulant_report_type in", values, "cumulantReportType");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeNotIn(List<String> values) {
            addCriterion("cumulant_report_type not in", values, "cumulantReportType");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeBetween(String value1, String value2) {
            addCriterion("cumulant_report_type between", value1, value2, "cumulantReportType");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeNotBetween(String value1, String value2) {
            addCriterion("cumulant_report_type not between", value1, value2, "cumulantReportType");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableIsNull() {
            addCriterion("cumulant_report_type_writable is null");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableIsNotNull() {
            addCriterion("cumulant_report_type_writable is not null");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableEqualTo(String value) {
            addCriterion("cumulant_report_type_writable =", value, "cumulantReportTypeWritable");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableNotEqualTo(String value) {
            addCriterion("cumulant_report_type_writable <>", value, "cumulantReportTypeWritable");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableGreaterThan(String value) {
            addCriterion("cumulant_report_type_writable >", value, "cumulantReportTypeWritable");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableGreaterThanOrEqualTo(String value) {
            addCriterion("cumulant_report_type_writable >=", value, "cumulantReportTypeWritable");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableLessThan(String value) {
            addCriterion("cumulant_report_type_writable <", value, "cumulantReportTypeWritable");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableLessThanOrEqualTo(String value) {
            addCriterion("cumulant_report_type_writable <=", value, "cumulantReportTypeWritable");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableLike(String value) {
            addCriterion("cumulant_report_type_writable like", value, "cumulantReportTypeWritable");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableNotLike(String value) {
            addCriterion("cumulant_report_type_writable not like", value, "cumulantReportTypeWritable");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableIn(List<String> values) {
            addCriterion("cumulant_report_type_writable in", values, "cumulantReportTypeWritable");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableNotIn(List<String> values) {
            addCriterion("cumulant_report_type_writable not in", values, "cumulantReportTypeWritable");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableBetween(String value1, String value2) {
            addCriterion("cumulant_report_type_writable between", value1, value2, "cumulantReportTypeWritable");
            return (Criteria) this;
        }

        public Criteria andCumulantReportTypeWritableNotBetween(String value1, String value2) {
            addCriterion("cumulant_report_type_writable not between", value1, value2, "cumulantReportTypeWritable");
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