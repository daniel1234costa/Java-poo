package javapoo.ClassesU2.RgistroAcademico;

public class AlunoDemoPos {
    public static void main(String[] args){
        AlunoPos posgraduando1 = new AlunoPos("Daniel", "Engenharia", "Ataques cibernéticos", "Reudisman", "20230111438" );
        System.out.println(posgraduando1);
        Aluno aluno2 = new Aluno("Edu", "matematica", "376378");
         AlunoPos posgraduando2 = new AlunoPos(aluno2,"Engenharia", "20230111438" );
        System.out.println(posgraduando2);

    }

    
}
