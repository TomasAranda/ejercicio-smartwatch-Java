package ar.edu.unlam.pb2.smartwatch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmartwatchNatacionTest {

	@Test
	void queSeObtengaLadistanciaRecorridaEnKilometros() {
		SmartwatchNatacion sw = new SmartwatchNatacion(null, null, null, null);
		
		Integer cantidadDeMetrosDePrueba = 100;
		for (int i = 0; i < cantidadDeMetrosDePrueba; i++) {
			sw.enviarPulso(TipoDePulso.DISTANCIA_EN_METROS);
		}
		
		assertEquals((double) cantidadDeMetrosDePrueba, sw.getDistanciaRealizada());
	}
	
	@Test
	void queSeObtengaElTiempoTranscurrido() {
		SmartwatchNatacion sw = new SmartwatchNatacion(null, null, null, null);
		
		Integer cantidadDeSegundosDePrueba = 30;
		for (int i = 0; i < cantidadDeSegundosDePrueba; i++) {
			sw.enviarPulso(TipoDePulso.TIEMPO_EN_SEGUNDOS);
		}
		
		assertEquals(cantidadDeSegundosDePrueba, sw.getTiempoTranscurrido());
	}

}
