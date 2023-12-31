package tp6Ej5.Main;

import tp6Ej5.EstadoAirbag;
import tp6Ej5.Taller;

public class Ejercicio5 {
	static Taller quickAuto;

	public static void main(String[] args) {
		quickAuto = new Taller();
		
		quickAuto.agregarVehiculoEnEspera("AAA", "Ford", EstadoAirbag.DEFECTUOSO);
		quickAuto.agregarVehiculoEnEspera("BBB", "Fiat", EstadoAirbag.OK);
		quickAuto.agregarVehiculoEnEspera("CCC", "Citroen", EstadoAirbag.NO_POSEE);
		quickAuto.agregarVehiculoEnEspera("HHH", "Honda", 500, true);
		quickAuto.agregarVehiculoEnEspera("MMM", "Motomel", 125, false);
		quickAuto.agregarVehiculoEnEspera("SSS", "Suzuki", 250, true);
		quickAuto.agregarVehiculoEnEspera("", "Ford", EstadoAirbag.OK);
		quickAuto.agregarVehiculoEnEspera(null, "Suzuki", 500, true);
		quickAuto.agregarVehiculoEnEspera("", "Suzuki", 250, true);

		quickAuto.revisarVehiculosEnPuerta();
		quickAuto.procesarIngresoVehiculos();
		quickAuto.reportarTrabajosPendientes();
		quickAuto.procesarServicios();
		quickAuto.informarImporteServicios();
		quickAuto.informarResumenServicios();
	}

}