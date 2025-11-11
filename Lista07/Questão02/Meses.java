package javapoo.Lista07.Questão02;
import java.util.Scanner;

public class Meses {
    public static void main(String[] args){
    Scanner leitor = new Scanner (System.in);
    int indice;
    String[] meses = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                             "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    
                             

    while(true){
          
          try{
            System.out.println("Informe um número inteiro de entre 1-12");
            indice = leitor.nextInt();
            System.out.println("Mês do ano correspondente: "+ meses[indice -1]);
            break;
            
          }
          catch(ArrayIndexOutOfBoundsException excecao){
            System.out.println("O número informado deve ser algun inteiro de 1 a 12, tente novamente");
            leitor.nextLine();
          } 
          catch(Exception e){
            System.out.println("Número inválido, digite um inteiro: ");
            leitor.nextLine();
          }

         
}

     leitor.close();

  

    
    
}

}