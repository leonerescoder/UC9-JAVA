package projetomeo;

public class AnaliseMeteorologica {
    
    public static double calcularMediaPonderadaTemperatura(double max ,double min) {

        double calculo;
        calculo = (max * 0.7) + (min * 0.3);
        return calculo;
        
    }    



    public static String classificaClima( double tempMedia,  int umidadeMedia){

       
      
        if(tempMedia > 30 && umidadeMedia > 75){
            return("MUITO QUENTE E ÚMIDO");
        }else if(tempMedia >=20 && tempMedia <=25 || umidadeMedia >=50 && umidadeMedia <=70 ){
            return("CONFORTAVEL");

        }else if(tempMedia < 15 && umidadeMedia < 50){
            return("FRIO E SECO");

        }else{
            return("");
        }
    }
        



        
    
            
            

    public static void main(String[] args) {
        
        double temperature ;
        int umidade;
       // Double qtdFilmes = new Double(umidade);
        
        
        
        double[][] temperaturas = {
             {32.5, 22.1},  // Cidade 1
             {28.3, 18.7},  // Cidade 2
             {35.8, 24.9},  // Cidade 3
             {30.2, 20.5},  // Cidade 4
             {25.7, 15.3}   // Cidade 5
        };
            
            
        int[][] umidades = {
                {85, 60, 75},  // Cidade 1
                {78, 55, 70},  // Cidade 2
                {90, 65, 80},  // Cidade 3
                {82, 58, 72},  // Cidade 4
                {75, 50, 68}   // Cidade 5
        };
        
        temperature =calcularMediaPonderadaTemperatura(temperaturas[0][0],temperaturas[0][1]);

       // umidade = calcularMediaPonderadaTemperatura(umidades[0][0],umidades[0][1]); Teste da Função

        //System.out.println(calcularMediaPonderadaTemperatura(temperature, umidade)); Teste da Função
        //System.out.println(calcularMediaPonderadaTemperatura(temperaturas[0][0], temperaturas[0][1])); Teste da Função

        
    
        //Inicio do Programa;

        System.out.printf("==========================================================\n");
        System.out.printf("\tSISTEMA  DE ANALISE  METEOROLÓGICA  INTELIGENTE \n" );
        System.out.printf("==========================================================");

             

            


        
        


       




        
    }
    
}
