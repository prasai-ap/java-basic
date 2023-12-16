package classandobjects;
//import java.util.Scanner;
public class Demo {
		public static void main(String[] args) {
			 Student std = new Student(1,"Aayus","Makalbari",69,"APEX");
			 Student std1 = new Student();
//	 Scanner scan = new Scanner(System.in);
// 			 int r =scan.nextInt();
//			 String n = scan.next();
//			 String a = scan.next();
//			 float w = scan.nextFloat();
//			 std.setRoll(r);
//			 std.setName(n);
//			 std.setAddress(a);
//			 std.setWeight(w);
			 System.out.println("Roll : "+std.getRoll());
			 System.out.println("College Name"+std.getCollegeName());
			 System.out.println("Name : "+std.getName());
			 System.out.println("Address : "+std.getAddress());
			 System.out.println("Weight : "+std.getWeight());
			 System.out.println("Roll : "+std1.getRoll());
			 System.out.println("College Name"+std1.getCollegeName());
			 System.out.println("Name : "+std1.getName());
			 System.out.println("Address : "+std1.getAddress());
			 System.out.println("Weight : "+std1.getWeight());
		}
		
}

