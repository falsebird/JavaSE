package cn.luoziyuan.homework.day09.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author mr.j
 *使用tcp协议发送数据
 *		使用发送端Socket对象（创建连接）
 *		获取输出流对象
 *		发送数据
 *		释放资源
 *Exception in thread "main" java.net.ConnectException: Connection refused: connect
 *tcp协议需要创建链接
 */
public class CilentDemo {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub

//		 *		使用发送端Socket对象（创建连接）
		Socket s = new Socket(InetAddress.getByName("luoziyuan"), 8090);
//  	 *		获取输出流对象
		OutputStream os= s.getOutputStream();
//		 *		发送数据
		String str = " hello im jiashihai  im coming";
		os.write(str.getBytes());
//		 *		释放资源
		os.close();
		s.close();

	}

}
