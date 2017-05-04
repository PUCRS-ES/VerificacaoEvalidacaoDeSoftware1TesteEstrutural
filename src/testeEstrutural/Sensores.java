package testeEstrutural;

public class Sensores {
	private Sensor[] sensores = new Sensor[10];
	
	public Sensores() {
		for(int i = 0; i < sensores.length; i++)
			sensores[i] = new Sensor();
	}
	
	public void setH(int s, boolean h) {
		if(0 <= s && s < 10)
			sensores[s].setHabilitado(h);
	}
	
	public void setTemp(int s, int temp) {
		if(0 <= s && s < 10)
			sensores[s].setTemperatura(temp);
	}
	
	public void setRad(int s, float radiacao) {
		if(0 <= s && s < 10)
			sensores[s].setRadiacao(radiacao);
	}
	
	public boolean isH(int s) {
		if(0 <= s && s < 10)
			return sensores[s].isHabilitado();
		else
			return false;
	}
	
	public int isAlerta(int s) {
		if(0 <= s && s < 10)
			return sensores[s].getAlerta();
		else
			return -1;
	}
}
