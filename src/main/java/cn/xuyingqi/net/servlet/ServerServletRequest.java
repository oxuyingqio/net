package cn.xuyingqi.net.servlet;

import cn.xuyingqi.net.protocol.Datagram;

/**
 * 服务器端Servlet请求
 * 
 * @author XuYQ
 *
 */
public interface ServerServletRequest extends ServletRequest {

	/**
	 * 获取数据报文
	 * 
	 * @return
	 */
	public Datagram getDatagram();
}