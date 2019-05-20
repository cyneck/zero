package com.cyneck.zero.entry.service.impl;

import com.cyneck.zero.common.aop.page.annotation.PageAnnotation;
import com.cyneck.zero.entry.mapper.TenantConfigMapper;
import com.cyneck.zero.entry.mapper.TenantMapper;
import com.cyneck.zero.entry.mapper.TenantParameterMapper;
import com.cyneck.zero.entry.model.condition.TenantCondition;
import com.cyneck.zero.entry.model.pojo.Tenant;
import com.cyneck.zero.entry.model.pojo.TenantConfig;
import com.cyneck.zero.entry.model.pojo.TenantParameter;
import com.cyneck.zero.entry.model.vo.TenantVo;
import com.cyneck.zero.entry.service.TenantService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
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
    public int testTenantVo(TenantVo tenant) {
        addTenantVo(tenant);
        modifyTenantVo(tenant);
        return 0;
    }

    @Override
    public int saveTenantVo(TenantVo tenant) {
        int tNum = tenantMapper.insert(tenant.getTenant());
        if (null != tenant.getTenantParameter()) {
            int tpNum = tenantParameterMapper.insert(tenant.getTenantParameter());
        }
        if (null != tenant.getTenantConfig()) {
            int tcNum = tenantConfigMapper.insert(tenant.getTenantConfig());
        }
        return tNum;
    }

    @Override
    public int addTenantVo(TenantVo tenant) {
        tenant.getTenant().setCreateStaffId("system");
        tenant.getTenant().setCreateTime(new Date());
        int tNum = tenantMapper.insert(tenant.getTenant());
        int tpNum = tenantParameterMapper.insert(tenant.getTenantParameter());
        int tcNum = tenantConfigMapper.insert(tenant.getTenantConfig());
        return tNum;
    }

    @Override
    public int modifyTenantVo(TenantVo tenant) {
        if (true) {
            throw new NullPointerException();
        }
//        int tNum = tenantMapper.updateByPrimaryKey(tenant.getTenant());
//        int tpNum = tenantParameterMapper.updateByPrimaryKey(tenant.getTenantParameter());
//        int tcNum = tenantConfigMapper.updateByPrimaryKey(tenant.getTenantConfig());
        return 0;
    }

    @Override
    public int deleteTenantVo(String id) {
        int tNum = tenantMapper.deleteByPrimaryKey(id);
        int tpNum = tenantParameterMapper.deleteByPrimaryKey(id);
        int tcNum = tenantConfigMapper.deleteByPrimaryKey(id);
        return tNum;
    }

    @Override
    @PageAnnotation(clazz = Tenant.class)
    public List<Tenant> getTenantList(TenantCondition condition) {

        List<Tenant> tenantList = tenantMapper.selectByCondition(condition);
        return tenantList;
    }

    @Override
    public TenantVo getTenantVoDetail(String tenantId) {
        Tenant tenant = tenantMapper.selectByPrimaryKey(tenantId);
        TenantParameter tenantParameter = tenantParameterMapper.selectByPrimaryKey(tenantId);
        TenantConfig tenantConfig = tenantConfigMapper.selectByPrimaryKey(tenantId);
        TenantVo tenantVo = new TenantVo(tenant, tenantParameter, tenantConfig);
        tenantVo.setTenantId(tenant.getTenantId());
        tenantVo.setTnameShort(tenant.getTnameShort());
        return tenantVo;
    }
}
