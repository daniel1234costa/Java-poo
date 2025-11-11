package javapoo.Lista04.Questão04;

public class Pessoa {
    private String nome;
    private String naturalidade;

    public Pessoa(String nome, String naturalidade){
        this.nome = nome;
        this.naturalidade = naturalidade;

    }
    public String toString(){
        return "\nNome: "+nome+"\nNaturalidade: "+naturalidade;
    }
}
