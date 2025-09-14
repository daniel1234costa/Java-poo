package javapoo.Classes;

public class EventoAcademico {
    String nomeEvento;
    String localEvento;
    int numeroDeParticipantes;

    public EventoAcademico(String nomeEvento, String localEvento, int numeroDeParticipantes){
        this.nomeEvento = nomeEvento;
        this.localEvento = (localEvento == null) ? "desconhecido" : localEvento;
        
        this.numeroDeParticipantes = numeroDeParticipantes;


    }


    public void mostrarEvento(){
        System.out.println("===========");
        System.out.println("Nome: " + nomeEvento);
        System.out.println("Local: " + localEvento);
        System.out.println(numeroDeParticipantes);

    }
    
}
