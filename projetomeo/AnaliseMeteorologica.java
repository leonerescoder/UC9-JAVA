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

    //Classifica os médias da temperatura
    public static String classificaClima( double tempMedia,  int umidadeMedia){ 
       
        
       
      
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
    /*
     public static String gerarAlertas(double temp,int umidade) { //Este metodo faz um relação entre a umidade e temperatura e faz e emite uma alerta
    
    if(temp > 35 || umidade > 90 ){
        return("Alerta VERMELHO");
        
    }else if(temp > 30 && temp < 35 &&  umidade > 80  ){
            return("Alerta Amarelo");

        }else{
            return("Alerta Verde");
        }
    }
    */ 

    

    //Metodo que clasiisfica a amplitudes das cidades
    public static double identificarCidadeComMaiorAmplitudeTermica(double[][] a) {
        
        double calculo;
        double amplitude =0;
        //int indicador=1;
        for(int i = 0; i < a.length; i++){
             calculo = a[i][0]- a[i][1];
             //System.out.println(calculo); Teste de Função
            
            
            if (calculo > amplitude) {
                amplitude  = calculo;
               // indicador += 1;
                
            };

           }
            return Math.round(amplitude * 10.0) /10.0; //arrendonda para casa decimal
            
         
            
               
            
            
            
    };
    //Metodo que realiza a automatização.
    public static void saidaProcessamento(double a[][],int b [][]) {
        //declaração de variaveis
        double temp;
        int umid;
        String classific; //alert; 
        int indicador=0;
        
        //Loop que realiza a automatização dos dados
        for(int i= 0; i < a.length;i++){
            temp =calcularMediaPonderadaTemperatura(a[i][0],a[i][1]);
            umid = calcularMediaUmidade(b[i][0],b[i][1],b[i][2]); 
            classific=classificaClima(temp,umid);
            //alert=gerarAlertas(temp,umid);
            indicador+=1; 

            System.out.printf("    %d   |%-5.2f °C|%-5.2f °C|%-5.2f °C|%-2d°C|%-20s|\n" ,indicador,a[i][0],a[i][1],temp,umid,classific);//%-17s| alert); // Linha de Formatação em printf aonde




            


        }

        
        
    }


    
        
         
    public static void main(String[] args) {
        //Array de dados ;
        
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



       //System.out.println( "a: " + identificarCidadeComMaiorAmplitudeTermica(temperaturas)); //Teste de Função



        //System.out.println(classificaClima(temperature,(int)umidade));/// Teste da Função
        //System.out.println(calcularMediaPonderadaTemperatura(temperaturas[0][0], temperaturas[0][1])); Teste da Função


        //Saida do código;
        
        System.out.printf("===========================================================================\n");
        System.out.printf("\tSISTEMA  DE ANALISE  METEOROLÓGICA  INTELIGENTE \n" );
        System.out.printf("===========================================================================");
        System.out.println(" ");
        
        System.out.printf("\nANALISE DETALHADA POR CIDADE:\n" );
        System.out.printf("--------------------------------------------------------------------------\n");
        System.out.printf("CIDADE  | T.MAX  | T.MIN  | T.MÉD  | UMID   | CLASSIFICAÇÃO         \n" );
        System.out.printf("---------------------------------------------------------------------------\n");
        saidaProcessamento(temperaturas, umidades);
        System.out.printf("ESTATÍSTICAS GERAIS: \n" );
        double amplitude= identificarCidadeComMaiorAmplitudeTermica(temperaturas);

        System.out.printf("Maior amplitude térmica:(%.2f) \n",amplitude );

        System.out.printf("---------------------------------------------------------------------------\n");
        

      


        
        
        
        
        
        
        
        
        


       




        
    }
    
}
