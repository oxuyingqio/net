package cn.xuyingqi.net.server.container;

import cn.xuyingqi.net.server.connector.Protocol;

/**
 * 协议容器
 * 
 * @author XuYQ
 *
 */
public interface ProtocolContainer {

	/**
	 * 获取协议对象
	 * 
	 * @param name
	 * @return
	 */
	public Protocol getProtocol(String name);
}
