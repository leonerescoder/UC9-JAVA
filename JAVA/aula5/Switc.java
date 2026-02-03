package aula5;

//Converter 1 a 2 ou 3 em palavra
public class Switc {
    public static void main(String[] args) {

        int num;
        num = 1;

        switch(num){
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("TRÊS");
                break;
            default :
                System.out.println("fora do range");
                break;
        }
    }
    
}
