package class_product;

public class Food extends Product {
	public double weight;
	public boolean isHealthy;
	
	public Food(String name, double price,double weight, boolean isHealthy) {
		super(name, price);
		this.weight = weight;
		this.isHealthy = isHealthy;
		
		 System.out.println(super.name + "is created ");
	}

}
