package listaif;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int nota;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a sua nota (0 a 10): ");
        nota =in.nextInt();

        if(nota >= 6){
            System.out.println("Aprovado");

        }else{
            System.out.println("Reprovado");
        }


    }
    
}
