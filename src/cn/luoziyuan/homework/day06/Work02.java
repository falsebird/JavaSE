package cn.luoziyuan.homework.day06;

/**
 * @author mr.j
 *2.定义Person类, Person类里面有年龄的属性, 在给Person设置名字的时候,如果是负数或者大于150的时候
 请抛出"AgeOutOfBoundsException(需要自己定义)"异常给调用者
 */
public class Work02 {
	public static void main(String[] args) throws AgeOutOfBoundsException {
		Person person1 = new Person(160);
		Person person2 = new Person();
		person2.setAge(152);
		
	}

}
