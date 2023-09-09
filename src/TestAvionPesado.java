package src;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import avion.AvionPesado;
import copControl.Mapa;
import copControl.Posicion;
import pista.Pista;
import pista.PistaSimple;
import pista.PosicionesEntradaVaciaException;

import static org.junit.jupiter.api.Assertions.*;

public class TestAvionPesado {

	private AvionPesado avionPesado;
	private Mapa mapaDeMovimiento;

	@BeforeEach
	void setUp() {
		// Configuración común antes de cada prueba
		Posicion posIni = new Posicion(0, 0);
		Posicion posFin = new Posicion(100, 100);
		mapaDeMovimiento = new Mapa();
		avionPesado = new AvionPesado(posIni, posFin, mapaDeMovimiento);
	}

	@Test
	void testPuedeAterrizarEnPistaInvalida() throws PosicionesEntradaVaciaException {
		// Crea una pista inválida (que no puede ser usada por aviones pesados)
		Posicion posicionPista = new Posicion(10, 10);
		Pista pista = new PistaSimple(posicionPista);

		assertFalse(avionPesado.puedeAterrizar(pista));
	}

	@Test
	void testEsControlable() {
		// Crear un avión pesado y asegurarse de que sea controlable
		assertTrue(avionPesado.esControlable());
	}
}