package cn.luoziyuan.homework.day09.tcpDemo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
          服务端:
1.接收客户端发送过来的用户名和密码
           2.如果用户名不是itheima或者 密码不是123456,就向客户端写入”登录失败”
             否则向客户端写入登录成功

 */
public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// *创建接收端socket对象
		ServerSocket serverSocket = new ServerSocket(8090);
		// *监听（阻塞）
		Socket socket = serverSocket.accept();
		// *获取输入流对象 使用高效流
		BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
		// *获取数据
		String username = br.readLine();
		String password = br.readLine();
		String con = null;
		//判断用户名与密码是否正确
		if ("luoziyuan".equals(username)&&"12345".equals(password)) {
			con = "登录成功";
		}else  {
			con = "登录失败";
		}
		//获取输出流对象
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		 //*输出数据
		bw.write(con);
		bw.flush();
		// *释放资源
		bw.close();
		br.close();
		socket.close();
		//serverSocket.close();//服务端一般不关闭
	}

}
