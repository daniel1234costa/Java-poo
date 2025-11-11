package javapoo.Lista04.Questão02;

public class EventoDelegacao {
    private DataHora dataHora;
    private String nome;

    public EventoDelegacao(int dia, int mes, int ano, int hora, String nome){
        dataHora = new DataHora(dia, mes, ano, hora);
        this.nome = nome;
    }
    public String toString(){
        return "\nEvento: "+nome+dataHora;
    }

    
}
