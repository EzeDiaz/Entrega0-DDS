package diaz.utn.frba.dds;

public class Prenda {
	
	String nombre;
	String tipoDePrenda;
	
	public String getTipoDePrenda() {
		return tipoDePrenda;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}
	
}
