package javapoo.Lista02.Questão09;
public class DemoRegistroacademico{

 public static void main (String[] args){
    RegistroAcademico Daniel = new RegistroAcademico("Daniel",2, 0.75);
    RegistroAcademico Andrei = new RegistroAcademico("Andrei",5, 0.50);
    System.out.println(Daniel.getNome());
    System.out.println("Matricula:"+ Daniel.getMatricula());
    System.out.println("Valor:" + Daniel.calculaMensalidade());
    System.out.println(Andrei.getNome());
    System.out.println("Matricula:"+ Andrei.getMatricula());
    System.out.println("Valor:" + Andrei.calculaMensalidade());
    System.out.println("Matriculas realizadas: "+ RegistroAcademico.numeroMatriculas);
   
    
    
}
}