package ExemplosWHILE;

import java.util.Scanner;

public class Exemplo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isReady = true;
        int opt = 0;

        do {
            System.out.println("Quer sair? Digite 2");

            if (opt == 2) {
                isReady = false;
            }
        } while (isReady);
    
    }
}

