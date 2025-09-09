import java.util.Scanner;
public class Questão20 {
    public static void main(String[] args ){
        Scanner leitor = new Scanner(System.in);
        int n, m;
        System.out.println("Informe m (primeiro número:  )");
        m = leitor.nextInt();
        System.out.println("Informe n (segundo número:  )");
        n = leitor.nextInt();
        System.out.printf("O MDC entre %d e %d é = %d", m, n, mdc(m,n));

        leitor.close();

        
    }
    public static int mdc( int num1, int num2){
        if(num2 > num1){
            return mdc(num2, num1);
        }
        else if(num2 == 0){
            return num1;

        }
        else{
            return mdc(num2, num1 % num2);
        }
    }
}
