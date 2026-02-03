package listaif;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = in.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = in.nextInt();

        if(num1 == num2){
            System.out.println("Números digitados são iguais");

        }else if(num1 > num2){
            System.out.println("Primeiro Número é maior que o Segundo");

        }else{
            System.out.println("Segundo Número é maior que o Primeiro");
        }


    }
    
}
