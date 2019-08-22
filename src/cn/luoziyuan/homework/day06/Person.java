package cn.luoziyuan.homework.day06;

public class Person {
	 private int age ;

	public Person() {
		super();
	}

	public Person(int age) throws AgeOutOfBoundsException {
		super();
		if (ifAgeOutOfBounds(age)) {
			throw  new AgeOutOfBoundsException();
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeOutOfBoundsException {
		if (ifAgeOutOfBounds(age)) {
			throw  new AgeOutOfBoundsException();
		} else {
			this.age = age;
		}
		
	}
	/**
	 * @param age
	 * @return µ±ÄêÁä³¬¹ı·¶Î§·µ»Øtrue
	 */
	private static boolean ifAgeOutOfBounds(int age){
		if (age>0&&age<150) {
			return false;
		}
		return true;
	}

}
