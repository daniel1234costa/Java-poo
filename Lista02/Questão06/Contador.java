package javapoo.Lista02.Questão06;

public class Contador {
    private int contador;
    public Contador(){
        this.contador = 0;
    }
    void zerar(){
        this.contador = 0;
    }
    void imcrementar(){
        this.contador++;
    }
    void imprime(){
        System.out.println("Valor atual: " + contador);

    }
    public int getValor(){
        return contador;
    }

    



    
}
