package aula26_01;

import java.util.Scanner;



public class atividade16 {
    public static void calculeTip() {
        double total;
        double porcentagem;
        double resultado;
        double endtotal;


        Scanner in = new Scanner(System.in);
        System.out.println("Digite o total da Conta: ");
        total = in.nextDouble();
        System.out.println("Digite o valor a porcentagem da gorjeta: ");
        porcentagem = in.nextDouble();

        resultado= (total * porcentagem) / 100;
        endtotal =  resultado + total;


        System.out.printf("O valor da gorjeta foi " + resultado + "\nValor total é " + endtotal);
        
    }


    public static void main(String[] args) {
        calculeTip();
        








        
        


    }
    
}
