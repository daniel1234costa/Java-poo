package javapoo.Lista03.Questão05;
import java.util.Random;

public class dados {
    public static void main(String[]args){
        Random random = new Random();
        final int  numeroJogadas = 36000000;
        int[] totalSomas = new int [13];

        System.out.println("Iniciando simulação de " + numeroJogadas + " lançamentos...");

        for(int i = 0; i < numeroJogadas; i++){
            int soma = 0;
            int dado1 = 1+ random.nextInt(6);
            int dado2 = 1+ random.nextInt(6);
            soma = dado1 + dado2;
            totalSomas[soma]++;

        }

        for(int i = 2; i < 13; i++){
            System.out.println("Número: "+i+" aparece "+totalSomas[i]+" vezes");

        }


    }
}
