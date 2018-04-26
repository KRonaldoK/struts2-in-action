package org.zxd.struts.chapter08.action;

import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.model.ValidateHolder;

import com.opensymphony.xwork2.Action;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter08.action
 * @FileName:XmlValidationAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月11日下午9:42:01
 * @since Jdk1.8
 */
public class XmlValidationAction extends BaseAction {
	/**
	 * @time：2016年11月11日下午10:32:50
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 6825049793829443817L;

	private ValidateHolder vh;

	public String add() {
		System.out.println(getVh());

		setViewName("xmlValidate");

		return Action.SUCCESS;
	}

	public ValidateHolder getVh() {
		return this.vh;
	}

	@Override
	public String input() throws Exception {

		setViewName("xmlValidate");

		return Action.SUCCESS;
	}

	public void setVh(ValidateHolder vh) {
		this.vh = vh;
	}
}
