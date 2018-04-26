package org.zxd.struts.chapter02.action.dataTransfer;

import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.model.User;

import com.opensymphony.xwork2.Action;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter03.action
 * @FileName:CustomerAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月15日下午9:42:46
 * @since Jdk1.8
 */
public class JavaBeanAction extends BaseAction {
	/**
	 * @time：2016年11月3日下午11:04:46
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 7782142140214234380L;

	private User user;

	@Override
	public String execute() throws Exception {
		System.out.println(getUser());

		setViewName("javaBean");

		return super.execute();
	}

	public User getUser() {
		return this.user;
	}

	public String register() {
		System.out.println(getUser());

		setViewName("javaBeanShow");

		return Action.SUCCESS;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
