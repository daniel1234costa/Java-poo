package javapoo.Lista02.Questão07Numero;

public class Numero {
    private int real;
    private int num;
    
    public Numero(int real, int num){
        this.real = real;
        this.num = num;
    }
     public Numero(int real){
        this.real = real;
        this.num = 0;
    }
      public Numero(){
        this.real = 0;
        this.num = 0;
    }
    
    public String toString() {
        if(num == 0){
            return real + "";
        }
        else if(real == 0 ){
            return num +"i";

        }
        else if(num < 0){
            return real + "-" +(num * -1) + "i";
        
        }
        else{
            return real +"+"+ num + "i";

        }
        
      
    }

    
}
