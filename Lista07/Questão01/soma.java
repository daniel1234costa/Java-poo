package javapoo.Lista07.Questão01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
      int a, b;
      Scanner leitor = new Scanner(System.in);
      System.out.println("Informe um número inteiro: ");
      a = lernumero(leitor);
      System.out.println("Informe um número inteiro: ");
      b = lernumero(leitor);

      System.out.println("Soma dos número informados: "+(a+b));


    }

    public static int lernumero (Scanner leitor) {
        int num = 0;
        while (true) {
            try{
                num = leitor.nextInt();
                return num;
            }
            catch(InputMismatchException excecao){
                System.out.println("Número inválido, por favor digite um número inteiro: ");
                leitor.nextLine();

            }
            
        }
    }
} 