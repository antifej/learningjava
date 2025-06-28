package Lessons_class;
import Java_class.Product;
public class Lesson32 {
//27.05.2025
	//Class objects
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product myProduct = new Product();
		//System.out.println("My product name is " + myProduct.productName);
		//System.out.println("My product price is " + myProduct.price);
		myProduct.printProductDescription();
		//TV LG OLED 55, 299.99
		Product productTv = new Product();
		productTv.productName = "TV LG OLED 55";
		productTv.price = 299.99;
		//System.out.println("Product name " +productTv.productName +".Price " +productTv.price);
		productTv.printProductDescription();
		//product
		
		
		Product noteBook = new Product();
		noteBook.productName = "Notebook MSI";
		noteBook.price = 1050;
		//System.out.println("Product name " +noteBook.productName +".Price " +noteBook.price);
        noteBook.printProductDescription();
        
        //Fridge Standart, 240
        //Tea Can, 30
        
        Product fridge = new Product();
        fridge.productName = "Standart";
        fridge.price = 240;
        fridge.printProductDescription();
        
        
        Product tea = new Product();
        tea.productName = "Can";
        tea.price = 30;
        tea.printProductDescription();
        
	}

}
