package cn.luoziyuan.homework.day04.work04;

public class Shirt extends Clothes {
	private String brand;
	private double price;
	private String color;
	private  final String FEACHER = "Плзг";
	@Override
	public void puton() {
		// TODO Auto-generated method stub

	}

	public Shirt(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public Shirt() {
		super();
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

	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

	public String getFEACHER() {
		return FEACHER;
	}
	

}
