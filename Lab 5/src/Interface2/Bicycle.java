package Interface2;

public class Bicycle implements Vehicle{
	int mileage;
	int numGears;
	public Bicycle(int milage,int numGears) {
		this.mileage=mileage;
		this.numGears=numGears;
	}
	public int numofGears() {
		return numGears;
	}
	public double tuneupcost() {
		return 0;
	}
	public boolean canCarry(int numpassengers) {
		return true;
	}
}
