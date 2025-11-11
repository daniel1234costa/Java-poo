package Questão03;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        String simbolos = "((((()))))";

        System.out.println(simbolos+" Está balanceada? "+(estaBalanceado(simbolos) ?  " Sim ": " Não "));
       

        
    }
    public static boolean estaBalanceado(String exemplo){
        Stack<Character> pilha = new Stack <>();
        for(Character caractere: exemplo.toCharArray()){
            if(caractere == '('){
                pilha.push(caractere);
            }
            else if(caractere == ')'){
                if(pilha.isEmpty()){
                    return false;
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
    
}
