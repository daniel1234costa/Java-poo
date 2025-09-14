import java.util.Scanner;
public class Questão03 {
    public static void main (String[] args){
       Scanner leitor = new Scanner(System.in);
        double angulo, seno, cosseno, tangente, secante, cotangente, cossecante, radiano;

        System.out.println("informe o angulo em graus ");
        angulo = leitor.nextDouble();
        radiano = Math.toRadians(angulo);
        seno = Math.sin(radiano);
        cosseno = Math.cos(radiano);
        tangente = Math.tan(radiano);
        secante = 1/cosseno;
        cossecante = 1/seno;
        cotangente = 1/tangente;
        System.out.printf("O angulo informado %.2fº graus equivale a %.2f em radiano e temos o seno: %.2f cosseno: %.2f tangente: %.2f secante: %.2f cotangente: %.2f cossecante: %.2f  ", angulo, radiano, seno, cosseno, tangente, secante, cotangente, cossecante);
        leitor.close();
        

    }
    
}
