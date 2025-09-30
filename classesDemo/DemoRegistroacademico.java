package javapoo.classesdemo;

import javapoo.classes.*;

public class DemoRegistroacademico {
    public static void main (String[] args){
         RegistroAcademico michael = new RegistroAcademico();
         michael.inicializarRegistroAcademico("michael", "oia092787", 2, 6);
         double mensalidadeMichael = michael.calculaMensalidade();
         System.out.printf("Mensalidade de Michael: %f", mensalidadeMichael);

    }
    
}
