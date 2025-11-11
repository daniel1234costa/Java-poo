package javapoo.Lista04.Questão04;

public class Governador extends Politico {
    private String estado;

    public Governador(String nome, String naturalidade, String partido, String estado){
        super(nome, naturalidade, partido);
        this.estado = estado;

    }

    public String toString(){
        return super.toString()+"\nEstado: "+estado;
    }

    
}
