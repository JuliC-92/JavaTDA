package tp6Ej1;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;

public class Main {

	public static void main(String[] args) {

		
		FabricanteDePelotas f = new FabricanteDePelotas();
		
		TuboPelotasDeTenis tubo = f.fabricarTubo();
		
		PelotaDeTenis p1 = tubo.extraer();
		PelotaDeTenis p2 = tubo.extraer();
		PelotaDeTenis p3 = tubo.extraer();
		
		for (int i = 0; i <9; i++) {
			p3.usar();
		}
		
		p1.usar();
		
		tubo.guardar(p3);
		tubo.guardar(p2);
		tubo.guardar(p1);
		
		TuboPelotasDeTenis tuboAux = new TuboPelotasDeTenis(3);
		while (!tubo.estaVacio()) {
			PelotaDeTenis p = tubo.extraer();
			System.out.println(p);
			tuboAux.guardar(p);
		}
		
		while(!tuboAux.estaVacio()) {
			tubo.guardar(tuboAux.extraer());
		}

	}

}
