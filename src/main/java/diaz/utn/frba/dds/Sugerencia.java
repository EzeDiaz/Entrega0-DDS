package diaz.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;

public class Sugerencia {
	
	Prenda torso;
	Prenda piernas;
	Prenda pies;
	Prenda accesorio = null;
	
	public Prenda getTorso() {
		return torso;
	}
	public void setTorso(Prenda torso) {
		this.torso = torso;
	}
	public Prenda getPiernas() {
		return piernas;
	}
	public void setPiernas(Prenda piernas) {
		this.piernas = piernas;
	}
	public Prenda getPies() {
		return pies;
	}
	public void setPies(Prenda pies) {
		this.pies = pies;
	}
	public Prenda getAccesorio() {
		return accesorio;
	}
	public void setAccesorio(Prenda accesorio) {
		this.accesorio = accesorio;
	}
	public void setSugerenciaConAccesorio(Prenda torsoActual, Prenda piernasActual, Prenda piesActual, Prenda accesorioActual) {
		this.setSugerenciaSinAccesorio(torsoActual, piernasActual, piesActual);
		this.setAccesorio(accesorioActual);
	}
	
	public void setSugerenciaSinAccesorio(Prenda torsoActual, Prenda piernasActual, Prenda piesActual) {
		this.setTorso(torsoActual);
		this.setPiernas(piernasActual);
		this.setPies(piesActual);
	}
	
	public void printSugerencia() {
		if(accesorio != null) {
			System.out.println(torso + " - " + piernas + " - " + pies + " - " + accesorio);
		} else {
			System.out.println(torso + " - " + piernas + " - " + pies);
		}
	}

}

//String sugerencia = this.getTorso().toString() + " " + this.getPiernas().toString() + " " + this.getPies().toString() + " " + this.getAccesorio().toString();
