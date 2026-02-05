package aula10;

public class Dist {
    //Atividade 1: realizar o cálculo dentro de um metodo.
    //static void calculaDistancia(double x1,double x2)


     static void caculaDistancia(double x1,double y1,double x2,double y2){
        double dx,dy,distX,distY,resultado;
        dx= x2-x1;
        dy= y2-y1;


        distX =Math.pow(dx,2.0); //eleva um numero
        distY=Math.pow(dy,2.0);
        
        resultado =Math.sqrt((distX+ distY));
        
        System.out.println("A distancia é: " + resultado);



    }
    public static void main(String[] args) {
       caculaDistancia(0, 0, 0, 1);


       
        /* 
        x1=0;
        y1=1;
        x2=0;
        y2=1;
        */
         /*Exemplo de Desenvolvimento incremental;
        //calcular a distancia entre dois pontos;
        //distancia dada por : dist ={(x2 -x1)^2 + (y2-y1)^1/2}
        double x1,x2,y1,y2 ,distX,distY,dx,dy,resultado;

        
        dx= x1-x2;
        dy= y2-y1;

        distX =Math.pow(dx,2.0); //eleva um numero
        distY=Math.pow(dy,2.0);
        
        resultado =Math.sqrt((distX+ distY));
        
        System.out.println("A distancia é: " + resultado);
         */



    }
    
}
