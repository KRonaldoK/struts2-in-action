package org.zxd.struts.chapter02.action.dataTransfer;

import org.zxd.struts.common.action.BaseAction;

import com.opensymphony.xwork2.Action;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter03.action
 * @FileName:InjectAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月15日下午9:15:15
 * @since Jdk1.8
 */
public class ParamInjectAction extends BaseAction {
	/**
	 * @time：2016年11月3日下午11:07:55
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 5642153389593896780L;

	private String username;
	private String password;
	private String token;
	private Boolean isActive;

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

	public String inject() {
		print();

		setViewName("paramInject");

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

	private void print() {
		System.out.println("username：" + getUsername());
		System.out.println("password：" + getPassword());
		System.out.println("token：" + getToken());
		System.out.println("isActive：" + getIsActive());
	}

}
