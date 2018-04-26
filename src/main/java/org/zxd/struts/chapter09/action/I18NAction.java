package org.zxd.struts.chapter09.action;

import java.util.LinkedHashMap;

import org.apache.struts2.ServletActionContext;
import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.enums.ErrorCode;
import org.zxd.struts.common.model.Customer;
import org.zxd.struts.common.utils.ResourceUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter09.action
 * @FileName:I18NAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月13日上午10:22:24
 * @since Jdk1.8
 */
public class I18NAction extends BaseAction {

	/**
	 * @time：2016年11月13日上午10:22:29
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -816098823926927901L;
	private Customer customer;

	public String addCustomer() {
		System.out.println(getCustomer());

		setViewName("addCustomer");

		return Action.SUCCESS;
	}

	public String changeLocale() {
		String locale = ServletActionContext.getRequest().getParameter("request_locale");
		System.out.println("当前的地域选择：" + locale);

		LinkedHashMap<String, String> localeMap = new LinkedHashMap<String, String>();
		localeMap.put("en_US", "英语");
		localeMap.put("zh_CN", "中文");

		ActionContext.getContext().put("localeMap", localeMap);

		setViewName("changeLocale");

		return Action.SUCCESS;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public String parameteredMessage() {
		changeLocale();

		ActionContext context = ActionContext.getContext();
		context.put("parametered", "Ognl 消息");
		context.put("local1", "本地化消息1");
		context.put("local2", "本地化消息2");

		setViewName("parameteredMessage");

		return Action.SUCCESS;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String showResources() {
		changeLocale();

		System.out.println("获取正常消息：" + ResourceUtils.getInstance().getMessage("visitorMessages"));
		System.out.println("获取错误消息：" + ErrorCode.Name_Is_Invalid.getI18NMessage());

		setViewName("changeLocale");

		return Action.SUCCESS;
	}

	public String visitorMessages() {
		setViewName("visitorMessages");

		return Action.SUCCESS;
	}
}
