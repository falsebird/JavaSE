package cn.luoziyuan.homework.day09.tcpDemo3;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
	private static List<User> userList = new ArrayList<User>();
	static	{
		userList.add(new User("jiashihai", "123"));
		userList.add(new User("gaoziya", "1234"));
		userList.add(new User("wangxu", "1234"));
		userList.add(new User("yinchuanyue", "12345"));
	}
	public static List<User> getUserList(){
		return userList;
	}
	

}
