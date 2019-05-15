package com.cyneck.zero.entry.controller;

import com.cyneck.zero.common.model.ApiResponse;
import com.cyneck.zero.entry.model.condition.TenantCondition;
import com.cyneck.zero.entry.model.pojo.Tenant;
import com.cyneck.zero.entry.service.TenantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.controller
 * @Description : TODO
 * @Create on : 2019/5/15 13:30
 **/
@Api(value = "租户维护", description = "TenantController")
@RestController
@RequestMapping(value = "/tenant/*")
public class TenantController {

    @Resource
    TenantService tenantService;

    @ApiOperation(value = "addTenant", notes = "新增租户")
    @RequestMapping(value = "addTenant", method = RequestMethod.POST)
    public ApiResponse addTenant(@RequestBody Tenant tenant) {
        int num = tenantService.addTenant(tenant);
        return ApiResponse.Success(num);
    }

    @ApiOperation(value = "updateTenant", notes = "修改租户信息")
    @RequestMapping(value = "updateTenant", method = RequestMethod.POST)
    public ApiResponse updateTenant(@RequestBody Tenant tenant) {
        int num = tenantService.modifyTenant(tenant);
        return ApiResponse.Success(num);
    }


    @ApiOperation(value = "getList", notes = "获取列表")
    @RequestMapping(value = "getList", method = RequestMethod.POST)
    public ApiResponse getList(@RequestBody TenantCondition condition) {
        List<Tenant> tenantList = tenantService.getTenantList(condition);
        return ApiResponse.Success(tenantList);
    }

    @ApiOperation(value = "getDetail", notes = "获取详情")
    @RequestMapping(value = "getDetail", method = RequestMethod.GET)
    public ApiResponse getDetail(String tenantId) {
        Tenant tenant = tenantService.getTenantDetail(tenantId);
        return ApiResponse.Success(tenant);
    }

}
