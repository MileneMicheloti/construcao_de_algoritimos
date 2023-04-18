package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Quantos cavalos voce comprou?");
    int num = scan.nextInt();

    System.out.println("\nEntao o numero de ferraduras sera: " + num * 4);

  }

}
