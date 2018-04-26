package org.zxd.struts.common.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.common.model
 * @FileName:PropertyHolder.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月6日下午12:44:27
 * @since Jdk1.8
 */
public class PropertyHolder implements Serializable {
	/**
	 * @time：2016年11月6日下午12:44:23
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 8482629564425837052L;
	private String username;
	private String password;
	private String url;
	private String email;
	private String intro;
	private Boolean isMale;
	private String hidden;

	private String[] groupId;
	private String hometown;
	private String tonic;
	private String hoppy;

	private String[] hometowns;
	private Set<String> hoppies;
	private List<String> tonics;

	private Date birth;
	private Date married;

	public Date getBirth() {
		return this.birth;
	}

	public String getEmail() {
		return this.email;
	}

	public String[] getGroupId() {
		return this.groupId;
	}

	public String getHidden() {
		return this.hidden;
	}

	public String getHometown() {
		return this.hometown;
	}

	public String[] getHometowns() {
		return this.hometowns;
	}

	public Set<String> getHoppies() {
		return this.hoppies;
	}

	public String getHoppy() {
		return this.hoppy;
	}

	public String getIntro() {
		return this.intro;
	}

	public Boolean getIsMale() {
		return this.isMale;
	}

	public Date getMarried() {
		return this.married;
	}

	public String getPassword() {
		return this.password;
	}

	public String getTonic() {
		return this.tonic;
	}

	public List<String> getTonics() {
		return this.tonics;
	}

	public String getUrl() {
		return this.url;
	}

	public String getUsername() {
		return this.username;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGroupId(String[] groupId) {
		this.groupId = groupId;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public void setHometowns(String[] hometowns) {
		this.hometowns = hometowns;
	}

	public void setHoppies(Set<String> hoppies) {
		this.hoppies = hoppies;
	}

	public void setHoppy(String hoppy) {
		this.hoppy = hoppy;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public void setIsMale(Boolean isMale) {
		this.isMale = isMale;
	}

	public void setMarried(Date married) {
		this.married = married;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTonic(String tonic) {
		this.tonic = tonic;
	}

	public void setTonics(List<String> tonics) {
		this.tonics = tonics;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "PropertyHolder [username=" + this.username + ", password=" + this.password + ", url=" + this.url + ", email=" + this.email + ", intro=" + this.intro + ", isMale=" + this.isMale + ", hidden=" + this.hidden + ", groupId="
				+ Arrays.toString(this.groupId) + ", hometown=" + this.hometown + ", tonic=" + this.tonic + ", hoppy=" + this.hoppy + ", hometowns=" + Arrays.toString(this.hometowns) + ", hoppies=" + this.hoppies + ", tonics=" + this.tonics
				+ "]";
	}

}
