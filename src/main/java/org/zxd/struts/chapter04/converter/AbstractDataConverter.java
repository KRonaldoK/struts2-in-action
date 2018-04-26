package org.zxd.struts.chapter04.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter04.converter
 * @FileName:AbstractDataConverter.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月23日下午9:38:16
 * @since Jdk1.8
 */
public class AbstractDataConverter extends StrutsTypeConverter {
	private SimpleDateFormat sdf;

	/**
	 * @usage 完成字符串到目标对象的转换。
	 * @param context：ActionContext
	 *            中的 context 对象
	 * @param values：需要转换为对象的的字符串数组
	 * @param toClass：需要转换的类型
	 * @return
	 */
	@Override
	public Date convertFromString(Map context, String[] values, Class toClass) {
		try {
			if (values.length <= 1) {
				return getSdf().parse(values[0]);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @usage 完成目标对象到字符串的转换。
	 * @param context：ActionContext
	 *            中的 context 对象
	 * @param o：需要转换为字符串的目标对象。
	 * @return
	 */
	@Override
	public String convertToString(Map context, Object o) {
		return getSdf().format(o);
	}

	public SimpleDateFormat getSdf() {
		return this.sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

}
