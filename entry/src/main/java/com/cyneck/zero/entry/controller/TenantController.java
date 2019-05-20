package com.cyneck.zero.entry.controller;

import com.cyneck.zero.common.model.ApiResponse;
import com.cyneck.zero.entry.model.condition.TenantCondition;
import com.cyneck.zero.entry.model.pojo.Tenant;
import com.cyneck.zero.entry.model.pojo.TenantExample;
import com.cyneck.zero.entry.model.vo.TenantVo;
import com.cyneck.zero.entry.service.TenantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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


    @ApiOperation(value = "test", notes = "保存租户信息")
    @RequestMapping(value = "test", method = RequestMethod.POST)
    public ApiResponse test(@RequestBody TenantVo tenantVo) {
        int num = tenantService.testTenantVo(tenantVo);
        return ApiResponse.Success(num);
    }

    @ApiOperation(value = "saveTenant", notes = "保存租户信息")
    @RequestMapping(value = "saveTenant", method = RequestMethod.POST)
    public ApiResponse addTenantVo(@RequestBody TenantVo tenantVo) {
        int num = tenantService.saveTenantVo(tenantVo);
        return ApiResponse.Success(num);
    }


    @ApiOperation(value = "getList", notes = "获取列表")
    @RequestMapping(value = "getList", method = RequestMethod.POST)
    public ApiResponse getList(@RequestBody TenantCondition condition) {
        TenantExample tenantExample = new TenantExample();
        tenantExample.createCriteria();
        List<Tenant> tenantList = tenantService.getTenantList(condition);
        return ApiResponse.Success(tenantList);
    }

    @ApiOperation(value = "getDetail", notes = "获取详情")
    @RequestMapping(value = "getDetail", method = RequestMethod.GET)
    public ApiResponse getDetail(@RequestParam(value = "tenantId") String tenantId) {
        TenantVo tenantVo = tenantService.getTenantVoDetail(tenantId);
        return ApiResponse.Success(tenantVo);
    }

}
