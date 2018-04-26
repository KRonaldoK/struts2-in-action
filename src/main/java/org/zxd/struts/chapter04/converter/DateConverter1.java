package org.zxd.struts.chapter04.converter;

import java.text.SimpleDateFormat;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter04.converter
 * @FileName:DateConverter1.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月23日下午9:38:21
 * @since Jdk1.8
 */
public class DateConverter1 extends AbstractDataConverter {
	{
		setSdf(new SimpleDateFormat("yyyy-MM-dd"));
	}
}
