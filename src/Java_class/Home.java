package Java_class;
import java_enum.HomeType;
public class Home {
	public String adress;
	public HomeType type;
	
	public Home(String adress, HomeType type) {
		this.adress = adress;
		this.type = type;
		
		
	}
	public void printInfoAboutHome() {
		System.out.println(this.type +"is located" +this.adress);
	}

}
