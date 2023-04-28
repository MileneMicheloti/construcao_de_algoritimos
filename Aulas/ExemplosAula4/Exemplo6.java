package ExerciciosFor;
import java.util.Scanner;
        
public class Exemplo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Escreva quantas vezes ira repitir: ");
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++ ){
            System.out.println("Digite um numero: ");
           int x = scan.nextInt();
           
            System.out.println("Numero digitado foi: "+x);
        }
    }

}
