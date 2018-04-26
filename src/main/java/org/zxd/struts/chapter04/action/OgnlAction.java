package org.zxd.struts.chapter04.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.model.ObjectFactory;
import org.zxd.struts.common.model.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter04.action
 * @FileName:OgnlAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月23日下午6:10:53
 * @since Jdk1.8
 */
public class OgnlAction extends BaseAction {
	/**
	 * @time：2016年10月23日下午4:52:24
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -8497018965395356965L;

	private User user;
	private String username;
	private String password;

	public OgnlAction() {
	}

	public String fromActionContext() {
		ActionContext actionContext = ActionContext.getContext();
		actionContext.put("username", "actionContext用户名");
		actionContext.put("password", "actionContext密码");

		Map<String, Object> session = actionContext.getSession();
		session.put("username", "session用户名");
		session.put("password", "session密码");

		Map<String, Object> application = actionContext.getApplication();
		application.put("username", "application用户名");
		application.put("password", "application密码");

		setViewName("fromActionContext");

		return Action.SUCCESS;
	}

	public String fromActionProperty() {
		setUsername("kristy");
		setPassword("123");
		setUser(ObjectFactory.getMY());

		setViewName("fromActionProperty");

		return Action.SUCCESS;
	}

	public String fromServletAPI() {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("username", "HttpServletRequest用户名");
		request.setAttribute("password", "HttpServletRequest密码");

		HttpSession session = request.getSession();
		session.setAttribute("username", "HttpSession用户名");
		session.setAttribute("password", "HttpSession密码");

		ServletContext application = ServletActionContext.getServletContext();
		application.setAttribute("username", "ServletContext用户名");
		application.setAttribute("password", "ServletContext密码");

		setViewName("fromServletAPI");

		return Action.SUCCESS;
	}

	public String fromValueStack() {
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		valueStack.push(ObjectFactory.getMY());
		valueStack.push(ObjectFactory.getCQ());

		setUsername("Property用户名");

		setViewName("fromValueStack");

		return Action.SUCCESS;
	}

	public String getPassword() {
		return this.password;
	}

	public User getUser() {
		return this.user;
	}

	public String getUsername() {
		return this.username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
