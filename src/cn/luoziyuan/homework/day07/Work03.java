package cn.luoziyuan.homework.day07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author mr.j
 *递归统计一个文件夹的大小
 */
public class Work03 {

	public static void main(String[] args) throws IOException {
		//creatFilesAndDirs();
		String pathname = "a";
		//String pathname1 = "a//c";
		File file = new File(pathname);
		String pathname1 = "a//b//c.txt";
		File file1 = new File(pathname1);
		//addContent();
		String pathname3 = "a//c";
		File file3 = new File(pathname3);
		System.out.println(getLenght(file3));
	}

	private static long getLenght(File file) {
		// TODO Auto-generated method stub
		if (file.exists()) {
			if (file.isDirectory()) {
				long length = 0;
				File[] files = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					length +=getLenght(files[i]);
				}
				return length;
			}else  {
				return file.length();
			}	
		}
		return 0;
	}

	private static void addContent() throws IOException {
		String pathname2 = "a//c.txt";
		String pathname1 = "a//b//c.txt";
		File file2 = new File(pathname2);
		File file1 = new File(pathname1);
		FileWriter fw2 = new FileWriter(file2);
		FileWriter fw1 = new FileWriter(file1);
		fw2.append("测试测试测试测试测试");
		fw1.append("测试测试测试测试测试");
		
		fw1.close();
		fw2.close();
	}
	
	/**
	 * @throws IOException
	 * 创建个拥有子文件夹个文件的文件夹
	 */
	private static void creatFilesAndDirs() throws IOException {
		String pathname = "a//b//c";
		String pathname1 = "a//b//c.txt";
		String pathname2 = "a//c.txt";
		String pathname3 = "a//c";
		File file = new File(pathname);
		File file1 = new File(pathname1);
		File file2 = new File(pathname2);
		File file3 = new File(pathname3);
		//System.out.println(file.getAbsolutePath());
		file.mkdirs();
		file1.createNewFile();
		file2.createNewFile();
		file3.mkdir();
	}
}
