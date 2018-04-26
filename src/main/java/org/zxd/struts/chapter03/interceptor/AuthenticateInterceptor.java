package org.zxd.struts.chapter03.interceptor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter03.interceptor
 * @FileName:AuthenticationInterceptor.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月22日下午11:21:40
 * @since Jdk1.8
 */
public class AuthenticateInterceptor extends AbstractInterceptor {
	/**
	 * @time：2016年10月22日下午11:44:30
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 8548470661410700358L;

	public static final String Login_User = "loginUser";
	public static final String Login = "login";
	public static final Set<String> Exclude_Methods = new HashSet<String>();

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("开始执行 " + this.getClass().getCanonicalName() + " 的预处理过程！");

		/**
		 * 如果是登录页面，则不进行拦截。
		 */
		ActionProxy actionProxy = invocation.getProxy();
		String method = actionProxy.getMethod();
		if (Exclude_Methods.contains(method)) {
			return invocation.invoke();
		}

		/**
		 * 从 session 中获取登录的用户信息，如果登录用户不存在，则进入登录页面。
		 */
		HttpSession session = ServletActionContext.getRequest().getSession();
		Object loginUser = session.getAttribute(Login_User);
		if (null == loginUser) {
			System.out.println("当前用户未登录，直接定向到登录页面！");
			return Login;
		}

		String result = invocation.invoke();

		System.out.println("开始执行 " + this.getClass().getCanonicalName() + " 的后处理过程！");

		return result;
	}

	/**
	 * @author：ZXD @version：1.0
	 * @time：2016年10月23日上午11:35:08
	 * @desc：通过 excludeMethods 参数设置需要排除拦截的方法列表，实现高度的灵活性。
	 * @since Jdk1.8
	 * @param excludeMethods
	 */
	public void setExcludeMethods(String excludeMethods) {
		System.out.println("传入参数：" + excludeMethods);

		String[] excludes = excludeMethods.split("\\s*,\\s*");

		for (String exclude : excludes) {
			Exclude_Methods.add(exclude);
		}

		System.out.println("解析后的结果：" + Arrays.toString(Exclude_Methods.toArray()));
	}

}
