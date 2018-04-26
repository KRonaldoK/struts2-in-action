package org.zxd.struts.chapter04.converter;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;
import org.zxd.struts.common.model.Point;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter04.converter
 * @FileName:PointConverter.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月23日下午8:52:35
 * @since Jdk1.8
 */
public class PointConverter extends StrutsTypeConverter {

	@Override
	public Point convertFromString(Map context, String[] values, Class toClass) {
		if (values.length == 1) {
			String pointStr = values[0];
			try {
				return parsePoint(pointStr);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public String convertToString(Map context, Object o) {
		Point p = (Point) o;
		return p.getX() + "," + p.getY();
	}

	private Point parsePoint(String pointStr) {
		String[] xy = pointStr.split(",");
		return new Point(new Double(xy[0]), new Double(xy[1]));
	}

}
