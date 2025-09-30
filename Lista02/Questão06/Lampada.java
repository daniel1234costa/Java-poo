package javapoo.Lista02.Questão06;

public class Lampada {
    private boolean status;
    private Contador luzLigada;

    public Lampada (){
        this.status = false;
        luzLigada = new Contador();
    }
    public void ascende(){
        if(!status){
        this.status = true;
        luzLigada.imcrementar();
        }
        else{
        System.out.println("A lampada já está ligada");
        }
    }
    public void apaga(){
        this.status = false;
    }
    public void mostrarEstado(){
        if(estaLigada()){
            System.out.println("A lampada está acesa");
        }
        else{
              System.out.println("A lampada está apagada");

        }
          System.out.println("A lampada já foi ligada"+ luzLigada.getValor() +"vezes");

    }
    public boolean estaLigada(){
        return status;
    }


}
