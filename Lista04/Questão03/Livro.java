package javapoo.Lista04.Questão03;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int ano;

    public Livro(String titulo, String autor, String editora, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }

    public String toString(){
        return "\nLivro: "+titulo+"\nAutor: "+autor+"\nEditora: "+editora+"\nAno: "+ano;
    }
    
}
