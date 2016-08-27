package cn.xuyingqi.net.servlet;

import cn.xuyingqi.net.protocol.Datagram;

/**
 * 客户端Servlet响应
 * 
 * @author XuYQ
 *
 */
public interface ClientServletResponse extends ServletResponse {

	/**
	 * 获取数据报文
	 * 
	 * @return
	 */
	public Datagram getDatagram();
}
