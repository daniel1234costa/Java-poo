package javapoo.Lista04.Questão04;

public class Politico extends Pessoa {
    private String partido;
    public Politico(String nome, String naturalidade, String partido){
        super(nome, naturalidade);
        this.partido = partido;
    }
    public String toString(){
        return super.toString()+"\nPartido político: "+partido;
    }

    
}
