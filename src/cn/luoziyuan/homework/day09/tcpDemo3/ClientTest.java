package cn.luoziyuan.homework.day09.tcpDemo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientTest {
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
