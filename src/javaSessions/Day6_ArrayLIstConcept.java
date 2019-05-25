package javaSessions;

import java.util.ArrayList;

public class Day6_ArrayLIstConcept {

	public static void main(String[] args) {
		
		ArrayList ar= new ArrayList();
		ar.add(20);
		ar.add(30);
		ar.add(90);
		System.out.println(ar.size());

		ar.add(60);
		System.out.println(ar.size());
		
		//Generics in ArrayList
				ArrayList<Integer> arr =new ArrayList<Integer>();
				arr.add(2);
				//arr.addAll("Hi");
				
				ArrayList<String> arrStr =new ArrayList<String>();
				arrStr.add("Hi");
	}

}
