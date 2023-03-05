public class LacoForDeTabuada {
  public static void main(String[] args) {

    System.out.println("/=====================================/");

    for (int multiplicador = 0; multiplicador <= 10 ; multiplicador++) {
      System.out.println("Multiplicando por " + multiplicador);
      for (int numeroN = 1; numeroN <= 10; numeroN++) {
        System.out.print(numeroN * multiplicador);
        System.out.print(" ");
      }

      System.out.println();
    }

    System.out.println("/=====================================/");
    
    for (int multiplicador = 10; multiplicador >= 0 ; --multiplicador) {
      System.out.println("Multiplicando por " + multiplicador);
      for (int numberN = 10; numberN >= 0; numberN--) {
        System.out.print(numberN * multiplicador);
        System.out.print(" ");
      }
      System.out.println();
    }

  }
}
