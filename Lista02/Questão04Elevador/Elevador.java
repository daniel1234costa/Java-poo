package javapoo.Lista02.Questão04Elevador;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    Elevador(int capacidade, int totalAndares){
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }
    void entra(){


        if (this.pessoasPresentes < this.capacidade){
            this.pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador. Total de pessoas: " + this.pessoasPresentes);
        } else {
            System.out.println("Elevador cheio! Não é possível entrar.");


        }
    }
     void sai(){
        if (this.pessoasPresentes > 0){
            this.pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador. Total de pessoas: " + this.pessoasPresentes);
        } else {
            System.out.println("Elevador vazio! Não há ninguém para sair.");
        }

}
    void sobe(){
        if (this.andarAtual < this.totalAndares){
            this.andarAtual++;
            System.out.println("O elevador subiu para o andar: " + this.andarAtual);
        } else {
            System.out.println("O elevador já está no último andar.");
        }
    }
    void desce(){
        if (this.andarAtual > 0){
            this.andarAtual--;
            System.out.println("O elevador desceu para o andar: " + this.andarAtual);
        } else {
            System.out.println("O elevador já está no térreo.");
        }
    }
  
}