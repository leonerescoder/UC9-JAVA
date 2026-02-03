package listaif;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int idade;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        idade = in.nextInt();

        if(idade >= 18){
            System.out.println("Você é Maior de Idade");

        } else{
            System.out.println("Você é Menor de idade");
        };
        
    }
    
}
