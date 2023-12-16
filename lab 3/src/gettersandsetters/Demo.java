package gettersandsetters;
import java.util.Scanner;
public class Demo {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Name of holiday");
		String name= scan.nextLine();
		System.out.println("Enter the date of holiday");
		int day= scan.nextInt();
		System.out.println("Enter the Name of month of holiday");
		String month=scan.next();
		Holiday holi=new Holiday();
		holi.setName(name);
		holi.setDay(day);
		holi.setMonth(month);
		holi.setholiday(true);
		if(holi.getholiday()==true){
			System.out.println("Holiday is given");
		}
		else{
			System.out.println(" holiday not given");
		}
	}	
}
