package org.zxd.struts.common.model;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.common.model
 * @FileName:ObjectFactory.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月11日上午12:13:47
 * @since Jdk1.8
 */
public class ObjectFactory {
	public static final String Name = "Kristy";

	public static User getCQ() {
		return new User("陈琪", "3", "333", true, new Group("003", "蘑菇街", "陈琪"));
	}

	public static User getDL() {
		return new User("丁磊", "4", "444", true, new Group("004", "网易", "丁磊"));
	}

	public static User getMY() {
		return new User("马云", "1", "111", true, new Group("001", "阿里巴巴", "马云"));
	}

	public static User getRZF() {
		return new User("任正非", "2", "222", true, new Group("002", "华为", "任正非"));
	}
}
