package inheritance;

public class Officer extends Employee {
	String expertise;
	public void setOfficer(String expertise){
		this.expertise=expertise;
	}
	public String getOfficer() {
		return expertise;
	}
}
