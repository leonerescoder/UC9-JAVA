package listaif;
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        
        double num1, num2;
        int ope;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número 1: ");
        num1=in.nextDouble();
        System.out.println("Digite um número 2: ");
        num2=in.nextDouble();

        System.out.println("Digite uma operação Matematica (1: + ; 2: - ; 3: * ; 4: / ): ");
        ope =in.nextInt();

        switch (ope) {
            case 1:
                
                System.out.println("A soma é: ");
                System.out.println(num1 + num2);
                break;
            case 2:
                
                System.out.println("A subtração destes números é: ");
                System.out.println(num1 - num2);
                break;
            case 3:
                
                System.out.println("A Multiplicações destes números é: ");
                System.out.println(num1 * num2);
                break;
            case 4:
                
                System.out.println("A Divisão destes números é: ");
                System.out.println(num1 / num2);
                break;
        
            default:
                System.out.println("Digitou algo de errado: ");

                break;
        }


    }
    
}
