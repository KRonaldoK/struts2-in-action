/**
 * @ProjectName:StrutsInAction 
 * @PackageName:views/chapter09 
 * @FileName:changeLocale.js 
 * @Date:2016年11月13日上午11:42:38
 * @Author:ZXD	 
 * @Version 1.0
 * @Copyright (c) 2016, 1565194365@qq.com All Rights Reserved. 
 */
$(function(){
	$("#requestLocale").on("change",function(){
		var locale=$(this).val();
		location.href="http://localhost:8080/StrutsInAction/chapter09/i18n_changeLocale.action?request_locale="+locale;
	});
});