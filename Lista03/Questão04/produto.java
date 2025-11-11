package javapoo.Lista03.Questão04;

public class produto {

    public int calculaProduto(int... numeros){
        if(numeros.length == 0){
            return 1;
        }
        int result = 1;
        for(int num: numeros){
            result *= num;

        }
        return result;
    }
    
}
