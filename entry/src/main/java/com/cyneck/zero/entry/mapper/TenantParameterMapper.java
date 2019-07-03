package com.cyneck.zero.entry.mapper;

import com.cyneck.zero.entry.model.pojo.TenantParameter;
import java.util.List;

public interface TenantParameterMapper {
    int deleteByPrimaryKey(String tenantId);

    int insert(TenantParameter record);

    TenantParameter selectByPrimaryKey(String tenantId);

    List<TenantParameter> selectAll();

    int updateByPrimaryKey(TenantParameter record);
}