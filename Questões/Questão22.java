import java.util.Scanner;
public class Questão22{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int n, x;
        System.out.println("Informe o grau do polinomio: ");
        n = leitor.nextInt();
        System.out.println("Informe o x : ");
        x = leitor.nextInt();
        int result  = polinomio(n, x, leitor);
        System.out.printf("O polinomio informado resulta em: %d ", result);


        
        leitor.close();


    }
    public static int polinomio(int grau, int valordex, Scanner leitor){
        System.out.printf("informe o coeficiente de grau %d: ", grau);
        int a = leitor.nextInt();
        if(grau == 0){
            return a;
        }
        return valordex * polinomio(grau - 1, valordex, leitor) + a;


    }

}