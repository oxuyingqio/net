package cn.xuyingqi.net.server.connector.protocol.datagram;

import java.util.Map;

/**
 * 报体
 * 
 * @author XuYQ
 *
 */
public interface Payload {

	/**
	 * 转换为Map集合
	 * 
	 * @return
	 */
	public Map<String, Object> toMap();
}
