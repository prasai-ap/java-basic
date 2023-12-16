package classandobjects;

public class Student {
		int roll;
		String name;
		String address;
		float weight;
		static String CollegeName;
		
		
		public Student(){
			CollegeName="Apex";
			roll=3;
			name="Basnet";
			address="Bhaktapur";
			weight=70;
			System.out.println("hello this is student default constructor");
		}
		
		public Student(int r, String n,String a, float w,String c) {
			CollegeName=c;
			roll=r;
			name=n;
			address=a;
			weight=w;
			System.out.println("hello this is student parameterized constructor");
		}
		
		
		public void setRoll(int r) {
			roll=r;
		}
		
		public void setName(String n) {
			name=n;
		}
		
		public void setAddress(String a) {
			address=a;
		}
		
		public void setWeight(float w) {
			weight = w;
		}
		public int getRoll() {
			return roll;
		}
		public String getName() {
			return name;
		}
		public String getAddress() {
			return address;
		}
		
		public float getWeight() {
			return weight;
		}
		public String getCollegeName() {
			return CollegeName;
		}

}

