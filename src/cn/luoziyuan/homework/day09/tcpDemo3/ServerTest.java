package cn.luoziyuan.homework.day09.tcpDemo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;


public class ServerTest {
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
		boolean flag = login(username , password);
		//获取输出流对象
		PrintWriter pw = new PrintWriter(socket.getOutputStream() ,true);
		 //*输出数据
		
		if (flag) {
			pw.println("登录成功");
		}else {
			pw.println("登录失败");
		}
		pw.flush();
		// *释放资源
		pw.close();
		br.close();
		socket.close();
		//serverSocket.close();//服务端一般不关闭
	}

	private static boolean login(String username, String password) {
		// TODO Auto-generated method stub
		List< User> users = UserDB.getUserList();
		
/*		for (Iterator<User> iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			if (username.equals(user.getUsername())&&password.equals(user.getPassword())) {
				return true;
			}
		}*/
		boolean flag = false;
		User user = new User(username, password);
		if (users.contains(user)) {
			flag = true;
		}
		//return false;
		return flag;
	}
}
