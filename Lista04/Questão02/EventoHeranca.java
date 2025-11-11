package javapoo.Lista04.Questão02;

public class EventoHeranca extends DataHora {
    private String nomeEvento;

    public EventoHeranca(int dia, int mes, int ano, int hora, String nomeEvento){
        super(dia, mes, ano, hora);
        this.nomeEvento = nomeEvento;
    }
    public String toString(){
        return "\nEvento: "+nomeEvento+super.toString();
    }
    
}
