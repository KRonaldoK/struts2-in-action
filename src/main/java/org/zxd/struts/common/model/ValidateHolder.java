package org.zxd.struts.common.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.common.model
 * @FileName:ValidateHolder.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月11日下午11:31:06
 * @since Jdk1.8
 */
public class ValidateHolder implements Serializable {
	/**
	 * @time：2016年11月11日下午11:31:15
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 6097548534386811194L;
	private String userId;
	private String password;
	private String confirmPassword;
	private Integer age;
	private Double salary;
	private Date birth;
	private String email;
	private String webSite;
	private String token;

	public ValidateHolder() {
	}

	public Integer getAge() {
		return this.age;
	}

	public Date getBirth() {
		return this.birth;
	}

	public String getConfirmPassword() {
		return this.confirmPassword;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

	public Double getSalary() {
		return this.salary;
	}

	public String getToken() {
		return this.token;
	}

	public String getUserId() {
		return this.userId;
	}

	public String getWebSite() {
		return this.webSite;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	@Override
	public String toString() {
		return "ValidateHolder [userId=" + this.userId + ", password=" + this.password + ", confirmPassword=" + this.confirmPassword + ", age=" + this.age + ", salary=" + this.salary + ", birth="
				+ this.birth + ", email=" + this.email + ", webSite=" + this.webSite + ", token=" + this.token + "]";
	}
}
