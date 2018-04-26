package org.zxd.struts.chapter10.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter10.action
 * @FileName:StrutsDownloadAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月13日下午4:11:17
 * @since Jdk1.8
 */
public class StrutsDownloadAction {

	private String inputPath;

	public String execute() throws Exception {
		return Action.SUCCESS;
	}

	public InputStream getInputStream() throws Exception {
		return ServletActionContext.getServletContext().getResourceAsStream(this.inputPath);
	}

	public void setInputPath(String value) {
		this.inputPath = sanitizeInputPath(value);
	}

	String sanitizeInputPath(String value) {
		if ((value != null) && value.toUpperCase().contains("WEB-INF")) {
			return null;
		}
		return value;
	}
}
