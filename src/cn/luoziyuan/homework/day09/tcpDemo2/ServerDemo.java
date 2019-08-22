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
          �����:
1.���տͻ��˷��͹������û���������
           2.����û�������itheima���� ���벻��123456,����ͻ���д�롱��¼ʧ�ܡ�
             ������ͻ���д���¼�ɹ�

 */
public class ServerDemo {

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
		String con = null;
		//�ж��û����������Ƿ���ȷ
		if ("luoziyuan".equals(username)&&"12345".equals(password)) {
			con = "��¼�ɹ�";
		}else  {
			con = "��¼ʧ��";
		}
		//��ȡ���������
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		 //*�������
		bw.write(con);
		bw.flush();
		// *�ͷ���Դ
		bw.close();
		br.close();
		socket.close();
		//serverSocket.close();//�����һ�㲻�ر�
	}

}
