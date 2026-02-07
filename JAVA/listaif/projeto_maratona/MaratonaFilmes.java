package listaif.projeto_maratona;

public class MaratonaFilmes {
    public static void ExibirCabecalho (){
        System.out.printf("============================================= \n");
        System.out.printf("\tGERENCIADOR DE MARATONA DE FILMES  \n" );
        System.out.printf("=============================================");

    }
    public static double calcularTempoTotal(int filmes, double duracaoMedia) {
       double calculotemp;
       Double qtdFilmes = new Double(filmes);
       calculotemp = qtdFilmes * duracaoMedia;


       // System.out.printf("Cálculos: \nTempo total: "+ calculotemp + " horas");
        return calculotemp;
        
    }
    public static String classificarMaratona (double horas){
        
        

        
       

        if(horas <= 4){
            
            return("Maratona leve");

        } else if(horas > 4 && horas <= 8)  {
             
            return("Maratona Moderada");
            
        }else{
              
            return("Maratona Epica");
        }

        


        
       


    }

     public static boolean isValida(int filmes){
        return filmes > 0;

    }


    public static void main(String[] args) {

        //
        String user;


        int filmes;
        double horas;
        int calculo;
        double duracaoMedia;
        double duracaoTotal;



        
        //Recebendo as valores na variavel
        filmes=10;
        duracaoMedia=2.0;
        user="LEO";

        ExibirCabecalho();
        System.out.println( );
        System.out.println( "Informações da Maratona:  ");
        System.out.println( "Usuario: "+ user);
        System.out.println( "Filmes planejados: "+ filmes);
        System.out.println( "Duração média por filme: " + duracaoMedia);
        duracaoTotal = calcularTempoTotal(filmes, duracaoMedia);
        System.out.println("A classificção é "+ classificarMaratona(duracaoTotal));
        duracaoTotal = calcularTempoTotal(filmes, duracaoMedia);
        //classificarMaratona(duracaoTotal);
        //System.out.println("Retorno do Total "+ duracaoTotal); teste
        System.out.printf("Cálculos: \nTempo total: "+ duracaoTotal + " horas");
        
        



        
        
    }
}
