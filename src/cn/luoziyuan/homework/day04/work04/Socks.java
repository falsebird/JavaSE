package cn.luoziyuan.homework.day04.work04;

public class Socks extends Clothes{
	private String brand;
	private double price;
	private String color;
	private  final String FEACHER = "¶´";
	@Override
	public void puton() {
		// TODO Auto-generated method stub
		
	}
	public Socks(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public Socks() {
		super();
	}
	@Override
	public String toString() {
		return "Socks [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFEACHER() {
		return FEACHER;
	}
	

}
