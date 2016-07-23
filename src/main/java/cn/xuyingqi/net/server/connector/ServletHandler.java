package cn.xuyingqi.net.server.connector;

import cn.xuyingqi.net.server.container.ServletContainer;

/**
 * Servlet处理类
 * 
 * @author XuYQ
 *
 */
public interface ServletHandler {

	/**
	 * 初始化Servlet处理类
	 * 
	 * @param servletContainer
	 *            servlet容器
	 */
	public void init(ServletContainer servletContainer);
}
