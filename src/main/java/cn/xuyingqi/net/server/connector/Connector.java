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
	 */
	public void init(ConnectorConfig connectorConfig);

	/**
	 * 设置协议容器
	 * 
	 * @param protocolContainer
	 *            协议容器
	 */
	public void setProtocolContainer(ProtocolContainer protocolContainer);

	/**
	 * 连接
	 */
	public void connect();
}
