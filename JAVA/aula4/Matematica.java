package aula4;

import java.util.Scanner;

class Matematica {
    public static void main(String[] args) {
        //area circulo: PI r^2

        //Declaração de variavel
        Scanner entradaUsuario = new Scanner(System.in);
        double x;
        double diam;
        double raio;
        double resultado;

       // double quad= Math.pow(2, 3);
        //System.out.println(quad);

        System.out.print("Digite o diamentro? ");
        diam=entradaUsuario.nextDouble();
        raio = diam/2;
        x= Math.PI; // Declarando o PI
        resultado=(Math.pow(raio,2.0) * x);

        
        System.out.println(resultado);
    }
    
}
