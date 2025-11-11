package javapoo.Lista04.Questão01;

public class Computador extends Equipamento{
    private int ram;
    private String sistemaOp; 

    public Computador(String id, String nome, int ram, String sistemaOp){
        super(id, nome);
        this.ram = ram;
        this.sistemaOp= sistemaOp;

    }
    public int getram(){
        return ram;
    }
    public String getSistemaOp() {
        return sistemaOp;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }

    public String toString(){
        return super.toString()+"\nRam: "+ram+"\nSistema operacional: "+sistemaOp;
    }

    
}
