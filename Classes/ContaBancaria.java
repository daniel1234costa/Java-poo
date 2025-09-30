package javapoo.classes;

public class ContaBancaria {
    String nome;
    float saldo;
    boolean ehespecial;

    public ContaBancaria(String nome, float saldo, boolean ehespecial){
        this.nome = nome;
        this.saldo = saldo;
        this.ehespecial = ehespecial;

    }

    public ContaBancaria(String nome){
        this.nome = nome;
        this.saldo = 0;
        this.ehespecial = false;

    }
    public void mostrarConta(){

        System.out.println("Nome: " + this.nome );
        System.out.println("Saldo: " + this.saldo );
        System.out.println("É especial: " + (ehespecial? "sim":"não") );

    }
    
}
