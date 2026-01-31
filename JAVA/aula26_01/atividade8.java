package aula26_01;
import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {
        double tempF , tempC;
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Fahrenheit: ");
        tempF= entradaUser.nextDouble();

        tempC =(tempF - 32)* 5 / 9;

        System.out.println("Esta temperatura em Celsius é: " + tempC);







    }
}
