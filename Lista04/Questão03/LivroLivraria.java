package javapoo.Lista04.Questão03;

public class LivroLivraria extends Livro {
    private double valor;
    private int estoque;

    public LivroLivraria(String titulo, String autor, String editora, int ano, double valor, int estoque){
        super(titulo, autor, editora, ano);
        this.valor = valor;
        this.estoque = estoque;

        }   
    public void vender(int quantidade){
        if(quantidade <= this.estoque){
            this.estoque -= quantidade;
            System.out.println("Venda realizada, valor = R$"+quantidade*valor);
        }
        else{
            System.out.println("\nImpossível realizar venda(quantidade > estoque)");
        }

    }

    public String toString(){
        return super.toString()+"\nValor: "+valor+"\nDisponíveis: "+estoque;
    }
}
