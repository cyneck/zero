package com.cyneck.zero.entry.service;

import com.cyneck.zero.entry.model.condition.TenantCondition;
import com.cyneck.zero.entry.model.pojo.Tenant;

import java.util.List;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.service
 * @Description : TODO
 * @Create on : 2019/5/15 11:30
 **/
public interface TenantService {

    int addTenant(Tenant tenant);

    int modifyTenant(Tenant tenant);

    List<Tenant> getTenantList(TenantCondition condition);

    Tenant getTenantDetail(String id);

}
