
public class ParImpar {

	public static void main (String[] args) {
		double valorDec = 5;
		int b = (int) valorDec;
		
		
		System.out.println("Divisão do decimal: " + valorDec/2);
		System.out.println("Divisão do inteiro: " + b/2);
		
		if(valorDec/2 == b/2)System.out.println("Mesmo Resultado.");
		else System.out.println("Resultado Diferente.");
	}

}
