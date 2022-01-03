package aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {
		
			Set<String> set = new LinkedHashSet<>();
			
			set.add("Tv");
			set.add("Notebook");
			set.add("Tablet");
			set.add("caneta");
		    
			//set.remove("Tablet");
			//set.removeIf(x -> x.length() >=3);
			set.removeIf(x -> x.charAt(0) == 'T');
			
			for (String p : set) {
			System.out.println(p);
			}

	
	}

}
