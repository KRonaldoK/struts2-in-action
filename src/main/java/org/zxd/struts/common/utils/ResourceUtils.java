package org.zxd.struts.common.utils;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import com.opensymphony.xwork2.ActionContext;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.common.utils
 * @FileName:ResourceUtils.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月13日下午1:49:22
 * @since Jdk1.8
 */
public class ResourceUtils {
	private static final String Resources_Name = "MessageResources";
	private static final String ZhCN = "zh_CN";
	private static final String EnUS = "en_US";
	private static final String I18N_Prefix = "Validation.Error.";
	private static final ResourceUtils utils = new ResourceUtils();

	public static final ResourceUtils getInstance() {
		return utils;
	}

	private final Map<String, ResourceBundle> bundleMap = new HashMap<String, ResourceBundle>() {
		/**
		 * @time：2016年11月13日下午1:43:44
		 * @desc：serialVersionUID TODO
		 */
		private static final long serialVersionUID = 6987829197160737265L;

		{
			/**
			 * 创建 Locale 的时候，不需要用 new 的方式创建，直接使用 Locale 对象提供的常量即可。
			 */
			put(ZhCN, ResourceBundle.getBundle(Resources_Name, Locale.CHINESE));
			put(EnUS, ResourceBundle.getBundle(Resources_Name, Locale.US));
		}
	};

	private ResourceUtils() {
	}

	public String getErrorMessage(String key) {
		ResourceBundle bundle = getStoredBundle();

		return bundle.getString(I18N_Prefix + key);
	}

	public String getMessage(String key) {
		ResourceBundle bundle = getStoredBundle();

		return bundle.getString(key);
	}

	private ResourceBundle getStoredBundle() {
		String locale = ActionContext.getContext().getLocale().toString();

		ResourceBundle bundle = this.bundleMap.get(locale);
		if (PreValidator.isNull(bundle)) {
			bundle = this.bundleMap.get(EnUS);
		}

		return bundle;
	}
}
