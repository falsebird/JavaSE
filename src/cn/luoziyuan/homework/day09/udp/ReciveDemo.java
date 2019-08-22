package cn.luoziyuan.homework.day09.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author mr.j
 * ʹ��UDPЭ��
 * �������ն˶�socket����
 * ��������
 * ��������
 * �����������
 * �ͷ���Դ
 * 
 * ע��˿ںţ�������
 */
public class ReciveDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�������ն˶�socket����
		DatagramSocket ds = new DatagramSocket(8090);
		
		 //* ��������
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		System.out.println(1);
		ds.receive(dp); //����
		System.out.println(2);
		 //* ��������
		
		
		InetAddress address = dp.getAddress();//��ȡ���Ͷ˵�ip����
		 //��ȡ���յ������ݣ�Ҳ����ֱ��ʹ�ô���������ʱ�������
		byte[] data = dp.getData();
		//��ȡ�յ����ݵľ��峤��
		int length = dp.getLength();
		
		
		 //* �����������
		System.out.println("sender---------------->" +address.getHostName());
		System.out.println(new String(data, 0 ,length));
		 // �ͷ���Դ
		ds.close();

	}

}
