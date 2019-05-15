package com.cyneck.zero.entry.mapper;

import com.cyneck.zero.entry.model.pojo.TenantConfig;
import com.cyneck.zero.entry.model.pojo.TenantConfigExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TenantConfigMapper {
    int deleteByExample(TenantConfigExample example);

    int deleteByPrimaryKey(String tenantId);

    int insert(TenantConfig record);

    int insertSelective(TenantConfig record);

    List<TenantConfig> selectByExample(TenantConfigExample example);

    TenantConfig selectByPrimaryKey(String tenantId);

    int updateByExampleSelective(@Param("record") TenantConfig record, @Param("example") TenantConfigExample example);

    int updateByExample(@Param("record") TenantConfig record, @Param("example") TenantConfigExample example);

    int updateByPrimaryKeySelective(TenantConfig record);

    int updateByPrimaryKey(TenantConfig record);
}