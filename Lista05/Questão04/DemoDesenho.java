package javapoo.Lista05.Questão04;

public class DemoDesenho {
    public static void main (String[]args){
        Circulo figura1 = new Circulo();
        Quadrado figura2 = new Quadrado();
        Triangulo figura3 = new Triangulo();    


        Desenho desenho1 = new Desenho (figura1, 2, 3, figura2, 3, 8);
        desenho1.apresenta();

        Desenho desenho2 = new Desenho(figura2, 6, 2, figura3, 1, 7);
        desenho2.apresenta();


    }
    
}
