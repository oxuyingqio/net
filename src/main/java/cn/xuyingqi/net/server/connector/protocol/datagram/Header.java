package cn.xuyingqi.net.server.connector.protocol.datagram;

/**
 * 报头
 * 
 * @author XuYQ
 *
 */
public interface Header {

	/**
	 * 获取报体长度
	 * 
	 * @return
	 */
	public int getContentLength();
}
