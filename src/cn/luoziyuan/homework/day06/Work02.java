package cn.luoziyuan.homework.day06;

/**
 * @author mr.j
 *2.����Person��, Person�����������������, �ڸ�Person�������ֵ�ʱ��,����Ǹ������ߴ���150��ʱ��
 ���׳�"AgeOutOfBoundsException(��Ҫ�Լ�����)"�쳣��������
 */
public class Work02 {
	public static void main(String[] args) throws AgeOutOfBoundsException {
		Person person1 = new Person(160);
		Person person2 = new Person();
		person2.setAge(152);
		
	}

}
