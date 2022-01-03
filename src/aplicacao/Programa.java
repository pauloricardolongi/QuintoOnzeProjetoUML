package aplicacao;

import entities.Client;

public class Programa {

	public static void main(String[] args) {
		
	
		Client c1 = new Client("Maria","maria@gmail.com");
		Client c2 = new Client("Maria","alex@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	}

}
