public class MultiposDeTres {
  public static void main(String[] args) {
    for ( int number = 1; number <= 27; number++) {
      if(number % 3 == 0){
        System.out.print("O numero " + number + " e divisivel por 3");
      } else {
        System.out.print("O numero " + number + " nao e divisivel por 3");

      }

      System.out.println();
    }

    System.out.println("====================================");
    for (int i = 3; i <= 27; i = i + 3) {
      System.out.println(i);
    }
  }
}
