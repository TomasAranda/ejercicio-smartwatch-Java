package ar.edu.unlam.pb2.smartwatch;

abstract public class Smartwatch {
	private static final Integer SEGUNDOS_EN_UN_DIA = 86400; 
	private String nombreUsuario;
	private Double pesoUsuario;
	private Double alturaUsuario;
	private Integer edadUsuario;
	private Integer pasosDiariosPromedioUsuario = 0;
	
	private Integer tiempoEnSegundosTranscurridos = 0;
	private Integer distanciaEnMetrosRealizados = 0;
	private Integer pasosRealizados = 0;

	public Smartwatch(String nombreUsuario, Integer edadUsuario,
			Double pesoUsuario, Double alturaUsuario) {
		this.nombreUsuario = nombreUsuario;
		this.edadUsuario = edadUsuario;
		this.pesoUsuario = pesoUsuario;
		this.alturaUsuario = alturaUsuario;
	}
	
	public void enviarPulso(TipoDePulso pulso) {
		switch (pulso) {
		case TIEMPO:
			tiempoEnSegundosTranscurridos++;
			break;
		case PASO:
			distanciaEnMetrosRealizados++;
			break;
		case DISTANCIA:
			pasosRealizados++;
			break;
		default:
			break;
		}
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public Integer getEdadUsuario() {
		return edadUsuario;
	}
	
	public void setEdadUsuario(Integer edadUsuario) {
		this.edadUsuario = edadUsuario;
	}
	
	public Integer getPasosDiariosPromedioUsuario() {
		if(tiempoEnSegundosTranscurridos > SEGUNDOS_EN_UN_DIA) {
			return (SEGUNDOS_EN_UN_DIA * pasosRealizados / tiempoEnSegundosTranscurridos);   
		}
		return pasosRealizados;
	}
	
	public Double getPesoUsuario() {
		return pesoUsuario;
	}
	
	public void setPesoUsuario(Double pesoUsuario) {
		this.pesoUsuario = pesoUsuario;
	}
	
	public Double getAlturaUsuario() {
		return alturaUsuario;
	}
	
	public void setAlturaUsuario(Double alturaUsuario) {
		this.alturaUsuario = alturaUsuario;
	}
}
