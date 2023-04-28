package ExerciciosFor;
import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in); 
       
      
               
       System.out.println("Escreva quantas vezes ira repitir: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++ ){
            System.out.println("Digite um numero: ");
           int x = sc.nextInt();
           
           if ( x >=10 && x <=20) {
               System.out.println("Voce digitou "+x);
           }else{
               System.out.println("Numero invalido");
           }
               
           }
    }

}
