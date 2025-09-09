
public class Exercicio {
    public static void main (String[] args) {

        String nome = "Daniel";
        String endereco = "Francisco Dantas";
        double salario = 2.500;
        String dataRecebiment = "12/09/2025";
        System.out.println("Meu nome é " +nome+ "\n estou morando em " +endereco+ "\nespero receber o salário de " +salario+ " \nna data de: " +dataRecebiment );

    }
    
} 
 
/*import java.util.Scanner;
public class Exercicio {
    public static void main (String[] args){
    float media, num1, num2, num3;
    Scanner leitor = new Scanner(System.in);
    System.out.print("informe o primeiro número\n");
    num1 = leitor.nextFloat();
     System.out.print("informe o segundo número\n");
    num2 = leitor.nextFloat();
     System.out.print("informe o terceiro número\n");
    num3 = leitor.nextFloat();
    
    media = media (num1, num2, num3);
    System.out.printf("A media dos números é %.2f ", media);
       leitor.close();
   
}
public static float media(float num1, float num2, float num3) {

    return (num1 + num2 + num3)/3;
}
} */
  /*import java.util.Scanner;

public class Exercicio {
    public static void main (String[] args){
        double num1, num2, num3, m;
        Scanner leitor = new Scanner(System.in);
        System.out.print("num1: ");
        num1 = leitor.nextDouble();             
         System.out.print("num1: ");
        num2 = leitor.nextDouble();
         System.out.print("num1: ");
        num3 = leitor.nextDouble();
            m = media(num1, num2, num3);
        System.out.print("Media:"+m);

        leitor.close();


        

        
    }
    public static double media(double num1, double num2, double num3){
        return (num1 + num2 + num3)/3;
    }

}
*/

/*import java.util.Scanner;
public class Exercicio {
    public static void main (String[] args){
        int n;
        Scanner ent = new Scanner(System.in);
        System.out.print("Valor: ");
        n = ent .nextInt();
        System.out.print( n + "!= " + fatorial(n));

        ent.close();
    }

public static int fatorial (int num) {
    System.out.print(num);
    if(num==0){
        return 1;
    }
    else {
        return num*fatorial(num-1);
    }

}
    
}*/
/*public class Triangulo{
   float l1; 
   float l2;
   float l3;
   String descicao;
   void inicializaTriangulo(float lado1, float lado2,float lado3, String desc){

    l1 = lado1;
    l2 = lado2;
    l3 = lado3;
    descicao = desc;
   }
   float calculaPerimetro(){

    
   }
}*/

/**/
 /*import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int n;
        System.out.println("Informe um número para saber a série de fibonacci até sua posição correspondente: ");
        n = leitor.nextInt();
        for(int i = 1; i <= n; i++){
        int resultado = calFibonacci(i);
        System.out.printf(" %d  ", resultado);
        }

        leitor.close();
        

    }
    public static int calFibonacci( int num){
        if(num == 1){
            return  0;
        }
        else if (num == 2 ){
            return 1;
        }
        return calFibonacci( num - 1) + calFibonacci(num - 2);

    }
}
    */
    

/*import java.util.Scanner;

public class questao_22Polinomio {
    public static void main(String[] args) {
        int grau, valorDeX;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o grau do polinômio: ");
        grau = leitor.nextInt();

        System.out.print("Informe o valor de x: ");
        valorDeX = leitor.nextInt();
        int resultado = calcularPolinomio(grau, valorDeX, leitor);
        System.out.println("Resultado do polinômio: " + resultado);

        leitor.close();
    }

    /**
     * A forma geral de um polinômio é:
     *
     * P(x) = a₀xⁿ + a₁xⁿ⁻¹ + a₂xⁿ⁻² + ⋯ + aₙ₋₁x + aₙ
     *
     * x é a variável do polinômio (pode ser um valor específico, como 2, 3, etc.).
     *
     * a₀, a₁, ..., aₙ são os coeficientes (valores que multiplicam as potências de
     * x).
     *
     * n é o grau do polinômio, ou seja, a maior potência de x.
     */
/* 
    public static int calcularPolinomio(int grauAtual, int x, Scanner leitor) {
        System.out.print("Informe o coeficiente de grau " + grauAtual + ": ");
        int coeficiente = leitor.nextInt();

        if (grauAtual == 0) {
            return coeficiente;
        }

        return x * calcularPolinomio(grauAtual - 1, x, leitor) + coeficiente;
    }
}
*/

 