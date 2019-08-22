package cn.luoziyuan.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToFileTest {
	/*
	 * 键盘录入3个学生信息(学号,姓名,年龄,居住地)存入集合。然后遍历集合把每一个学生信息存入文本文件(每一个学生信息为一行数据，自己定义分割标记)
	 * 
	 * 分析：
	 * 		A:定义学生类
	 * 		B:创建集合对象
	 * 		C:写方法实现键盘录入学生信息，并把学生对象作为元素添加到集合
	 * 		D:创建输出缓冲流对象
	 * 		E:遍历集合,得到每一个学生信息，并把学生信息按照一定的格式写入文本文件
	 * 			举例：heima001,向问天,30,北京
	 * 		F:释放资源
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
			System.out.println("请输入按顺序输入学生的学号，姓名，年龄，联系地址");
			System.out.println("请输入id");
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
					System.out.println("输入的学号重复,请重新输入");
				}else{
					break;
				}
				
			}
			
			System.out.println("请输入姓名");
			String name = in.nextLine();
			System.out.println("请输入年龄");
			String age = in.nextLine();
			System.out.println("请输入联系地址");
			String address = in.nextLine();
			Student s = new Student(id, name, age, address);
			list.add(s);
			System.out.println("添加学生成功");
			in.close();
	}

}
