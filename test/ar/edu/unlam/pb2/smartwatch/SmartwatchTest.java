package ar.edu.unlam.pb2.smartwatch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SmartwatchTest {

	@Test
	void queSeObtengaLadistanciaRecorridaEnKilometros() {
		SmartwatchCarrera sw = new SmartwatchCarrera(null, null, null, null);
		
		Integer cantidadDeMetrosDePrueba = 100;
		for (int i = 0; i < cantidadDeMetrosDePrueba; i++) {
			sw.enviarPulso(TipoDePulso.DISTANCIA);
		}
		
		Double valorEsperado = (double) (cantidadDeMetrosDePrueba / 1000);
		Double valorObtenido = sw.getDistanciaEnKilometros() / 1000;
		
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	void queSeObtengaElTiempoTranscurrido() {
		SmartwatchCarrera sw = new SmartwatchCarrera(null, null, null, null);
		
		Integer cantidadDeSegundosDePrueba = 10;
		for (int i = 0; i < cantidadDeSegundosDePrueba; i++) {
			sw.enviarPulso(TipoDePulso.TIEMPO);
		}
		
		Integer valorObtenido = sw.getTiempoEnSegundosTranscurridos();
		
		assertEquals(cantidadDeSegundosDePrueba, valorObtenido);
	}

	@Test
	void queSeObtengaElRitmoDeLaCarrera() {
		SmartwatchCarrera sw = new SmartwatchCarrera(null, null, null, null);
		
		Integer cantidadDeMetrosDePrueba = 50;
		for (int i = 0; i < cantidadDeMetrosDePrueba; i++) {
			sw.enviarPulso(TipoDePulso.DISTANCIA);
		}
		Integer cantidadDeSegundosDePrueba = 10;
		for (int i = 0; i < cantidadDeSegundosDePrueba; i++) {
			sw.enviarPulso(TipoDePulso.TIEMPO);
		}
		
		Double valorObtenido = sw.getRitmoDeCarrera();
		Double valorEsperado = (double) ((cantidadDeSegundosDePrueba / 60.0) / (cantidadDeMetrosDePrueba / 1000.0));
		
		assertEquals(valorEsperado, valorObtenido);
	}

}
