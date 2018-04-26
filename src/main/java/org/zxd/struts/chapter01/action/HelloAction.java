package org.zxd.struts.chapter01.action;

import com.opensymphony.xwork2.Action;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter01.action
 * @FileName:HelloAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月15日下午5:02:55
 * @since Jdk1.8
 */
public class HelloAction {

	/**
	 * @author：ZXD @version：1.0
	 * @time：2016年10月15日下午5:03:06
	 * @desc：TODO
	 * @since Jdk1.8
	 * @return
	 */
	public String execute() {
		System.out.println("Hello Struts2");

		return Action.SUCCESS;
	}
}
