package org.zxd.struts.chapter03.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter03.interceptor
 * @FileName:ExecutionInterceptor.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月23日上午10:37:20
 * @since Jdk1.8
 */
public class ExecutionInterceptor extends AbstractInterceptor {

	/**
	 * @time：2016年10月22日下午11:45:02
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 6641571383898945382L;

	private boolean needLog = false;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("开始执行 " + this.getClass().getCanonicalName() + " 的预处理过程！");

		long start = System.currentTimeMillis();

		String result = invocation.invoke();

		System.out.println("开始执行 " + this.getClass().getCanonicalName() + " 的后处理过程！");

		long execution = System.currentTimeMillis() - start;

		if (isNeedLog()) {
			ActionProxy actionProxy = invocation.getProxy();
			/**
			 * 获取 Action 的命名空间
			 */
			String namespace = actionProxy.getNamespace();
			/**
			 * 获取 Action 的名称
			 */
			String actionName = actionProxy.getActionName();
			/**
			 * 获取执行的方法名称
			 */
			String method = actionProxy.getMethod();

			System.out.println("execute [" + namespace + "/" + actionName + "!" + method + "] toke " + execution + " ms!");
		}

		return result;
	}

	public boolean isNeedLog() {
		return this.needLog;
	}

	/**
	 * @author：ZXD @version：1.0
	 * @time：2016年10月23日上午11:13:27
	 * @desc：在容器启动时，完成拦截器中属性的初始化。 @since Jdk1.8
	 * @param needLog
	 */
	public void setNeedLog(String needLog) {
		System.out.println("指定拦截器的初始化：" + needLog);

		this.needLog = "true".equalsIgnoreCase(needLog.trim());
	}

}
