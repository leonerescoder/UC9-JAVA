package projetomeo;

public class AnaliseMeteorologica {
    
    public static double calcularMediaPonderadaTemperatura(double max ,double min) {

        double calculo;
        calculo = (max * 0.7) + (min * 0.3);
        return calculo;
        
    } 
    public static int calcularMediaUmidade(int umid1 ,int umid2,int umid3) {

        int calc;
        calc = (umid1 + umid2 + umid3) / 3 ;
        return calc;   


    };

    public static String classificaClima( double tempMedia,  int umidadeMedia){ //Classifica os médias da temperatura
 
       
      
        if(tempMedia > 30 && umidadeMedia > 75){
            return("MUITO QUENTE E ÚMIDO");
        }else if(tempMedia >=20 && tempMedia <=25 || umidadeMedia >=50 && umidadeMedia <=70 ){
            return("CONFORTAVEL");

        }else if(tempMedia < 15 && umidadeMedia < 50){
            return("FRIO E SECO");

        }else{
            return("QUENTE MODERADO");
        }
    };
    public static String gerarAlertas(double temp,int umidade) { //Este metodo faz um relação entre a umidade e temperatura e faz e emite uma alerta
        
        if(temp > 35 || umidade > 90 ){
            return("Alerta VERMELHO");

        }else if(temp > 30 && temp < 35 &&  umidade > 80  ){
            return("Alerta Amarelo");

        }else{
            return("Alerta Verde");
        }
        
    }
    
    public static void identificarCidadeComMaiorAmplitudeTermica(double[][] a) {

            double calculo;
            
        
           for(int i = 0; i < a.length; i++){
             calculo = a[i][0]- a[i][1];
             System.out.println(calculo);
                              
           }



        };
        
        /* */

        



        
    
            
            

    public static void main(String[] args) {
        
        double temp1,temp2,temp3,temp4,temp5 ;
        double umid1,umid2,umid3,umid4,umid5;
        String classif1,classif2,classif3,classif4,classif5;
        String alert1,alert2,alert3,alert4,alert5;
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

        identificarCidadeComMaiorAmplitudeTermica(temperaturas);



        
        
        //Processamentos de dados
        //CIDADE 1
        temp1 =calcularMediaPonderadaTemperatura(temperaturas[0][0],temperaturas[0][1]);
        umid1 = calcularMediaUmidade(umidades[0][0],umidades[0][1],umidades[0][2]); 
        classif1=classificaClima(temp1,(int)umid1);
        alert1=gerarAlertas(temp1,(int)umid1);
        
        //CIDADE 2
        temp2 =calcularMediaPonderadaTemperatura(temperaturas[1][0],temperaturas[1][1]);
        umid2 = calcularMediaUmidade(umidades[1][0],umidades[1][1],umidades[1][2]); 
        classif2=classificaClima(temp1,(int)umid2);
        alert2=gerarAlertas(temp2,(int)umid2);

        //CIDADE 3
        temp3 =calcularMediaPonderadaTemperatura(temperaturas[2][0],temperaturas[2][1]);
        umid3 = calcularMediaUmidade(umidades[2][0],umidades[2][1],umidades[2][2]); 
        classif3=classificaClima(temp3,(int)umid3);
        alert3=gerarAlertas(temp3,(int)umid3);
        //CIDADE 4
        temp4 =calcularMediaPonderadaTemperatura(temperaturas[3][0],temperaturas[3][1]);
        umid4 = calcularMediaUmidade(umidades[3][0],umidades[3][1],umidades[3][2]); 
        classif4=classificaClima(temp4,(int)umid4);
        alert4=gerarAlertas(temp4,(int)umid4);

        //CIDADE 5
        temp5 =calcularMediaPonderadaTemperatura(temperaturas[4][0],temperaturas[4][1]);
        umid5 = calcularMediaUmidade(umidades[4][0],umidades[4][1],umidades[4][2]); 
        classif5=classificaClima(temp5,(int)umid5);
        alert5=gerarAlertas(temp5,(int)umid5);
        



        //System.out.println(classificaClima(temperature,(int)umidade));/// Teste da Função
        //System.out.println(calcularMediaPonderadaTemperatura(temperaturas[0][0], temperaturas[0][1])); Teste da Função


    
        //Final;

        /* 
        System.out.printf("===========================================================================\n");
        System.out.printf("\tSISTEMA  DE ANALISE  METEOROLÓGICA  INTELIGENTE \n" );
        System.out.printf("===========================================================================");
        System.out.println(" ");
        
        System.out.printf("\nANALISE DETALHADA POR CIDADE:\n" );
        System.out.printf("--------------------------------------------------------------------------\n");
        System.out.printf("CIDADE  | T.MAX  | T.MIN  | T.MÉD  | UMID   | CLASSIFICAÇÃO     | ALERTA   \n" );
        System.out.printf("---------------------------------------------------------------------------\n");
        System.out.printf("    1   |%.2f °C|%.2f °C|%.2f °C|%.2f °C|%s     | %s\n" ,temperaturas[0][0],temperaturas[0][1],temp1,umid1,classif1,alert1);
        System.out.printf("    2   |%.2f °C|%.2f °C|%.2f °C|%.2f °C|%s         | %s\n" ,temperaturas[1][0],temperaturas[1][1],temp2,umid2,classif2,alert2);
        System.out.printf("    3   |%.2f °C|%.2f °C|%.2f °C|%.2f °C|%s| %s\n" ,temperaturas[2][0],temperaturas[2][1],temp3,umid3,classif3,alert3);
        System.out.printf("    4   |%.2f °C|%.2f °C|%.2f °C|%.2f °C|%s         | %s\n" ,temperaturas[3][0],temperaturas[3][1],temp4,umid4,classif4,alert4);
        System.out.printf("    5   |%.2f °C|%.2f °C|%.2f °C|%.2f °C|%s         | %s\n" ,temperaturas[4][0],temperaturas[4][1],temp5,umid5,classif5,alert5);
        System.out.printf("---------------------------------------------------------------------------\n");
        

      


        */
        
        
        
        
        
        
        
        


       




        
    }
    
}
