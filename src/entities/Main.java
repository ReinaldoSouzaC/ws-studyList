package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria"); // Add to list
		list.add("Jondan");
		list.add("Bruna");
		list.add("Rai");
		list.add("Marcia");
		list.add("Mariana");
		
		list.add(2, "Patricia"); // Add with index to list
		
		System.out.println(list.size()); // Size of list
		
		for(String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("-----------------------");
		list.remove("Maria"); // Remove
		list.remove(2); // Remove with index
		
		for(String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("----------------------");
		list.removeIf(x -> x.charAt(0) == 'P'); // Remove with charAt
		
		for(String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("---------------------");
		System.out.println("Index of Rai: " + list.indexOf("Rai"));
		
		System.out.println("--------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for (String obj : result) {
			System.out.println(obj);
		}
		
		System.out.println("---------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(name);
	}

}
