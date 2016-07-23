package cn.xuyingqi.net.server.container;

import java.util.Set;

import cn.xuyingqi.net.server.connector.protocol.Protocol;

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

	/**
	 * 获取协议名称集合
	 * 
	 * @return
	 */
	public Set<String> getProtocolNames();
}
