package com.cyneck.zero.entry.model.pojo;

import com.cyneck.zero.common.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class Tenant extends BaseEntity implements Serializable {
    private String tenantId;

    private String organCode;

    private String companyName;

    private String state;

    private String contactName;

    private String createStaffId;

    private Date createTime;

    private String modifyStaffId;

    private Date modifyTime;

    private String domainName;

    private String tnameShort;

    private Date beginDate;

    private Date endDate;

    private String contactPhone;

    private String logoPath;

    private String welcomeInfo;

    private String saleCustName;

    private String saleTaxIdNumber;

    private String saleOpenBank;

    private String saleAddrAndTel;

    private static final long serialVersionUID = 1L;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getCreateStaffId() {
        return createStaffId;
    }

    public void setCreateStaffId(String createStaffId) {
        this.createStaffId = createStaffId == null ? null : createStaffId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyStaffId() {
        return modifyStaffId;
    }

    public void setModifyStaffId(String modifyStaffId) {
        this.modifyStaffId = modifyStaffId == null ? null : modifyStaffId.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName == null ? null : domainName.trim();
    }

    public String getTnameShort() {
        return tnameShort;
    }

    public void setTnameShort(String tnameShort) {
        this.tnameShort = tnameShort == null ? null : tnameShort.trim();
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath == null ? null : logoPath.trim();
    }

    public String getWelcomeInfo() {
        return welcomeInfo;
    }

    public void setWelcomeInfo(String welcomeInfo) {
        this.welcomeInfo = welcomeInfo == null ? null : welcomeInfo.trim();
    }

    public String getSaleCustName() {
        return saleCustName;
    }

    public void setSaleCustName(String saleCustName) {
        this.saleCustName = saleCustName == null ? null : saleCustName.trim();
    }

    public String getSaleTaxIdNumber() {
        return saleTaxIdNumber;
    }

    public void setSaleTaxIdNumber(String saleTaxIdNumber) {
        this.saleTaxIdNumber = saleTaxIdNumber == null ? null : saleTaxIdNumber.trim();
    }

    public String getSaleOpenBank() {
        return saleOpenBank;
    }

    public void setSaleOpenBank(String saleOpenBank) {
        this.saleOpenBank = saleOpenBank == null ? null : saleOpenBank.trim();
    }

    public String getSaleAddrAndTel() {
        return saleAddrAndTel;
    }

    public void setSaleAddrAndTel(String saleAddrAndTel) {
        this.saleAddrAndTel = saleAddrAndTel == null ? null : saleAddrAndTel.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tenantId=").append(tenantId);
        sb.append(", organCode=").append(organCode);
        sb.append(", companyName=").append(companyName);
        sb.append(", state=").append(state);
        sb.append(", contactName=").append(contactName);
        sb.append(", createStaffId=").append(createStaffId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyStaffId=").append(modifyStaffId);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", domainName=").append(domainName);
        sb.append(", tnameShort=").append(tnameShort);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", contactPhone=").append(contactPhone);
        sb.append(", logoPath=").append(logoPath);
        sb.append(", welcomeInfo=").append(welcomeInfo);
        sb.append(", saleCustName=").append(saleCustName);
        sb.append(", saleTaxIdNumber=").append(saleTaxIdNumber);
        sb.append(", saleOpenBank=").append(saleOpenBank);
        sb.append(", saleAddrAndTel=").append(saleAddrAndTel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}