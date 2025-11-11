package javapoo.Lista04.Questão05;

public class Tecnico extends Assistente {
    private double bonus;
    public Tecnico(String nome, double salario, int matricula, double bonus){
        super(nome, salario, matricula);
        this.bonus = bonus;

    }
    public double ganhoAnual(){
        return (getSalario() + this.bonus ) * 12 + getSalario() + bonus;
    }
    
    public String toString(){
        return "\n[Técnico]"+super.toString()+"\nBonus salarial: "+bonus;
    }
    


    
}
