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
	List<Sugerencia> sugerencias = new ArrayList<Sugerencia>();
	
	//Cargo las prendas en sus listas correspondientes.
	public void cargarPrenda(Prenda unaPrenda) {
		if(unaPrenda.getClass() == Torso.class) {
			prendasDeTorso.add(unaPrenda);
		} else {
			if(unaPrenda.getClass() == Piernas.class) {
				prendasDePiernas.add(unaPrenda);
			} else {
				if(unaPrenda.getClass() == Pies.class) {
					prendasDePies.add(unaPrenda);
				}
				else {
					prendasAccesorios.add(unaPrenda);
				}
			}
		}
		}
	
	//Armo la lista de combinaciones, con todas las posibles
	public void generarTodasLasSugerencias() {
		/*
		if(this.algunaListaObligatoriaEstaVacia())
			throw excepcion no se pueden completar sugerencias validas bla bla
		*/
		Prenda torsoActual;
		Prenda piernasActual;
		Prenda piesActual;
		Prenda accesorioActual;
		Sugerencia sugerencia = new Sugerencia();
		
		for(int i = 0; i < this.cantPrendasDeTorsoCargadas(); i++) {
			 torsoActual = prendasDeTorso.get(i);
			 for(int j=0; j < this.cantPrendasDePiernasCargadas(); j++) {
				 piernasActual = prendasDePiernas.get(j);
				 for(int k=0; k < this.cantPrendasDePiesCargadas(); k++) {
					 piesActual = prendasDePies.get(k);
					 if(this.hayAccesoriosCargados()) {
						 for(int m=0; m < this.cantPrendasAccesoriosCargadas(); m++) {
							 accesorioActual = prendasAccesorios.get(m);
							 sugerencia.setSugerenciaConAccesorio(torsoActual, piernasActual, piesActual, accesorioActual);
						 }
					 } else {
						 sugerencia.setSugerenciaSinAccesorio(torsoActual, piernasActual, piesActual);
					 }
					 sugerencias.add(sugerencia);
					 sugerencia = new Sugerencia();
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
	
	public int cantSugerencias() {
		return sugerencias.size();
	}
	/*
	public List<String> sugerencias() {
		return sugerencias;
	}
	*/
	public boolean hayAccesoriosCargados() {
		return this.cantPrendasAccesoriosCargadas() > 0;
	}
	
	public List<Sugerencia> getSugerencias() {
		return sugerencias;
	}
	
}

/*
	Intente implementar el uso de accesorios de manera aleatoria, pero no funciono.
	
public void generarTodasLasCombinaciones() {
Prenda torsoActual;
Prenda piernasActual;
Prenda piesActual;
Prenda accesorioActual;
Sugerencia sugerencia;
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
					 sugerencia = torsoActual + " - " + piernasActual + " - " + piesActual + " - " + accesorioActual;
				 } else {
					 sugerencia = torsoActual + " - " + piernasActual + " - " + piesActual;
				 }
			 }
			 sugerencia = torsoActual + " - " + piernasActual + " - " + piesActual;
			 sugerencias.add(sugerencia);
		 }
	 }
 }
}
*/

/*
 
	Solucion considerando el "tipo"

public void cargarPrenda(Prenda unaPrenda) {
if(unaPrenda.getClass() == Torso.class) {
	prendasDeTorso.add(unaPrenda);
} else {
	if(unaPrenda.getClass() == Piernas.class) {
		prendasDePiernas.add(unaPrenda);
	} else {
		if(unaPrenda.getClass() == Pies.class) {
			prendasDePies.add(unaPrenda);
		}
		else {
			prendasAccesorios.add(unaPrenda);
		}
	}
}
}

	Solucion comparando Strings
	
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

*/