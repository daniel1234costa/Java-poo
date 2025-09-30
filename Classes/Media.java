package javapoo.classes;

public class Media {
    public static void main (String[] args){
        System.out.println(media(...numeros:1.5,3.4,4.6,5.4,6,));


    }
    public static double media (double[] numeros){
        double med = 0.0;
        for(double n: numeros){
            med += n;
        }
        med /= numeros.length;
        return med;
    }
    
}
