
public class LacoForTreino {
  public static void main(String[] args) {
    System.out.println("testando . . . ");


    // teste para tenter desenhar um quadrado
    for (int coluna = 10; coluna > 0 ; coluna--) {
      for (int linha = 0; linha <= 10; linha++) {
        if (linha >= coluna){
          break;
        }
        System.out.print("*");

      }
      System.out.println();
    }

    System.out.println("testando novamente. . . ");



    for (int coluna = 0; coluna < 10 ; coluna++) {
      for (int linha = 0; linha < 10; linha++) {
        if (linha > coluna) {
          break;
        }
        System.out.print("\\");
      }

      System.out.println();
    }
  }
}
