package tp6Ej2;

import java.util.ArrayList;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Cola;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public abstract class Baraja {

	protected Pila<Naipe> naipes;

	public Baraja(boolean mezclado) {
		naipes = new PilaNodos<Naipe>();
		cargarNaipes();
		if (mezclado) {
			mezclar();
		}
	}

	public void agregar(ArrayList<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.remove(0));			
		}
	}

	public void agregar(Cola<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.remove());			
		}
	}

	public void agregar(Naipe naipe) {
		naipes.push(naipe);
	}

	public void agregar(Pila<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.pop());			
		}
	}

	protected abstract void cargarNaipes();

	public Naipe extraer() {
		return naipes.pop();
	}

	public Cola<Naipe> extraer(int cuantos) {
		int contador = 0;
		boolean hay =false;
		Cola<Naipe> aux = new ColaNodos<Naipe>();
		while (contador<=cuantos) {
			Naipe n =this.naipes.pop();
			contador++;
			if(n.getDescripcion().equals("Comodin")) {
				hay = true;}
			aux.add(n);
		}
		if(hay) {
			System.out.println("Hay Comodin en este mazo");
		}
		
		return aux;
	}

	public int getCantidadNaipes() {
		return naipes.size();
	}

	/**
	Una urna es una TDA que sirve para ordenar de manera aleatoria cualquier tipo de elemento que se le 
	aguege. En este metodo se lo saca del mezclador se lo mete en la urna la cual en el segundo while 
	lo devuelve en otro orden al mezcaldor
	 */
	protected void mezclar() {
		Urna<Naipe> mezclador = new Urna<>();
		while (!naipes.isEmpty()) {
			mezclador.add(naipes.pop());
		}
		while (!mezclador.isEmpty()) {
			naipes.push(mezclador.remove());
		}
	}
}