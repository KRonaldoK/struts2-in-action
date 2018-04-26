package org.zxd.struts.chapter07.exceptions;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter07.exceptions
 * @FileName:StrutsException.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月11日下午7:49:53
 * @since Jdk1.8
 */
public class UnAuthorizedException extends RuntimeException {

	/**
	 * @time：2016年11月11日下午7:49:51
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -165637561260637473L;

	public UnAuthorizedException(String message) {
		super(message);
	}

	public UnAuthorizedException(String message, Throwable cause) {
		super(message, cause);
	}
}
