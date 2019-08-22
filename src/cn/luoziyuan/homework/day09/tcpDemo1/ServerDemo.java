package cn.luoziyuan.homework.day09.tcpDemo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author mr.j
 *�������ն�socket����
 *������������
 *��ȡ����������
 *��ȡ����
 *����дת��ΪСд���ؿͻ���
 *�������
 *�ͷ���Դ
 *ServerSocket(int port) 
          �����󶨵��ض��˿ڵķ������׽��֡�
          Socket accept()  ���������ܵ����׽��ֵ����ӡ�
          
          ʹ��TCPЭ�鷢�����ݣ�����˽����յ�������ת���ɴ�д���ظ��ͻ���
 */
public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// *�������ն�socket����
		ServerSocket serverSocket = new ServerSocket(8090);
		// *������������
		Socket socket = serverSocket.accept();
		// *��ȡ����������
		InputStream is  = socket.getInputStream();
		// *��ȡ����
		byte[] bys = new byte[1024];
		int length ;
		length = 	is.read(bys);
		InetAddress address = socket.getInetAddress();
		 //*�������
		OutputStream os = socket.getOutputStream();
		
		os.write(new String(bys, 0 ,length).toUpperCase().getBytes());//�����ܵ����ַ���ת��Ϊ��д��ĸ�����ؿͻ���
		
		System.out.println("sender---------------->" +address.getHostName());
		System.out.println(new String(bys, 0 ,length));
		// *�ͷ���Դ
		socket.close();
		//serverSocket.close();//�����һ�㲻�ر�
	}

}
