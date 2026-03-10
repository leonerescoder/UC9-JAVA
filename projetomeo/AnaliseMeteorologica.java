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
    
    
    public static double identificarCidadeComMaiorAmplitudeTermica(double[][] a) {
        
        double calculo;
        double amplitude =0;
        for(int i = 0; i < a.length; i++){
             calculo = a[i][0]- a[i][1];
            
            
            if (calculo > amplitude) {
                amplitude  = calculo;
            };

           }
            return Math.round(amplitude * 10.0) /10.0;
         
            
               
            
            
            
    };
    public static void saidaProcessamento(double a[][],int b [][]) {
        double temp,umid;
        String classific, alert;
        int indicador=0;

        for(int i= 0; i < a.length;i++){
            temp =calcularMediaPonderadaTemperatura(a[i][0],a[i][1]);
            umid = calcularMediaUmidade(b[i][0],b[i][1],b[i][2]); 
            classific=classificaClima(temp,(int)umid);
            alert=gerarAlertas(temp,(int)umid);
            indicador+=1;

            System.out.printf("    %d   |%-5.2f °C|%-5.2f °C|%-5.2f °C|%-5.2f °C|%-20s|%-17s\n" ,indicador,a[i][0],a[i][1],temp,umid,classific,alert);



            


        }

        
        
    }


    
        
         
    public static void main(String[] args) {
        
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

        ///System.out.println( "a: " + identificarCidadeComMaiorAmplitudeTermica(temperaturas));



        //System.out.println(classificaClima(temperature,(int)umidade));/// Teste da Função
        //System.out.println(calcularMediaPonderadaTemperatura(temperaturas[0][0], temperaturas[0][1])); Teste da Função


    
        
        System.out.printf("===========================================================================\n");
        System.out.printf("\tSISTEMA  DE ANALISE  METEOROLÓGICA  INTELIGENTE \n" );
        System.out.printf("===========================================================================");
        System.out.println(" ");
        
        System.out.printf("\nANALISE DETALHADA POR CIDADE:\n" );
        System.out.printf("--------------------------------------------------------------------------\n");
        System.out.printf("CIDADE  | T.MAX  | T.MIN  | T.MÉD  | UMID   | CLASSIFICAÇÃO      | ALERTA   \n" );
        System.out.printf("---------------------------------------------------------------------------\n");
        saidaProcessamento(temperaturas, umidades);
        System.out.printf("---------------------------------------------------------------------------\n");
        

      


        
        
        
        
        
        
        
        
        


       




        
    }
    
}
