package org.zxd.struts.chapter09.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter09.i18n
 * @FileName:BasicI18N.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月13日上午10:23:54
 * @since Jdk1.8
 */
public class BasicI18N {

	/**
	 * @author：ZXD @version：1.0
	 * @time：2016年11月13日上午10:34:31
	 * @desc：通用英语
	 * @since Jdk1.8
	 */
	@Test
	public void testEn() {
		ResourceBundle resource = ResourceBundle.getBundle("MessageResources", Locale.ENGLISH);
		String username = resource.getString("username");
		String password = resource.getString("password");
		String groupId = resource.getString("group.groupId");
		String groupName = resource.getString("group.groupName");
		String groupLeader = resource.getString("group.groupLeader");
		System.out.println(username + "\r\n" + password + "\r\n" + groupId + "\r\n" + groupName + "\r\n" + groupLeader);
	}

	/**
	 * @author：ZXD @version：1.0
	 * @time：2016年11月13日上午10:34:31
	 * @desc：美国英语
	 * @since Jdk1.8
	 */
	@Test
	public void testEnUS() {
		ResourceBundle resource = ResourceBundle.getBundle("MessageResources", Locale.US);
		String username = resource.getString("username");
		String password = resource.getString("password");
		String groupId = resource.getString("group.groupId");
		String groupName = resource.getString("group.groupName");
		String groupLeader = resource.getString("group.groupLeader");
		System.out.println(username + "\r\n" + password + "\r\n" + groupId + "\r\n" + groupName + "\r\n" + groupLeader);
	}

	/**
	 * @author：ZXD @version：1.0
	 * @time：2016年11月13日上午10:35:34
	 * @desc：中文
	 * @since Jdk1.8
	 */
	@Test
	public void testZhCn() {
		ResourceBundle resource = ResourceBundle.getBundle("MessageResources", Locale.CHINESE);
		String username = resource.getString("username");
		String password = resource.getString("password");
		String groupId = resource.getString("group.groupId");
		String groupName = resource.getString("group.groupName");
		String groupLeader = resource.getString("group.groupLeader");
		System.out.println(username + "\r\n" + password + "\r\n" + groupId + "\r\n" + groupName + "\r\n" + groupLeader);
	}

}
