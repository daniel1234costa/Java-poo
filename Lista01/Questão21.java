import java.util.Scanner;
public class Questão21 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int num;
        System.out.println("Informe um número para saber se é primo");
        num = leitor.nextInt();
        if(numeroPrimo(num,2)){
            System.out.printf("%d é um numero primo", num);
        }
         else{
            System.out.printf("%d não é um numero primo", num);
        }
        leitor.close();



    }
    public static boolean numeroPrimo(int numero, int divisor){
        if(numero <= 1){
            return false;
        }
        if(numero > 2 && numero % 2 ==0){
            return false;
        }
         if(divisor * divisor > numero){
            return true;

        }
        if(numero % divisor == 0) {
        return false;
            
            }
            return numeroPrimo(numero, divisor + 1);

        }

    }
    

