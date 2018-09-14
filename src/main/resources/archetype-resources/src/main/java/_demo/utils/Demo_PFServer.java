#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}._demo.utils;

import exp.libs.warp.net.pf.PFAgent;

/**
 * <PRE>
 * 端口转发服务 样例
 * </PRE>
 * <br/><B>PROJECT : </B> exp-libs
 * <br/><B>SUPPORT : </B> <a href="http://www.exp-blog.com" target="_blank">www.exp-blog.com</a> 
 * @version   2017-08-17
 * @author    EXP: 272629724@qq.com
 * @since     jdk版本：jdk1.6
 */
public class Demo_PFServer {

	/**
	 * 端口转发样例
	 */
	public void demo() {
		int localPort = 9999;	// 获取本地监听端口
		String remoteIP = "172.168.10.63";	// 远程服务IP
		int remotePort = 1521;	// 远程服务端口
		
		PFAgent agent = new PFAgent(localPort, remoteIP, remotePort);
		agent._start();
	}
	
}
