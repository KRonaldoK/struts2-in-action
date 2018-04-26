package org.zxd.struts.chapter06.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.model.DefaultOption;
import org.zxd.struts.common.model.Group;
import org.zxd.struts.common.model.ObjectFactory;
import org.zxd.struts.common.model.PropertyHolder;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter06.action
 * @FileName:FormTagAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月6日上午11:49:04
 * @since Jdk1.8
 */
public class FormTagsAction extends BaseAction {

	/**
	 * @time：2016年11月6日上午11:49:57
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -6763010935029572363L;

	private PropertyHolder ph = new PropertyHolder();

	public String checkboxlistTag() {
		initData();

		return setView("tags18_checkboxlist");
	}

	public String checkboxTag() {
		return setView("tags14_checkbox");
	}

	public String dateTag() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		getPh().setBirth(sdf.parse("1990-09-05"));

		getPh().setMarried(sdf.parse("2018-10-01"));

		return setView("tags20_date");
	}

	public String formTag() {
		return setView("tags10_form");
	}

	public PropertyHolder getPh() {
		return this.ph;
	}

	public String hiddenTag() {
		return setView("tags15_hidden");
	}

	public String labelTag() {
		getPh().setUsername("马云");

		return setView("tags19_label");
	}

	public String passwordTag() {
		return setView("tags12_password");
	}

	public String radioTag() {
		initData();

		return setView("tags17_radio");
	}

	public String selectTag() {
		initData();

		return setView("tags16_select");
	}

	public void setPh(PropertyHolder ph) {
		this.ph = ph;
	}

	public String textareaTag() {
		return setView("tags13_textarea");
	}

	public String textfieldTag() {
		return setView("tags11_textfield");
	}

	private void initData() {
		ArrayList<Group> groups = new ArrayList<Group>();
		groups.add(ObjectFactory.getCQ().getGroup());
		groups.add(ObjectFactory.getDL().getGroup());
		groups.add(ObjectFactory.getMY().getGroup());
		groups.add(ObjectFactory.getRZF().getGroup());

		ActionContext context = ActionContext.getContext();
		context.put("groups", groups);

		Set<DefaultOption> hoppies = new HashSet<DefaultOption>();
		hoppies.add(new DefaultOption("eat", "吃饭"));
		hoppies.add(new DefaultOption("sleep", "睡觉"));
		hoppies.add(new DefaultOption("play", "打豆豆"));

		context.put("hoppies", hoppies);

		DefaultOption[] tonics = new DefaultOption[5];
		tonics[0] = new DefaultOption("RCR", "荒漠肉苁蓉");
		tonics[1] = new DefaultOption("DCXC", "冬虫夏草");
		tonics[2] = new DefaultOption("TPSH", "铁皮石斛");
		tonics[3] = new DefaultOption("HSW", "何首乌");
		tonics[4] = new DefaultOption("YSS", "野山参");

		context.put("tonics", tonics);

		Map<String, String> hometownMap = new HashMap<String, String>();
		hometownMap.put("HangZhou", "杭州");
		hometownMap.put("NingBo", "宁波");
		hometownMap.put("WenZhou", "温州");

		context.put("hometownMap", hometownMap);
	}

	private void print() {
		System.out.println(getPh());
	}

	private String setView(String viewName) {
		print();

		setViewName(viewName);

		return Action.SUCCESS;
	}
}
