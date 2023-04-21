package Exercicios;

public class Exercicio5 {

    public static void main(String[] args) {
        int idade = 18;
        String nome = "Milene";

        if (idade >= 18) {
            System.out.println("Voce e maior de 18 anos pode acessar");
        } else if (nome.equals("Milene")) {
            System.out.println("Voce e Milene pode acessar");

        } else {
            System.out.println("Voce nao pode acessar");
        }
    }
}
