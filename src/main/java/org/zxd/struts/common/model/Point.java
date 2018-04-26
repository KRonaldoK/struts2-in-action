package org.zxd.struts.common.model;

import java.io.Serializable;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.common.model
 * @FileName:Point.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月4日下午8:30:41
 * @since Jdk1.8
 */
public class Point implements Serializable {
	/**
	 * @time：2016年11月4日下午8:30:35
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = -6460240966595134003L;
	private Double x;
	private Double y;

	public Point() {
	}

	public Point(Double x, Double y) {
		setX(x);
		setY(y);
	}

	public Double getX() {
		return this.x;
	}

	public Double getY() {
		return this.y;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public void setY(Double y) {
		this.y = y;
	}
}
