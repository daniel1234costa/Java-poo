package javapoo.Classes;

public class RegistroA{


    private String nome;
    private String matricula;
    private String curso;


    public RegistroA(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

     public String toString() {
        return "RegistroA [nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + "]";
    }
   

    
}
