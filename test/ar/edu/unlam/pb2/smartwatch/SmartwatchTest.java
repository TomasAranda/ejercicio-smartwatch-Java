package ar.edu.unlam.pb2.smartwatch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmartwatchTest {

	@Test
	void queSeObtengaLadistanciaRecorridaEnKilometros() {
		SmartwatchCarrera sw = new SmartwatchCarrera(null, null, null, null);
		
		Double kilometrosRecorridos = sw.getDistanciaEnKilometros();
		
		fail();
	}

}
