package diaz.utn.frba.dds;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class SugeridorTest {

	@Test (expected = FaltanPrendasException.class)
	public void testSiFaltanPrendasRompe() throws FaltanPrendasException {
		Sugeridor sugeridor = new Sugeridor();
		sugeridor.generarTodasLasSugerencias();
	}

	@Test
	public void testSeGeneranTodasLasCombinacionesConAccesorio() throws FaltanPrendasException {
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
		
		Assert.assertEquals(24, sugeridor.cantSugerencias());
	}
	
	@Test
	public void testSeGeneranTodasLasCombinacionesSinAccesorio() throws FaltanPrendasException {
		Torso chomba = new Torso();
		Torso camisa = new Torso("Camisa");
		Piernas jean = new Piernas("Jean");
		Piernas chino = new Piernas("Chino");
		Pies zapatos = new Pies("Zapatos");
		Pies zapas1 = new Pies("Zapas blancas");
		Pies zapas2 = new Pies("Zapas negras");
		
		Sugeridor sugeridor = new Sugeridor();
		
		sugeridor.cargarPrenda(chomba);
		sugeridor.cargarPrenda(camisa);
		sugeridor.cargarPrenda(jean);
		sugeridor.cargarPrenda(zapatos);
		sugeridor.cargarPrenda(zapas1);
		sugeridor.cargarPrenda(zapas2);
		sugeridor.cargarPrenda(chino);
		
		sugeridor.generarTodasLasSugerencias();
		
		Assert.assertEquals(12, sugeridor.cantSugerencias());
	}
}
