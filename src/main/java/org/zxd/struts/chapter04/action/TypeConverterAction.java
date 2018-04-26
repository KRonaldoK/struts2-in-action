package org.zxd.struts.chapter04.action;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.zxd.struts.common.action.BaseAction;

import com.opensymphony.xwork2.Action;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter04.action
 * @FileName:TypeConverterAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月23日下午6:46:03
 * @since Jdk1.8
 */
public class TypeConverterAction extends BaseAction {

	/**
	 * @time：2016年10月23日下午6:39:57
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -1603119273424285105L;

	private String username;
	private int age1;
	private Integer age2;
	private double salary1;
	private Double salary2;
	private boolean sex1;
	private Boolean sex2;

	private String[] nameArray;
	/**
	 * 使用下标传递数组元素时，必须要先完成初始化，Strut 不会自动初始化。
	 */
	private Double[] salaryArray = new Double[2];

	private List<String> nameList;
	private List<Double> salaryList;

	private Map<String, String> nameMap;
	private Map<String, Double> salaryMap;

	public String array() {
		setViewName("array");

		return Action.SUCCESS;
	}

	public String basic() {
		setViewName("basic");

		return Action.SUCCESS;
	}

	public int getAge1() {
		return this.age1;
	}

	public Integer getAge2() {
		return this.age2;
	}

	public String[] getNameArray() {
		return this.nameArray;
	}

	public List<String> getNameList() {
		return this.nameList;
	}

	public Map<String, String> getNameMap() {
		return this.nameMap;
	}

	public double getSalary1() {
		return this.salary1;
	}

	public Double getSalary2() {
		return this.salary2;
	}

	public Double[] getSalaryArray() {
		return this.salaryArray;
	}

	public List<Double> getSalaryList() {
		return this.salaryList;
	}

	public Map<String, Double> getSalaryMap() {
		return this.salaryMap;
	}

	public boolean getSex1() {
		return this.sex1;
	}

	public Boolean getSex2() {
		return this.sex2;
	}

	public String getUsername() {
		return this.username;
	}

	public String list() {
		setViewName("list");

		return Action.SUCCESS;
	}

	public String map() {
		setViewName("map");

		return Action.SUCCESS;
	}

	public void setAge1(int age1) {
		this.age1 = age1;
	}

	public void setAge2(Integer age2) {
		this.age2 = age2;
	}

	public void setNameArray(String[] nameArray) {
		this.nameArray = nameArray;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public void setNameMap(Map<String, String> nameMap) {
		this.nameMap = nameMap;
	}

	public void setSalary1(double salary1) {
		this.salary1 = salary1;
	}

	public void setSalary2(Double salary2) {
		this.salary2 = salary2;
	}

	public void setSalaryArray(Double[] salaryArray) {
		this.salaryArray = salaryArray;
	}

	public void setSalaryList(List<Double> salaryList) {
		this.salaryList = salaryList;
	}

	public void setSalaryMap(Map<String, Double> salaryMap) {
		this.salaryMap = salaryMap;
	}

	public void setSex1(boolean sex1) {
		this.sex1 = sex1;
	}

	public void setSex2(Boolean sex2) {
		this.sex2 = sex2;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String submitArray() {
		System.out.println(Arrays.toString(getNameArray()));
		System.out.println(Arrays.toString(getSalaryArray()));

		setViewName("array");
		return Action.SUCCESS;
	}

	public String submitBasic() {
		System.out.println(getUsername());
		System.out.println(getAge1());
		System.out.println(getAge2());
		System.out.println(getSalary1());
		System.out.println(getSalary2());
		System.out.println(getSex1());
		System.out.println(getSex2());

		setViewName("basic");

		return Action.SUCCESS;
	}

	public String submitList() {
		System.out.println(Arrays.toString(getNameList().toArray()));
		System.out.println(Arrays.toString(getSalaryList().toArray()));

		setViewName("list");
		return Action.SUCCESS;
	}

	public String submitMap() {
		for (Entry<String, String> entry : getNameMap().entrySet()) {
			System.out.println(entry.getKey() + "，" + entry.getValue());
		}

		for (Entry<String, Double> entry : getSalaryMap().entrySet()) {
			System.out.println(entry.getKey() + "，" + entry.getValue());
		}

		setViewName("map");
		return Action.SUCCESS;
	}

}
