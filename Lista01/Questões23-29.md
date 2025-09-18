# Questões 23 - 29

## 23. [UFPR - 2023 - IF-PR - Informática] Assinale a alternativa correspondente à saída que
## será apresentada na tela ao executar o código abaixo, inserindo como entrada o valor 5
## para a média e 0,75 para frequência.


import java.util.Scanner;
public class LogicaCondicional {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Entre com a media, de 0 a 10: ");
float media_aluno = input.nextFloat();
System.out.println("Entre com a frequencia de 0 a 1 (indicando 100%): ");
float frequencia = input.nextFloat();
float media = 7;
float frequencia_minima = 0.75f;
if (media_aluno >= media && frequencia >= frequencia_minima) {
System.out.println("Voce foi aprovado!");

} else if (media_aluno >= media) {
System.out.println("Solicite aprovacao mediante justificativa de
faltas.");
} else if (frequencia >= frequencia_minima) {
float recuperar = media * 2 - media_aluno;
if (recuperar <= 10)
System.out.println("Esta em recuperacao, tirar no minimo " +
recuperar);
else
System.out.println("Nao esta apto para recuperacao.");
} else {
System.out.println("Voce esta reprovado.");
}
}
}

(A) Você foi aprovado!
(B) Solicite aprovação mediante justificativa de faltas.
*(C) Está em recuperação, tirar no mínimo 9.0*
(D) Não está apto para recuperação.
(E) Você está reprovado.


24. [IDECAN - 2023 - Técnico em Tecnologia da Informação] Considere o seguinte trecho de
código escrito na Linguagem Java, considerando a openJDK 17.0.3.
public class Main {
public static void main (String[] args) {
int x, y;
y = 1;
x = 1 + ++y;
System.out.println(x--);
}
}
Ao executar este trecho de código qual o resultado mostrado na tela?

(A) 0
(B) 1
(C) 2
*(D) 3*
(E) error in line 5: invalid operation


25. [FADE - UFPE - 2023 - UFPE - Analista de Tecnologia da Informação - Área: Sistemas]
Considere o seguinte código em Java:
4
public class Main {
public static void main(String[] args) {
System.out.println(proc(5));
}
public static int proc(int k) {
if (k > 0) return proc(k - 2) + proc(k - 1);
return 1;
}
}
A execução desse código resulta na impressão do seguinte valor:

*(A) 13*
(B) 8
(C) 10
(D) 9
(E) 12


26. [FGV - 2023 - AL-MA - Programador - Superior] Analise o código Java a seguir.
public class Main {
public static void main(String[] args) {
for (int i = 0; i <= 10; i++) {
if (i == 4) {
break;
} else if (i % 2 == 0) {
continue;
}
System.out.println(i);
}
}
}
A quantidade de valores que são exibidos na execução desse código é igual a

(a) 0.
*(b) 2.*
(c) 3.
(d) 5.
(e) 9.


27. [IFRN - 2009 - Professor - Sistemas de Informação] Analise criteriosamente o código a
seguir e marque a alternativa que corresponde ao respectivo conteúdo de saída após a
execução do programa.
5
public class Operador {
public static void main(String[] args) {
int a = 100;
int b = 10;
double c = 10.5;
a = b = (int) c;
System.out.print(" | " + a++ + " | ");
if (a++ < 12 || ++b > 5) {
System.out.print(b + " | ");
} else {
System.out.println(c + " | ");
}
}
}

(A) | 10 | 9 |
*(B) | 10 | 10 |*
(C) | 10 | 10.5 |
(D) | 11 | 9 |


28. [UFC - 2013 - Analista de Tecnologia da Informação / Engenharia de Software] Considere
o seguinte programa na linguagem Java:
public class Loop {
public static void main(String[] args) {
int a, b;
a=1; b=2;
while(a<7) {
a = b+a;
do {
b=a+b;
a=a+1;
} while(b<9);
}
System.out.println(a + " e " + b);
}
}
Qual o resultado exibido da execução do programa acima?

(A) 0 e 18
(B) 1 e 19
(C) 6 e 24
(D) 9 e 17
*(E) 15 e 23*
29. [VUNESP - 2023 - EsFCEx - Oficial do Quadro Complementar] A seguir é apresentado
um trecho de código escrito na linguagem Java.
class Main {
public static void main(String[] args) {
int x;
x = 10 * 2 % 3 + 5;
System.out.println( Valor: + x++);
}
}
É correto afirmar que o valor impresso será
(A) 25
(B) 8
(C) 4
*(D) 7*
(E) 26
