package javapoo.Lista05.Questão05;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;
    private String localBilioteca;

    public LivroDeBiblioteca(String titulo, String autor, int numDePaginas, int anoEdicao, boolean emprestado, String localBilioteca){
        super(titulo, autor, numDePaginas, anoEdicao);
        this.emprestado = false;
        this.localBilioteca = localBilioteca;
    }

    public boolean estaEmprestado(){
        return this.emprestado;
    
    }
    
    public void empresta(){
        emprestado = true;
    }

    public void devolve(){
        emprestado = false;
    }

    public String localizacao(){
        return localBilioteca;
    }

    public String descricao(){
        return "\nDescricão: "+qualTitulo()+" Autor: "+qualAutor();
    }

    public String toString(){
        return "\n====Biblioteca====\n"+
        super.toString()+ "\nLocalização na Biblioteca: " +localizacao()+ "\nEmprestado: " + (estaEmprestado() ? "Sim" : "Não")+"\nDescrição: "+descricao();
    }


    }









    

