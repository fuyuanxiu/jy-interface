package com.xh.lesson.api.service.internal;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.base.data.ApiResponseResult;
import com.xh.lesson.api.ApiUtil;
import com.xh.lesson.api.service.PoService;

@Service(value = "PoService")
@Transactional(propagation = Propagation.REQUIRED)
public class PoImpl  implements PoService {

	@Override
	public ApiResponseResult findProductionPOBoardData(String string) throws Exception {
		// TODO Auto-generated method stub
		return ApiResponseResult.success("").data(ApiUtil.getList(string));
	}

}
