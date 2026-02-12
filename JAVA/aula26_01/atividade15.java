package aula26_01;

import java.util.Scanner;

public class atividade15 {

    public static void imprimirSaudacaoPersonalizada(String nome) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = in.nextLine();
        System.out.printf("Olá "+ nome +",\nbem-vindo");


        
    }
    public static void main(String[] args) {
        
        imprimirSaudacaoPersonalizada(null);
        
        

        
    }
    
}
