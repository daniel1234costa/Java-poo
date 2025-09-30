import java.util.Scanner;
public class Questão09 {
    public static void main (String []args){
        Scanner leitor = new Scanner(System.in);
        int numero,cont=0,naipe = 0;
            do {
                System.out.println("Informe um número entre 1 e 4 ");
                naipe = leitor.nextInt();


             }while(naipe < 1 || naipe > 4);
             do {
                System.out.println("Informe um número entre 1 e 13 ");
                numero = leitor.nextInt();
                if(numero >= 1 && numero <= 13){
                    cont++;
                }


             }while(cont == 0);
             
             switch(numero) {
                case 1:
                System.out.println("Sua carta é um ás de");
                break;
                 case 2:
                System.out.println("Sua carta é um dois de");
                break;
                 case 3:
                System.out.println("Sua carta é um três de");
                break;
                 case 4:
                System.out.println("Sua carta é um quatro de");
                break;
                 case 5:
                System.out.println("Sua carta é um cinco de");
                break;
                 case 6:
                System.out.println("Sua carta é um seis de");
                break;
                 case 7:
                System.out.println("Sua carta é um sete de");
                break;
                 case 8:
                System.out.println("Sua carta é um oito de");
                break;
                 case 9:
                System.out.println("Sua carta é um nove de");
                break;
                 case 10:
                System.out.println("Sua carta é um dez de");
                break;
                 case 11:
                System.out.println("Sua carta é um valete de");
                break;
                 case 12:
                System.out.println("Sua carta é uma dama de");
                break;
                 case 13:
                System.out.println("Sua carta é um rei de");
                break;
                default:
                System.out.println("numero invalido");
                
            } 
            if (naipe == 1){
                System.out.println("ouros");
            }
             else if (naipe == 2){
                System.out.println("paus");
            }
             else if (naipe == 3){
                System.out.println("copas");
            }
             else {
                System.out.println("espadas");
            }
                

  leitor.close();
             }
      
 }
    

