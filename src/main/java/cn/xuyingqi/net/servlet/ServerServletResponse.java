package cn.xuyingqi.net.servlet;

import cn.xuyingqi.net.protocol.Datagram;
import cn.xuyingqi.net.servlet.ServletResponse;

/**
 * 服务器端Servlet响应
 * 
 * @author XuYQ
 *
 */
public interface ServerServletResponse extends ServletResponse {

	/**
	 * 设置数据报文
	 * 
	 * @param datagram
	 * @return
	 */
	public ServletResponse setDatagram(Datagram datagram);
}