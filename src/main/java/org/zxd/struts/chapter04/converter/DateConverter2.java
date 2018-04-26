package org.zxd.struts.chapter04.converter;

import java.text.SimpleDateFormat;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter04.converter
 * @FileName:DateConverter2.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年10月23日下午9:38:25
 * @since Jdk1.8
 */
public class DateConverter2 extends AbstractDataConverter {
	{
		setSdf(new SimpleDateFormat("yyyy/MM/dd"));
	}
}
