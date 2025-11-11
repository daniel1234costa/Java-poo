package javapoo.Lista03.Questão03;

public class Cliente {
    private int id, idade;
    private String nome, telefone;

    public Cliente(int id, int idade, String telefone, String nome){
        this.id = id;
        this.idade = idade;
        this.telefone = telefone;
        this.nome = nome;

    }

    public String toString(){
        return "\nID: " +id+ "\nNome: " +nome+ "\nIdade: " +idade+ "\nTelefone: " +telefone;
    }

    
}
