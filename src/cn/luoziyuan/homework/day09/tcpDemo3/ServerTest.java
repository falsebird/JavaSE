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
		// *�������ն�socket����
		ServerSocket serverSocket = new ServerSocket(8090);
		// *������������
		Socket socket = serverSocket.accept();
		// *��ȡ���������� ʹ�ø�Ч��
		BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
		// *��ȡ����
		String username = br.readLine();
		String password = br.readLine();
		boolean flag = login(username , password);
		//��ȡ���������
		PrintWriter pw = new PrintWriter(socket.getOutputStream() ,true);
		 //*�������
		
		if (flag) {
			pw.println("��¼�ɹ�");
		}else {
			pw.println("��¼ʧ��");
		}
		pw.flush();
		// *�ͷ���Դ
		pw.close();
		br.close();
		socket.close();
		//serverSocket.close();//�����һ�㲻�ر�
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
