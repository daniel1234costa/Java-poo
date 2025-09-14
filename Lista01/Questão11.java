import java.util.Scanner;
public class Questão11 {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        double x, y, x1, y1;
        System.out.println("Informe o x ");
        x = leitor.nextDouble();
         System.out.println("Informe o y ");
        y = leitor.nextDouble();
         System.out.println("Informe o x1 ");
        x1 = leitor.nextDouble();
         System.out.println("Informe o y1 ");
        y1 = leitor.nextDouble();

        if (x == x1 && y == y1 ){

            System.out.println("O mesmo ponto foi inserido duas vezes");
        }
        else if(x1 > x && y1 > y){
             System.out.println("O primeiro ponto está acima e a direita do primeiro");
        }
        else if(x1 > x && y1 < y){
             System.out.println("O primeiro ponto está abaixo e a direita do primeiro");
        }
        else if(x1 < x && y1 > y){
             System.out.println("O primeiro ponto está acima e a esquerda do primeiro");
        }
        else if(x1 < x && y1 < y){
             System.out.println("O primeiro ponto está abaixo e a esquerda do primeiro");
        }
        else if(x1 > x){
            System.out.println("O segundo ponto está a direita do primeiro ");
        }
         else if(x1 < x){
            System.out.println("O segundo ponto está a esquerda do primeiro ");
        }
         
        else if(y1 > y){
            System.out.println("O segundo ponto está a acima do primeiro  ");
        }
         else if(y1 < y){
            System.out.println("O segundo ponto está a abaixo do primeiro");
        }
        
        leitor.close();

    }
    
}
