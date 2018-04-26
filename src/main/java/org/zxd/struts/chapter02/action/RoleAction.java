package org.zxd.struts.chapter02.action;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter02.action
 * @FileName:RoleAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月15日下午5:21:57
 * @since Jdk1.8
 */
public class RoleAction {
	private static final String AddRole = "addRole";
	private static final String UpdateRole = "updateRole";
	private static final String DeleteRole = "deleteRole";

	public String addRole() {
		System.out.println("Execute addRole");

		return AddRole;
	}

	public String deleteRole() {
		System.out.println("Execute deleteRole");

		return DeleteRole;
	}

	public String updateRole() {
		System.out.println("Execute updateRole");

		return UpdateRole;
	}
}
