package javapoo.classesDemo;

import javapoo.Classes.*;

public class DemoRegistroacademico {
    public static void main (String[] args){
         RegistroAcademico michael = new RegistroAcademico();
         michael.inicializarRegistroAcademico("michael", "oia092787", 2, 5);
         double mensalidadeMichael = michael.calculaMensalidade();
         System.out.printf("Mensalidade de Michael: %f", mensalidadeMichael);

    }
    
}
