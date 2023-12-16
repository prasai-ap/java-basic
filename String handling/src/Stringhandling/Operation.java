package Stringhandling;
import java.util.Scanner;
public class Operation {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		String var1,var2,l;
		int n;
		System.out.println("Enter First String");
		var1=scan.next();
		System.out.println("Enter Second String");
		var2=scan.next();
		l=var1.concat(var2);
		System.out.println("Concated Strong is"+l);
		System.out.println(var1.toUpperCase());
		if(var1.equals(var2)) {
			System.out.println("Strings are equal");
		}
		n=l.length();
		System.out.println("Length of concated String is"+n);
		StringBuilder b=new StringBuilder();
		b.append(var1);
		b.reverse();
		System.out.println(b);
		scan.close();
	}
}