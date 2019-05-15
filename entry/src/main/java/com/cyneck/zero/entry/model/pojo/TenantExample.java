package com.cyneck.zero.entry.model.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TenantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TenantExample() {
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

        public Criteria andOrganCodeIsNull() {
            addCriterion("organ_code is null");
            return (Criteria) this;
        }

        public Criteria andOrganCodeIsNotNull() {
            addCriterion("organ_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrganCodeEqualTo(String value) {
            addCriterion("organ_code =", value, "organCode");
            return (Criteria) this;
        }

        public Criteria andOrganCodeNotEqualTo(String value) {
            addCriterion("organ_code <>", value, "organCode");
            return (Criteria) this;
        }

        public Criteria andOrganCodeGreaterThan(String value) {
            addCriterion("organ_code >", value, "organCode");
            return (Criteria) this;
        }

        public Criteria andOrganCodeGreaterThanOrEqualTo(String value) {
            addCriterion("organ_code >=", value, "organCode");
            return (Criteria) this;
        }

        public Criteria andOrganCodeLessThan(String value) {
            addCriterion("organ_code <", value, "organCode");
            return (Criteria) this;
        }

        public Criteria andOrganCodeLessThanOrEqualTo(String value) {
            addCriterion("organ_code <=", value, "organCode");
            return (Criteria) this;
        }

        public Criteria andOrganCodeLike(String value) {
            addCriterion("organ_code like", value, "organCode");
            return (Criteria) this;
        }

        public Criteria andOrganCodeNotLike(String value) {
            addCriterion("organ_code not like", value, "organCode");
            return (Criteria) this;
        }

        public Criteria andOrganCodeIn(List<String> values) {
            addCriterion("organ_code in", values, "organCode");
            return (Criteria) this;
        }

        public Criteria andOrganCodeNotIn(List<String> values) {
            addCriterion("organ_code not in", values, "organCode");
            return (Criteria) this;
        }

        public Criteria andOrganCodeBetween(String value1, String value2) {
            addCriterion("organ_code between", value1, value2, "organCode");
            return (Criteria) this;
        }

        public Criteria andOrganCodeNotBetween(String value1, String value2) {
            addCriterion("organ_code not between", value1, value2, "organCode");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdIsNull() {
            addCriterion("create_staff_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdIsNotNull() {
            addCriterion("create_staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdEqualTo(String value) {
            addCriterion("create_staff_id =", value, "createStaffId");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdNotEqualTo(String value) {
            addCriterion("create_staff_id <>", value, "createStaffId");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdGreaterThan(String value) {
            addCriterion("create_staff_id >", value, "createStaffId");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_staff_id >=", value, "createStaffId");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdLessThan(String value) {
            addCriterion("create_staff_id <", value, "createStaffId");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdLessThanOrEqualTo(String value) {
            addCriterion("create_staff_id <=", value, "createStaffId");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdLike(String value) {
            addCriterion("create_staff_id like", value, "createStaffId");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdNotLike(String value) {
            addCriterion("create_staff_id not like", value, "createStaffId");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdIn(List<String> values) {
            addCriterion("create_staff_id in", values, "createStaffId");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdNotIn(List<String> values) {
            addCriterion("create_staff_id not in", values, "createStaffId");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdBetween(String value1, String value2) {
            addCriterion("create_staff_id between", value1, value2, "createStaffId");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIdNotBetween(String value1, String value2) {
            addCriterion("create_staff_id not between", value1, value2, "createStaffId");
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

        public Criteria andModifyStaffIdIsNull() {
            addCriterion("modify_staff_id is null");
            return (Criteria) this;
        }

        public Criteria andModifyStaffIdIsNotNull() {
            addCriterion("modify_staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifyStaffIdEqualTo(String value) {
            addCriterion("modify_staff_id =", value, "modifyStaffId");
            return (Criteria) this;
        }

        public Criteria andModifyStaffIdNotEqualTo(String value) {
            addCriterion("modify_staff_id <>", value, "modifyStaffId");
            return (Criteria) this;
        }

        public Criteria andModifyStaffIdGreaterThan(String value) {
            addCriterion("modify_staff_id >", value, "modifyStaffId");
            return (Criteria) this;
        }

        public Criteria andModifyStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("modify_staff_id >=", value, "modifyStaffId");
            return (Criteria) this;
        }

        public Criteria andModifyStaffIdLessThan(String value) {
            addCriterion("modify_staff_id <", value, "modifyStaffId");
            return (Criteria) this;
        }

        public Criteria andModifyStaffIdLessThanOrEqualTo(String value) {
            addCriterion("modify_staff_id <=", value, "modifyStaffId");
            return (Criteria) this;
        }

        public Criteria andModifyStaffIdLike(String value) {
            addCriterion("modify_staff_id like", value, "modifyStaffId");
            return (Criteria) this;
        }

        public Criteria andModifyStaffIdNotLike(String value) {
            addCriterion("modify_staff_id not like", value, "modifyStaffId");
            return (Criteria) this;
        }

        public Criteria andModifyStaffIdIn(List<String> values) {
            addCriterion("modify_staff_id in", values, "modifyStaffId");
            return (Criteria) this;
        }

        public Criteria andModifyStaffIdNotIn(List<String> values) {
            addCriterion("modify_staff_id not in", values, "modifyStaffId");
            return (Criteria) this;
        }

        public Criteria andModifyStaffIdBetween(String value1, String value2) {
            addCriterion("modify_staff_id between", value1, value2, "modifyStaffId");
            return (Criteria) this;
        }

        public Criteria andModifyStaffIdNotBetween(String value1, String value2) {
            addCriterion("modify_staff_id not between", value1, value2, "modifyStaffId");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNull() {
            addCriterion("domain_name is null");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNotNull() {
            addCriterion("domain_name is not null");
            return (Criteria) this;
        }

        public Criteria andDomainNameEqualTo(String value) {
            addCriterion("domain_name =", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotEqualTo(String value) {
            addCriterion("domain_name <>", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThan(String value) {
            addCriterion("domain_name >", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("domain_name >=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThan(String value) {
            addCriterion("domain_name <", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThanOrEqualTo(String value) {
            addCriterion("domain_name <=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLike(String value) {
            addCriterion("domain_name like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotLike(String value) {
            addCriterion("domain_name not like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameIn(List<String> values) {
            addCriterion("domain_name in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotIn(List<String> values) {
            addCriterion("domain_name not in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameBetween(String value1, String value2) {
            addCriterion("domain_name between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotBetween(String value1, String value2) {
            addCriterion("domain_name not between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andTnameShortIsNull() {
            addCriterion("tname_short is null");
            return (Criteria) this;
        }

        public Criteria andTnameShortIsNotNull() {
            addCriterion("tname_short is not null");
            return (Criteria) this;
        }

        public Criteria andTnameShortEqualTo(String value) {
            addCriterion("tname_short =", value, "tnameShort");
            return (Criteria) this;
        }

        public Criteria andTnameShortNotEqualTo(String value) {
            addCriterion("tname_short <>", value, "tnameShort");
            return (Criteria) this;
        }

        public Criteria andTnameShortGreaterThan(String value) {
            addCriterion("tname_short >", value, "tnameShort");
            return (Criteria) this;
        }

        public Criteria andTnameShortGreaterThanOrEqualTo(String value) {
            addCriterion("tname_short >=", value, "tnameShort");
            return (Criteria) this;
        }

        public Criteria andTnameShortLessThan(String value) {
            addCriterion("tname_short <", value, "tnameShort");
            return (Criteria) this;
        }

        public Criteria andTnameShortLessThanOrEqualTo(String value) {
            addCriterion("tname_short <=", value, "tnameShort");
            return (Criteria) this;
        }

        public Criteria andTnameShortLike(String value) {
            addCriterion("tname_short like", value, "tnameShort");
            return (Criteria) this;
        }

        public Criteria andTnameShortNotLike(String value) {
            addCriterion("tname_short not like", value, "tnameShort");
            return (Criteria) this;
        }

        public Criteria andTnameShortIn(List<String> values) {
            addCriterion("tname_short in", values, "tnameShort");
            return (Criteria) this;
        }

        public Criteria andTnameShortNotIn(List<String> values) {
            addCriterion("tname_short not in", values, "tnameShort");
            return (Criteria) this;
        }

        public Criteria andTnameShortBetween(String value1, String value2) {
            addCriterion("tname_short between", value1, value2, "tnameShort");
            return (Criteria) this;
        }

        public Criteria andTnameShortNotBetween(String value1, String value2) {
            addCriterion("tname_short not between", value1, value2, "tnameShort");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNull() {
            addCriterion("begin_date is null");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNotNull() {
            addCriterion("begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDateEqualTo(Date value) {
            addCriterion("begin_date =", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotEqualTo(Date value) {
            addCriterion("begin_date <>", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThan(Date value) {
            addCriterion("begin_date >", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_date >=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThan(Date value) {
            addCriterion("begin_date <", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("begin_date <=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIn(List<Date> values) {
            addCriterion("begin_date in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotIn(List<Date> values) {
            addCriterion("begin_date not in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateBetween(Date value1, Date value2) {
            addCriterion("begin_date between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("begin_date not between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andLogoPathIsNull() {
            addCriterion("logo_path is null");
            return (Criteria) this;
        }

        public Criteria andLogoPathIsNotNull() {
            addCriterion("logo_path is not null");
            return (Criteria) this;
        }

        public Criteria andLogoPathEqualTo(String value) {
            addCriterion("logo_path =", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotEqualTo(String value) {
            addCriterion("logo_path <>", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathGreaterThan(String value) {
            addCriterion("logo_path >", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathGreaterThanOrEqualTo(String value) {
            addCriterion("logo_path >=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLessThan(String value) {
            addCriterion("logo_path <", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLessThanOrEqualTo(String value) {
            addCriterion("logo_path <=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLike(String value) {
            addCriterion("logo_path like", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotLike(String value) {
            addCriterion("logo_path not like", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathIn(List<String> values) {
            addCriterion("logo_path in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotIn(List<String> values) {
            addCriterion("logo_path not in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathBetween(String value1, String value2) {
            addCriterion("logo_path between", value1, value2, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotBetween(String value1, String value2) {
            addCriterion("logo_path not between", value1, value2, "logoPath");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoIsNull() {
            addCriterion("welcome_info is null");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoIsNotNull() {
            addCriterion("welcome_info is not null");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoEqualTo(String value) {
            addCriterion("welcome_info =", value, "welcomeInfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoNotEqualTo(String value) {
            addCriterion("welcome_info <>", value, "welcomeInfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoGreaterThan(String value) {
            addCriterion("welcome_info >", value, "welcomeInfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("welcome_info >=", value, "welcomeInfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoLessThan(String value) {
            addCriterion("welcome_info <", value, "welcomeInfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoLessThanOrEqualTo(String value) {
            addCriterion("welcome_info <=", value, "welcomeInfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoLike(String value) {
            addCriterion("welcome_info like", value, "welcomeInfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoNotLike(String value) {
            addCriterion("welcome_info not like", value, "welcomeInfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoIn(List<String> values) {
            addCriterion("welcome_info in", values, "welcomeInfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoNotIn(List<String> values) {
            addCriterion("welcome_info not in", values, "welcomeInfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoBetween(String value1, String value2) {
            addCriterion("welcome_info between", value1, value2, "welcomeInfo");
            return (Criteria) this;
        }

        public Criteria andWelcomeInfoNotBetween(String value1, String value2) {
            addCriterion("welcome_info not between", value1, value2, "welcomeInfo");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameIsNull() {
            addCriterion("sale_cust_name is null");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameIsNotNull() {
            addCriterion("sale_cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameEqualTo(String value) {
            addCriterion("sale_cust_name =", value, "saleCustName");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameNotEqualTo(String value) {
            addCriterion("sale_cust_name <>", value, "saleCustName");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameGreaterThan(String value) {
            addCriterion("sale_cust_name >", value, "saleCustName");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("sale_cust_name >=", value, "saleCustName");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameLessThan(String value) {
            addCriterion("sale_cust_name <", value, "saleCustName");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameLessThanOrEqualTo(String value) {
            addCriterion("sale_cust_name <=", value, "saleCustName");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameLike(String value) {
            addCriterion("sale_cust_name like", value, "saleCustName");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameNotLike(String value) {
            addCriterion("sale_cust_name not like", value, "saleCustName");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameIn(List<String> values) {
            addCriterion("sale_cust_name in", values, "saleCustName");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameNotIn(List<String> values) {
            addCriterion("sale_cust_name not in", values, "saleCustName");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameBetween(String value1, String value2) {
            addCriterion("sale_cust_name between", value1, value2, "saleCustName");
            return (Criteria) this;
        }

        public Criteria andSaleCustNameNotBetween(String value1, String value2) {
            addCriterion("sale_cust_name not between", value1, value2, "saleCustName");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberIsNull() {
            addCriterion("sale_tax_id_number is null");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberIsNotNull() {
            addCriterion("sale_tax_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberEqualTo(String value) {
            addCriterion("sale_tax_id_number =", value, "saleTaxIdNumber");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberNotEqualTo(String value) {
            addCriterion("sale_tax_id_number <>", value, "saleTaxIdNumber");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberGreaterThan(String value) {
            addCriterion("sale_tax_id_number >", value, "saleTaxIdNumber");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sale_tax_id_number >=", value, "saleTaxIdNumber");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberLessThan(String value) {
            addCriterion("sale_tax_id_number <", value, "saleTaxIdNumber");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberLessThanOrEqualTo(String value) {
            addCriterion("sale_tax_id_number <=", value, "saleTaxIdNumber");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberLike(String value) {
            addCriterion("sale_tax_id_number like", value, "saleTaxIdNumber");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberNotLike(String value) {
            addCriterion("sale_tax_id_number not like", value, "saleTaxIdNumber");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberIn(List<String> values) {
            addCriterion("sale_tax_id_number in", values, "saleTaxIdNumber");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberNotIn(List<String> values) {
            addCriterion("sale_tax_id_number not in", values, "saleTaxIdNumber");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberBetween(String value1, String value2) {
            addCriterion("sale_tax_id_number between", value1, value2, "saleTaxIdNumber");
            return (Criteria) this;
        }

        public Criteria andSaleTaxIdNumberNotBetween(String value1, String value2) {
            addCriterion("sale_tax_id_number not between", value1, value2, "saleTaxIdNumber");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankIsNull() {
            addCriterion("sale_open_bank is null");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankIsNotNull() {
            addCriterion("sale_open_bank is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankEqualTo(String value) {
            addCriterion("sale_open_bank =", value, "saleOpenBank");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankNotEqualTo(String value) {
            addCriterion("sale_open_bank <>", value, "saleOpenBank");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankGreaterThan(String value) {
            addCriterion("sale_open_bank >", value, "saleOpenBank");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankGreaterThanOrEqualTo(String value) {
            addCriterion("sale_open_bank >=", value, "saleOpenBank");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankLessThan(String value) {
            addCriterion("sale_open_bank <", value, "saleOpenBank");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankLessThanOrEqualTo(String value) {
            addCriterion("sale_open_bank <=", value, "saleOpenBank");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankLike(String value) {
            addCriterion("sale_open_bank like", value, "saleOpenBank");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankNotLike(String value) {
            addCriterion("sale_open_bank not like", value, "saleOpenBank");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankIn(List<String> values) {
            addCriterion("sale_open_bank in", values, "saleOpenBank");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankNotIn(List<String> values) {
            addCriterion("sale_open_bank not in", values, "saleOpenBank");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankBetween(String value1, String value2) {
            addCriterion("sale_open_bank between", value1, value2, "saleOpenBank");
            return (Criteria) this;
        }

        public Criteria andSaleOpenBankNotBetween(String value1, String value2) {
            addCriterion("sale_open_bank not between", value1, value2, "saleOpenBank");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelIsNull() {
            addCriterion("sale_addr_and_tel is null");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelIsNotNull() {
            addCriterion("sale_addr_and_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelEqualTo(String value) {
            addCriterion("sale_addr_and_tel =", value, "saleAddrAndTel");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelNotEqualTo(String value) {
            addCriterion("sale_addr_and_tel <>", value, "saleAddrAndTel");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelGreaterThan(String value) {
            addCriterion("sale_addr_and_tel >", value, "saleAddrAndTel");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelGreaterThanOrEqualTo(String value) {
            addCriterion("sale_addr_and_tel >=", value, "saleAddrAndTel");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelLessThan(String value) {
            addCriterion("sale_addr_and_tel <", value, "saleAddrAndTel");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelLessThanOrEqualTo(String value) {
            addCriterion("sale_addr_and_tel <=", value, "saleAddrAndTel");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelLike(String value) {
            addCriterion("sale_addr_and_tel like", value, "saleAddrAndTel");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelNotLike(String value) {
            addCriterion("sale_addr_and_tel not like", value, "saleAddrAndTel");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelIn(List<String> values) {
            addCriterion("sale_addr_and_tel in", values, "saleAddrAndTel");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelNotIn(List<String> values) {
            addCriterion("sale_addr_and_tel not in", values, "saleAddrAndTel");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelBetween(String value1, String value2) {
            addCriterion("sale_addr_and_tel between", value1, value2, "saleAddrAndTel");
            return (Criteria) this;
        }

        public Criteria andSaleAddrAndTelNotBetween(String value1, String value2) {
            addCriterion("sale_addr_and_tel not between", value1, value2, "saleAddrAndTel");
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