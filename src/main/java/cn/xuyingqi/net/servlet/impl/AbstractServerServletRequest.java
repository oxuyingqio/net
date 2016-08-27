package cn.xuyingqi.net.servlet.impl;

import cn.xuyingqi.net.protocol.Datagram;
import cn.xuyingqi.net.servlet.ServerServletRequest;
import cn.xuyingqi.net.servlet.ServletSession;

/**
 * 抽象公共服务器端Servlet请求
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractServerServletRequest extends AbstractServletRequest implements ServerServletRequest {

	/**
	 * 抽象公共服务器端Servlet请求
	 * 
	 * @param servletSession
	 *            servlet会话
	 */
	public AbstractServerServletRequest(ServletSession servletSession) {

		super(servletSession);
	}

	@Override
	public abstract Datagram getDatagram();
}
