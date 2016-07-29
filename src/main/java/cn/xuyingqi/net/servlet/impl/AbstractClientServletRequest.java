package cn.xuyingqi.net.servlet.impl;

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
	public abstract ClientServletRequest addHeader(String name, Object value);

	@Override
	public abstract boolean containsHeader(String name);

	@Override
	public abstract ClientServletRequest setHeader(String name, Object value);

	@Override
	public abstract ClientServletRequest addPayload(String name, Object value);

	@Override
	public abstract boolean containsPayload(String name);

	@Override
	public abstract ClientServletRequest setPayload(String name, Object value);
}
