package cn.xuyingqi.net.server.connector;

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
	 * 连接
	 */
	public void connect();
}
