package cn.luoziyuan.homework.day09.tcpDemo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author mr.j
 *ʹ��tcpЭ�鷢������
 *		ʹ�÷��Ͷ�Socket���󣨴������ӣ�
 *		��ȡ���������
 *		��������
 *		�ͷ���Դ
 *Exception in thread "main" java.net.ConnectException: Connection refused: connect
 *tcpЭ����Ҫ��������
 */
public class CilentDemo {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub

//		 *		ʹ�÷��Ͷ�Socket���󣨴������ӣ�
		Socket s = new Socket(InetAddress.getByName("luoziyuan"), 8090);
//  	 *		��ȡ���������
		OutputStream os= s.getOutputStream();
//		 *		��������
		String str = " hello im jiashihai  im coming";
		os.write(str.getBytes());
		InputStream is =  s.getInputStream();
		byte[] bys = new byte[1024];
		int len =is.read(bys ); 
		System.out.println(new String(bys, 0 ,len));
//		 *		�ͷ���Դ
		os.close();
		s.close();

	}

}
