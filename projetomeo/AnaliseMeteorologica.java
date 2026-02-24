package projetomeo;

public class AnaliseMeteorologica {
    
    public static double calcularMediaPonderadaTemperatura(double max ,double min) {

        double calculo;
        
        if(min <= -50 && max >= 60){
            System.out.println("Estão no intervalo razoável");
            
        }else{
            
        }
        
        
        calculo = (max * 0.7) + (min * 0.3);





        return calculo;
        
    }    


    public static void main(String[] args) {
        
        
    


       




        
    }
    
}
