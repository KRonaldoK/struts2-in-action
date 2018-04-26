package org.zxd.struts.chapter04.ognl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.zxd.struts.common.model.Menu;
import org.zxd.struts.common.model.ObjectFactory;
import org.zxd.struts.common.model.User;

import ognl.Ognl;
import ognl.OgnlException;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter04.ognl
 * @FileName:OgnlDetial.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月23日下午3:09:22
 * @since Jdk1.8
 */
public class OgnlDetial {

	/**
	 * @author：ZXD @version：1.0
	 * @time：2016年10月23日下午2:46:44
	 * @desc：基于复合对象的导航
	 * @since Jdk1.8
	 */
	@SuppressWarnings("boxing")
	@Test
	public void testComplexObject() {
		Menu menu01 = new Menu("M01", null, "/userManager", "用户管理");
		Menu menu02 = new Menu("M02", null, "/roleManager", "角色管理");
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(menu01);
		menus.add(menu02);

		User rzf = ObjectFactory.getRZF();
		rzf.setMenus(menus);

		try {
			/**
			 * 当需要获取根的多级属性时，通过 . 来访问。
			 */
			Object username = Ognl.getValue("group.groupName", rzf);
			/**
			 * Ognl 不但可以访问对象属性，还可以直接调用对象的方法 List.get(index)。
			 */
			Object displayName = Ognl.getValue("menus.get(0).displayName", rzf);
			System.out.println(username + "，" + displayName);
		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author：ZXD @version：1.0
	 * @time：2016年10月23日下午3:03:25
	 * @desc：基于 List 的导航
	 * @since Jdk1.8
	 */
	@Test
	public void testList() {
		Menu menu01 = new Menu("M01", null, "/userManager", "用户管理");
		Menu menu02 = new Menu("M02", null, "/roleManager", "角色管理");
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(menu01);
		menus.add(menu02);

		/**
		 * menus 的导航树 menus menu01 menuId（M01） parentId（null） url（/userManager）
		 * displayName（用户管理） menu02 menuId（M02） parentId（null） url（/roleManager）
		 * displayName（角色管理）
		 */
		try {
			/**
			 * 获取 List 中第一个对象的 displayName 属性
			 */
			Object value = Ognl.getValue("get(0).displayName", menus);
			System.out.println(value);

			/**
			 * Ognl 不仅可以访问属性，还可以调用对象的方法。
			 */
			Object size = Ognl.getValue("size()", menus);
			Object isEmpty = Ognl.getValue("isEmpty()", menus);
			System.out.println(size + "，" + isEmpty);

		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author：ZXD @version：1.0
	 * @time：2016年10月23日下午3:09:49
	 * @desc：基于 Map 的导航
	 * @since Jdk1.8
	 * @return
	 */
	@Test
	public void testMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key1", "value1");
		map.put("key2", ObjectFactory.getDL());

		Menu menu01 = new Menu("M01", null, "/userManager", "用户管理");
		Menu menu02 = new Menu("M02", null, "/roleManager", "角色管理");
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(menu01);
		menus.add(menu02);

		map.put("key3", menus);

		try {
			Object key1 = Ognl.getValue("key1", map);

			Object username = Ognl.getValue("key2.username", map);

			Object displayName = Ognl.getValue("key3.get(1).displayName", map);

			System.out.println(key1 + "，" + username + "，" + displayName);
		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author：ZXD @version：1.0
	 * @time：2016年10月23日下午2:39:54
	 * @desc：实现基于简单对象的导航。 @since Jdk1.8
	 */
	@Test
	public void testObject() {
		Menu menu = new Menu("M01", null, "/userManager", "用户管理");

		try {
			/**
			 * Ognl 对象图导航语言，必须有一个开始的根。 menu 的导航树结构： menu menuId（M01）
			 * parentId（null） url（/userManager） displayName（用户管理）
			 */

			/**
			 * 获取根的第一级属性，直接通过属性名获取，属性名必须有 getter 和 setter。 Ognl.getValue
			 * 方法的第一个参数是 ognl 表达式， 第二个参数是 root 对象。
			 */
			Object menuId = Ognl.getValue("menuId", menu);
			Object displayName = Ognl.getValue("displayName", menu);
			System.out.println(menuId + "，" + displayName);
		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author：ZXD @version：1.0
	 * @time：2016年10月23日下午3:18:15
	 * @desc：模拟 Struts 的数据存储结构（ActionContext，ValueStack）
	 * @since Jdk1.8
	 */
	@Test
	public void testStrtutsOgnl() {
		Map<String, Object> actionContext = new HashMap<String, Object>();

		Map<String, Object> request = new HashMap<String, Object>();
		request.put("username", "kristy");
		request.put("password", "123");

		actionContext.put("request", request);

		Map<String, Object> session = new HashMap<String, Object>();
		session.put("mayun", ObjectFactory.getMY());

		actionContext.put("session", session);

		Map<String, Object> application = new HashMap<String, Object>();

		Menu menu01 = new Menu("M01", null, "/userManager", "用户管理");
		Menu menu02 = new Menu("M02", null, "/roleManager", "角色管理");
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(menu01);
		menus.add(menu02);
		application.put("menus", menus);

		actionContext.put("application", application);

		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("username", "孙悟空");
		parameters.put("password", "456");
		parameters.put("isRemeberMe", "true");

		actionContext.put("parameters", parameters);

		ArrayList<Object> compoundRoot = new ArrayList<Object>();
		compoundRoot.add(new Menu("M01", null, "/userManager", "用户管理"));
		compoundRoot.add(ObjectFactory.getCQ());

		// actionContext.put("root", compoundRoot);

		try {
			/**
			 * Ognl 有一个重载的 getValue 方法， 第一个参数是 ognl 表达式，第二个参数是 Context，第三个参数是
			 * root Ognl 会根据第一个表达式的不同，选择性地去 Context 或 root 中获取数据。 如果表达式以 # 开头，则
			 * Ognl 会去 Context 中获取数据， # 后紧跟的是 Map 中的 key，OGNL 会先根据 key 获取
			 * value，再完成导航。 如果表达式不以 # 开头，则 Ognl 会去 root 中获取数据，
			 */

			/**
			 * 获取 request 中的 username 属性值
			 */
			Object username = Ognl.getValue("#request.username", actionContext, compoundRoot);
			System.out.println(username);

			/**
			 * 获取 session 中的 loginIpAddr
			 */

			Object groupName = Ognl.getValue("#session.mayun.group.groupName", actionContext, compoundRoot);
			System.out.println(groupName);

			/**
			 * 获取 application 中第二个 menu 的 displayName
			 */
			Object displayName = Ognl.getValue("#application.menus.get(0).displayName", actionContext, compoundRoot);
			System.out.println(displayName);

			/**
			 * 获取 parameters 中的 isRememberMe 属性值
			 */
			Object isRemeberMe = Ognl.getValue("#parameters.isRemeberMe", actionContext, compoundRoot);
			System.out.println(isRemeberMe);

			/**
			 * 获取 root 中 menu 对象的 displayName 属性
			 */
			displayName = Ognl.getValue("get(0).displayName", actionContext, compoundRoot);
			System.out.println(displayName);

			/**
			 * 获取 root 中 token 的 username 属性，如果是 #root 则表示是根对象（不会去 actionContext
			 * 中找）， [1] 表示跟对象的第二个元素。
			 */
			username = Ognl.getValue("#root[1].username", actionContext, compoundRoot);
			System.out.println(username);

		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}
}
