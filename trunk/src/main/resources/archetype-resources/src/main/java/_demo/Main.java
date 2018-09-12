#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}._demo;

import exp.libs.utils.other.LogUtils;

/**
 * <PRE>
 * 程序入口
 * </PRE>
 * <br/><B>PROJECT : </B> xxxxxxx
 * <br/><B>SUPPORT : </B> <a href="http://www.exp-blog.com" target="_blank">www.exp-blog.com</a> 
 * @version   xxxxxxx
 * @author    xxxxxxx
 * @since     jdk版本：jdk1.6
 */
public class Main {
	
	public static void main(String[] args) {
		LogUtils.loadLogBackConfig();		// 加载日志配置
		Config.getInstn().reflash(60000);	// 初始化配置项(每隔60秒刷新一次)
		
		// TODO: 程序入口
	}
	
}
