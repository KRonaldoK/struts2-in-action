package org.zxd.struts.common.model;

import java.io.Serializable;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.common.model
 * @FileName:Group.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月4日下午7:51:58
 * @since Jdk1.8
 */
public class Group implements Serializable {
	/**
	 * @time：2016年11月4日下午7:51:56
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -4640454505183103385L;
	/**
	 * @time：2016年11月4日下午7:52:14
	 * @desc：groupId 集团编号
	 */
	private String groupId;
	/**
	 * @time：2016年11月4日下午7:52:16
	 * @desc：groupName 集团名称
	 */
	private String groupName;
	/**
	 * @time：2016年11月4日下午7:52:18
	 * @desc：groupLeader 集团领导
	 */
	private String groupLeader;

	public Group() {
	}

	public Group(String groupId, String groupName, String groupLeader) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.groupLeader = groupLeader;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public String getGroupLeader() {
		return this.groupLeader;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public void setGroupLeader(String groupLeader) {
		this.groupLeader = groupLeader;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Group [groupId=" + this.groupId + ", groupName=" + this.groupName + ", groupLeader=" + this.groupLeader + "]";
	}

}
