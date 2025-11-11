package javapoo.Lista05.Questão05;

public interface ItemDeBiblioteca {
    public static final int maximoDeDiasEmprestimo = 14;
     boolean estaEmprestado();
     void empresta();
     void devolve();
     String localizacao();
     String descricao();


    
}
