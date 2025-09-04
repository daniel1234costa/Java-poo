import java.util.Scanner;
public class Questão01 {
    public static void main (String [] args){
       Scanner leitor =  new Scanner  (System.in);
        double lado, area;
        System.out.print("Informe o lado do quadrado: ");
        lado = leitor.nextDouble();
        area = lado * lado;
        System.out.print("A area do quadrado e: "+area);


       leitor.close();

    }
    
}