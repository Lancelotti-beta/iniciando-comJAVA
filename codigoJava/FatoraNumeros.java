public class FatoraNumeros {
  public static void main(String[] args) {
    int fatora = 1;
    for ( int number = 1; number <= 10; number++) {
      fatora *= number;
      System.out.println("O fatorial de " + number + " e igual a " + fatora);

    }
  }
}
