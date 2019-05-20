package com.cyneck.zero.entry.model.vo;

import com.cyneck.zero.entry.model.pojo.Tenant;
import com.cyneck.zero.entry.model.pojo.TenantConfig;
import com.cyneck.zero.entry.model.pojo.TenantParameter;
import lombok.Data;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.model.vo
 * @Description : TODO
 * @Create on : 2019/5/17 09:33
 **/
@Data
public class TenantVo {
    private String tenantId;
    private String tnameShort;

    private Tenant tenant;
    private TenantParameter tenantParameter;
    private TenantConfig tenantConfig;

    public TenantVo(Tenant tenant, TenantParameter tenantParameter, TenantConfig tenantConfig) {
        this.tenant = tenant;
        this.tenantConfig = tenantConfig;
        this.tenantParameter = tenantParameter;
    }
}
