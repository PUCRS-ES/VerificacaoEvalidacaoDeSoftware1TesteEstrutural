package testeEstrutural;

public enum Alertas {
	VERDE(0),
	AMARELO(1),
	LARANJA(2),
	VERMELHO(3);
	
    private final int value;

    private Alertas(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
