
public class TesteConversaoValores {
	public static void main (String[] args) {
		
		float pontoFlutante = 3.14f;
		
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		
		
		int valorMax = 20000000;
		
		System.out.println(valorMax + 1000000000);
		
		long valorGrande = 376523756287562338L;
		short valorPequeno = 2123;
		byte valorMinusculo = 127;
		
		System.out.println(valorMinusculo + 180044);
		
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
