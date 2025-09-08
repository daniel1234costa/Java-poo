import java.util.Scanner;

public class Questão16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0, centena = 0, dezena = 0, unidade = 0;
        for (int i = 100; i <= 999; i++) {
            unidade = i % 10;
            dezena = (i / 10) % 10;
            centena = i / 100;
            soma = (centena * centena * centena) + (dezena * dezena * dezena) + (unidade * unidade * unidade);
            if (soma == i) {
                System.out.printf("%d  ", i);
            }
        }

        leitor.close();

    }

}
