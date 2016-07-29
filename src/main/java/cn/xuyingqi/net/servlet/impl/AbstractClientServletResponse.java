package cn.xuyingqi.net.servlet.impl;

import java.util.Set;

import cn.xuyingqi.net.servlet.ClientServletResponse;
import cn.xuyingqi.net.servlet.ServletRequest;

/**
 * 抽象公共客户端Servlet响应
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractClientServletResponse extends AbstractServletResponse implements ClientServletResponse {

	/**
	 * 抽象公共客户端Servlet响应
	 * 
	 * @param servletRequest
	 *            Servlet请求
	 */
	public AbstractClientServletResponse(ServletRequest servletRequest) {
		super(servletRequest);
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
