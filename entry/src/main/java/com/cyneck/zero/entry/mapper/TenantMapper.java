package com.cyneck.zero.entry.mapper;

import com.cyneck.zero.entry.model.condition.TenantCondition;
import com.cyneck.zero.entry.model.pojo.Tenant;
import com.cyneck.zero.entry.model.pojo.TenantExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface TenantMapper {
    int deleteByExample(TenantExample example);

    int deleteByPrimaryKey(String tenantId);

    int insert(Tenant record);

    int insertSelective(Tenant record);

    List<Tenant> selectByExample(TenantExample example);

    Tenant selectByPrimaryKey(String tenantId);

    int updateByExampleSelective(@Param("record") Tenant record, @Param("example") TenantExample example);

    int updateByExample(@Param("record") Tenant record, @Param("example") TenantExample example);

    int updateByPrimaryKeySelective(Tenant record);

    int updateByPrimaryKey(Tenant record);

    List<Tenant> selectByCondition(TenantCondition condition);
}