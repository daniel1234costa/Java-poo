
import java.util.Scanner;
public class Questão19 {
    public static void main(String[] args) {
        int num1;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um algorismo para ver o seu fatorial: ");
        num1 = leitor.nextInt();

        for (int i = 0; i <= num1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            System.out.printf("%d! = %d \n", i, fatorial(i));
        }
            leitor.close();
    }
    public static int fatorial(int num2) {
        if (num2 == 0) {
            return 1;

        } else {
            return num2 * fatorial(num2 - 1);
        } }
}