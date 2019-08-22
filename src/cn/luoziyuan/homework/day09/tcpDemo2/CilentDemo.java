package cn.luoziyuan.homework.day09.tcpDemo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author mr.j 使用tcp协议发送数据 使用发送端Socket对象（创建连接） 获取输出流对象 发送数据 释放资源 Exception in
 *         thread "main" java.net.ConnectException: Connection refused: connect
 *         tcp协议需要创建链接
 *
 *         客户端: 1.提示用户输入用户名和密码,将用户输入的用户名和密码发送给服务端 2.接收服务端验证完用户名和密码的结果
 * 
 */
public class CilentDemo {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub

		// * 使用发送端Socket对象（创建连接）
		Socket socket = new Socket("luoziyuan", 8090);
		//获取用户名和密码
		BufferedReader brReader= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("请输入用户名和密码");
		System.out.println("用户名：");
		String  username = brReader.readLine();
		System.out.println("密码：");
		String  password=brReader.readLine();
		
		brReader.close();

		// * 获取输出流对象
		// PrintWriter 向文本输出流打印对象的格式化表示形式
		// PrintWriter(OutputStream out, boolean autoFlush) 通过现有的 OutputStream 创建新的 PrintWriter。
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter pw = new PrintWriter(socket.getOutputStream() ,true);
		// * 发送数据
		//void println(String x)  打印 String，然后终止该行。 
		pw.println(username);
		pw.println(password);
		System.out.println(username);
		System.out.println(password);
		pw.flush();
		//获取输入流对象
		BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String con = br.readLine();
		System.out.println(con);
		// * 释放资源
		//os.close();
		br.close();
		pw.close();
		socket.close();

	}

	

}
