package cn.luoziyuan.homework.day04;

import java.util.ArrayList;
import java.util.List;

import cn.luoziyuan.homework.day04.work03.Person;
import cn.luoziyuan.homework.day04.work03.Student;

/**
 * @author mr.j (1)定义Person类包含姓名：String name、年龄：int age、成绩：int score，生成空参、有参构造、
 *         set和get方法、toString方法 (2)定义Student类继承Person，属性与Person类相同
 *         (3)查看API中ArrayList集合中的以下方法： （a）boolean add(E e) 方法 （b）<T> T[]
 *         toArray(T[] a)方法 （c）boolean addAll(Collection<? extends E> c)方法
 *         (4)通过查看API对以上方法的学习，完成以下功能 a.
 *         ArrayList集合中存入5个Student对象，将ArrayList集合转成对应的数组Studentp[]， 并遍历打印数组中的元素
 *         b. 定义一个存储Person对象的ArrayList集合对象list1，并出入2个Person对象，
 *         定义一个存储Student对象的ArrayList集合对象list2，并出入2个Student对象，
 *         调用addAll方法将list2的全部内容添加到list1中，遍历打印list1中的内容
 */
public class Work03 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		addStudent(list);
		//traversal(list);
		Student[] students = new Student[5];
		list.toArray(students);
		 //traversal(students);
		 ArrayList<Person> list1 = new ArrayList<>();
		 ArrayList<Student> list2 = new ArrayList<Student>();
		 addPerson(list1);
		 addStudent(list2);
		 //traversal(list1);
		 //traversal(list2);
		 list1.addAll(list2);
		 traversal(list1);
	}

	public static void addStudent(List<Student> list) {
		for (int i = 0; i < 5; i++) {
			Student student = new Student("贾世海"+i, 20 - 1-i, 100-i);
			list.add(student);
		}
	}
	public static void addPerson(List<Person> list) {
		for (int i = 0; i < 5; i++) {
			Person student = new Person("贾世海"+i, 20 - 1-i, 100-i);
			list.add(student);
		}
	}

	public static <T> void traversal(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}

	public static void traversal(List<?> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

	}
}
