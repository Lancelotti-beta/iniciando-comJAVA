
public class TesteIR {
	public static void main(String[] args) {
		
		/*
		 * meu erro foi comparar com "Ou/OR" (||) ao invess de "e/AND" (&&), a fun��o, e tambem 
		 * n�o me atentei aos sinais de maior e menor.
		 * double salario = 3300.0;
		 * 
		   //Esse era o c�digo anterior
		 	if (salario >= 1900.0 || salario >= 2800.0) {
		 		System.out.println("Seu IR � de 7,5%. "
		 				+ "Voc� pode deduzir na declara��o o valor de R$ 142,00");
			}
			if (salario >= 2800.01 || salario >= 3751.0) {
				System.out.println("Seu IR � de 15%. "
						+ "Voc� pode deduzir na declara��o o valor de R$ 350,00");
			}
			if (salario >= 3751.01 || salario >= 4664.00) {
				System.out.println("Seu IR � de 22,5%. "
						+ "Voc� pode deduzir na declara��o o valor de R$ 636,00");
			}
		 *
		 */
		
		double salario = 3300.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Seu IR � de 7,5%. "
					+ "Voc� pode deduzir na declara��o o valor de R$ 142,00");
		}
		if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("Seu IR � de 15%. "
					+ "Voc� pode deduzir na declara��o o valor de R$ 350,00");
		}
		if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("Seu IR � de 22,5%. "
					+ "Voc� pode deduzir na declara��o o valor de R$ 636,00");
		}
		
		
	}
}
