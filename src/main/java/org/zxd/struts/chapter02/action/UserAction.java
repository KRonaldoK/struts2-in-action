package org.zxd.struts.chapter02.action;

import com.opensymphony.xwork2.Action;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter02.action
 * @FileName:UserAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月15日下午5:02:44
 * @since Jdk1.8
 */
public class UserAction {

	public String addUser() {
		System.out.println("Execute addUser");

		return Action.SUCCESS;
	}

	public String deleteUser() {
		System.out.println("Execute deleteUser");

		return Action.SUCCESS;
	}

	public String updateUser() {
		System.out.println("Execute updateUser");

		return Action.SUCCESS;
	}
}
