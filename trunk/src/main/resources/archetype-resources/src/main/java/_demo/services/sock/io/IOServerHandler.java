#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}._demo.services.sock.io;

import exp.libs.warp.net.sock.io.common.ISession;
import exp.libs.warp.net.sock.io.common.IHandler;

/**
 * <PRE>
 * IOSocket服务端业务处理器 样例
 * </PRE>
 * <br/><B>PROJECT : </B> exp-libs
 * <br/><B>SUPPORT : </B> <a href="http://www.exp-blog.com" target="_blank">www.exp-blog.com</a> 
 * @version   2017-08-17
 * @author    EXP: 272629724@qq.com
 * @since     jdk版本：jdk1.6
 */
class IOServerHandler implements IHandler {

	@Override
	public boolean _login(ISession session) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void _handle(ISession session) {
		// TODO Auto-generated method stub
		session.write("conn success");
	}

	@Override
	public IHandler _clone() {
		return new IOServerHandler();
	}

}
