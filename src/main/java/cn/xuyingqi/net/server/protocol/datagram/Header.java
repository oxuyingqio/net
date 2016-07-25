package cn.xuyingqi.net.server.protocol.datagram;

import java.util.Map;

/**
 * 报头
 * 
 * @author XuYQ
 *
 */
public interface Header {

	/**
	 * 转换为Map集合
	 * 
	 * @return
	 */
	public Map<String, Object> toMap();
}
