package Clases;

public class Peliculas {

	private final int ID;
	private String Nombre;
	private Categorias genero;

	private static int count = 0;

	////// Constructores //////////

	public Peliculas() {
		count++;
		ID = count;
		Nombre = "";
		genero = new Categorias();
	}

	public Peliculas(String nombre, Categorias genero) {
		count++;
		ID = count;
		Nombre = nombre;
		this.genero = genero;
	}

	//////////////// Gets and Sets/////////////

	public int getID() {
		return ID;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Categorias getGenero() {
		return genero;
	}

	public void setGenero(Categorias genero) {
		this.genero = genero;
	}

	////////////// ToString()//////////

	public String toString() {
		return Nombre + " - " + genero.getNombre() + " - " + ID;
	}

	public static int devuelveProximoID() {
		return count + 1;
	}

	////////////// HashCode-Equals()//////////

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peliculas other = (Peliculas) obj;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		return true;
	}

}