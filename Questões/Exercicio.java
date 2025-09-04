
/*public class Exercicio {
    public static void main (String[] args) {

        String nome = "Daniel";
        String endereco = "Francisco Dantas";
        double salario = 2.500;
        String dataRecebiment = "12/09/2025";
        System.out.println("Meu nome é " +nome+ "\n estou morando em " +endereco+ "\nespero receber o salário de " +salario+ " \nna data de: " +dataRecebiment );

    }
    
} */
 
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
