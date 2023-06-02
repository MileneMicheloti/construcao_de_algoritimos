package Matriz;
import java.util.Scanner;

public class Exercicio1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int matriz[][] = new int [4][3];
        
         System.out.println("Insira 12 numeros: ");
         for (int linha = 0; linha < matriz.length; linha++){
             for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                 matriz[linha][coluna] = sc.nextInt();
             }
         }
         System.out.print("A matriz: \n");
         for(int linha = 0; linha < matriz.length; linha++){
             for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                 System.out.print( matriz[linha][coluna] + " ");
             }
             System.out.println("");
         }
    }
    
}
