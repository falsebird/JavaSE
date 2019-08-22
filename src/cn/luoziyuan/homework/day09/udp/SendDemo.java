package cn.luoziyuan.homework.day09.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * @author mr.j
 * 使用UDP协议
 * 创建发送端socket对象
 * 创建数据，并打包
 * 发送数据
 * 释放资源
 * 
 */
public class SendDemo {

	/**
	 * @param args
	 *  DatagramSocket此类表示用来发送和接收数据报包的套接字。 

	 * DatagramSocket(int port) 
          创建数据报套接字并将其绑定到本地主机上的指定端口。
          DatagramSocket() 
          构造数据报套接字并将其绑定到本地主机上任何可用的端口。
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		 //创建发送端socket对象
		DatagramSocket dSocket = new DatagramSocket();
		
		 // 创建数据，并打包
		/*
		 * DatagramPacket: 此类表示数据包
		 * 数据byte[]
		 * 设备地址 ip
		 * 进程的地址： 端口号
		 * DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		 */
		String s= "你好啊， 我叫贾世海";
		byte[] bys = s.getBytes();
		int length = bys.length;
		InetAddress inetAddress = InetAddress.getByName("luoziyuan");
		
		int port = 8090;
		
		DatagramPacket dPacket = new DatagramPacket(bys, length, inetAddress, port);
		  //发送数据
		dSocket.send(dPacket);
		 // 释放资源
		dSocket.close();
	}
}
