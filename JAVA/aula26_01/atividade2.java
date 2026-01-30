package aula26_01;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        double tempC;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor em Celsius: ");
        tempC=in.nextDouble();
        System.out.println("A temperatura em Celsius é: " + tempC);
    }
}
