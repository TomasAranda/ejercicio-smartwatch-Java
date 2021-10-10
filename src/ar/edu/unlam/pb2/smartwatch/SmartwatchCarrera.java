package ar.edu.unlam.pb2.smartwatch;

public class SmartwatchCarrera extends Smartwatch {

	public SmartwatchCarrera(String nombreUsuario, Integer edadUsuario, Double pesoUsuario, Double alturaUsuario) {
		super(nombreUsuario, edadUsuario, pesoUsuario, alturaUsuario);
	}

	public Double getDistanciaEnKilometros() {
		return (double) (distanciaEnMetrosRealizados / 1000);
	}

	public Double getRitmoDeCarrera() {
		Double resultado = (double) (tiempoEnSegundosTranscurridos / 60.0);
		Double distanciaEnKilometros = (double) (distanciaEnMetrosRealizados / 1000.0);
		resultado /= distanciaEnKilometros;
		return resultado;
	}

	public Integer getTiempoEnSegundosTranscurridos() {
		return tiempoEnSegundosTranscurridos;
	}

}
