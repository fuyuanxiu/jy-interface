package com.xh.lesson.vo.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: LoginRespVO
 * TODO:类文件简单描述
 * @Author: 小霍
 * @CreateDate: 2019/9/7 23:05
 * @UpdateUser: 小霍
 * @UpdateDate: 2019/9/7 23:05
 * @Version: 0.0.1
 */
@Data
public class LoginRespVO {
    @ApiModelProperty(value = "token")
    private String accessToken;
    @ApiModelProperty(value = "刷新token")
    private String refreshToken;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "用户id")
    private String id;
    @ApiModelProperty(value = "电话")
    private String phone;
    @ApiModelProperty(value = "用户所拥有的菜单权限(前后端分离返回给前端控制菜单和按钮的显示和隐藏)")
    private List<PermissionRespNode> list;
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<PermissionRespNode> getList() {
		return list;
	}
	public void setList(List<PermissionRespNode> list) {
		this.list = list;
	}
    
    
}
