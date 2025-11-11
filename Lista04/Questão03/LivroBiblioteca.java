package javapoo.Lista04.Questão03;

public class LivroBiblioteca extends Livro {
    private boolean estaEmprestado;
    private String localizacao;   

    public LivroBiblioteca(String titulo, String autor, String editora, int ano, String localizacao){
        super(titulo, autor, editora, ano);
        this.estaEmprestado = false;
        this.localizacao = localizacao;

        }

    public void emprestar(){
        if(!this.estaEmprestado){
        this.estaEmprestado = true;
        }
        else{
            System.out.println("\nlivro já emprestado");
        }
    }

    public void devolver(){
        this.estaEmprestado = false;
    }

    public String toString(){
        return super.toString()+"\nBiblioteca: "+localizacao+"\nEmprestado: "+(this.estaEmprestado ? "sim": "não");
    }
    
}
