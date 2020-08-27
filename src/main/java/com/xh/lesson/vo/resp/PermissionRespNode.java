package com.xh.lesson.vo.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: PermissionRespNode
 * TODO:类文件简单描述
 * @Author: 小霍
 * @CreateDate: 2019/9/23 10:36
 * @UpdateUser: 小霍
 * @UpdateDate: 2019/9/23 10:36
 * @Version: 0.0.1
 */
@Data
public class PermissionRespNode {
    @ApiModelProperty(value = "id")
    private String id;
    @ApiModelProperty(value = "菜单权限名称")
    private String title;

    @ApiModelProperty(value = "菜单权限标识，shiro 适配restful")
    private String perms;

    @ApiModelProperty(value = "接口地址")
    private String url;

    @ApiModelProperty(value = "请求方式 和url 配合使用 (我们用 路径匹配的方式做权限管理的时候用到)")
    private String method;

    @ApiModelProperty(value = "父级id")
    private String pid;

    @ApiModelProperty(value = "父级名称")
    private String pidName;

    @ApiModelProperty(value = "菜单权限类型(1:目录;2:菜单;3:按钮)")
    private Integer type;

    @ApiModelProperty(value = "编码(前后端分离 前段对按钮显示隐藏控制 btn-permission-search 代表 菜单权限管理的列表查询按钮)")
    private String code;

    @ApiModelProperty(value = "排序码")
    private Integer orderNum;

    @ApiModelProperty(value = "是否展开 默认不展开(false)")
    private boolean spread=true;

    @ApiModelProperty(value = "是否选中 默认false")
    private boolean checked;
    private List<?> children;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPerms() {
		return perms;
	}
	public void setPerms(String perms) {
		this.perms = perms;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPidName() {
		return pidName;
	}
	public void setPidName(String pidName) {
		this.pidName = pidName;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public boolean isSpread() {
		return spread;
	}
	public void setSpread(boolean spread) {
		this.spread = spread;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public List<?> getChildren() {
		return children;
	}
	public void setChildren(List<?> children) {
		this.children = children;
	}

    
}
