package gettersandsetters;

import java.util.Scanner;
public class MovieDemo {
	public static void main(String[]args){
		String title;
		String maleactor;
		String femaleactor;
		String genre;
		float rating;
		int budget;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Name of movie");
		title= scan.nextLine();
		System.out.println("Enter the name of male actor");
		 maleactor= scan.next();
		System.out.println("Enter the Name of female actor");
		femaleactor=scan.next();
		System.out.println("Enter the genre of movie");
		genre= scan.next();
		System.out.println("Enter the rating of movie");
		rating= scan.nextFloat();
		System.out.println("Enter the budget of movie");
		budget= scan.nextInt();
		Movie mov=new Movie();	
		mov.setTitle(title);
		mov.setMaleActor(maleactor);
		mov.setFemaleActor(femaleactor);
		mov.setGenre(genre);
		mov.setRating(rating);
		mov.setBudget(budget);
		System.out.println("Name of movie"+mov.getTitle());
		System.out.println("male actor in movie"+mov.getMaleActor());
		System.out.println("female actor in movie"+mov.getFemaleActor());
		System.out.println("genre of movie"+mov.getGenre());
		System.out.println("Rating of movie"+mov.getRating());
		System.out.println("Budget of movie"+mov.getBudget());
	}

}
