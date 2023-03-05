public class TestandoLacos{

  public static void main (String[] args){
    System.out.println( " ----- Calculo de Gauss na força Bruta, no 'dedo' ----- ");


    int number = 10;

    int contador = 0;
    int total = 0;



    while(contador <= number){ //Toda variavel criada aqui dentro, "morre" aqui

      System.out.println( "Calculo de Gauss: ");
      System.out.println( total + " = " + total + " + " + contador);

      int resultado = total += contador;
      System.out.println(resultado);

      System.out.println( "Contador da maquina: ");
      System.out.println( contador + " = " + contador + " +  1");
      ++contador;

      System.out.println(contador);

     //ou seja, ao fina desse laço a variavel "morre" || resetada
     //e volta ao valor inicial declarado.
    }

    System.out.println("Resultado do contador = " + contador);
    System.out.println("Resultado da soma de Gauss do numero " + number + " = " + total);




  }
}
