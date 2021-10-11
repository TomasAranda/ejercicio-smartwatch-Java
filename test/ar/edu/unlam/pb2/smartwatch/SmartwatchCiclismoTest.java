package ar.edu.unlam.pb2.smartwatch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmartwatchCiclismoTest {

	@Test
	void queSeObtengaLadistanciaRecorridaEnKilometros() {
		SmartwatchCiclismo sw = new SmartwatchCiclismo(null, null, null, null);
		
		Integer cantidadDeMetrosDePrueba = 100;
		for (int i = 0; i < cantidadDeMetrosDePrueba; i++) {
			sw.enviarPulso(TipoDePulso.DISTANCIA_EN_METROS);
		}
		
		Double valorEsperado = cantidadDeMetrosDePrueba / 1000.0;
		Double valorObtenido = sw.getDistanciaRealizada();
		
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	void queSeObtengaElTiempoTranscurrido() {
		SmartwatchCiclismo sw = new SmartwatchCiclismo(null, null, null, null);
		
		Integer cantidadDeSegundosDePrueba = 10;
		for (int i = 0; i < cantidadDeSegundosDePrueba; i++) {
			sw.enviarPulso(TipoDePulso.TIEMPO_EN_SEGUNDOS);
		}
		
		Integer valorObtenido = sw.getTiempoTranscurrido();
		
		assertEquals(cantidadDeSegundosDePrueba, valorObtenido);
	}

	@Test
	void queSeObtengaLaVelocidadPromedio() {
		SmartwatchCiclismo sw = new SmartwatchCiclismo(null, null, null, null);
		
		Integer cantidadDeSegundosDePrueba = 10;
		for (int i = 0; i < cantidadDeSegundosDePrueba; i++) {
			sw.enviarPulso(TipoDePulso.TIEMPO_EN_SEGUNDOS);
		}
		Integer cantidadDeMetrosDePrueba = 100;
		for (int i = 0; i < cantidadDeMetrosDePrueba; i++) {
			sw.enviarPulso(TipoDePulso.DISTANCIA_EN_METROS);
		}
		
		Double valorObtenido = sw.getVelocidadPromedio();
		Double valorEsperado = (cantidadDeSegundosDePrueba / 60.0 / 60.0 ) / (cantidadDeMetrosDePrueba / 1000.0);
		
		assertEquals(valorEsperado, valorObtenido);
	}

}
