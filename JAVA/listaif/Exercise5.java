package listaif;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = in.nextInt();

        if(num < 0){

            System.out.println("Este número negativo");
            

        } else if(num > 0){
            System.out.println("Este número é positivo");

        }else {
            System.out.println("Este número é igual a zero");
        };
    }
}
