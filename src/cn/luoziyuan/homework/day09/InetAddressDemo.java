package cn.luoziyuan.homework.day09;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author mr.j
 *inetAddress :此类表示代表ip地址
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getByName("luoziyuan");//192.168.109.1
		//InetAddress address = InetAddress.getByName("贾世海");
		//InetAddress address2 = InetAddress.getByName("192.168.109.1");
		//System.out.println(address.getHostAddress());
		//System.out.println(address2.getHostAddress());
		String hostAddress= address.getHostAddress();
		String hostName = address.getHostName();
		System.out.println(hostAddress);
		System.out.println(hostName);
	}

}
