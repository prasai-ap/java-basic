package Exception;
import java.util.Scanner;
public class Arrayexcep {
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	long[] data=new long[1000000000];
	try {
		System.out.println(data[1000000000]);
	}
	catch(Exception Sujan) {
		System.out.println(Sujan);
	}
	scan.close();	
	}
	
}
