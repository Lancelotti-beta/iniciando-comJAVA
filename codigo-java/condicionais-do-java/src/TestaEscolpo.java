
public class TestaEscolpo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais!");
		System.out.println("//=============================================//");
		System.out.println("Teste 1");

		
		int idade;
		idade = 20;
		int quantidadePessoas = 1;

		//comparar uma das vareaveis, e se uma for "verdadeira", passa no teste
		
		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja Bem Vindo!");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
		
		System.out.println("//=============================================//");
		System.out.println("Teste 2");
		
		boolean acompanhado;
		//acompanhado = quantidadePessoas >= 2;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("O que � ? " + acompanhado);
		
		//compara os "if's" e se ambos forem "verdadeiros", passarem no teste, a fun�a� � executada. 
		//Do contrario n�o executa ou vai para o "else"
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem Vindo!");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
	}
}
