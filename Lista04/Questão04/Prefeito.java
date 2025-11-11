package javapoo.Lista04.Questão04;

public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(String nome, String naturalidade, String partido, String cidade){
        super(nome, naturalidade, partido);
        this.cidade = cidade;
    }
    public String toString(){
        return "\nPrefeito: "+super.toString()+"\nCidade: "+cidade;
    }
    
}
