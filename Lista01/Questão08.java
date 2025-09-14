import java.util.Scanner;
public class Questão08 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int code;
        String nome ="Setor";
        double valor,valordesconto=0;
        System.out.println("Informe o código do setor e o valor da peca por favor");
        System.out.println("Valor da peca: ");
        valor = leitor.nextDouble();
         System.out.println("Codigo do setor:  ");
        code = leitor.nextInt();
        switch (code){
            case 222:
            nome = "Setor de eletros";
            if(valor > 500){
                valordesconto = valor * 0.90;
            } 
            else{
                valordesconto = valor;
            }
            break;
            case 111:
            nome = "Setor de cama mesa e banho";
            if(valor > 100){
                valordesconto = valor * 0.60;
            } 
            else if(valor >= 50){
                valordesconto = valor * 0.80;
            }
            else {
                valordesconto = valor * 0.90;
            }
            break;
            default:
            System.out.println("Código inválido");
        }
        System.out.printf("A compra no %s após o desconto fica por %.2f", nome, valordesconto);

    

        leitor.close();

    }
    
}
