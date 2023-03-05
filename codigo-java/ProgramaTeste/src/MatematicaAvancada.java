

public class MatematicaAvancada {
			
	private double resultado;

	public void soma(double valor1 , double valor2) {
		setResultado(valor1+valor2);
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public boolean par(double valorDecimal) {
		
		boolean retorna = false;
		
		int valorInteiro = (int)valorDecimal;
		
		if(valorDecimal/2 == valorInteiro/2)retorna = true;
		
		return retorna;
	}
}
