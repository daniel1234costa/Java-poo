package javapoo.Lista02.Questão01Esporte;

public class DemoEsporte {
    public static void main (String [] args){
        Esporte time1 = new Esporte("futebol", "flamengo", 200, 25 );
        time1.mostrarTime();
        time1.saberRanking();
        time1.atualizarPontos(650);

    }
    
}
