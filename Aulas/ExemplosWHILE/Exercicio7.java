package ExemplosWHILE;

public class Exercicio7 {

    public static void main(String[] args) {
        int valor = 1;
        
        // com x
      for (int i = 1; i <= 5; i++){
          for (int j = 1; j <= i; j++){
              System.out.println("X");
          }
          System.out.println("");
      }
      // com numeros
      for (int i = 1; i <=5; i++){
          for (int j = 1; j <= i; j++){
              System.out.println(valor + " ");
              valor++;
          }
          System.out.println("");
      }
    }

}
