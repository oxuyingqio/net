package cn.xuyingqi.net.server.connector;

/**
 * 连接器配置
 * 
 * @author XuYQ
 *
 */
public interface ConnectorConfig {

	/**
	 * 获取协议名称
	 * 
	 * @return
	 */
	public String getProtocol();

	/**
	 * 获取主机地址
	 * 
	 * @return
	 */
	public String getHost();

	/**
	 * 获取端口号
	 * 
	 * @return
	 */
	public int getPort();

	/**
	 * 获取超时时间
	 * 
	 * @return
	 */
	public int getTimeout();

	/**
	 * 获取最大链接数
	 * 
	 * @return
	 */
	public int getMaxConnections();
}
