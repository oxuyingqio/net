package cn.xuyingqi.net.servlet.impl;

import java.util.Set;

import cn.xuyingqi.net.servlet.ServerServletRequest;
import cn.xuyingqi.net.servlet.ServletSession;

/**
 * 抽象公共Servlet请求
 * @author XuYQ
 *
 */
public class AbstractServerServletRequest extends AbstractServletRequest implements ServerServletRequest {

	public AbstractServerServletRequest(ServletSession servletSession) {
		super(servletSession);
	}

	@Override
	public Set<String> getHeaderNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getHeader(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getPayloadNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPayload(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
