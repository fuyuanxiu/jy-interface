package com.xh.lesson.interfaces.service.internal;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.base.data.ApiResponseResult;
import com.app.base.data.DataGrid;
import com.utils.BaseService;
import com.utils.SearchFilter;
import com.utils.enumeration.BasicStateEnum;
import com.xh.lesson.interfaces.dao.InterfacesInfoDao;
import com.xh.lesson.interfaces.entity.InterfacesInfo;
import com.xh.lesson.interfaces.service.InterfacesService;


@Service(value = "interfacesService")
@Transactional(propagation = Propagation.REQUIRED)
public class InterfacesImpl implements InterfacesService {

    @Autowired
    private InterfacesInfoDao interfacesInfoDao;

	@Override
	public ApiResponseResult add(InterfacesInfo interfacesInfo) throws Exception {
		// TODO Auto-generated method stub
		interfacesInfoDao.save(interfacesInfo);
		return ApiResponseResult.success("保存成功");
	}

	@Override
	public ApiResponseResult edite(InterfacesInfo sysRouter) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponseResult delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponseResult getlist(String keyword,  PageRequest pageRequest) throws Exception {
		// TODO Auto-generated method stub
		//查询条件1
        List<SearchFilter> filters =new ArrayList<>();
        filters.add(new SearchFilter("isDel", SearchFilter.Operator.EQ, BasicStateEnum.FALSE.intValue()));
        //查询2
        List<SearchFilter> filters1 =new ArrayList<>();
        if(StringUtils.isNotEmpty(keyword)){
            filters1.add(new SearchFilter("bsCode", SearchFilter.Operator.LIKE, keyword));
            filters1.add(new SearchFilter("bsName", SearchFilter.Operator.LIKE, keyword));
        }
        Specification<InterfacesInfo> spec = Specification.where(BaseService.and(filters, InterfacesInfo.class));
        Specification<InterfacesInfo> spec1 =  spec.and(BaseService.or(filters1, InterfacesInfo.class));
        //Page<InterfacesInfo> page = interfacesInfoDao.findAll(spec1, pageRequest);

       // return ApiResponseResult.success().data(DataGrid.create(page.getContent(), (int) page.getTotalElements(), pageRequest.getPageNumber() + 1, pageRequest.getPageSize()));
        List<InterfacesInfo> li = interfacesInfoDao.findAll();
        return ApiResponseResult.success().data(DataGrid.create(li, li.size(), pageRequest.getPageNumber() + 1, pageRequest.getPageSize()));
	}


}
