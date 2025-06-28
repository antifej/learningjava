package class_product;

public class Clothe extends Product  {
	public boolean isNew;
	public String size;
	
	public Clothe(String name,double price, boolean isNew, String size ) {
		super(name, price );
		this.isNew = isNew;
		this.size = size;
		
		System.out.println(super.name + " is created! ");
	}

}
