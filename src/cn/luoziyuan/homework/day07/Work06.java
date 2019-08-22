package cn.luoziyuan.homework.day07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author mr.j
 *6.通过字节流复制一张图片

 */
public class Work06 {
	public static void main(String[] args) throws IOException {
		File src = new File("rosi-2462-028.jpg");
		File dest1 = new File("rosi-2462-028(1).jpg");
		File dest2 = new File("rosi-2462-028(2).jpg");
		Long current1 = System.currentTimeMillis();
		copyFileOnByte(src, dest1);
		Long current2 = System.currentTimeMillis();
		copyFileOnBytes(src, dest2);
		Long current3 = System.currentTimeMillis();
		System.out.println("通过复制字符复制文件的时间："+(current2-current1));//61
		System.out.println("通过复制字符数组复制文件的时间："+(current3-current2));//3
	}

	public static void copyFileOnByte(File src, File dest) throws IOException{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		
		int b = 0;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		
		fis.close();
		fos.close();
	}
	public static void copyFileOnBytes(File src, File dest) throws IOException{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
			
		int len = 0;
		byte[] bytes = new byte[1024];
		while((len = fis.read(bytes))!=-1){
			fos.write(bytes, 0,  len);
		}
		fis.close();
		fos.close();
	}
}
