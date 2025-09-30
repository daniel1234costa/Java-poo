
import java.util.Scanner;

public class Questão05 {
    public static void main(String[] args) {
        int numero, unidade, dezena, centena;
        Scanner leitor = new Scanner(System.in);

        
        do{
            System.out.println("Informe o Algarismo: ");
            numero = leitor.nextInt();
        if (numero < 100 || numero > 999) {
            System.out.println("Número inválido, digite novamente.");
        }
           
        }while(numero < 100 || numero > 999);

          unidade = numero % 10;
          dezena = (numero / 10) % 10;
          centena = (numero / 100) % 10;
          int formatoUcd = (unidade * 100) + (centena * 10) + dezena;
          
    System.out.println("Numero: " + numero + "  Formato UCD: " + formatoUcd);
          
        leitor.close();
    }
}