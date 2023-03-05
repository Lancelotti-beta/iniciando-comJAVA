public class TestaWhile{
	public static void main(String[] args){

		int contador = 1;
		while(contador <= 10){

			System.out.println("Print: ");
			System.out.println(contador);

			//Podemos usar as seguintes formas:
			// contador = contador + 1;
			// contador += 1;
			// ++contador; || contador++;

			++contador;
		}
		System.out.println("ultimo valor depois do While:");
		System.out.println(contador);
	}
}