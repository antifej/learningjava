package Java_class;
import java_enum.Genre;
public class Movie {
	
	public  String name;
	public double movieLenght;
	public Genre movieGenre;
	public boolean isForAdults;
	
	public Movie(String name, double movieLenght, Genre movieGenre, boolean isForAdults) {
		this.name = name;
		this.movieLenght = movieLenght;
		this.movieGenre = movieGenre;
		this.isForAdults = isForAdults;
		System.out.println("Movie"+ this.name + "created ");
	}
	public void printAboutMovie() {
		System.out.println("Name -"+ this.name + "Movie lenght" + this.movieLenght + "Genre -"+ this.movieGenre +"Is for adults "+ this.isForAdults);
		
		
	}
	public void canWatch(int age) {
		if( age >= 18) {
			System.out.println("You can watch this movie" +this.name);
			
		}else if(age < 18 && age > 6 && this.isForAdults) {
			System.out.println("you can not watch this movie" + this.name);
		}else {
			System.out.println("You can watch this movie" + this.name);
		}
	}
	

}
