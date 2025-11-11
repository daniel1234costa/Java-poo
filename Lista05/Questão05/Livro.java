package javapoo.Lista05.Questão05;

public class Livro {
    private String titulo;
    private String autor;
    private int numDePaginas;
    private int anoEdicao;

        public Livro(String titulo, String autor, int numDePaginas, int anoEdicao){

            this.titulo = titulo;
            this.autor = autor;
            this.numDePaginas = numDePaginas;
            this.anoEdicao = anoEdicao;


        }

        public String qualTitulo(){
            return this.titulo;
        }

        public String qualAutor(){
            return this.autor;
        }

        public String toString(){
            return "====Livro===="+
                   "\nTitulo: "+qualTitulo()+
                   "\nAutor: "+qualAutor()+
                   "\nNúmero de páginas: "+numDePaginas+
                   "\nEdição: "+anoEdicao;
        }
    
    
}
