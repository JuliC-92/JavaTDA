package tp6Ej1;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class PelotaPorUso extends ListaOrdenadaNodos<EstadoPelota, PelotaDeTenis> {

	@Override
	public int compare(PelotaDeTenis dato1, PelotaDeTenis dato2) {
		return dato1.getEstado().ordinal()-dato2.getEstado().ordinal();
	}

	@Override
	public int compareByKey(EstadoPelota clave, PelotaDeTenis elemento) {
		return clave.ordinal()-elemento.getEstado().ordinal();
	}

}
