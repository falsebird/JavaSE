package cn.luoziyuan.homework.day02.work02;

/**
 * @author mr.j
 *司机类,司机有名字,车龄,司机可以开车,如果车龄操作5年的才可以开大众,
	  如果车龄没有操作五年的只能开本田,
 */
public class Driver {
	private String name;
	private int driveAge;
	public Driver(String name, int driveAge) {
		super();
		this.name = name;
		this.driveAge = driveAge;
	}
	public Driver() {
		super();
	}
	//开车的方法
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDriveAge() {
		return driveAge;
	}
	public void setDriveAge(int driveAge) {
		this.driveAge = driveAge;
	}
	

}
