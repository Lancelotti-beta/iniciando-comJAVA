package Apoio;

public class Matematica {

  //Aqui ficara os "atributos" da class
  public int resultado;

  //Aqui ficara os "metodos" da class
  public void soma(int number1, int number2) {
    resultado=number1+number2;
  }

  public void multiplica(int number1, int number2) {
    resultado=number1*number2;
  }

  public void mostraResultado() {
    System.out.println("Resultado: "+resultado);
  }
}
