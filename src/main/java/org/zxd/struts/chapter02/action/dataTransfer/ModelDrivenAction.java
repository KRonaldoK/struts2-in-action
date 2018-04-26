package org.zxd.struts.chapter02.action.dataTransfer;

import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.model.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter03.action
 * @FileName:ModelDrivenAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月16日上午10:17:16
 * @since Jdk1.8
 */
public class ModelDrivenAction extends BaseAction implements ModelDriven<User> {
	/**
	 * @time：2016年11月3日下午11:19:35
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 8030355878098273214L;

	private final User user = new User();

	@Override
	public String execute() throws Exception {
		setViewName("modelDriven");

		return super.execute();
	}

	@Override
	public User getModel() {
		return getUser();
	}

	public User getUser() {
		return this.user;
	}

	public String register() {
		System.out.println(getModel());

		setViewName("modelDrivenShow");

		return Action.SUCCESS;
	}
}
