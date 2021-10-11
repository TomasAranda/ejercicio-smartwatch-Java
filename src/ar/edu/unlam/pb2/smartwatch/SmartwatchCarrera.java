package ar.edu.unlam.pb2.smartwatch;

public class SmartwatchCarrera extends Smartwatch {

	public SmartwatchCarrera(String nombreUsuario, Integer edadUsuario, Double pesoUsuario, Double alturaUsuario) {
		super(nombreUsuario, edadUsuario, pesoUsuario, alturaUsuario);
	}

	@Override
	public Double getDistanciaRealizada() {
		// (EN KILOMETROS)
		return super.getDistanciaRealizada() / 1000.0;
	}

	public Double getRitmoDeCarrera() {
		Double resultado = (double) (tiempoTranscurrido / 60.0);
		Double distanciaEnKilometros = (double) (distanciaRealizada / 1000.0);
		resultado /= distanciaEnKilometros;
		return resultado;
	}

}
