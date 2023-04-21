package Exercicios;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("User: ");
        String user = scan.nextLine();
        
        System.out.println("Senha: ");
        String senha = scan.nextLine();
        
        if (senha.equals ("milenelinda")){
            System.out.println("Ola "+user+", voce pode acessar"); 
            
        } else {
            System.out.println("Voce nao e a Milene Vaza");
        }
    }
    
}
