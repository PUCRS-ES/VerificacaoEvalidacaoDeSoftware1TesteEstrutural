package testeEstrutural;

public class Sensor {
	private boolean habilitado;
	private int temperatura;
	private float radiacao;
	private int alerta;
	
	public boolean isHabilitado() {
		return habilitado;
	}
	
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
		atualizaAlerta();
	}
	
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
		atualizaAlerta();
	}
	
	public void setRadiacao(float radiacao) {
		this.radiacao = radiacao;
		atualizaAlerta();
	}
	
	public int getAlerta() {
		return alerta;
	}
	
	private void atualizaAlerta() {
		if (habilitado == false)
			alerta = Alertas.VERDE.getValue();
		else if (radiacao > 7)
			alerta = Alertas.VERMELHO.getValue();
		else if (radiacao > 5 || temperatura > 40)
			alerta = Alertas.LARANJA.getValue();
		else if (radiacao > 1 || temperatura > 30)
			alerta = Alertas.AMARELO.getValue();
	}
}
