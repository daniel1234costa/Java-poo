package javapoo.Lista02.Questão01Esporte;
public class Esporte {

    private String nomeEsporte;
    private String nomeTime;
    private int pontuacao;
    private int numeroJogadores;
    
    public Esporte (String nomeEsporte, String nomeTime, int  pontuação, int numeroJogadores){
        this.nomeTime = nomeTime;
        this.nomeEsporte = nomeEsporte;
        this.numeroJogadores = numeroJogadores;
        this.pontuacao = pontuação;

    }
        public void mostrarTime(){
            System.out.println("Esporte: " + nomeEsporte);
            System.out.println("Time: " + nomeTime);
            System.out.println("Pontuação: " + pontuacao);
            System.out.println("Numero de jogadores: " + numeroJogadores);

        }
        public void saberRanking() {
        if(pontuacao <= 100){
            System.out.println("O time " + nomeTime + " está no Ranking C com " + pontuacao + " pontos.");
        }else if (pontuacao > 100 && pontuacao<= 500) {
            System.out.println("O time " + nomeTime + " está no Ranking B com " + pontuacao + " pontos.");
        } else{
            System.out.println("O time " + nomeTime + " está no Ranking A com " + pontuacao + " pontos.");
        }
    
    }
         
         public void atualizarPontos(int novaPontuacao){
            this.pontuacao = novaPontuacao;
            System.out.printf("A pontuação do time: %s foi atualizada para %d", nomeTime, pontuacao);

        }

    
}
