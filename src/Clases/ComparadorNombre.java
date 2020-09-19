package Clases;

import java.util.*;

public class ComparadorNombre implements Comparator<Peliculas> {
	@Override
	public int compare(Peliculas e1, Peliculas e2) {
	return e1.getNombre().compareTo(e2.getNombre());
	}
}