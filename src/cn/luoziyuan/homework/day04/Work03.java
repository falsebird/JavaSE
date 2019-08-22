package cn.luoziyuan.homework.day04;

import java.util.ArrayList;
import java.util.List;

import cn.luoziyuan.homework.day04.work03.Person;
import cn.luoziyuan.homework.day04.work03.Student;

/**
 * @author mr.j (1)����Person�����������String name�����䣺int age���ɼ���int score�����ɿղΡ��вι��졢
 *         set��get������toString���� (2)����Student��̳�Person��������Person����ͬ
 *         (3)�鿴API��ArrayList�����е����·����� ��a��boolean add(E e) ���� ��b��<T> T[]
 *         toArray(T[] a)���� ��c��boolean addAll(Collection<? extends E> c)����
 *         (4)ͨ���鿴API�����Ϸ�����ѧϰ��������¹��� a.
 *         ArrayList�����д���5��Student���󣬽�ArrayList����ת�ɶ�Ӧ������Studentp[]�� ��������ӡ�����е�Ԫ��
 *         b. ����һ���洢Person�����ArrayList���϶���list1��������2��Person����
 *         ����һ���洢Student�����ArrayList���϶���list2��������2��Student����
 *         ����addAll������list2��ȫ��������ӵ�list1�У�������ӡlist1�е�����
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
			Student student = new Student("������"+i, 20 - 1-i, 100-i);
			list.add(student);
		}
	}
	public static void addPerson(List<Person> list) {
		for (int i = 0; i < 5; i++) {
			Person student = new Person("������"+i, 20 - 1-i, 100-i);
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
