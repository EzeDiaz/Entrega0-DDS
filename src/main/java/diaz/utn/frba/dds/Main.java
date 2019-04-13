package diaz.utn.frba.dds;

public class Main {
	
	public static void main(String[] args) throws FaltanPrendasException {
		//Defino algunas prendas para probar
		Torso chomba = new Torso();
		Torso camisa = new Torso("Camisa");
		Piernas jean = new Piernas("Jean");
		Piernas chino = new Piernas("Chino");
		Pies zapatos = new Pies("Zapatos");
		Pies zapas1 = new Pies("Zapas blancas");
		Pies zapas2 = new Pies("Zapas negras");
		Accesorio reloj = new Accesorio("Reloj");
		Accesorio collar = new Accesorio("Collar");
		
		Sugeridor sugeridor = new Sugeridor();
		
		sugeridor.cargarPrenda(chomba);
		sugeridor.cargarPrenda(camisa);
		sugeridor.cargarPrenda(jean);
		sugeridor.cargarPrenda(zapatos);
		sugeridor.cargarPrenda(zapas1);
		sugeridor.cargarPrenda(zapas2);
		sugeridor.cargarPrenda(reloj);
		sugeridor.cargarPrenda(chino);
		sugeridor.cargarPrenda(collar);
		
		sugeridor.generarTodasLasSugerencias();
		
		for(int i = 0; i < sugeridor.cantSugerencias(); i++) {
			Sugerencia unaSugerencia = sugeridor.getSugerencias().get(i);
			//if(tiene accesorio...)
			unaSugerencia.printSugerencia();
		}
	}

}

