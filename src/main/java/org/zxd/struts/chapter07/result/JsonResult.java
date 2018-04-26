package org.zxd.struts.chapter07.result;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter07.result
 * @FileName:JsonResult.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月6日下午9:59:02
 * @since Jdk1.8
 */
public class JsonResult implements Result {

	/**
	 * @time：2016年11月6日下午9:58:59
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 2106766325905485395L;

	public static final String JsonKey = "JsonObject";
	private static final ObjectMapper Mapper = new ObjectMapper();
	private static final String DefaultContentType = "text/plain";
	private static final String DefaultEncoding = "UTF-8";

	@Override
	public void execute(ActionInvocation invocation) throws Exception {
		ActionContext context = ActionContext.getContext();
		Object target = context.get(JsonKey);
		String result = Mapper.writeValueAsString(target);

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType(DefaultContentType);
		response.setCharacterEncoding(DefaultEncoding);

		PrintWriter writer = response.getWriter();
		writer.print(result);
		writer.close();
	}
}
