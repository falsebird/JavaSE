package cn.luoziyuan.homework.day09.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author mr.j
 *创建接收端socket对象
 *监听（阻塞）
 *获取输入流对象
 *获取数据
 *输出数据
 *释放资源
 *ServerSocket(int port) 
          创建绑定到特定端口的服务器套接字。
          Socket accept()  侦听并接受到此套接字的连接。
 */
public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// *创建接收端socket对象
		ServerSocket serverSocket = new ServerSocket(8090);
		// *监听（阻塞）
		Socket ss = serverSocket.accept();
		// *获取输入流对象
		InputStream is  = ss.getInputStream();
		// *获取数据
		byte[] bys = new byte[1024];
		int length ;
		length = 	is.read(bys);
		InetAddress address = ss.getInetAddress();
		 //*输出数据
		System.out.println("sender---------------->" +address.getHostName());
		System.out.println(new String(bys, 0 ,length));
		// *释放资源
		ss.close();
		//serverSocket.close();//服务端一般不关闭
	}

}
