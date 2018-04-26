package org.zxd.struts.chapter02.action;

import com.opensymphony.xwork2.Action;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter02.action
 * @FileName:ResourceAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月15日下午5:51:41
 * @since Jdk1.8
 */
public class ResourceAction {

	public String addResource() {
		System.out.println("Execute addResource");

		return Action.SUCCESS;
	}

	public String deleteResource() {
		System.out.println("Execute deleteResource");

		return Action.SUCCESS;
	}

	public String updateResource() {
		System.out.println("Execute updateResource");

		return Action.SUCCESS;
	}
}
