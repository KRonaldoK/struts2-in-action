package org.zxd.struts.chapter08.action;

import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.model.ValidateHolder;

import com.opensymphony.xwork2.Action;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter08.action
 * @FileName:VisitorValidationAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月11日下午11:16:02
 * @since Jdk1.8
 */
public class VisitorValidationAction extends BaseAction {
	/**
	 * @time：2016年11月11日下午11:15:59
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 1502761205060649168L;
	private ValidateHolder vh;

	public String add() {
		System.out.println(getVh());

		setViewName("visitorXmlValidate");

		return Action.SUCCESS;
	}

	public ValidateHolder getVh() {
		return this.vh;
	}

	@Override
	public String input() throws Exception {

		setViewName("visitorXmlValidate");

		return Action.SUCCESS;
	}

	public void setVh(ValidateHolder vh) {
		this.vh = vh;
	}

}
