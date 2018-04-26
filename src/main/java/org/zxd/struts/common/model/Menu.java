package org.zxd.struts.common.model;

import java.io.Serializable;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.common.model
 * @FileName:Menu.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月4日下午8:37:47
 * @since Jdk1.8
 */
public class Menu implements Serializable {
	/**
	 * @time：2016年11月4日下午8:37:42
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -600099869059880592L;
	/**
	 * @time：2016年11月4日下午9:28:14
	 * @desc：menuId 菜单编号
	 */
	private String menuId;
	/**
	 * @time：2016年11月4日下午9:28:24
	 * @desc：parentId 父菜单编号
	 */
	private String parentId;
	/**
	 * @time：2016年11月4日下午9:28:33
	 * @desc：url 菜单 URL
	 */
	private String url;
	/**
	 * @time：2016年11月4日下午9:28:42
	 * @desc：displayName 菜单显示名称
	 */
	private String displayName;

	public Menu() {
	}

	public Menu(String menuId, String parentId, String url, String displayName) {
		super();
		this.menuId = menuId;
		this.parentId = parentId;
		this.url = url;
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public String getMenuId() {
		return this.menuId;
	}

	public String getParentId() {
		return this.parentId;
	}

	public String getUrl() {
		return this.url;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
