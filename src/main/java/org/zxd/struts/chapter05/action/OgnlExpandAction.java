package org.zxd.struts.chapter05.action;

import java.util.ArrayList;

import org.zxd.struts.common.action.BaseAction;
import org.zxd.struts.common.model.Point;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * @ProjectName:StrutsInAction
 * @PackageName:org.zxd.struts.chapter05.action
 * @FileName:OgnlExpandAction.java
 * @desc：TODO
 * @author：ZXD
 * @version 1.0
 * @time：2016年11月4日下午10:46:18
 * @since Jdk1.8
 */
public class OgnlExpandAction extends BaseAction {

	/**
	 * @time：2016年11月4日下午10:46:14
	 * @desc：serialVersionUID TODO
	 */
	private static final long serialVersionUID = 527720910215086055L;

	@SuppressWarnings("boxing")
	public String filter() {
		ArrayList<Point> points = new ArrayList<Point>();
		points.add(new Point(1.0, 2.0));
		points.add(new Point(3.0, 4.0));
		points.add(new Point(5.0, 6.0));
		points.add(new Point(7.0, 8.0));

		ActionContext context = ActionContext.getContext();
		context.put("points", points);

		return setView("ognlFilter");
	}

	public String ognlStatic() {
		return setView("ognlStatic");
	}

	public String shadow() {
		filter();

		return setView("ognlShadow");
	}

	private String setView(String viewName) {
		setViewName(viewName);

		return Action.SUCCESS;
	}

}
