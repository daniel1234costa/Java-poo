package javapoo.Lista02.Questão10;

public class Generico <T>{
    private T a, b, c;

    public Generico(T a, T b, T c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void iguais(){

        if(a == b && b == c){
            System.out.println("todos os numero são iguais");
        }
        else if(a == b || b == c || a == c){
             System.out.println("Dois numeros são iguais");
           
        }
        else{
              System.out.println("Nenhum numero é igual");
        }
        

    }
    public void imprimidados(){
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        System.out.println("C:"+c);
    }

    
}
