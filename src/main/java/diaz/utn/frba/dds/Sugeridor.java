package diaz.utn.frba.dds;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* 
Crear un proyecto Maven siguiendo el arquetipo básico. 
El mismo debe ser creado sobre un repositorio Github creado por 
el alumno. El proyecto debe cumplir los siguientes requerimientos: 
dado un conjunto de prendas, armar combinaciones solo teniendo en
cuenta el tipo de prenda (torso, piernas, pies, accesorios-opcionales ) 
para vestir una persona. Una sugerencia es válida si tiene al 
menos una prenda de cada tipo, excepto accesorios.
*/

public class Sugeridor {

	List<Prenda> prendasDeTorso = new ArrayList<Prenda>();
	List<Prenda> prendasDePiernas = new ArrayList<Prenda>();
	List<Prenda> prendasDePies = new ArrayList<Prenda>();
	List<Prenda> prendasAccesorios = new ArrayList<Prenda>();
	List<String> combinaciones = new ArrayList<String>();
	
	//Cargo las prendas en sus listas correspondientes.
	public void cargarPrenda(Prenda unaPrenda) {
		if(unaPrenda.getTipoDePrenda().equals("Torso")) {
			prendasDeTorso.add(unaPrenda);
		} else {
			if(unaPrenda.getTipoDePrenda().equals("Piernas")) {
				prendasDePiernas.add(unaPrenda);
			} else {
				if(unaPrenda.getTipoDePrenda().equals("Pies")) {
					prendasDePies.add(unaPrenda);
				}
				else {
					prendasAccesorios.add(unaPrenda);
				}
			}
		}
	}
	
	//Armo la lista de combinaciones, con todas las posibles
	public void generarTodasLasCombinaciones() {
		Prenda torsoActual;
		Prenda piernasActual;
		Prenda piesActual;
		Prenda accesorioActual;
		String combinacion;
		Random incluyeAccesorio = new Random();
		Random m = new Random();
		
		for(int i = 0; i < this.cantPrendasDeTorsoCargadas(); i++) {
			 torsoActual = prendasDeTorso.get(i);
			 for(int j=0; j < this.cantPrendasDePiernasCargadas(); j++) {
				 piernasActual = prendasDePiernas.get(j);
				 for(int k=0; k < this.cantPrendasDePiesCargadas(); k++) {
					 piesActual = prendasDePies.get(k);
					 if(this.hayAccesoriosCargados()) {
						 accesorioActual = prendasAccesorios.get(m.nextInt(this.cantPrendasAccesoriosCargadas()));
						 if(incluyeAccesorio.nextBoolean()) {
							 combinacion = torsoActual + " - " + piernasActual + " - " + piesActual + " - " + accesorioActual;
						 } else {
							 combinacion = torsoActual + " - " + piernasActual + " - " + piesActual;
						 }
					 }
					 combinacion = torsoActual + " - " + piernasActual + " - " + piesActual;
					 combinaciones.add(combinacion);
				 }
			 }
		 }
	}
	
	public int cantPrendasDeTorsoCargadas() {
		return prendasDeTorso.size();
	}
	
	public int cantPrendasDePiernasCargadas() {
		return prendasDePiernas.size();
	}
	
	public int cantPrendasDePiesCargadas() {
		return prendasDePies.size();
	}
	
	public int cantPrendasAccesoriosCargadas() {
		return prendasAccesorios.size();
	}
	
	public int cantCombinaciones() {
		return combinaciones.size();
	}
	
	public List<String> combinaciones() {
		return combinaciones;
	}
	
	public boolean hayAccesoriosCargados() {
		return this.cantPrendasAccesoriosCargadas() > 0;
	}
	
}