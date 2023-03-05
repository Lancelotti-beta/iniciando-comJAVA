
public class testeSalario {
	public static void main(String[] args) {
		
		//nesse primeiro teste o codigo não compila pois a 
		//variavel não esta declarada fora do "if/else"
		/* Decomente e veja */
		
		/*
		 boolean aumentoSalario = true;
		
		if (aumentoSalario) {
			double salario = 4200.0;
		} else {
			double salario = 3800.0;
		}
		
		System.out.println(salario);
		*/
		
		//neste momento do codigo a função funciona pois a variavel 
		//foi declarada antes do "if/else"
		
		boolean aumentoSalario = false;
		double salario;
		
		if (aumentoSalario) {
			salario = 4200.0;
		} else {
			salario = 3800.0;
		}
		
		System.out.println(salario);

	}
}
