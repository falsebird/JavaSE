package cn.luoziyuan.homework.day09.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * @author mr.j
 * ʹ��UDPЭ��
 * �������Ͷ�socket����
 * �������ݣ������
 * ��������
 * �ͷ���Դ
 * 
 */
public class SendDemo {

	/**
	 * @param args
	 *  DatagramSocket�����ʾ�������ͺͽ������ݱ������׽��֡� 

	 * DatagramSocket(int port) 
          �������ݱ��׽��ֲ�����󶨵����������ϵ�ָ���˿ڡ�
          DatagramSocket() 
          �������ݱ��׽��ֲ�����󶨵������������κο��õĶ˿ڡ�
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		 //�������Ͷ�socket����
		DatagramSocket dSocket = new DatagramSocket();
		
		 // �������ݣ������
		/*
		 * DatagramPacket: �����ʾ���ݰ�
		 * ����byte[]
		 * �豸��ַ ip
		 * ���̵ĵ�ַ�� �˿ں�
		 * DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		 */
		String s= "��ð��� �ҽм�����";
		byte[] bys = s.getBytes();
		int length = bys.length;
		InetAddress inetAddress = InetAddress.getByName("luoziyuan");
		
		int port = 8090;
		
		DatagramPacket dPacket = new DatagramPacket(bys, length, inetAddress, port);
		  //��������
		dSocket.send(dPacket);
		 // �ͷ���Դ
		dSocket.close();
	}
}
