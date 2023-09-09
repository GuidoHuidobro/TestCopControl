package src;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import copControl.Dificultad;

public class TestDificultad {
	@Test
	public void testGetCantidadDeAvionesPorAterrizar() {
		// Crea una instancia de Dificultad con un valor de cantidad de aviones por
		// aterrizar
		Dificultad dificultad = new Dificultad(10, 20, 30);

		// Verifica que el método getCantidadDeAvionesPorAterrizar devuelve el valor
		// esperado
		assertEquals(10, dificultad.getCantidadDeAvionesPorAterrizar());
	}

	@Test
	public void testGetFrecuenciaDeAparicion() {
		// Crea una instancia de Dificultad con un valor de frecuencia de aparición
		Dificultad dificultad = new Dificultad(10, 20, 30);

		// Verifica que el método getFrecuenciaDeAparicion devuelve el valor esperado
		assertEquals(20, dificultad.getfrecuenciaDeAparicion());
	}

	@Test
	public void testGetValorDeDificultad() {
		// Crea una instancia de Dificultad con valores de cantidad de aviones,
		// frecuencia y velocidad
		Dificultad dificultad = new Dificultad(10, 20, 30);

		// Calcula el valor esperado de la dificultad
		int valorEsperado = 10 + 20 + 30;

		// Verifica que el método getValorDeDificultad devuelve el valor esperado
		assertEquals(valorEsperado, dificultad.getValorDeDificultad());
	}
}
