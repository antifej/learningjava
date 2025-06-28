package Java_class;
import java_enum.Console;

public class ComputerGame {
	public String gameName;
	public double gamePrice;
	public Console gameConsole;
	public boolean isFree;
	
	
	public ComputerGame(String name, double price, Console console, boolean isFree) {
		this.gameName = name;
		this.gamePrice = price;
		this.gameConsole = console;
		this.isFree = isFree;
		
		System.out.println("Game " +this.gameName +" is created!");
	}
	
	public boolean buyGame(double money) {
		if(this.isFree) {
			return true;
			
		}else {
			if(money >= this.gamePrice) {
				return true;
			}
			return false;
		}
	}
	
	public void printInformationAboutGame() {
		System.out.println("Game Name:"+ this.gameName+
							"\n Game Price " +this.gamePrice +
							"\n Game Console " + this.gameConsole +
							"\n is Free " + this.isFree);
		System.out.println("----------------------------------------");
		
		
	}
	
	
}
