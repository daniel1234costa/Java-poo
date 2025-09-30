package javapoo.Lista02.Questão10;

public class DemoGenerico {
    public static void main(String [] args){
        Generico <Integer> trio1 = new Generico<>(4, 4, 9);
        trio1.imprimidados();
        trio1.iguais();


    }
    
}
