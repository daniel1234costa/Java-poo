package javapoo.Lista05.Questão05;

public class DemoLivro {
    public static void main(String[]args){
        LivroDeBiblioteca livro1 = new LivroDeBiblioteca("Algoritmos", "Ada Lovelace", 200, 2015, false, "Corredor 2 prateleira A");
        System.out.println(livro1);
        livro1.empresta();
        System.out.println(livro1);
        System.out.println("Prazo para devolução: "+ ItemDeBiblioteca.maximoDeDiasEmprestimo+" dias");
        livro1.devolve();
        System.out.println(livro1);
      
        


    }
    
}
