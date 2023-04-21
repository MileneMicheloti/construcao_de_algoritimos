package Exercicios;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Me de um numero");
        int valor = scan.nextInt();
        
        if (valor > 0) {
            System.out.println("Positivo");
        }else if (valor < 0) {
            System.out.println("Negativo");
        } else if (valor == 0) {
            System.out.println("Zero");
        }
    }
    
}
