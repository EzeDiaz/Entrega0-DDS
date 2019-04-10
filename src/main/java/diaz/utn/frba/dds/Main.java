package diaz.utn.frba.dds;

public class Main {
	
	public static void main(String[] args) {
		//Defino algunas prendas para probar
		Prenda chomba = new Torso();
		Prenda camisa = new Torso("Camisa");
		Prenda jean = new Piernas("Jean");
		Prenda zapatos = new Pies("Zapatos");
		Prenda zapas1 = new Pies("Zapas blancas");
		Prenda zapas2 = new Pies("Zapas negras");
		Prenda reloj = new Accesorio("Reloj");
		
		Sugeridor combinationMakerV1 = new Sugeridor();
		
		combinationMakerV1.cargarPrenda(chomba);
		combinationMakerV1.cargarPrenda(camisa);
		combinationMakerV1.cargarPrenda(jean);
		combinationMakerV1.cargarPrenda(zapatos);
		combinationMakerV1.cargarPrenda(zapas1);
		combinationMakerV1.cargarPrenda(zapas2);
		combinationMakerV1.cargarPrenda(reloj);
		
		combinationMakerV1.generarTodasLasCombinaciones();
		
		for(int i = 0; i < combinationMakerV1.cantCombinaciones(); i++) {
			System.out.println(combinationMakerV1.combinaciones().get(i));
		}
	}

}

