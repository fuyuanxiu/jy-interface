package com.xh.lesson.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.base.data.ApiResponseResult;
import com.xh.lesson.api.service.PoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//@Api(description = "看板")
//@CrossOrigin
//@ControllerAdvice
//@Controller
//@RequestMapping(value = "/api")
@RequestMapping("/api")
@RestController
@Api(tags = "APi-PO管理")
public class PoController {

    @Autowired
    private PoService poService;
	
    //@PostMapping("/board")
    //@ApiOperation(value = "新增组织接口")
    //@LogAnnotation(title = "机构管理",action = "新增组织")
    //@RequiresPermissions("api:po:board")
    @PostMapping(value = "/po/board1")
    @ApiOperation(value = "用户登录接口")
    public ApiResponseResult findProductionPOBoardData(){
        try {
			return poService.findProductionPOBoardData("findProductionPOBoardData");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ApiResponseResult.failure(e.toString());
		}
    }
    
}
