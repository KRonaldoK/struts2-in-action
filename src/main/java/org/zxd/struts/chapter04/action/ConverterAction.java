package org.zxd.struts.chapter04.action;

import java.util.Date;

import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.model.Point;

import com.opensymphony.xwork2.Action;

public class ConverterAction extends BaseAction {
	/**
	 * @time：2016年11月3日下午11:38:28
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 6131451739272660475L;

	private Date date1;
	private Date date2;
	private Point point;

	public Date getDate1() {
		return this.date1;
	}

	public Date getDate2() {
		return this.date2;
	}

	public Point getPoint() {
		return this.point;
	}

	public String globalConverter() {
		System.out.println(getPoint());

		setViewName("globalConverter");

		return Action.SUCCESS;
	}

	public String localConverter() {
		System.out.println(getDate1());
		System.out.println(getDate2());

		setViewName("localConverter");

		return Action.SUCCESS;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

}
