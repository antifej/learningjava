package pd;
import java_enum.Genre;
import Java_class.Movie;
import java.util.ArrayList;
import java.util.Scanner;
public class pd8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		Movie movie1 = new Movie(" Terminator 2 ", 1.20, Genre.Sci_Fi, false);
		
		Movie movie2 = new Movie(" Anabell ", 1.29, Genre.Horror, false);
		Movie movie3 = new Movie(" White chiks ", 1.47, Genre.Comedy, false);
		Movie movie4 = new Movie(" Pinochio", 1.50, Genre.Animation, false);
		Movie movie5 = new Movie(" Paradise", 1.38, Genre.Action, true);
		Movie movie6 = new Movie(" Spiderman", 2.03, Genre.Superhero, false);
		movieList.add(movie1);
		movieList.add(movie2);
		movieList.add(movie3);
		movieList.add(movie4);
		movieList.add(movie5);
		movieList.add(movie6);
		
		for (Movie movie : movieList) {
			movie.printAboutMovie();
		}

        for (Movie movie : movieList) {
        	if(movie.movieGenre == Genre.Horror) {
        		System.out.println("Horror movie is "+ movie.name);
        	}
        }
        Scanner sk1 = new Scanner (System.in);
        System.out.println("Enter age");
        int age = sk1.nextInt();
        for (Movie movie : movieList) {
        	movie.canWatch(age);
        }
		
        
        System.out.print("Movie that longer than 1.06");
        
       for(Movie movie : movieList) {
    	   if(movie.movieLenght >= 1.06) {
    		   System.out.println(movie.name);
    	   }
    	   
       }
       int movieCount = 0;
       for(Movie movie : movieList) {
    	   if(movie.isForAdults == false) {
    		   movieCount++;
    	   }
       }
       System.out.println("Movie that are for everyone " + movieCount);
	}
	

}
