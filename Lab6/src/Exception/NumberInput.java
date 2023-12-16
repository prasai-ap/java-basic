package Exception;
import java.util.Scanner;
public class NumberInput {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number as input");
		int a;
		try{
			a=scan.nextInt();
		}
		catch (Exception harry) {
			//System.out.println(harry);
			harry.printStackTrace();
		}
		finally {
			System.out.println("Finally block");
		}
		scan.close();
	}
}
