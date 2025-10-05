# Anotações Iniciais para POO (Java)

## Como Java funciona?
Universal: roda em qualquer máquina ou sistema pois usa a JVM (Máquina Virtual do Java) para traduzir o código `.class` em bytecode.  
Linguagem compilada.  
JDK (Java Development Kit): kit que contém a JVM e as ferramentas para compilar/executar.  

## Convenções de variáveis
Tipos: int, double, float, char, byte, short, long, boolean (sempre minúsculo).  
Variáveis compostas seguem o padrão camelCase: variavelCompostaExemplo.

## Estrutura básica
public class NomeDaClasse {
    public static void main(String[] args) {
        // código aqui
    }
}

## Revisar
JavaDoc  
Convenções de variáveis  
Pré e pós-incremento  
Recursão  

Entrada:
import java.util.Scanner;

Scanner leitor = new Scanner(System.in);
int var = leitor.nextInt();

Float precisa do F no final (ex: 12.5F).

## Orientação a Objetos

### Classes
Definição de tipos de objetos.  
Nome inicia com maiúscula: ClasseUrso.

### Atributos
Variáveis ou constantes da classe.  

### Encapsulamento
Modificadores: public, private, package.  
Métodos privados: usados apenas dentro da classe para atributos privados.  

### Atributos estáticos
public static int qtd;

# Unidade 2

## Arrays

### Arrays unidimensionais
int[] nomeDaReferencia;
int nomeDaReferencia[];

int[] posicoesDeMemoria = new int[1024];
medidasDeTemperatura[5] = 45.8;

Com laço:
int[] naturais = new int[11];
for (int i = 0; i < naturais.length; i++) {
    naturais[i] = i;
    System.out.println("naturais[" + i + "] = " + naturais[i]);
}

### Arrays de classes
Funcionario[] equipe = new Funcionario[5];
equipe[2] = new Funcionario("Davi Matias", 876451, 27, 12, 1940, 38200f);

Método recebendo array:
void modificaArray(double[] b)

### Arrays multidimensionais
char[][] tabuleiro = new char[8][8];

### Arrays irregulares
Matrizes com linhas de tamanhos diferentes.  

## For aprimorado
- itera pelos elementos de um array sem usar um contador
for (tipo variavel : array) {
    // uso da variável
}

O array usado no for não é referência ao original.

### Classes Arrays 
 Fornece metodos estaticos para manipulação de arrays comuns:

- sort: organiza os elementos em ordem crescente
- binarySearch: determina se um array contém um valor específico e, se contiver, onde o valor está localizado
- equals: compara arrays
- fill: insere valores em um array
- arraycopy 

### Colecoes 
- usadas para armazenar grupos de objetos relacionados

### Arraylist 
- ArrayList<T> (pacote java.util.Arraylist)
- podem ser alterar dinamicamente seu tamanho para acomodar mais elementos
- com o espaço reservado <T> podemos usar para armazenar qualquer tipo de dados ex: 
  ArrayList<String> list;


  ![Metodos uteis](![](image.png))