package collectionapi;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
public class ArrayListDemo{
	public static void main(String[]args) { 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the index to retrive");
		int n=scan.nextInt();
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("Red");
		arraylist.add("Dark Blue");
		arraylist.add("Sky Blue");
		arraylist.add("Light Green");
		arraylist.add("Purple");
		arraylist.add("Dark Green");
		arraylist.add("Orange");
		System.out.println("item in index is"+" "+arraylist.get(n));
		arraylist.add(1,"Indigo");
		arraylist.add(5,"Yellow");
		Iterator itr = arraylist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("Enter the name of colour you want to Search");
		String a= scan.next();
		 itr = arraylist.iterator();
		while(itr.hasNext()) {
			if(arraylist.contains(a)) {
				System.out.println("Found the data");
			}
			
		}
		LinkedList<String> ll=new LinkedList<String>();
		//ll=(LinkedList<String>)arraylist.clone();
		
		
	}   
	
}

