package com.xh.lesson.interfaces.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.xh.lesson.interfaces.entity.InterfacesInfo;


public interface InterfacesInfoDao extends  CrudRepository<InterfacesInfo, Long>, JpaSpecificationExecutor<InterfacesInfo>  {
	
	List<InterfacesInfo> findAll();
}
