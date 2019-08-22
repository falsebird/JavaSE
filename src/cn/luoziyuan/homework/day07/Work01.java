package cn.luoziyuan.homework.day07;

import java.io.File;
import java.io.IOException;

public class Work01 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				String pathname = "..\\..\\a";
				File file = new File(pathname);
				System.out.println();
				//System.out.println(file.exists());
				//System.out.println(file.isFile());//只有在文件存在时候才能判断是否为文件
				//System.out.println(file.isAbsolute());
				//System.out.println(file.isDirectory());//只有在文件夹存在时候才能判断是否为文件
				//creatNewFile(file);
				//file.mkdir();
				System.out.println(file.getAbsolutePath());
				

	}


	private static void creatNewFile(File file) throws IOException {
		if (!file.exists()) {
			file.createNewFile();	
			System.out.println("创建成功");
		}
	}

}
