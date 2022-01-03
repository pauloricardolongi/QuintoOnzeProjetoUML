package aplicacao;

import java.util.HashSet;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {
		
			Set<String> set = new HashSet<>();
			
			set.add("TV");
			set.add("Notebook");
			set.add("Tablet");
			set.add("caneta");
			System.out.println(set.contains("Notebook"));
			
			for (String p : set) {
			System.out.println(p);
			}

	
	}

}
