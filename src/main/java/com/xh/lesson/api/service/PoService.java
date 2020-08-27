package com.xh.lesson.api.service;

import com.app.base.data.ApiResponseResult;

import java.util.List;

import org.springframework.data.domain.PageRequest;

public interface PoService {

	ApiResponseResult findProductionPOBoardData(String string)throws Exception;

    
}
