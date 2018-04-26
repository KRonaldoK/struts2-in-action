package org.zxd.struts.common.model;

import java.io.Serializable;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.common.model
 * @FileName:DefaultOption.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月6日下午2:38:32
 * @since Jdk1.8
 */
public class DefaultOption implements Serializable {
	/**
	 * @time：2016年11月6日下午2:38:30
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 2019042743065194832L;
	private String key;
	private String value;

	public DefaultOption() {
	}

	public DefaultOption(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return this.key;
	}

	public String getValue() {
		return this.value;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
