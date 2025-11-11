package javapoo.Lista04.Questão05;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;

    }
    public void aumentarSalario(double valor){
        this.salario = salario + valor;
    }
    public double ganhoAnual(){
        return salario * 12 + salario;

    }

    public double getSalario(){
        return salario;
    }

    public String toString(){
        return"\nNome do funcionário: "+this.nome+"\nSalário: "+this.salario+"\nSalario anual: "+ganhoAnual();


    }
    
}
