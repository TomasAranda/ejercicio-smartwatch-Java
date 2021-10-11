package ar.edu.unlam.pb2.smartwatch;

abstract public class Smartwatch {
	private static final Integer SEGUNDOS_EN_UN_DIA = 86400; 
	private String nombreUsuario;
	private Double pesoUsuario;
	private Double alturaUsuario;
	private Integer edadUsuario;
	private Integer pasosDiariosPromedioUsuario = 0;
	
	protected Integer tiempoTranscurrido = 0;
	protected Integer distanciaRealizada = 0;
	protected Integer pasosRealizados = 0;

	public Smartwatch(String nombreUsuario, Integer edadUsuario,
			Double pesoUsuario, Double alturaUsuario) {
		this.nombreUsuario = nombreUsuario;
		this.edadUsuario = edadUsuario;
		this.pesoUsuario = pesoUsuario;
		this.alturaUsuario = alturaUsuario;
	}
	
	public void enviarPulso(TipoDePulso pulso) {
		switch (pulso) {
		case TIEMPO_EN_SEGUNDOS:
			tiempoTranscurrido++;
			break;
		case PASO:
			pasosRealizados++;
			break;
		case DISTANCIA_EN_METROS:
			distanciaRealizada++;
			break;
		default:
			break;
		}
	}
		
	public Integer getPasosDiariosPromedioUsuario() {
		if(tiempoTranscurrido > SEGUNDOS_EN_UN_DIA) {
			return (SEGUNDOS_EN_UN_DIA * pasosRealizados / tiempoTranscurrido);   
		}
		return pasosRealizados;
	}
	
	// TODO: AGREGAR METODOS QUE DEVUELVEN DISTANCIA Y VELOCIDAD (SOBREESCRIBIRLOS EN LAS CLASES HIJAS PARA QUE LO DEVUELVAN EN LA UNIDAD CORRECTA)
	public Double getDistanciaRealizada() {
		// (EN METROS)
		return (double) distanciaRealizada;
	}

	public Integer getTiempoTranscurrido() {
		// (EN SEGUNDOS)
		return tiempoTranscurrido;
	}
}
