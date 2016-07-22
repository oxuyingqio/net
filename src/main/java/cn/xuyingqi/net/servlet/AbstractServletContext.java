package cn.xuyingqi.net.servlet;

import java.util.Map;
import java.util.Set;

import cn.xuyingqi.util.util.MapFactory;

/**
 * 抽象公共Servlet上下文
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractServletContext implements ServletContext {

	/**
	 * 属性
	 */
	private Map<String, Object> attr = MapFactory.newInstance();

	@Override
	public ServletContext setAttribute(String name, Object object) {

		attr.put(name, object);

		return this;
	}

	@Override
	public Object getAttribute(String name) {

		return attr.get(name);
	}

	@Override
	public Set<String> getAttributeNames() {

		return attr.keySet();
	}
}
