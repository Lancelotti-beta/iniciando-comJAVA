
public class ProgramaWhile {

    public static void main(String[] args) {
      int contador = 0;

      while(contador <= 10) {

        System.out.print(contador + " <");
        contador++;

        System.out.print(" " + contador);
        System.out.println();

      }
      System.out.println("E este é o valor final: " + contador);

    }
}
