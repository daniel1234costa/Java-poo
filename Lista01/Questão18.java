import java.util.Scanner;

public class Questão18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double base, expoente;
        System.out.println("Informe uma base: ");
        base = leitor.nextInt();
        System.out.println("Informe um expoente: ");
        expoente = leitor.nextInt();
        double result = potencia(base, expoente);
        System.out.printf("%.0f elevado a %.0f : %.0f", base, expoente, result);
        leitor.close();

    }

    public static double potencia(double base, double expoente) {
        if (expoente == 0) {
            return 1;
        }

        double resultado = 1.0;

        for (int i = 0; i < expoente; i++) {
            resultado = resultado * base;
        }

        return resultado;
    }
}
