package javapoo.Lista04.Questão03;

public class DemoLivros {
    public static void main(String[]args){
        LivroLivraria livro1 = new LivroLivraria("A casa de cera", "Robert Jonh", "Books", 2000, 35, 76);
        System.out.println(livro1);
        livro1.vender(10);

        LivroBiblioteca livro2 = new LivroBiblioteca("O segredo da felicidade", "João Sales", "EscritaBrasil", 1999, "Sessão 2");
        System.out.println(livro2);
        livro2.emprestar();
        System.out.println(livro2);
        livro2.emprestar();
    }
    
}
