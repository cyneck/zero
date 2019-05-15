package com.cyneck.zero.entry.service.impl;

import com.cyneck.zero.common.aop.page.annotation.PageAnnotation;
import com.cyneck.zero.entry.mapper.TenantConfigMapper;
import com.cyneck.zero.entry.mapper.TenantMapper;
import com.cyneck.zero.entry.mapper.TenantParameterMapper;
import com.cyneck.zero.entry.model.condition.TenantCondition;
import com.cyneck.zero.entry.model.pojo.Tenant;
import com.cyneck.zero.entry.service.TenantService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.service.impl
 * @Description : 租住维护
 * @Create on : 2019/5/15 11:30
 **/
@Service
public class TenantServiceImpl implements TenantService {

    @Resource
    TenantMapper tenantMapper;

    @Resource
    TenantConfigMapper tenantConfigMapper;

    @Resource
    TenantParameterMapper tenantParameterMapper;

    @Override
    public int addTenant(Tenant tenant) {
        int num = tenantMapper.insert(tenant);
        return num;
    }

    @Override
    public int modifyTenant(Tenant tenant) {

        return tenantMapper.updateByPrimaryKey(tenant);
    }

    @Override
    @PageAnnotation(clazz = Tenant.class)
    public List<Tenant> getTenantList(TenantCondition condition) {
        List<Tenant> tenantList = tenantMapper.selectByCondition(condition);
        return tenantList;
    }

    @Override
    public Tenant getTenantDetail(String id) {
        return tenantMapper.selectByPrimaryKey(id);
    }
}
