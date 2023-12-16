package Exception;
import java .util.Scanner;
public class Division {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to find its divisor");
		int a=scan.nextInt();
		System.out.println("Enter a number as divider");
		int b=scan.nextInt();
		try{
			System.out.println(a/b);
		}
	catch(Exception alok)  {
		System.out.println(alok);
	}
	scan.close();
	}
	
}
