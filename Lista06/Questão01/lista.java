package Questão01;

import java.util.LinkedList;

public class lista{
    public static void main(String[]args){
        LinkedList<Character> lista1 = new LinkedList<>();

        lista1.add('A');
        lista1.add('C');
        lista1.add('U');
        lista1.add('D');
        lista1.add('G');
        lista1.add('K');
        lista1.add('L');
        lista1.add('I');
        lista1.add('E');
        lista1.add('W');
        
        LinkedList<Character> novaLista = new LinkedList<>();
        for(int i = lista1.size() - 1; i>=0; i--){
            novaLista.add(lista1.get(i));
        }
        System.out.println("Lista original: "+ lista1);
        System.out.println("Lista invertida: "+novaLista);


    }

}