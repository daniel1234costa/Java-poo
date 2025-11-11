package javapoo.Lista05.Questão04;


public class Desenho {
    private FiguraGeometrica figura1;
    private FiguraGeometrica figura2;
    double xF1, yF1;
    double xF2, yF2;

    public Desenho(FiguraGeometrica figura1, double xF1, double yF1, FiguraGeometrica figura2, double xF2, double yF2){
        this.figura1 = figura1;
        this.xF1 = xF1;
        this.yF1 = yF1;

        this.figura2 = figura2;
        this.xF2 = xF2;
        this.yF2 = yF2;
    }

    public void apresenta() {
       
        System.out.println(figura1.descricao()+"Coordenadas: "+"X: "+xF1+" Y: "+yF1+"\n");

      
       System.out.println(figura2.descricao()+"Coordenadas: "+"X: "+xF2+" Y: "+yF2+"\n");
    }
    
    
}
