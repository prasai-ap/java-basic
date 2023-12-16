package Interface2;

public  class Car implements Vehicle {
	int mileage;
	int numDoors;
	public Car(int milage,int numDoors) {
		this.mileage=mileage;
		this.numDoors=numDoors;
	}
	public double tuneupcost() {
		return 0;
	}
	public boolean canCarry(int numpassengers) {
		return true;
	}
	public int numOfDoors() {
		return numDoors;
	}
}
