package com.xh.lesson.interfaces.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.base.control.WebController;
import com.app.base.data.ApiResponseResult;
import com.xh.lesson.aop.annotation.LogAnnotation;
import com.xh.lesson.interfaces.entity.InterfacesInfo;
import com.xh.lesson.interfaces.service.InterfacesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/interface")
@RestController
@Api(tags = "接口配置-接口配置信息管理")
public class InterfacesController extends WebController{

    @Autowired
    private InterfacesService sysRouterService;
    
    @PostMapping("/add")
    @ApiOperation(value = "新增接口配置")
    @LogAnnotation(title = "接口配置信息管理",action = "新增接口配置")
    @RequiresPermissions("interface:add")
    public ApiResponseResult add(@RequestBody(required=false) InterfacesInfo sysRouter){
        try{
            return sysRouterService.add(sysRouter);
        }catch(Exception e){
            return ApiResponseResult.failure("新增接口配置失败！");
        }
    }


    @ApiOperation(value = "删除接口配置", notes = "删除接口配置")
    @PostMapping("/delete")
    public ApiResponseResult delete(@RequestParam(value = "id", required = false) Long id){
        try{
            return sysRouterService.delete(id);
        }catch(Exception e){
            return ApiResponseResult.failure("删除角色失败！");
        }
    }

    
    @PostMapping("/getlist")
    @ApiOperation(value = "分页获取接口配置信息")
    @LogAnnotation(title = "接口配置信息",action = "分页获取接口配置信息")
    //@RequiresPermissions("sys:role:list")
    public ApiResponseResult getlist(String keyword) {
        try {
        	Sort sort = new Sort(Sort.Direction.DESC, "id");
            return sysRouterService.getlist(keyword,super.getPageRequest(sort));
        } catch (Exception e) {
        	System.out.println(e.toString());
            return ApiResponseResult.failure("获取接口配置信息失败！"+e.toString());
        }
    }
    
}
