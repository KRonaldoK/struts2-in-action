package org.zxd.struts.chapter02.action.dataTransfer;

import org.zxd.struts.common.action.BaseAction;

import com.opensymphony.xwork2.Action;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter03.action
 * @FileName:UserAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月15日下午9:42:38
 * @since Jdk1.8
 */
public class PropertyAction extends BaseAction {
	/**
	 * @time：2016年11月3日下午11:11:24
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -4141387911093477336L;

	private String username;
	private String password;
	private String token;
	private Boolean isActive;

	@Override
	public String execute() {
		print();

		setViewName("property");

		return Action.SUCCESS;
	}

	public Boolean getIsActive() {
		return this.isActive;
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

	public String register() {
		print();

		setViewName("propertyShow");

		return Action.SUCCESS;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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

	/**
	 * @author：ZXD @version：1.0
	 * @time：2016年11月4日下午8:13:03
	 * @desc：打印属性信息
	 * @since Jdk1.8
	 */
	private void print() {
		System.out.println("username：" + getUsername());
		System.out.println("password：" + getPassword());
		System.out.println("token：" + getToken());
		System.out.println("isActive：" + getIsActive());
	}

}
