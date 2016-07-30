package cn.xuyingqi.net.servlet.impl;

import java.util.Set;

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
	public abstract Set<String> getHeaderNames();

	@Override
	public abstract Object getHeader(String name);

	@Override
	public abstract Set<String> getPayloadNames();

	@Override
	public abstract Object getPayload(String name);
}
