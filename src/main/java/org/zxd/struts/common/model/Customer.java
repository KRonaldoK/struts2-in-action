package org.zxd.struts.common.model;

import java.io.Serializable;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.common.model
 * @FileName:Customer.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月9日下午10:59:46
 * @since Jdk1.8
 */
public class Customer implements Serializable {
	/**
	 * @time：2016年11月9日下午10:59:35
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -1090184398580470015L;
	private String Id;
	private Integer age;
	private String name;
	private String sex;
	private String password;
	private Group group;

	public Customer() {
	}

	public Integer getAge() {
		return this.age;
	}

	public Group getGroup() {
		return this.group;
	}

	public String getId() {
		return this.Id;
	}

	public String getName() {
		return this.name;
	}

	public String getPassword() {
		return this.password;
	}

	public String getSex() {
		return this.sex;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public void setId(String id) {
		this.Id = id.trim();
	}

	public void setName(String name) {
		this.name = name.trim();
	}

	public void setPassword(String password) {
		this.password = password.trim();
	}

	public void setSex(String sex) {
		this.sex = sex.trim();
	}

	@Override
	public String toString() {
		return "Customer [Id=" + this.Id + ", age=" + this.age + ", name=" + this.name + ", sex=" + this.sex
				+ ", password=" + this.password + ", group=" + this.group + "]";
	}
}
