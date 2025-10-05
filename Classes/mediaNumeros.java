package javapoo.Classes;

public class mediaNumeros {
    public static void main (String[] args) {
        System.out.println("Media: "+ media(1.5, 6.8, 8.0));
        System.out.println("Media: "+ media(1.5, 6.8, 8.0, 4.6, 7.9, 9.0, 10.3));


    }

    public static double media (double...num){
        double soma = 0.0;
        for (double d: num){
            soma += d;


        }
        return (soma/num.length);

    }
    
}
