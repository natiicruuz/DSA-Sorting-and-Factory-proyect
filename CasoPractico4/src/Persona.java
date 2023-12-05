
public class Persona implements Comparable<Persona>{
	
	private int id;
	private String nombre;

	public Persona(int id, String nombre){
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int compareTo(Persona o) { // compara los ID's de las personas
		return Integer.compare(this.id,o.id) ;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
}
