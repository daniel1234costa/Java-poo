package Questão02;
import java.util.Map;
import java.util.TreeMap;

public class ContarLetrasMapa {
    public static void main(String[] args){

     String palavra = "HELLO THERE";
     String palavraProcessada = palavra.toUpperCase();
     Map<Character, Integer> contadorLetras = new TreeMap<>(); 

    for(char letra: palavraProcessada.toCharArray()){
        if(Character.isLetter(letra)){
            contadorLetras.put(letra, contadorLetras.getOrDefault(letra,0)+1);
        }

    }

    System.out.println("Letras em ordem alfabetica e com suas contagens: ");
    for(char contagem: contadorLetras.keySet()){
        System.out.println(contagem+": "+ contadorLetras.get(contagem));
    }

    }
}
