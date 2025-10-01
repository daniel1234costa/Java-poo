package javapoo.Classes;

public class Pessoa {
    private String nome;
    private double altura;
    public Pessoa (String nome, double altura){
        this.nome = nome;
        this.altura = altura;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String toString(){
        return "nome: " + this.nome + " altura: " + this.altura;
    }

    
}
