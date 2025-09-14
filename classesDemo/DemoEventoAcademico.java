package javapoo.classesDemo;
import javapoo.Classes.*;

    public class DemoEventoAcademico {
        public static void main (String [] args){

            EventoAcademico evento1 = new EventoAcademico( "Ecop", null, 500);
            evento1.mostrarEvento();


            EventoAcademico evento2 = new EventoAcademico( "Ecop", "Ufersa", 500);
            evento2.mostrarEvento();

            
        }
        
    }
