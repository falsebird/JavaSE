package cn.luoziyuan.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToFileTest {
	/*
	 * ����¼��3��ѧ����Ϣ(ѧ��,����,����,��ס��)���뼯�ϡ�Ȼ��������ϰ�ÿһ��ѧ����Ϣ�����ı��ļ�(ÿһ��ѧ����ϢΪһ�����ݣ��Լ�����ָ���)
	 * 
	 * ������
	 * 		A:����ѧ����
	 * 		B:�������϶���
	 * 		C:д����ʵ�ּ���¼��ѧ����Ϣ������ѧ��������ΪԪ����ӵ�����
	 * 		D:�����������������
	 * 		E:��������,�õ�ÿһ��ѧ����Ϣ������ѧ����Ϣ����һ���ĸ�ʽд���ı��ļ�
	 * 			������heima001,������,30,����
	 * 		F:�ͷ���Դ
	 */
	
	public static void main(String[] args) throws IOException {
		String filename = new String("text.txt");
		
		ArrayList<Student> studentLis = new ArrayList<Student>();
		BufferedWriter bw =  new BufferedWriter( new FileWriter(filename ));
		addstudents(studentLis);
		addstudents(studentLis);
		addstudents(studentLis);
		 int i = 0;
		while (i < studentLis.size()){
			bw.write(studentLis.get(i).toString());
			bw.newLine();
			bw.flush();
			
			i++;
		}
		bw.close();
		
	}
	public static void addstudents(ArrayList<Student> list){
			Scanner in = new Scanner(System.in);
			boolean flag = false; 
			System.out.println("�����밴˳������ѧ����ѧ�ţ����������䣬��ϵ��ַ");
			System.out.println("������id");
			String id;
			while(true){       
				id = in.nextLine();
				if(list.size()==0){
					
				}
				for(int j = 0 ; j < list.size() ; j ++){
					if ( id.equals(list.get(j))){
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println("�����ѧ���ظ�,����������");
				}else{
					break;
				}
				
			}
			
			System.out.println("����������");
			String name = in.nextLine();
			System.out.println("����������");
			String age = in.nextLine();
			System.out.println("��������ϵ��ַ");
			String address = in.nextLine();
			Student s = new Student(id, name, age, address);
			list.add(s);
			System.out.println("���ѧ���ɹ�");
			in.close();
	}

}
