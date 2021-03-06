package com.xh.lesson.vo.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
@Data
public class HomeRespVO {
    @ApiModelProperty(value = "用户信息")
    private UserInfoRespVO userInfo;
    @ApiModelProperty(value = "目录菜单")
    private List<PermissionRespNode> menus;
	public UserInfoRespVO getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfoRespVO userInfo) {
		this.userInfo = userInfo;
	}
	public List<PermissionRespNode> getMenus() {
		return menus;
	}
	public void setMenus(List<PermissionRespNode> menus) {
		this.menus = menus;
	}

}