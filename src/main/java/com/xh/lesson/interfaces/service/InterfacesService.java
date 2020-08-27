package com.xh.lesson.interfaces.service;


import java.util.Date;

import org.springframework.data.domain.PageRequest;

import com.app.base.data.ApiResponseResult;
import com.xh.lesson.interfaces.entity.InterfacesInfo;

public interface InterfacesService {

    public ApiResponseResult add(InterfacesInfo sysRouter) throws Exception;
    
    public ApiResponseResult edite(InterfacesInfo sysRouter) throws Exception;

    public ApiResponseResult delete(Long id) throws Exception;
    
    public ApiResponseResult getlist(String keyword, PageRequest pageRequest) throws Exception;

}
