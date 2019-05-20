package com.cyneck.zero.entry.service;

import com.cyneck.zero.entry.model.condition.TenantCondition;
import com.cyneck.zero.entry.model.pojo.Tenant;
import com.cyneck.zero.entry.model.vo.TenantVo;

import java.util.List;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.service
 * @Description : 租户维护
 * @Create on : 2019/5/15 11:30
 **/
public interface TenantService {

    //事务传播特性测试
    int testTenantVo(TenantVo tenant);

    int saveTenantVo(TenantVo tenant);

    int addTenantVo(TenantVo tenant);

    int modifyTenantVo(TenantVo tenant);

    int deleteTenantVo(String id);

    List<Tenant> getTenantList(TenantCondition condition);

    TenantVo getTenantVoDetail(String id);

}
