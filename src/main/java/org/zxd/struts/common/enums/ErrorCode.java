package org.zxd.struts.common.enums;

import org.zxd.struts.common.utils.ResourceUtils;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.common.enums
 * @FileName:ErrorCode.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月11日上午12:14:06
 * @since Jdk1.8
 */
public enum ErrorCode {
	Name_Is_Invalid(1000001, "客户姓名不能为空，客户姓名的长度必须在 4 到 64 位之间。"), Age_Is_Invalid(1000002, "客户年龄不能为空，客户年龄必须在 0 到 150 之间。"), Password_Is_Invalid(1000005,
			"客户密码不能为空，客户密码的长度必须在 8 到 64 位之间，客户密码必须包含字母、数字和特殊字符。"), Sex_Is_Invalid(1000008, "客户性别不能为空，性别只能是男和女，暂时不支持人妖。"), GroupId_Is_Invalid(1000010,
					"集团编号不能为空，集团编号只能是数字，集团编号的长度必须在  4 到 16 位之间。"), GroupName_Is_Invalid(000013, "集团名称不能为空，集团名称只能是字母。"), GroupLeader_Is_Invalid(1000014, "集团领导不能为空，集团领导名称只能是字母，长度必须在  4 到 64 位之间。");
	private int code;
	private String decsCn;
	@SuppressWarnings("unused")
	private String i18NMessage;

	private ErrorCode(int code, String decsCn) {
		this.code = code;
		this.decsCn = decsCn;
	}

	public int getCode() {
		return this.code;
	}

	public String getDecsCn() {
		return this.decsCn;
	}

	public String getI18NMessage() {
		return ResourceUtils.getInstance().getErrorMessage(String.valueOf(getCode()));
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setDecsCn(String decsCn) {
		this.decsCn = decsCn;
	}
}
