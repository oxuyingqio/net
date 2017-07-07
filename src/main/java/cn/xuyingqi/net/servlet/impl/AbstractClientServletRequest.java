package cn.xuyingqi.net.servlet.impl;

import cn.xuyingqi.net.protocol.Datagram;
import cn.xuyingqi.net.servlet.ClientServletRequest;
import cn.xuyingqi.net.servlet.ServletSession;

/**
 * 抽象公共客户端Servlet请求
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractClientServletRequest extends AbstractServletRequest implements ClientServletRequest {

	/**
	 * 抽象公共客户端Servlet请求
	 * 
	 * @param servletSession
	 *            Servlet会话
	 */
	public AbstractClientServletRequest(ServletSession servletSession) {

		super(servletSession);
	}

	@Override
	public abstract ClientServletRequest setDatagram(Datagram datagram);
}