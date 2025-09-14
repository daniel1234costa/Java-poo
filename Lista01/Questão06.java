import java.util.Scanner;
public class Questão06 {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        int dia=0, hora=0, minuto=0, valm;
        System.out.println("Informe uma quantidade de minutos:");
        valm = leitor.nextInt();
         while(valm < 0) {
        System.out.println("Valor inválido. Por favor, informe uma quantidade de minutos maior ou igual a zero:");
        valm = leitor.nextInt();
        }

        int valorin = valm;
       
        do{

             if(valm >= 1440) {
                  dia++;
                  valm = valm - 1440;

            }
            else if(valm >= 60){
                hora ++;
                valm = valm - 60;
            } 
            else if(valm >= 1){
                minuto ++;
                valm = valm - 1;
            }


        }while(valm > 0);

        System.out.printf("%d minutos é igual a %d dias %d horas e %d minutos", valorin, dia, hora,minuto);

    

        leitor.close();

 
    }
    
}
