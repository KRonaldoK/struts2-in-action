package org.zxd.struts.common.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter03.action
 * @FileName:BaseAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月15日下午10:02:10
 * @since Jdk1.8
 */
public class BaseAction extends ActionSupport {
	/**
	 * @time：2016年11月11日下午10:11:21
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 918960457423624262L;
	private String viewName;

	public String getViewName() {
		return this.viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
}
