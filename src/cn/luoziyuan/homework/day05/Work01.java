package cn.luoziyuan.homework.day05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author mr.j
 *1.创建Star明星这个类,名字相同我们认为是同一个明星,键盘若干个名字,通过名字创建明星,
将明星存储到适当的集合中,保证明星的唯一性
2.说明HashSet能够去重的原因;
规则:新添加到HashSet集合的元素都会与集合中已有的元素一一比较
        首先比较哈希值(每个元素都会调用hashCode()产生一个哈希值)
             如果新添加的元素与集合中已有的元素的哈希值都不同,新添加的元素存入集合
             如果新添加的元素与集合中已有的某个元素哈希值相同,此时还需要调用equals(Object obj)比较
                   如果equals(Object obj)方法返回true,说明新添加的元素与集合中已有的某个元素的属性值相同,
                   那么新添加的元素不存入集合
                   如果equals(Object obj)方法返回false, 说明新添加的元素与集合中已有的元素的属性值都不同, 
                   那么新添加的元素存入集合

 */
public class Work01 {
	public static void main(String[] args) {
		
		Set<Star> stars = new HashSet<Star>();
		getStarts(stars);
		traversal(stars);
	}

	private static void getStarts(Set<Star> stars) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			String name = scanner.nextLine();
			stars.add(new Star(name));
		}
		scanner.close();
	}
	public static void traversal(Set<?> sets) {
		
	for (Iterator<?> iterator = sets.iterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		System.out.println(object.toString());
	}
		
	}

}
