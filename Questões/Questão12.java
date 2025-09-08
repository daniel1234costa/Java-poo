import java.util.Scanner;

public class Questão12 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int dia;
        do {
            System.out.println("Informe um dia entre 1 e 28 de fevereiro: ");
            dia = leitor.nextInt();
                } while (dia < 1 || dia > 28);
             switch (dia) {
                
            case 1, 8, 16, 24:
                System.out.printf("Dia %d de fevereiro é um domingo", dia);
                break;
            case 2, 10, 18, 26:
                System.out.printf("Dia %d de fevereiro é segunda feira", dia);
                break;
            case 3, 11, 19, 27:
                System.out.printf("Dia %d de fevereiro é uma terça feira", dia);
                break;
            case 4, 12, 20, 28:
                System.out.printf("Dia %d de fevereiro é uma quarta feira", dia);
                break;
            case 5, 13, 21:
                System.out.printf("Dia %d de fevereiro é uma quinta", dia);
                break;
            case 6, 14, 22:
                System.out.printf("Dia %d de fevereiro é uma sexta feira", dia);
                break;
            case 7, 15, 23:
                System.out.printf("Dia %d de fevereiro é um sábado", dia);
                break;

        }

        leitor.close();

    }
}
