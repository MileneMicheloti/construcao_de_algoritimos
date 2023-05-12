package ExemplosWHILE;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        
        do{
            System.out.println("[1] CADASTRAR, [2] SAIR");
            opt = sc.nextInt();
            
            switch (opt){
                case 1:
                    System.out.println("CADASTRAR");
                    break;
                case 2: 
                    System.out.println("SAIR");
                    break;
                default:
                    System.out.println("## OPÇAO INVALIDA ##");
                   
            }
        }while (opt != 2);

    }

}
