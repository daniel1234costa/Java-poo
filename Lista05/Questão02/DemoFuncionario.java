package javapoo.Lista05.Questão02;

public class DemoFuncionario {
    public static void main(String[]args){

        Funcionario funcionario1 = new Funcionario("Daniel");
        System.out.println(funcionario1);
        funcionario1.setSalarioHora(3.00);
        System.out.println(funcionario1);
        funcionario1.addHora(10);
        System.out.println(funcionario1);


        Funcionario funcionario3 = new Funcionario("Marcos", 40,"Pedreiro", 120);
        System.out.println(funcionario3);
    }
    
}
