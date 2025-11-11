package javapoo.Lista04.Questão01;

public class Equipamento {
    private String id;
    private String nome;

    public Equipamento(String id, String nome){
        this.id = id;
        this.nome = nome;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "\nID: "+id+" \nNome do equipamento: "+nome;
    }

    
}
