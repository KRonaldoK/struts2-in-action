package org.zxd.struts.chapter07.action;

import org.zxd.struts.chapter07.exceptions.InternalException;
import org.zxd.struts.chapter07.exceptions.UnAuthorizedException;
import org.zxd.struts.common.action.BaseAction;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter07.action
 * @FileName:ExceptionAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月11日下午7:50:42
 * @since Jdk1.8
 */
public class ExceptionAction extends BaseAction {

	/**
	 * @time：2016年11月11日下午7:50:38
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -9041178639134417003L;

	public String internalError() {
		throw new InternalException("服务器异常！");
	}

	public String unAuthorizedError() {
		throw new UnAuthorizedException("授权失败！");
	}

	public String unhandledError() throws Exception {
		throw new Exception("统一异常处理！");
	}
}
