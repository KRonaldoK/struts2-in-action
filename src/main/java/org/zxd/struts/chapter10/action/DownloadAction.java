package org.zxd.struts.chapter10.action;

import java.io.File;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.utils.CommonDownloader;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter10.action
 * @FileName:DownloadAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月13日下午3:54:51
 * @since Jdk1.8
 */
public class DownloadAction extends BaseAction {
	/**
	 * @time：2016年11月13日下午3:49:39
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 8252313444392153959L;
	/**
	 * 实际项目中不能让用户输入文件名，有风险。
	 */
	private String fileName;

	public void download() throws Exception {
		ServletContext context = ServletActionContext.getServletContext();
		String rootPath = context.getRealPath("/downloads");
		String finalName = rootPath + File.separator + getFileName();
		File file = new File(finalName);

		if (file.exists()) {
			CommonDownloader.download(file, ServletActionContext.getResponse());
		} else {
			throw new Exception("要下载的文件不存在！");
		}

	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
