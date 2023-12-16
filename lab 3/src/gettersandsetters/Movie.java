package gettersandsetters;

public class Movie {
	String title;
	String maleactor;
	String femaleactor;
	String genre;
	float rating;
	int budget;
	public void setTitle(String title){
		this.title=title;
	}
	public void setMaleActor(String maleactor){
		this.maleactor=maleactor;
	}
	public void setFemaleActor(String femaleactor) {
		this.femaleactor=femaleactor;
	}
	public void setGenre(String genre){
		this.genre=genre;
	}
	public void setRating(float rating){
		this.rating=rating;
	}
	public void setBudget(int budget){
		this.budget=budget;
	}
	public String getTitle() {
		return title;
	}
	public String getMaleActor() {
		return maleactor;
	}
	public String getFemaleActor() {
		return femaleactor;
	}
	public String getGenre() {
		return genre;
	}
	public float getRating() {
		return rating ;
	}
	public int getBudget() {
		return budget;
	}
		
		
}
