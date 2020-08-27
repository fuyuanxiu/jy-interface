package com.xh.lesson.interfaces.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.app.base.entity.BaseEntity;

/**
 * 接口信息配置表
 *
 */
@Entity(name = "interfacesInfo")
@Table(name= InterfacesInfo.TABLE_NAME)
@DynamicUpdate
public class InterfacesInfo extends BaseEntity {
	private static final long serialVersionUID = -5951531333314901264L;
	public static final String TABLE_NAME = "api_interfaces_Info";

	/**
	 * 备注
	 */
	@Column(length=255)
	protected String bsComment;
	
	/**
	 * 接口名
	 */
	@Column(length=255)
	protected String bsName;
	
	/**
	 * 接口代码
	 */
	@Column(length=255)
	protected String bsCode;
	
	/**
	 * 是否启用
	 * 1:启用；0:不启用
	 */
	@Column(length=255)
    protected Integer bsStatus=1;
	
	/**
	 * 序号
	 */
	@Column(length=255)
    protected int bsIndex;
	
	/**
	 * 接口路径
	 */
	@Column(length=255)
	protected String bsUrl;
	
	/**
	 * 请求方式
	 * POST,GET,PUT,DELETE
	 */
	@Column(length=100)
	protected String bsMethod;
	
	/**
	 * 请求参数
	 * {}
	 */
	@Column(length=255)
	protected String bsParam;

	public String getBsComment() {
		return bsComment;
	}

	public void setBsComment(String bsComment) {
		this.bsComment = bsComment;
	}

	public String getBsName() {
		return bsName;
	}

	public void setBsName(String bsName) {
		this.bsName = bsName;
	}

	public String getBsCode() {
		return bsCode;
	}

	public void setBsCode(String bsCode) {
		this.bsCode = bsCode;
	}

	
	

	public Integer getBsStatus() {
		return bsStatus;
	}

	public int getBsIndex() {
		return bsIndex;
	}

	public void setBsIndex(int bsIndex) {
		this.bsIndex = bsIndex;
	}

	public void setBsStatus(Integer bsStatus) {
		this.bsStatus = bsStatus;
	}

	public String getBsUrl() {
		return bsUrl;
	}

	public void setBsUrl(String bsUrl) {
		this.bsUrl = bsUrl;
	}

	public String getBsMethod() {
		return bsMethod;
	}

	public void setBsMethod(String bsMethod) {
		this.bsMethod = bsMethod;
	}

	public String getBsParam() {
		return bsParam;
	}

	public void setBsParam(String bsParam) {
		this.bsParam = bsParam;
	}

	

}
