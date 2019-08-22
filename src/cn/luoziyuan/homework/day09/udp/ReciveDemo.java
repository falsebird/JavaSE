package cn.luoziyuan.homework.day09.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author mr.j
 * 使用UDP协议
 * 创建接收端端socket对象
 * 接收数据
 * 解析数据
 * 输出接受数据
 * 释放资源
 * 
 * 注意端口号！！！！
 */
public class ReciveDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建接收端端socket对象
		DatagramSocket ds = new DatagramSocket(8090);
		
		 //* 接收数据
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		System.out.println(1);
		ds.receive(dp); //阻塞
		System.out.println(2);
		 //* 解析数据
		
		
		InetAddress address = dp.getAddress();//获取发送端的ip对象
		 //获取接收到的数据，也可以直接使用创建包对象时候的数组
		byte[] data = dp.getData();
		//获取收到数据的具体长度
		int length = dp.getLength();
		
		
		 //* 输出接受数据
		System.out.println("sender---------------->" +address.getHostName());
		System.out.println(new String(data, 0 ,length));
		 // 释放资源
		ds.close();

	}

}
