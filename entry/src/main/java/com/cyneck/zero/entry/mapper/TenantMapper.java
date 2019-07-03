package com.cyneck.zero.entry.mapper;

import com.cyneck.zero.entry.model.pojo.Tenant;
import java.util.List;

public interface TenantMapper {
    int deleteByPrimaryKey(String tenantId);

    int insert(Tenant record);

    Tenant selectByPrimaryKey(String tenantId);

    List<Tenant> selectAll();

    int updateByPrimaryKey(Tenant record);
}