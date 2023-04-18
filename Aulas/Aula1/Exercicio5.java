package Exercicios;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor do produto?");
        Float produto = scan.nextFloat();

        System.out.println("Qual o valor da porcentagem?");
        Float porcentagem = scan.nextFloat();

        Float desconto = produto * porcentagem / 100;

        Float produtoComDesconto = produto - desconto;
    
        System.out.println("\nDesconto: " + desconto);
        
        System.out.println("\nProduto com Desconto: " + produtoComDesconto);
    }
    
}
