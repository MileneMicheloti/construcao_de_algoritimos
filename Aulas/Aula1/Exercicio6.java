package Exercicios;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lider");
        int lider = scan.nextInt();

        System.out.println("Time Lanterna");
        int lanterna = scan.nextInt();

        int vitorias = (lider - lanterna) / 3;

    
        System.out.println("\nVitorias necessarias: " + vitorias);
        
        
    }
    
}
