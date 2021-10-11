package ar.edu.unlam.pb2.smartwatch;

public class SmartwatchCiclismo extends Smartwatch {
	private Integer cadenciaEnRPM = 0;

	public SmartwatchCiclismo(String nombreUsuario, Integer edadUsuario, Double pesoUsuario, Double alturaUsuario) {
		super(nombreUsuario, edadUsuario, pesoUsuario, alturaUsuario);
	}

	@Override
	public Double getDistanciaRealizada() {
		// (EN KILOMETROS)
		return super.getDistanciaRealizada() / 1000.0;
	}

	public Double getVelocidadPromedio() {
		return (tiempoTranscurrido / 60.0 / 60.0 ) / (distanciaRealizada / 1000.0);
	}
	
	public Integer getCadenciaEnRPM() {
		return cadenciaEnRPM;
	}
	
	public void setCadenciaEnRPM(Integer cadenciaEnRPM) {
		this.cadenciaEnRPM = cadenciaEnRPM;
	}
}
