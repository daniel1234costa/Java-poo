package javapoo.Lista04.Questão05;

public class DemoFuncionario {
    public static void main(String args[]){
        Funcionario funcionario1 = new Funcionario("Daniel", 10000);
        System.out.println(funcionario1);
        funcionario1.aumentarSalario(1000);
        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario1);

        Assistente assistente1 = new Assistente("João", 6000, 12324327);
        System.out.println(assistente1);
        assistente1.setMatricula(1234567);
        System.out.println(assistente1.getMatricula());

        Administrativo adm1 = new Administrativo("Debora", 15000, 01175614614, "noite", 1);
        System.out.println(adm1);

        Tecnico tec1 = new Tecnico("Flavia", 5000, 123988624, 500);
        System.out.println(tec1);



    }
    
}
