package javapoo.Lista04.Questão02;

public class DemoEvento {
    public static void main(String[]args){
        EventoDelegacao evento1 = new EventoDelegacao(25, 12, 2025, 19, "Ceia de Natal");
        System.out.println(evento1);
    
        EventoHeranca evento2 = new EventoHeranca(04, 11, 2025, 17,"Meu aniversário"); 
        System.out.println(evento2);
    }
    
}
