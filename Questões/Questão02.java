import java.util.Scanner;
public class Questão02 {
    public static void main ( String[] args){
        Scanner leitor = new Scanner ( System.in);
        float num1, num2, num3, media;
        System.out.print("Informe tres valores para obter sua media:\n");
        System.out.print("valor 1: ");
        num1 = leitor.nextInt();
        System.out.print("valor 2: ");
         num2 = leitor.nextInt();
        System.out.print("valor 3: ");
         num3 = leitor.nextInt();
         media = m(num1, num2, num3);
         System.out.printf("A media dos numeros %.1f %.1f %.1f e %.2f", num1, num2, num3, media);

        leitor.close();

    }
    public static float m(float nota01, float nota02, float nota03){
        return(nota01+nota02+nota03)/3;

    }
    
}
