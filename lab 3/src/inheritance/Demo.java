package inheritance;
import java.util.Scanner;
public class Demo{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		int age=scan.nextInt();
		double phoneno=scan.nextDouble();
		String address=scan.next();
		float salary=scan.nextFloat();
		String expertise=scan.next();
		String departmentType=scan.next();
		Employee e=new Employee();
		e.setName(name);
		e.setAge(age);
		e.setPhoneno(phoneno);
		e.setAddress(address);
		e.setSalary(salary);
		//e.Department(departmentType);
		//e.Officer(expertise);
		System.out.println("Name is"+e.name);
		System.out.println("Age is"+e.age);
		System.out.println("Phone No is"+e.phoneno);
		System.out.println("Address"+e.address);
		System.out.println("Salary is"+e.address);
		System.out.println("Expert in"+e.expertise);
		System.out.println("Department is"+e.departmentType);
	}
}