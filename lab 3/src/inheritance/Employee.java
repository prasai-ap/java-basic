package inheritance;

public class Employee {
	String name;
	int age;
	double phoneno;
	String address ;
	float salary;
	String expertise;
	String departmentType;
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setPhoneno(double phoneno){
		this.phoneno=phoneno;
	}
	public void setAddress(String Adderss) {
		this.address=address;
	}
	public void setSalary(float salary){
		this.salary=salary;
	}
	public void setDepartment(String departmentType){
		this.departmentType=departmentType;
	}	
	public void setOfficer(String expertise){
		this.expertise=expertise;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public double getPhoneno(){
		return phoneno;
	}
	public String getAddress() {
		return address;
	}
	public float getSalary(){
		return salary;
	}
	public String getDepartment(){
		return departmentType;
	}	
	public String getOfficer(){
		return expertise;
	}
}
