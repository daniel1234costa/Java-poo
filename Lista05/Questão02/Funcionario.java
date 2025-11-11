package javapoo.Lista05.Questão02;

public class Funcionario {
    private String nome;
    private double salarioHora;
    private String funcao;
    private int horasTrabalhadas;

    public Funcionario(String nome){
        this.nome = nome;
        this.salarioHora = 2.00;
        this.funcao = "Geral";
        this.horasTrabalhadas = 0;


    }

    public Funcionario(String nome, double salarioHora, String funcao, int horasTrabalhadas){
        this.nome = nome;
        this.salarioHora = salarioHora;
        this.funcao = funcao;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calculaSalario(){
        return horasTrabalhadas * salarioHora;
    }

    public double getSalarioHora(){
        return salarioHora;
    }

    public void setSalarioHora(double novosalarioHora){
        if(novosalarioHora > salarioHora){
            this.salarioHora = novosalarioHora;
        }
        else{
            System.out.println("O novo salário deve ser maior que o anterior");
        }
    }

    public void addHora(int quantidade){
        this.horasTrabalhadas += quantidade;

    }
    
    public String toString(){
        return "\nNome: "+nome+"\nFunção: "+funcao+"\nSalário por hora: "+salarioHora+"\nHoras trabalhadas: "+horasTrabalhadas+"\nSalário atingido: R$"+calculaSalario();
    }
}
