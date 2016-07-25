package cn.xuyingqi.net.server.connector.protocol.datagram;

import java.util.Map;

/**
 * 报头
 * 
 * @author XuYQ
 *
 */
public interface Header {

	/**
	 * 将报头转换为Map集合
	 * 
	 * @return
	 */
	public Map<String, Object> convertMap();
}
