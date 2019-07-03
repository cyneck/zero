package com.cyneck.zero.entry.mapper;

import com.cyneck.zero.entry.model.pojo.TenantConfig;
import java.util.List;

public interface TenantConfigMapper {
    int deleteByPrimaryKey(String tenantId);

    int insert(TenantConfig record);

    TenantConfig selectByPrimaryKey(String tenantId);

    List<TenantConfig> selectAll();

    int updateByPrimaryKey(TenantConfig record);
}