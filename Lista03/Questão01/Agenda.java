package javapoo.Lista03.Questão01;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> evento;

    public Agenda(){
        this.evento = new ArrayList<>();

    }   

    public void adicionarCompromisso(EntradaEmAgenda novaEntrada){
        this.evento.add(novaEntrada);
    }

    public void listaDia(int dia, int mes, int ano){

            System.out.println("Compromissos para " +dia+"/"+mes+"/"+ano);
            boolean encontrado = false;

        for(EntradaEmAgenda dadosCadastrados : this.evento){
            if(dadosCadastrados.ehNoDia(dia, mes, ano)){
            System.out.println(dadosCadastrados);
            encontrado = true;
            }
        }
         if(!encontrado){
            System.out.println("Nenhum compromisso encontrado");
        }
            System.out.println("-------------------------------");
    }

}
