# Anotações inciais para poo (java)
  Como java funciona?
  - universal : roda em qualquer máquina ou sistema pois faz o uso de uma máquina virtual para traduzir o código em bytecood do .class para qualquer sistema.
  - linguagem compilada
  - Jdk é o kit de desenvolvimento java, nele temos a máquina virtual do java, e os atributos para compilar e executar.
  
## coonvençôes de variáveis 
tipos de variáveis *int, double, float, char, byte, short, long, boolean* todas escritas em letras minúsculas.
em variáveis com palavras compostas seguimos o padrão *variavelCompostaExemplo.*
## Esttrutura básica para códigos em java:
´´´´public class *nome da classe* {
    public statis void main (String[] args){ 
    }

}´´´´
### O que revisar
- java doc 
- Convenções de variáveis
- pré e pós incremento
- recursão
- para entrada temos o *import java.util.Scanner;* 
usamos o Scanner *leitor = new Scanner(System.in);* 
 para ler uma variável, fazemos *var* = leitor.nextTipo();
 - Colocar o F no float 

 ### Iniciando a oriientação a objetos
 ##### classes :
 - Uma calsse é a definição de um tipo específico de objetosk
 - tradicionalmente todas as classes inician com letras maiusculas ex: ClasseUrso
 ##### Atributos :
 - variável ou constante da classe
 ### Encapsulamento
 - Modificadores: public, private, pakage.
 - Usar o método privado apenas quando não for necessário em outras classes, ou para alterar uma variáveil privada.
 ### Atributos estáticos
 - Um atributo que será igual para qualquer objeto da classe.
 - public static int qtd;

 # Unidade 2

### for aprimorado 
- sintaxe : 

for (parametro; array){
    var =+ parametro;
}

ps - o array do for não é uma referência a o array original.



















 import java.util.Scanner;
public class Questão10 {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        
        leitor.close();

    }
    
}



