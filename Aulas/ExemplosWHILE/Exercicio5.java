package ExemplosWHILE;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      
        System.out.println("Senha: ");
        String senha = sc.nextLine();
        
        boolean podeEntrar = senha.equals ("123") ? true : false;
        
        System.out.println(podeEntrar);
    }

}
