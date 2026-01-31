package aula26_01;

import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args) {
        double price,cost;
        int quant;
        
        Scanner entradaUser = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        price=entradaUser.nextDouble();

        System.out.println("Digite a quantidade: ");
        quant=entradaUser.nextInt();

        cost=quant * price;

        System.out.printf("Valor formatado: R$ %.2f  \n", cost );








        

    }
}
