package tp6Ej4;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaChoferes extends ListaOrdenadaNodos<Integer, Chofer> {

	@Override
	public int compare(Chofer chofer1, Chofer chofer2) {
		return chofer1.getDni() - chofer2.getDni();
	}

	@Override
	public int compareByKey(Integer clave, Chofer chofer) {
		return clave - chofer.getDni();
	}

}
