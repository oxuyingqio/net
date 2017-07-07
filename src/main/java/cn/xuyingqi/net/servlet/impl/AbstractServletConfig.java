package cn.xuyingqi.net.servlet.impl;

import java.util.Set;

import cn.xuyingqi.net.servlet.ServletConfig;
import cn.xuyingqi.net.servlet.ServletContext;

/**
 * 抽象公共Servlet配置
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractServletConfig implements ServletConfig {

	@Override
	public abstract Set<String> getInitParameterNames();

	@Override
	public abstract String getInitParameter(String name);

	@Override
	public abstract ServletContext getServletContext();

	@Override
	public abstract String getServletName();
}