package cn.luoziyuan.homework.day09.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author mr.j
 *�������ն�socket����
 *������������
 *��ȡ����������
 *��ȡ����
 *�������
 *�ͷ���Դ
 *ServerSocket(int port) 
          �����󶨵��ض��˿ڵķ������׽��֡�
          Socket accept()  ���������ܵ����׽��ֵ����ӡ�
 */
public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// *�������ն�socket����
		ServerSocket serverSocket = new ServerSocket(8090);
		// *������������
		Socket ss = serverSocket.accept();
		// *��ȡ����������
		InputStream is  = ss.getInputStream();
		// *��ȡ����
		byte[] bys = new byte[1024];
		int length ;
		length = 	is.read(bys);
		InetAddress address = ss.getInetAddress();
		 //*�������
		System.out.println("sender---------------->" +address.getHostName());
		System.out.println(new String(bys, 0 ,length));
		// *�ͷ���Դ
		ss.close();
		//serverSocket.close();//�����һ�㲻�ر�
	}

}
