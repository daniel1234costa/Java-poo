
public class Questão15 {
    public static void main(String[] args){
        int num = 2, somaD=0, cont = 0;
        do{
            for(int i = 1; i < num; i++){
                if(num % i == 0){
                    somaD = somaD + i;

                }

            }
            if(somaD == num){
                cont++;
                System.out.printf("%d \n", num);

            }
            somaD = 0;
            num++;


        }while(cont < 4);


    }
}
