package cn.xuyingqi.net.server.connector;

import cn.xuyingqi.net.server.container.ProtocolContainer;

/**
 * 连接器
 * 
 * @author XuYQ
 *
 */
public interface Connector {

	/**
	 * 初始化连接器
	 * 
	 * @param connectorConfig
	 *            连接器配置
	 * @param protocolContainer
	 *            协议容器
	 */
	public void init(ConnectorConfig connectorConfig, ProtocolContainer protocolContainer);

	/**
	 * 连接
	 */
	public void connect();
}
