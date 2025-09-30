package javapoo.Lista02.Questão04Elevador;

public class DemoElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5, 10); 

        elevador.entra();
        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.sai();
        elevador.desce();
        elevador.desce();
        elevador.desce(); 
        elevador.sai(); 
    }
    
}
