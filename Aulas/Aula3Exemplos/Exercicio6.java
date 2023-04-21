package Exercicios;
import java.util.Scanner;

public class Exercicio6 {
     public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
         System.out.println("Ta de folga?");
         boolean folga = scan.nextBoolean();
         
         System.out.println("Ta sol?");
         boolean tasol = scan.nextBoolean();
         
         if (tasol && folga) {
             System.out.println("irei passear hoje!! :)");
         } else {
             System.out.println("nao irei passear :(");
         }
                 
         
    }
    
}
