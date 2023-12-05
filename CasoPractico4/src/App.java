import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Persona> list = Factory.createList();
		list.add(new Persona(3,"Pedro"));
		list.add(new Persona(1,"Natalia"));
		list.add(new Persona(4,"Daniel"));
		list.add(new Persona(2,"Felipe"));
		list.add(new Persona(5,"Jimena"));
		

		System.out.println("Lista desordenada");
		for(Persona p: list) {
			System.out.println(p); 
		}

		
		System.out.println("\nLista ordenada ascendentemente");
		list = Factory.sortList(list, "asc");
		for(Persona p: list) {
			System.out.println(p); 
		}
		
		System.out.println("\nLista ordenada descendentemente");
		list = Factory.sortList(list, "desc");
		for(Persona p: list) {
			System.out.println(p); 
		}
		
	}

}
