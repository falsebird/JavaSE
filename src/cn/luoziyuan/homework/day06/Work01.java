package cn.luoziyuan.homework.day06;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author mr.j
 *1.�ֶ�ʵ��FileWriter ��try catch�쳣������ʽ������ģʽ
 */
public class Work01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw;
		try {
			 fw = new FileWriter("a.txt");
			 fw.write("aaa");
			 fw.flush();
			 fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
