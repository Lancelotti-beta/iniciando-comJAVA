
public class TesteIR {
	public static void main(String[] args) {
		
		/*
		 * meu erro foi comparar com "Ou/OR" (||) ao invess de "e/AND" (&&), a função, e tambem 
		 * não me atentei aos sinais de maior e menor.
		 * double salario = 3300.0;
		 * 
		   //Esse era o código anterior
		 	if (salario >= 1900.0 || salario >= 2800.0) {
		 		System.out.println("Seu IR é de 7,5%. "
		 				+ "Você pode deduzir na declaração o valor de R$ 142,00");
			}
			if (salario >= 2800.01 || salario >= 3751.0) {
				System.out.println("Seu IR é de 15%. "
						+ "Você pode deduzir na declaração o valor de R$ 350,00");
			}
			if (salario >= 3751.01 || salario >= 4664.00) {
				System.out.println("Seu IR é de 22,5%. "
						+ "Você pode deduzir na declaração o valor de R$ 636,00");
			}
		 *
		 */
		
		double salario = 3300.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Seu IR é de 7,5%. "
					+ "Você pode deduzir na declaração o valor de R$ 142,00");
		}
		if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("Seu IR é de 15%. "
					+ "Você pode deduzir na declaração o valor de R$ 350,00");
		}
		if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("Seu IR é de 22,5%. "
					+ "Você pode deduzir na declaração o valor de R$ 636,00");
		}
		
		
	}
}
