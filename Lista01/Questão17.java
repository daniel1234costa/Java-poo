public class Questão17 {
    public static void main(String[] args){
        double populacao1 = 7000, populacao2 = 20000;
        double anos = 0;
        do{
             populacao1 =  populacao1 * 1.035;
             populacao2 = populacao2 * 1.01;
            anos++;
        }while(populacao1 < populacao2);

        System.out.printf("Após %.0f anos a cidade 1 atingiu um número maior ou igual ao de habitantes da cidade 2", anos);

    }
    
}
