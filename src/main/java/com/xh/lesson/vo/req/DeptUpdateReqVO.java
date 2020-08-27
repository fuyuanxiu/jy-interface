package com.xh.lesson.vo.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName: DeptUpdateReqVO
 * 更新 组织
 * @Author: 小霍
 * @CreateDate: 2019/9/19 14:04
 * @UpdateUser: 小霍
 * @UpdateDate: 2019/9/19 14:04
 * @Version: 0.0.1
 */
@Data
public class DeptUpdateReqVO {
    @ApiModelProperty(value = "机构id")
    @NotBlank(message = "机构id不能为空")
    private String id;
    @ApiModelProperty(value = "机构名称")
    private String name;
    @ApiModelProperty(value = "父级id")
    private String pid;
    @ApiModelProperty(value = "机构状态(1:正常；0:弃用)")
    private Integer status;

    @ApiModelProperty(value = "部门经理id")
    private String deptManagerId;

    @ApiModelProperty(value = "部门经理名称")
    private String managerName;

    @ApiModelProperty(value = "部门经理电话")
    private String phone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDeptManagerId() {
		return deptManagerId;
	}

	public void setDeptManagerId(String deptManagerId) {
		this.deptManagerId = deptManagerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    
}
