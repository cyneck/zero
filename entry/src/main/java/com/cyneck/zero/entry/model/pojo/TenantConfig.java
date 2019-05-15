package com.cyneck.zero.entry.model.pojo;

import com.cyneck.zero.common.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class TenantConfig extends BaseEntity implements Serializable {
    private String tenantId;

    private String customizeResetSurplus;

    private String printRepairReceipt;

    private String initialCycQty;

    private Date createTime;

    private String timeSplitEnable;

    private String adjustLadder;

    private String cumulantReportType;

    private String cumulantReportTypeWritable;

    private static final long serialVersionUID = 1L;

    public TenantConfig(String tenantId, String customizeResetSurplus, String printRepairReceipt, String initialCycQty, Date createTime, String timeSplitEnable, String adjustLadder, String cumulantReportType, String cumulantReportTypeWritable) {
        this.tenantId = tenantId;
        this.customizeResetSurplus = customizeResetSurplus;
        this.printRepairReceipt = printRepairReceipt;
        this.initialCycQty = initialCycQty;
        this.createTime = createTime;
        this.timeSplitEnable = timeSplitEnable;
        this.adjustLadder = adjustLadder;
        this.cumulantReportType = cumulantReportType;
        this.cumulantReportTypeWritable = cumulantReportTypeWritable;
    }

    public TenantConfig() {
        super();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getCustomizeResetSurplus() {
        return customizeResetSurplus;
    }

    public void setCustomizeResetSurplus(String customizeResetSurplus) {
        this.customizeResetSurplus = customizeResetSurplus == null ? null : customizeResetSurplus.trim();
    }

    public String getPrintRepairReceipt() {
        return printRepairReceipt;
    }

    public void setPrintRepairReceipt(String printRepairReceipt) {
        this.printRepairReceipt = printRepairReceipt == null ? null : printRepairReceipt.trim();
    }

    public String getInitialCycQty() {
        return initialCycQty;
    }

    public void setInitialCycQty(String initialCycQty) {
        this.initialCycQty = initialCycQty == null ? null : initialCycQty.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTimeSplitEnable() {
        return timeSplitEnable;
    }

    public void setTimeSplitEnable(String timeSplitEnable) {
        this.timeSplitEnable = timeSplitEnable == null ? null : timeSplitEnable.trim();
    }

    public String getAdjustLadder() {
        return adjustLadder;
    }

    public void setAdjustLadder(String adjustLadder) {
        this.adjustLadder = adjustLadder == null ? null : adjustLadder.trim();
    }

    public String getCumulantReportType() {
        return cumulantReportType;
    }

    public void setCumulantReportType(String cumulantReportType) {
        this.cumulantReportType = cumulantReportType == null ? null : cumulantReportType.trim();
    }

    public String getCumulantReportTypeWritable() {
        return cumulantReportTypeWritable;
    }

    public void setCumulantReportTypeWritable(String cumulantReportTypeWritable) {
        this.cumulantReportTypeWritable = cumulantReportTypeWritable == null ? null : cumulantReportTypeWritable.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tenantId=").append(tenantId);
        sb.append(", customizeResetSurplus=").append(customizeResetSurplus);
        sb.append(", printRepairReceipt=").append(printRepairReceipt);
        sb.append(", initialCycQty=").append(initialCycQty);
        sb.append(", createTime=").append(createTime);
        sb.append(", timeSplitEnable=").append(timeSplitEnable);
        sb.append(", adjustLadder=").append(adjustLadder);
        sb.append(", cumulantReportType=").append(cumulantReportType);
        sb.append(", cumulantReportTypeWritable=").append(cumulantReportTypeWritable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}