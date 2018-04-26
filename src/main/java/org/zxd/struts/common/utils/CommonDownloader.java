package org.zxd.struts.common.utils;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.common.utils
 * @FileName:CommonDownloader.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月13日下午3:55:48
 * @since Jdk1.8
 */
public class CommonDownloader {
	public static final void download(File file, HttpServletResponse response) {
		/**
		 * 1：设置响应的数据类型。
		 */
		response.setContentType("multipart/form-data");
		/**
		 * 2：设置响应头：最后一个参数是设置下载文件名
		 */
		response.setHeader("Content-Disposition", "attachment;fileName=" + file.getName());
		/**
		 * 3：将文件信息写到 HttpServletResponse 的 OutputStream 中完成文件传输。
		 */
		try {
			ServletOutputStream out = response.getOutputStream();
			/**
			 * 将文件写到输出流中，实现下载。
			 */
			FileUtils.copyFile(file, out);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
