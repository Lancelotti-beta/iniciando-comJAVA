
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais!");
		System.out.println("//=============================================//");
		
		int idade;
		idade = 13;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Você tem mais que 18 anos");
			System.out.println("Seja Bem Vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar, "
						+ "pois está acompanhado");
			} else {
				System.out.println("Infelizmente você não pode entrar");
			}
		}
	}
}
