import java.util.Scanner;
public class Questão04 {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
    double graus, grausF;
    System.out.printf("Conversortemp Centígrados -> Farhenheit \n Informe a temperatura em graus centígrados: ");
    graus = leitor.nextDouble();
    grausF = graus * 9/5 + 32;
    System.out.printf("%.2f graus celsius é equivalente a %.2f  graus fahrenheit ", graus, grausF);


        leitor.close();


    }
    
}
