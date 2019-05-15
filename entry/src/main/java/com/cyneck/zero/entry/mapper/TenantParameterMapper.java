package com.cyneck.zero.entry.mapper;

import com.cyneck.zero.entry.model.pojo.TenantParameter;
import com.cyneck.zero.entry.model.pojo.TenantParameterExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TenantParameterMapper {
    int deleteByExample(TenantParameterExample example);

    int deleteByPrimaryKey(String tenantId);

    int insert(TenantParameter record);

    int insertSelective(TenantParameter record);

    List<TenantParameter> selectByExample(TenantParameterExample example);

    TenantParameter selectByPrimaryKey(String tenantId);

    int updateByExampleSelective(@Param("record") TenantParameter record, @Param("example") TenantParameterExample example);

    int updateByExample(@Param("record") TenantParameter record, @Param("example") TenantParameterExample example);

    int updateByPrimaryKeySelective(TenantParameter record);

    int updateByPrimaryKey(TenantParameter record);
}