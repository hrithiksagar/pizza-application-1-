package in.ac.sharda.PizzaApplication.domain;

public class Product {

	private int id;
	private int price;
	private String name,desc;
	
	public Product(int id, int price, String name, String desc) {
		this.id = id;
		this.price = price;
		this.name = name;
		this.desc = desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
