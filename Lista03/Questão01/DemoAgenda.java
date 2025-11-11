package javapoo.Lista03.Questão01;

public class DemoAgenda {
    public static void main(String[] args){
        Agenda minhAgenda = new Agenda();
        EntradaEmAgenda evento1 = new EntradaEmAgenda( "1 da madrugada", "Meu aniversário", 04, 11, 2005);
        EntradaEmAgenda evento2 = new EntradaEmAgenda(" 15 da tarde", "Prova de poo", 17,11, 2025);

        minhAgenda.adicionarCompromisso(evento1);
        minhAgenda.adicionarCompromisso(evento2);

        minhAgenda.listaDia(04, 11, 2005);
        minhAgenda.listaDia(20, 11, 2025);




    }
    
}
