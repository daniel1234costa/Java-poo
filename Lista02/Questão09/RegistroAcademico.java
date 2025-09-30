package javapoo.Lista02.Questão09;


public class RegistroAcademico {
    private String nome, matricula;
    private int codigoCurso;
    private double percentualDeCobranca;
    public static int numeroMatriculas = 0;


    public RegistroAcademico (String n, int c, double p){
        this.nome = n;
        this.codigoCurso = c;
        this.percentualDeCobranca = p;
        numeroMatriculas++;
        this.matricula = "mat" + "000" + numeroMatriculas;
    }
    public double calculaMensalidade(){
        return 100.0*codigoCurso*percentualDeCobranca;
    }
    public String getNome(){
        return nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public static int getNumeroMatriculas(){
        return numeroMatriculas;
    }   

    
}
