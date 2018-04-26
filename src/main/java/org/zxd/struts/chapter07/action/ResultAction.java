package org.zxd.struts.chapter07.action;

import java.util.ArrayList;
import java.util.Date;

import org.zxd.struts.chapter07.result.JsonResult;
import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.model.ObjectFactory;
import org.zxd.struts.common.model.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter07.action
 * @FileName:ResultAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月6日下午7:47:29
 * @since Jdk1.8
 */
public class ResultAction extends BaseAction {

	/**
	 * @time：2016年11月6日下午7:47:26
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -1662742926855508172L;

	public String absolute() {
		System.out.println("绝对路径客户端跳转");

		return Action.SUCCESS;
	}

	public String dispatcher() {
		System.out.println("Dispatcher");

		setViewName("dispatcher");

		return Action.SUCCESS;
	}

	public String freemarker() {
		return velocity();
	}

	public String json() {
		ArrayList<User> users = new ArrayList<User>();
		users.add(ObjectFactory.getCQ());
		users.add(ObjectFactory.getDL());
		users.add(ObjectFactory.getMY());
		users.add(ObjectFactory.getRZF());

		/**
		 * 只有通过指定的 key 将对象保存到 ActionContext 中时，才能被写出。
		 */
		ActionContext.getContext().put(JsonResult.JsonKey, users);

		return Action.SUCCESS;
	}

	public String redirectAction() {
		ActionContext context = ActionContext.getContext();
		context.put("username", "Kristy");
		context.put("age", "26");
		context.put("token", "19900905");

		System.out.println("Struts 客户端跳转");

		return Action.SUCCESS;
	}

	public String relative() {
		System.out.println("相对路径客户端跳转");

		return Action.SUCCESS;
	}

	public String velocity() {
		ActionContext context = ActionContext.getContext();
		context.put("date", new Date());

		return Action.SUCCESS;
	}

}
