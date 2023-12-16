package collectionapi;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetdemo {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		HashSet hs=new HashSet();
		hs.add(6);
		hs.add(7);
		hs.add("Sonam Lama");
		hs.add("Ferrari");
		hs.add("Billoinaire");
		hs.add(6);
		System.out.println(hs);
		Iterator itr= hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
		System.out.println("Enter what you want to Search in string");
	    String a= scan.nextLine();
	    int b=scan.nextInt();
	    itr = hs.iterator();
		while(itr.hasNext()) {
			if(hs.contains(a)) {
				System.out.println("Found the data");
				break;
			}
			else if(hs.contains(b)) {
				System.out.println("Data Found");
				break;
			}
			
		}
	

	}
}