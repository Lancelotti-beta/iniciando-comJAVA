
public class TestaOperadores {
	public static void main(String[] args) {
		int valor1 = 10;
		int valor2 = 5;
		
		if(valor1 == valor2) {
			System.out.println("Valor1 � igua a Valor2");
		}else {
			System.out.println("Valor1 � diferente de Valor2");
		}
		
		if(valor1 != valor2) {
			System.out.println("Valor1 � diferente de Valor2");
		}else {
			System.out.println("Valor1 � igual a Valor2");
		}
		
		if(valor1 > valor2) {
			System.out.println("Valor1 � maior que Valor2");
		}else {
			System.out.println("Valor1 � menor que Valor2");
		}
		
		if(valor1 < valor2) {
			System.out.println("Valor1 � menor que Valor2");
		}else {
			System.out.println("Valor1 � maior que Valor2");
		}
		
		if(valor1 >= valor2) {
			System.out.println("Valor1 � maior ou igua a Valor2");
		}else {
			System.out.println("Valor1 � menor ou igua Valor2");
		}
		
		if(valor1 <= valor2) {
			System.out.println("Valor1 � menor ou igua a Valor2");
		}else {
			System.out.println("Valor1 � maior ou igua Valor2");
		}
	}
}
