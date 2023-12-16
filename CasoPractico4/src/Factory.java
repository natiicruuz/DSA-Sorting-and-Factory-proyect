import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Factory {
	
	public static <T extends Comparable<T>> List<T> createList() { // creamos la lista, puede ser con arraylist o linkedlist
		
		List<T> lista = new ArrayList<>();
		//List<T> lista = new LinkedList<>();


		return lista;

	}

    public static <T extends Comparable<T>> List<T> sortList(List<T> lista, String tipoOrdenamiento) {
		// ordenamos la lista dependiendo del tipo de entrada que tengamos, ya sea asc o desc


		if ("asc".equals(tipoOrdenamiento)) {
			Collections.sort(lista);
		} else if ("desc".equals(tipoOrdenamiento)) {
			Collections.sort(lista, Collections.reverseOrder());
		}

		return lista;
	}
}
