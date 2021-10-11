package ar.edu.unlam.pb2.smartwatch;

public class SmartwatchNatacion extends Smartwatch {

	public SmartwatchNatacion(String nombreUsuario, Integer edadUsuario, Double pesoUsuario, Double alturaUsuario) {
		super(nombreUsuario, edadUsuario, pesoUsuario, alturaUsuario);
	}

	@Override
	public Integer getTiempoTranscurrido() {
		return super.getTiempoTranscurrido();
	}

}
