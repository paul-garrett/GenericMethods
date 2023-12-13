// author: Jeremy Holley
// Generic Method Examples

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap; // Unordered Collection of Key, Value pairs

public class Main { 
	public static void main(String[] args) { 

		/* Generic method add() used to initialize the lists with any type */
		
		ArrayList<String> employees = add("Julian", "Clark", "Becky");
		ArrayList<Double> salaries = add(45000.0, 65000.0, 150000.0);
		ArrayList<Integer> yearsEmployed = add(35, 2, 7);


		/* Generic print method */
		
		// print(employees);
		// print(salaries);
		// print(yearsEmployed);






		
		/*	HashMap Collection */
		
		HashMap<String, Double> map = new HashMap<>();
		map.put(employees.get(0), salaries.get(0));
		map.put(employees.get(1), salaries.get(1));
		map.put(employees.get(2), salaries.get(2));

		System.out.println(map);
		Double s1 = map.get("Becky");
		System.out.printf("Becky's Salary: %.2f\n", s1);







		
		/*	Generic Method find() */
		
		// System.out.println(find(employees, "Clark"));
		// System.out.println(find(salaries, 65000.0));
		// System.out.println(find(yearsEmployed, 3));





		
		

		/*	Bounded Wildcards */
		
		ArrayList<Mutt> dogs = add(new Mutt(), new Mutt(), new Mutt());
		print(dogs);
		
	}


	
	/**************************
	***** GENERIC METHODS *****
	***************************/

  // Generic methods are used to compile and run code with any type of data.
	// Generic methods are used to add any type of data to a list.
	// Generic methods are used to print any type of data to the console.
	
	/* 	Generic method that can take a variable amount of arguments and return an ArrayList of those items.
		The variable arguments are stored as an array. */
	                        // ... means we can pass any number of arguments of the same type 
	public static <T> ArrayList<T> add(T... items) {
		return new ArrayList<T>(Arrays.asList(items));
    // ["Julian", ...]
	}



	/*	Generic method that takes an ArrayList of any type as an argument and prints the elements. */
	
	// public static <T> void print(ArrayList<T> list) {
	// 	System.out.println(Arrays.toString(list.toArray()));
	// }



	/* Generic method that takes an ArrayList of any type and an element of that same type as two separate arguments. The method's purpose is to return true if the element is in the list or false otherwise. */
	
	// public static <T> boolean find(ArrayList<T> list, T elem) {
	// 	if (list.size() == 0) {
	// 		return false;
	// 	} else {
	// 		for (int i = 0; i < list.size(); i++) {
	// 			if (list.get(i).equals(elem)) {
	// 				return true;
	// 			}
	// 		}
	// 	}
	// 	return false;
	// }

	


	/********************
	***** WILDCARDS *****
	*********************/
	
	// /* Unbounded Wildcards <?> */
	
	// public static void print(ArrayList<?> list) {
	// 	for (Object obj : list) {
	// 		System.out.println(obj);
	// 	}
	// 	System.out.println();
	// }


	
	/* 	Upper Bounded Wildcard <? extends SpecifiedClass> 
		The type can be any subclass of the Specified Class. */
	
	public static void print(ArrayList<? extends Dog> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println();
	}


	
	/* 	Lower Bounded Wildcard <? super SpecifiedClass> 
		The type of the list can be any superclass of the Specified Class. */
	
	// public static void print(ArrayList<? super Dog> list) {
	// 	for (Object obj : list) {
	// 		System.out.println(obj);
	// 	}
	// 	System.out.println();
	// }
}

class Animal {}

class Dog extends Animal {}

class Mutt extends Dog {}
