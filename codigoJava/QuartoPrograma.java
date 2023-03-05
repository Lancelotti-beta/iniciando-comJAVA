import Apoio.Matematica;

class QuartoPrograma {

  public static void main(String args[]) {

    Matematica m = new Matematica();
    m.soma(5, 10);
    System.out.println("Resultado: " + m.resultado);

    m.multiplica(5,15);
    System.out.println("Resultado: " + m.resultado);
  }
}
