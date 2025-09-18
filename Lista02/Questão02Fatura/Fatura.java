package javapoo.Lista02.Questão02Fatura;

public class Fatura {
    int numeroIdentificacao;
    int quantidadeComprada;
    double preco;
    String descricao;

     public Fatura(int numeroIdentificacao, int quantidadeComprada, double preco, String descricao ){
        this.numeroIdentificacao = numeroIdentificacao;
        if(quantidadeComprada <= 0){
        this.quantidadeComprada = 0;
        }
        else {
        this.quantidadeComprada = quantidadeComprada;
        }
        if(preco <= 0){
        this.preco = 0;
        }
        else {
        this.preco = preco;
        }
        this.descricao = descricao;

     }
     public void calculaTotal(){
        double valorFinal = this.quantidadeComprada * this.preco;
        System.out.printf("O valor final para %d items de %f é : %.1f", quantidadeComprada, preco, valorFinal);

     }


    
}
