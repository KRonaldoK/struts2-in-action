package org.zxd.struts.chapter03.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.zxd.struts.chapter03.interceptor.AuthenticateInterceptor;
import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.model.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter03.action
 * @FileName:InterceptorAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月23日上午10:41:03
 * @since Jdk1.8
 */
public class InterceptorAction extends BaseAction implements ModelDriven<User> {
	/**
	 * @time：2016年11月3日下午11:21:32
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 1279456941615225811L;

	private final User user = new User();

	@Override
	public User getModel() {
		return getUser();
	}

	public User getUser() {
		return this.user;
	}

	public String login() {
		HttpSession session = ServletActionContext.getRequest().getSession();

		String username = getUser().getUsername();

		if (null != username) {
			session.setAttribute(AuthenticateInterceptor.Login_User, username);
		}

		return show();
	}

	public String show() {
		System.out.println("开始执行 show 动作：" + getUser());

		setViewName("interceptorShow");

		return Action.SUCCESS;
	}
}
