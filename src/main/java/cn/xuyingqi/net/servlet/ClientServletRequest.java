package cn.xuyingqi.net.servlet;

import cn.xuyingqi.net.protocol.Datagram;

/**
 * 客户端Servlet请求
 * 
 * @author XuYQ
 *
 */
public interface ClientServletRequest extends ServletRequest {

	/**
	 * 设置数据报文
	 * 
	 * @param datagram
	 * @return
	 */
	public ClientServletRequest setDatagram(Datagram datagram);
}