package Interface2;

public class VehicleDemo {
	public static void main(String[]args) {
		Car c=new Car(20,5);
		System.out.println("No of doors of a car"+" "+c.numOfDoors());
		Bicycle b=new Bicycle(26,3);
		System.out.println("No of gears of bicycle"+" "+b.numofGears());
	}

}
