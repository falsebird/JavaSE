package cn.luoziyuan.homework.day09.tcpDemo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author mr.j
 *创建接收端socket对象
 *监听（阻塞）
 *获取输入流对象
 *获取数据
 *将大写转换为小写返回客户端
 *输出数据
 *释放资源
 *ServerSocket(int port) 
          创建绑定到特定端口的服务器套接字。
          Socket accept()  侦听并接受到此套接字的连接。
          
          使用TCP协议发送数据，服务端将接收到的数据转换成大写返回给客户端
 */
public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// *创建接收端socket对象
		ServerSocket serverSocket = new ServerSocket(8090);
		// *监听（阻塞）
		Socket socket = serverSocket.accept();
		// *获取输入流对象
		InputStream is  = socket.getInputStream();
		// *获取数据
		byte[] bys = new byte[1024];
		int length ;
		length = 	is.read(bys);
		InetAddress address = socket.getInetAddress();
		 //*输出数据
		OutputStream os = socket.getOutputStream();
		
		os.write(new String(bys, 0 ,length).toUpperCase().getBytes());//将接受到的字符串转换为大写字母并传回客户端
		
		System.out.println("sender---------------->" +address.getHostName());
		System.out.println(new String(bys, 0 ,length));
		// *释放资源
		socket.close();
		//serverSocket.close();//服务端一般不关闭
	}

}
