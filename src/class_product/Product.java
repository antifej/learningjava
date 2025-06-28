package class_product;

public class Product {
	public String name;
	public double price;
	
	
	protected Product(String name,double price) {
		this.name = name;
		this.price = price;
	
		System.out.println(this.name + "created ");
	}

}
