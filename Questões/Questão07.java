import java.util.Scanner;
public class Questão07 {
    public static void main (String[] args){
Scanner leitor = new Scanner(System.in);
double num,menornum = 0;
System.out.println("Informe tres numeros: ");
int cont = 1;
System.out.printf("Informe o %dº numero:  ", cont);
num = leitor.nextDouble();
menornum = num;
for(int i = 0; i < 2; i++){
    System.out.printf(" \nInforme o %dº numero: ", cont++);
    num = leitor.nextDouble();
    if(num < menornum){
        menornum = num;
    }


}
System.out.printf("O menor numero é : %.2f", menornum);

leitor.close();


    }
    
}
