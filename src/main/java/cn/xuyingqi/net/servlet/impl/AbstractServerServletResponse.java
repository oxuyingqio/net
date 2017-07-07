package cn.xuyingqi.net.servlet.impl;

import cn.xuyingqi.net.protocol.Datagram;
import cn.xuyingqi.net.servlet.ServerServletResponse;
import cn.xuyingqi.net.servlet.ServletRequest;
import cn.xuyingqi.net.servlet.ServletResponse;

/**
 * 抽象公共服务器端Servlet响应
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractServerServletResponse extends AbstractServletResponse implements ServerServletResponse {

	/**
	 * 抽象公共服务器端Servlet响应
	 * 
	 * @param servletRequest
	 *            Servlet请求
	 */
	public AbstractServerServletResponse(ServletRequest servletRequest) {

		super(servletRequest);
	}

	@Override
	public abstract ServletResponse setDatagram(Datagram datagram);
}