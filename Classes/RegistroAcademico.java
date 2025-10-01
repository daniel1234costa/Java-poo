package javapoo.Classes;

public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoCurso;
    double percentualDeCobranca;
    public void inicializarRegistroAcademico(String n, String m, int c, double p){
        nome = n; 
        matricula = m;
        codigoCurso = c;
        percentualDeCobranca = p;


    }
    public double calculaMensalidade(){
        return 100*codigoCurso*percentualDeCobranca;
    }
    
    
}
