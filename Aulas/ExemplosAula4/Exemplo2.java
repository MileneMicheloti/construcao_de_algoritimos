package ExerciciosFor;
import java.util.Scanner;

public class Exemplo2 {

       public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
           System.out.println("Digite a tabuada: ");
           int tabuada = sc.nextInt();
           
           
          for (int i = 1; i <=10; i++) {
           int resultado = i * tabuada;
           System.out.println(i + " + " +tabuada + " = " + resultado);
    }
            
   }
}
