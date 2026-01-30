package aula26_01;
import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        int num1,num2;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = in.nextInt();
        System.out.println("Digite um número 2: ");
        num2 = in.nextInt(); 
        System.out.println("A soma é: ");
        System.out.println((num1 + num2));
    }
};
