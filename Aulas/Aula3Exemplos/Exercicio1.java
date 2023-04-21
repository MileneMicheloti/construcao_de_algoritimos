package Exercicios;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
       
        System.out.println("Insira um numero: ");
        int num1 = scan.nextInt();
        
        System.out.println("Insira outro numero: ");
        int num2 = scan.nextInt();
        
        int resultado = num1 * num2;
        
        System.out.println("A multiplicacão é: "+resultado);
    }
    
}
