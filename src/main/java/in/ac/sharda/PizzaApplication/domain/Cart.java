package in.ac.sharda.PizzaApplication.domain;

import java.util.List;
import java.util.ArrayList;

public class Cart {

	private List<Product>products=new ArrayList<>();
	public void addProduct(Product product) 
	{
		this.products.add(product);
	}
}
