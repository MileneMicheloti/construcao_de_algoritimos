package ExerciciosFor;
import java.util.Scanner;

public class Exemplo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n;
        int x;
        int qdtDentro = 0;
        int qdtFora = 0;
        
       System.out.println("Escreva quantas vezes ira repitir: ");
         n = sc.nextInt();
        
        for (int i = 0; i < n; i++ ){
            System.out.println("Digite um numero: ");
            x = sc.nextInt();
           
           if ( x >=10 && x <=20) {
               System.out.println("Voce digitou "+x);
               qdtDentro++;
           }else{
               System.out.println("Numero invalido");
               qdtFora++;
           }
                      }
        System.out.println("Numeros validos: "+qdtDentro);
               System.out.println("Numeros validos: "+qdtFora);
    }

}
