package Exercicios;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      
        System.out.println("Digite um numero decimal: ");
        float num1 = scan.nextFloat();
        
        System.out.println("Digite outro numero decimal: ");
        float num2 = scan.nextFloat();
        
        float soma = num1 + num2;
        float sub = num1 - num2;
        float mult = num1 * num2;
        float div = num1 / num2;
        
        System.out.println("\nResultados: \n");
        System.out.println("Soma= "+soma);
        System.out.println("Subtracao= "+sub);
        System.out.println("Multiplicacao= "+mult);
        System.out.println("Divisao= "+div);
    }
    
}
