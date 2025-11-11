package javapoo.ClassesU2.RgistroAcademico;

public class AlunoPos {
    private Aluno alunopos;
    private String tituloTese;
    private String orientador;

    public AlunoPos(String nome, String curso, String tituloTese, String orientador, String matricula){

        this.tituloTese = tituloTese;
        this.orientador = orientador;
        alunopos = new Aluno(nome, curso, matricula);
    }

     public AlunoPos(Aluno alunopos, String tituloTese, String orientador){

        this.tituloTese = tituloTese;
        this.orientador = orientador;
        this.alunopos = alunopos;
    }

    public String toString(){
        return alunopos.toString()+" \nTitulo da tese: "+tituloTese+" \nOrientador: "+orientador;
    }

    
    
}
