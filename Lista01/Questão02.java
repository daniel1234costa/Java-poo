import java.util.Scanner;
public class Questão02 {
    public static void main ( String[] args){
      Scanner leitor = new Scanner (System.in);
      double num1, num2, num3, media = 0;
      System.out.println("Informe o primeiro numero: ");
      num1 = leitor.nextDouble();
      System.out.println("Informe o segundo numero: ");
      num2 = leitor.nextDouble();
      System.out.println("Informe o terceiro numero: ");
      num3 = leitor.nextDouble();
        media = (num1 + num2 + num3)/3;
        System.out.printf("A media dos números %.1f, %.1f e %.1f é igual a %.1f: ", num1, num2, num3, media);


      leitor.close();
}}
