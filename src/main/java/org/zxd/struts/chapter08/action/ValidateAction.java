package org.zxd.struts.chapter08.action;

import static org.zxd.struts.common.utils.PreValidator.isAllLetter;
import static org.zxd.struts.common.utils.PreValidator.isNull;
import static org.zxd.struts.common.utils.PreValidator.isNullOrTrimEmpty;
import static org.zxd.struts.common.utils.PreValidator.isNumberBetween;
import static org.zxd.struts.common.utils.PreValidator.isNumeric;
import static org.zxd.struts.common.utils.PreValidator.isStringLengthBetween;

import org.apache.struts2.interceptor.validation.SkipValidation;
import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.constants.CommonConstants;
import org.zxd.struts.common.constants.FieldConstants;
import org.zxd.struts.common.enums.ErrorCode;
import org.zxd.struts.common.model.Customer;
import org.zxd.struts.common.model.Group;

import com.opensymphony.xwork2.Action;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter08.action
 * @FileName:ValidateAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月9日下午10:46:18
 * @since Jdk1.8
 */
public class ValidateAction extends BaseAction {

	/**
	 * @time：2016年11月9日下午10:46:15
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -548218973115941498L;
	private Customer customer;

	public String addCustomer() {
		System.out.println(getCustomer());

		setViewName("validate");

		return Action.SUCCESS;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	/**
	 * @author：ZXD @version：1.0
	 * @time：2016年11月11日下午11:36:35
	 * @desc：org.apache.struts2.interceptor.validation.SkipValidation 注解可以跳过验证。
	 * @since Jdk1.8
	 * @see com.opensymphony.xwork2.ActionSupport#input()
	 * @return
	 * @throws Exception
	 */
	@SkipValidation
	@Override
	public String input() throws Exception {

		setViewName("validate");

		return Action.SUCCESS;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void validate() {
		System.out.println("开始调用无参数的 validate 方法！");

		Customer customer = getCustomer();

		String name = customer.getName();
		if (isNullOrTrimEmpty(name) || !isStringLengthBetween(name, CommonConstants.Min_Length_Of_Name, CommonConstants.Max_Length_Of_Name)) {
			addFieldError(FieldConstants.Name, ErrorCode.Name_Is_Invalid.getDecsCn());
		}

		String sex = customer.getSex();
		if (isNullOrTrimEmpty(sex) || !(CommonConstants.Sex_Male.equals(sex) || CommonConstants.Sex_Female.equals(sex))) {
			addFieldError(FieldConstants.Sex, ErrorCode.Sex_Is_Invalid.getDecsCn());
		}

		Integer age = customer.getAge();
		if (isNull(age) || !isNumberBetween(age, CommonConstants.Min_Age, CommonConstants.Max_Age)) {
			addFieldError(FieldConstants.Age, ErrorCode.Age_Is_Invalid.getDecsCn());
		}

		String password = customer.getPassword();
		if (isNullOrTrimEmpty(password) || !isStringLengthBetween(password, CommonConstants.Min_Length_Of_Password, CommonConstants.Max_Length_Of_Password)) {
			addFieldError(FieldConstants.Password, ErrorCode.Password_Is_Invalid.getDecsCn());
		}

		Group group = customer.getGroup();

		String groupId = group.getGroupId();
		if (isNullOrTrimEmpty(groupId) || !isNumeric(groupId) || !isStringLengthBetween(groupId, CommonConstants.Min_Length_Of_GroupId, CommonConstants.Max_Length_Of_GroupId)) {
			addFieldError(FieldConstants.GroupId, ErrorCode.GroupId_Is_Invalid.getDecsCn());
		}

		String groupName = group.getGroupName();
		if (isNullOrTrimEmpty(groupName) || !isAllLetter(groupName)) {
			addFieldError(FieldConstants.GroupName, ErrorCode.GroupName_Is_Invalid.getDecsCn());
		}

		String groupLeader = group.getGroupLeader();
		if (isNullOrTrimEmpty(groupLeader) || !isAllLetter(groupLeader) || !isStringLengthBetween(groupLeader, CommonConstants.Min_Length_Of_GroupLeader, CommonConstants.Max_Length_Of_GroupLeader)) {
			addFieldError(FieldConstants.GroupLeader, ErrorCode.GroupLeader_Is_Invalid.getDecsCn());
		}
	}

	public void validateAddCustomer() {
		System.out.println("开始调用无参数的 validateAddCustomer 方法！");
	}
}
