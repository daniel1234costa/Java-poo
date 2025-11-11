package javapoo.Lista03.Questão04;

public class produtoDemo {
    public static void main(String[] args){
        produto calcularProd = new produto();
        int prod1 = calcularProd.calculaProduto();
        System.out.println("O produto de 0 números:"+prod1);
        int prod2 = calcularProd.calculaProduto(1, 3, 1, 10);
        System.out.println("O produto é: "+prod2);
         System.out.println("O produto é: "+calcularProd.calculaProduto(2,3,4,5));
    }
    
}
