
public class TestaOperadores {
	public static void main(String[] args) {
		int valor1 = 10;
		int valor2 = 5;
		
		if(valor1 == valor2) {
			System.out.println("Valor1 é igua a Valor2");
		}else {
			System.out.println("Valor1 é diferente de Valor2");
		}
		
		if(valor1 != valor2) {
			System.out.println("Valor1 é diferente de Valor2");
		}else {
			System.out.println("Valor1 é igual a Valor2");
		}
		
		if(valor1 > valor2) {
			System.out.println("Valor1 é maior que Valor2");
		}else {
			System.out.println("Valor1 é menor que Valor2");
		}
		
		if(valor1 < valor2) {
			System.out.println("Valor1 é menor que Valor2");
		}else {
			System.out.println("Valor1 é maior que Valor2");
		}
		
		if(valor1 >= valor2) {
			System.out.println("Valor1 é maior ou igua a Valor2");
		}else {
			System.out.println("Valor1 é menor ou igua Valor2");
		}
		
		if(valor1 <= valor2) {
			System.out.println("Valor1 é menor ou igua a Valor2");
		}else {
			System.out.println("Valor1 é maior ou igua Valor2");
		}
	}
}
