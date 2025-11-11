package javapoo.ClassesU2.RgistroAcademico;

public class Aluno {
    private String nomeAluno;
    private String curso;
    private String matricula;

    public Aluno(String nomeAluno, String curso, String matricula){
        this.nomeAluno = nomeAluno;
        this.curso = curso;
        this.matricula = matricula;

    }
    
    public String toString(){
        return "Aluno: "+nomeAluno+" \nCurso: "+curso+" \nmatricula: "+matricula;
    }
}
