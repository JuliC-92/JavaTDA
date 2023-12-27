package tp6Ej2;

import ar.edu.ort.tp1.tdas.interfaces.Cola;

public class Main {

	public static void main(String[] args) {

		BarajaEspaniola mazo = new BarajaEspaniola();
		mazo.cargarNaipes();
		mazo.mezclar();

		Cola<Naipe> cola = mazo.extraer(10);
		
		Naipe centinela = null;
		cola.add(centinela);
		Naipe e = cola.remove();
			while (e != centinela) {
				System.out.println(e.getDescripcion());
				cola.add(e);
				e = cola.remove();
			}
	
	
	}
	


}
