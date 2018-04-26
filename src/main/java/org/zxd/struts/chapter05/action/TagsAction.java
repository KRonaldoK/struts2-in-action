package org.zxd.struts.chapter05.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.model.Group;
import org.zxd.struts.common.model.ObjectFactory;
import org.zxd.struts.common.model.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter05.action
 * @FileName:TagsAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月30日下午3:48:44
 * @since Jdk1.8
 */
@SuppressWarnings("serial")
public class TagsAction extends BaseAction {
	/**
	 * @time：2016年10月30日下午4:30:45
	 * @desc：user 用户对象
	 */
	private User user;

	public String beanParamTag() {
		propertyTag();

		return setView("tags04_bean_param");
	}

	@Override
	public Locale getLocale() {
		return Locale.ENGLISH;
	}

	public User getUser() {
		return this.user;
	}

	public String i18nTextTag() {
		return setView("tags09_i18n_text");
	}

	public String ifTag() {
		ActionContext context = ActionContext.getContext();
		context.put("age", 27);

		return setView("tags05_if");
	}

	public String includeTag() {
		return setView("tags07_include");
	}

	public String iteratorTag() {
		ActionContext context = ActionContext.getContext();

		ArrayList<Group> groups = new ArrayList<Group>();
		groups.add(new Group("001", "蘑菇街", "陈琪"));
		groups.add(new Group("002", "阿里巴巴", "马云"));
		groups.add(new Group("003", "网易", "丁磊"));
		groups.add(new Group("004", "华为", "任正非"));

		context.put("groups", groups);

		Map<String, String> nameMap = new HashMap<String, String>();
		nameMap.put("001", "唐僧");
		nameMap.put("002", "悟空");
		nameMap.put("003", "八戒");
		nameMap.put("004", "沙僧");

		context.put("nameMap", nameMap);

		return setView("tags06_iterator");
	}

	public String propertyTag() {
		setUser(ObjectFactory.getMY());

		ActionContext context = ActionContext.getContext();
		context.put("user", getUser());

		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("user", getUser());

		return setView("tags01_property");
	}

	public String pushTag() {
		propertyTag();

		return setView("tags03_push");
	}

	public String setTag() {
		propertyTag();

		return setView("tags02_set");
	}

	@SuppressWarnings("hiding")
	public void setUser(User user) {
		this.user = user;
	}

	public String urlTag() {
		return setView("tags08_url");
	}

	private String setView(String viewName) {
		setViewName(viewName);

		return Action.SUCCESS;
	}

}
