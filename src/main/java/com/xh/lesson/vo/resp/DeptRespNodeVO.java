package com.xh.lesson.vo.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: DeptRespNodeVO
 * TODO:类文件简单描述
 * @Author: 小霍
 * @CreateDate: 2019/9/19 22:01
 * @UpdateUser: 小霍
 * @UpdateDate: 2019/9/19 22:01
 * @Version: 0.0.1
 */
@Data
public class DeptRespNodeVO {
    @ApiModelProperty(value = "组织id")
    private String id;

    @ApiModelProperty(value = "组织编码")
    private String deptNo;

    @ApiModelProperty(value = "组织名称")
    private String title;

    @ApiModelProperty(value = "组织父级id")
    private String pid;

    @ApiModelProperty(value = "组织状态")
    private Integer status;

    @ApiModelProperty(value = "组织关系id")
    private String relationCode;

    @ApiModelProperty(value = "是否展开 默认不展开(false)")
    private boolean spread;


    @ApiModelProperty(value = "子集")
    private List<?> children;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
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


	public String getRelationCode() {
		return relationCode;
	}


	public void setRelationCode(String relationCode) {
		this.relationCode = relationCode;
	}


	public boolean isSpread() {
		return spread;
	}


	public void setSpread(boolean spread) {
		this.spread = spread;
	}


	public List<?> getChildren() {
		return children;
	}


	public void setChildren(List<?> children) {
		this.children = children;
	}
    
    
}
