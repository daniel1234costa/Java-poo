package javapoo.Lista03.Questão02;

public class Matriz {
    private float matriz[][];

    public Matriz(float ind1, float ind2, float ind3, float ind4){
        this.matriz = new float[2][2];
        this.matriz[0][0] = ind1;
        this.matriz[0][1] = ind2;
        this.matriz[1][0] = ind3;
        this.matriz[1][1] = ind4;
    }
    public void determinante(){
        float determinanteM = (this.matriz[0][0] * this.matriz[1][1]) - (this.matriz[0][1] * this.matriz[1][0]);
        System.out.println("Determinante da matriz 2x2 = "+determinanteM);
    }
    public void imprimeMatriz(){
        System.out.println(this.matriz[0][0]+"   "+this.matriz[0][1]);
        System.out.println();
        System.out.println(this.matriz[1][0]+"   "+this.matriz[1][1]);
    }
}
