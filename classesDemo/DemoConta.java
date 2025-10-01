package javapoo.classesDemo;
import javapoo.Classes.ContaBancaria;



public class DemoConta {
    public static void main(String [] args){
        javapoo.Classes.ContaBancaria conta1 = new ContaBancaria("João", 1000, true);
        ContaBancaria conta2 = new ContaBancaria("Maria");

       conta1.mostrarConta();
       conta2.mostrarConta();
    }
    
}
