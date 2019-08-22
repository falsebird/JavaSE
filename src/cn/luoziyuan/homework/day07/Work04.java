package cn.luoziyuan.homework.day07;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mr.j
 *4.递归找出文件夹下所有的.java文件;
 */
public class Work04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src");
		List<File> files = new ArrayList<File>();
		getAllJavaFile(files ,file);//获取所有的.java文件
		for (Iterator<File> iterator = files.iterator(); iterator.hasNext();) {
			File file1 = (File) iterator.next();
			System.out.println(file1.getAbsolutePath());
		}
	}
	/**
	 * @param files
	 * @param file
	 * 递归的查找一个文件夹内所有的.java文件
	 */
	private static void getAllJavaFile(List<File> files ,File file) {
		// TODO Auto-generated method stub
		if (file.exists()) {//当文件名存在才进行下面的操作
			if (file.isDirectory()) {//当一file是一个文件夹时，分别处理文件夹下的内容
				File[] filess = file.listFiles();
				for (int i = 0; i < filess.length; i++) {
					if (filess[i].isDirectory()) {//当filess[i]是文件夹是递归处理
						getAllJavaFile(files, filess[i]);
					}else if (isJavaFile(filess[i])) {//当这个文件是文件且符合条件时存入
						files.add(filess[i]);	
					}
				}
			}else  {
				if (isJavaFile(file)) {//当这个文件是文件且符合条件时存入
					files.add(file);
				}
			}	
		}
	}
	/**
	 * @param file
	 * @return
	 * 判断一个文件是否是
	 */
	public static boolean isJavaFile(File file){
		String pathname = file.getName();
		return pathname.endsWith(".java");
	}
	
}
