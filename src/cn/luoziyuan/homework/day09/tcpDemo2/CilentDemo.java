package cn.luoziyuan.homework.day09.tcpDemo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author mr.j ʹ��tcpЭ�鷢������ ʹ�÷��Ͷ�Socket���󣨴������ӣ� ��ȡ��������� �������� �ͷ���Դ Exception in
 *         thread "main" java.net.ConnectException: Connection refused: connect
 *         tcpЭ����Ҫ��������
 *
 *         �ͻ���: 1.��ʾ�û������û���������,���û�������û��������뷢�͸������ 2.���շ������֤���û���������Ľ��
 * 
 */
public class CilentDemo {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub

		// * ʹ�÷��Ͷ�Socket���󣨴������ӣ�
		Socket socket = new Socket("luoziyuan", 8090);
		//��ȡ�û���������
		BufferedReader brReader= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�������û���������");
		System.out.println("�û�����");
		String  username = brReader.readLine();
		System.out.println("���룺");
		String  password=brReader.readLine();
		
		brReader.close();

		// * ��ȡ���������
		// PrintWriter ���ı��������ӡ����ĸ�ʽ����ʾ��ʽ
		// PrintWriter(OutputStream out, boolean autoFlush) ͨ�����е� OutputStream �����µ� PrintWriter��
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter pw = new PrintWriter(socket.getOutputStream() ,true);
		// * ��������
		//void println(String x)  ��ӡ String��Ȼ����ֹ���С� 
		pw.println(username);
		pw.println(password);
		System.out.println(username);
		System.out.println(password);
		pw.flush();
		//��ȡ����������
		BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String con = br.readLine();
		System.out.println(con);
		// * �ͷ���Դ
		//os.close();
		br.close();
		pw.close();
		socket.close();

	}

	

}
