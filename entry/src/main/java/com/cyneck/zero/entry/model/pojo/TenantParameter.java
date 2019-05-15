package com.cyneck.zero.entry.model.pojo;

import com.cyneck.zero.common.model.BaseEntity;
import java.io.Serializable;

public class TenantParameter extends BaseEntity implements Serializable {
    private String tenantId;

    private String readDecimalDigit;

    private String settleModel;

    private String apiUrl;

    private String businessModel;

    private String alarmFrequency;

    private static final long serialVersionUID = 1L;

    public TenantParameter(String tenantId, String readDecimalDigit, String settleModel, String apiUrl, String businessModel, String alarmFrequency) {
        this.tenantId = tenantId;
        this.readDecimalDigit = readDecimalDigit;
        this.settleModel = settleModel;
        this.apiUrl = apiUrl;
        this.businessModel = businessModel;
        this.alarmFrequency = alarmFrequency;
    }

    public TenantParameter() {
        super();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getReadDecimalDigit() {
        return readDecimalDigit;
    }

    public void setReadDecimalDigit(String readDecimalDigit) {
        this.readDecimalDigit = readDecimalDigit == null ? null : readDecimalDigit.trim();
    }

    public String getSettleModel() {
        return settleModel;
    }

    public void setSettleModel(String settleModel) {
        this.settleModel = settleModel == null ? null : settleModel.trim();
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl == null ? null : apiUrl.trim();
    }

    public String getBusinessModel() {
        return businessModel;
    }

    public void setBusinessModel(String businessModel) {
        this.businessModel = businessModel == null ? null : businessModel.trim();
    }

    public String getAlarmFrequency() {
        return alarmFrequency;
    }

    public void setAlarmFrequency(String alarmFrequency) {
        this.alarmFrequency = alarmFrequency == null ? null : alarmFrequency.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tenantId=").append(tenantId);
        sb.append(", readDecimalDigit=").append(readDecimalDigit);
        sb.append(", settleModel=").append(settleModel);
        sb.append(", apiUrl=").append(apiUrl);
        sb.append(", businessModel=").append(businessModel);
        sb.append(", alarmFrequency=").append(alarmFrequency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}