package cn.luoziyuan.homework.day07;

import java.io.File;
import java.io.IOException;

/**
 * @author mr.j
 * 首先递归创建一个文件夹，在其中放入文件夹和文件
 *2.递归删除一个文件夹
 */
public class Work02 {
	public static void main(String[] args) throws IOException {
		creatFilesAndDirs();
		String pathname = "a";
		//String pathname1 = "a//c";
		File file = new File(pathname);
		//File file1 = new File(pathname1);
		//File[] files = file1.listFiles();
		//System.out.println(files.length);
/*		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getAbsolutePath());
		}*/
		//System.out.println(file.getAbsolutePath());
		deletFilesAndDirs(file);
		
		
	}

	/**
	 * @param file
	 * 递归删除一个文件夹及其目录下所有文件
	 */
	private static void deletFilesAndDirs(File file) {
		// TODO Auto-generated method stub
		if (file.isDirectory()&&file.exists()) {
			File[] files = file.listFiles();
			if (files.length!=0) {
				for (int i = 0; i < files.length; i++) {
					if (files[i].isDirectory()) {
						deletFilesAndDirs(files[i]);
					}else {
						files[i].delete();
					}
				}
			}else {
				file.delete();	
			}
		}
		file.delete();	
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
		File file3 = new File(pathname3);
		File file = new File(pathname);
		File file1 = new File(pathname1);
		File file2 = new File(pathname2);
		
		//System.out.println(file.getAbsolutePath());
		file.mkdirs();
		file1.createNewFile();
		file2.createNewFile();
		file3.mkdir();
	}

}
