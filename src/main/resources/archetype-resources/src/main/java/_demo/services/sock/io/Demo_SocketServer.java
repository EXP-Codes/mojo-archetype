#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}._demo.services.sock.io;

import exp.libs.warp.net.sock.bean.SocketBean;
import exp.libs.warp.net.sock.io.server.SocketServer;

/**
 * <PRE>
 * IOSocket服务端 样例
 * </PRE>
 * <br/><B>PROJECT : </B> exp-libs
 * <br/><B>SUPPORT : </B> <a href="http://www.exp-blog.com" target="_blank">www.exp-blog.com</a> 
 * @version   2017-08-17
 * @author    EXP: 272629724@qq.com
 * @since     jdk版本：jdk1.6
 */
public class Demo_SocketServer {

	public static void main(String[] args) {
//		SocketBean sb = Config.getInstn().getSocket();
		SocketBean sb = new SocketBean();
		sb.setIp("127.0.0.1");
		sb.setPort(9998);
		
		SocketServer server = new SocketServer(sb, new IOServerHandler());
		server._start();
	}
	
}
