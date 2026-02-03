package listaif;

import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        int weak;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número (1 A 7): ");
        weak = in.nextInt();

        switch (weak) {
            case 1:
                System.out.println("Hoje é Domingo");
                break;
            case 2:
                System.out.println("Hoje é Segunda");
                break;
            case 3:
                System.out.println("Hoje é Terça");
                break;
            case 4:
                System.out.println("Hoje é Quarta");
                break;
            case 5:
                System.out.println("Hoje é Quinta");
                break;
            case 6:
                System.out.println("Hoje é Sexta");

                break;
            case 7:
                System.out.println("Hoje é Sabado");
                break;
            
            default:
                System.out.println("Você um número incorreto");
                break;
        }
        
    }
    
}
