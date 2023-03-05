package testeMatematicos;

public class matematicaAvancada {

	private Object resultado;

	public void soma(double primeiroValor, double segundoValor) {
		setResultado(primeiroValor * segundoValor);
	}

	public Object getResultado() {
		return resultado;
	}

	public void setResultado(Object resultado) {
		this.resultado = resultado;
	}
}
