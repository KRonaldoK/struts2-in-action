package org.zxd.struts.chapter10.action;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.utils.PreValidator;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter10.action
 * @FileName:BatchUploadAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月13日下午3:24:03
 * @since Jdk1.8
 */
public class BatchUploadAction extends BaseAction {

	/**
	 * @time：2016年11月13日下午2:57:36
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -7070435953872145047L;

	/**
	 * 定义上传的文件对象，并提供 getter 和 setter。
	 */
	private File[] upload;
	/**
	 * 上传文件名必须是 xxxFileName，并提供 getter 和 setter.
	 */
	private String[] uploadFileName;
	/**
	 * 上传文件的类型名必须是 xxxContentType，并提供 getter 和 setter.
	 */
	private String[] uploadContentType;

	public File[] getUpload() {
		return this.upload;
	}

	public String[] getUploadContentType() {
		return this.uploadContentType;
	}

	public String[] getUploadFileName() {
		return this.uploadFileName;
	}

	public void setUpload(File[] upload) {
		this.upload = upload;
	}

	public void setUploadContentType(String[] uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public void setUploadFileName(String[] uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String toUpload() {
		setViewName("batchUpload");

		return Action.SUCCESS;
	}

	public String upload() {
		ServletContext ctx = ServletActionContext.getServletContext();
		/**
		 * 通过 ServletContext.getRealPath 方法获取项目部署后 webapp/uploads 文件夹的实际路径。
		 */
		String path = ctx.getRealPath("/uploads");
		System.out.println(path);

		if (!PreValidator.isNull(getUpload())) {
			try {
				File[] files = getUpload();

				if ((null != files) && (files.length > 0)) {
					String[] fileNames = getUploadFileName();
					for (int index = 0; index < files.length; index++) {
						FileUtils.copyFile(files[index], new File(path + File.separator + fileNames[index]));
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (!PreValidator.isNull(getUploadFileName())) {
			ActionContext.getContext().put("message", "file upload successfully：" + Arrays.toString(getUploadFileName()));
		}

		setViewName("batchUpload");

		return Action.SUCCESS;
	}

}
