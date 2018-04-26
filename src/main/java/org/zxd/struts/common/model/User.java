package org.zxd.struts.common.model;

import java.io.Serializable;
import java.util.List;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.common.model
 * @FileName:User.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月11日上午12:13:54
 * @since Jdk1.8
 */
public class User implements Serializable {
	/**
	 * @time：2016年11月4日下午7:53:57
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -91601778917127774L;
	/**
	 * @time：2016年11月4日下午7:54:12
	 * @desc：username 用户名
	 */
	private String username;

	/**
	 * @time：2016年11月4日下午7:54:22
	 * @desc：password 密码
	 */
	private String password;

	/**
	 * @time：2016年11月4日下午7:54:29
	 * @desc：token 授权凭证
	 */
	private String token;
	/**
	 * @time：2016年11月4日下午7:54:47
	 * @desc：isActive 用户是否激活
	 */
	private Boolean isActive;
	/**
	 * @time：2016年11月4日下午7:54:55
	 * @desc：group 用户所属集团
	 */
	private Group group;

	/**
	 * @time：2016年11月4日下午8:38:15
	 * @desc：menus 用户可访问的菜单列表
	 */
	private List<Menu> menus;

	public User() {
	}

	public User(String username, String password, String token, boolean isActive, Group group) {
		super();
		this.username = username;
		this.password = password;
		this.token = token;
		this.isActive = isActive;
		this.group = group;
	}

	public Group getGroup() {
		return this.group;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public List<Menu> getMenus() {
		return this.menus;
	}

	public String getPassword() {
		return this.password;
	}

	public String getToken() {
		return this.token;
	}

	public String getUsername() {
		return this.username;
	}

	public Boolean isActive() {
		return this.isActive;
	}

	public void setActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [username=" + this.username + ", password=" + this.password + ", token=" + this.token
				+ ", isActive=" + this.isActive + ", group=" + this.group + "]";
	}
}
