import java.util.Scanner;

public class Questão18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int base, expoente;
        System.out.println("Informe uma base: ");
        base = leitor.nextInt();
        System.out.println("Informe um expoente: ");
        expoente = leitor.nextInt();
        
        System.out.printf("%d elevado a %d : %d", base, expoente, potencia(base, expoente));
        leitor.close();

    }
    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente-1);

    }
}
