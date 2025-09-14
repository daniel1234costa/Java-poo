
import java.util.Scanner;

public class Questão14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int termo1, termo2, termoF, num;
        System.out.println("Informe um número para obter sua sequência de fibonacci (n > 0) ");
        num = leitor.nextInt();
         termo1 = 0;
         termo2 = 1;
         if(num  == 0){
             System.out.println("O número deve ser > 0 ");
         }
         else if(num  == 1){
             System.out.print(" 0 ");
         }
         else {
             System.out.print("0  1  ");

        for (int i = 2; i < num; i++) {
            termoF = termo1 + termo2;
            System.out.printf("%d  ", termoF);
            termo1 = termo2;
            termo2 = termoF;

        }}

        leitor.close();

    }
}
