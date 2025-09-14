public class Questão17 {
    public static void main(String[] args){
        double populacao1 = 7000, populacao2 = 20000;
        double novapop1 = 0, novapop2 = 0, anos = 0;
        do{
            novapop1 = populacao1 * 1.035;
            novapop2 = populacao2 * 1.01;
            anos++;
            populacao1 = novapop1;
            populacao2 = novapop2;
        }while(novapop1 < novapop2);

        System.out.printf("Após %.0f anos a cidade 1 atingiu um número maior ou igual ao de habitantes da cidade 2", anos);

    }
    
}
