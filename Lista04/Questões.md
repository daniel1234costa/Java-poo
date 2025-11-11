6. [FGV - 2024 - INPE - Tecnologista Júnior I - Desenvolvimento de Software para Operação de Satélites] (Adaptada) Uma linguagem de programação Orientada a Objetos deve
prover suporte aos principais fundamentos do desenvolvimento Orientação a Objetos.
Entretanto, cada linguagem apresenta as suas especificidades e formas de implementar
esses fundamentos.
Sobre a Linguagem Java, analise as afirmativas a seguir.
I A palavra-chave this em Java é uma referência ao próprio objeto da classe e pode
ser usada para acessar atributos e métodos da instância atual.
II Quando uma classe ClasseB estende ClasseA com extends, significa que ClasseB
pode acessar membros privados e protegidos de ClasseA.
III A linguagem Java permite herança múltipla de classes.
(A) I, II e III.
(B) II e III, apenas.
(C) I e III, apenas.
(D) I e II, apenas.
*(E) I, apenas.*

7. [FAB - EEAR - 2023 - Sargento da Aeronáutica - Informática] Herança é um dos conceitos
fundamentais da Programação Orientada a Objetos. Analise as afirmativas abaixo sobre
esse importante pilar da POO.
I- As classes inferiores da hierarquia não herdam automaticamente todas as propriedades
e os métodos das classes superiores.
II- A herança permite basear uma nova classe na definição de uma classe previamente
existente.
III- A classe filha é conhecida como superclasse e a classe progenitora como subclasse.
IV- A herança permite o agrupamento de classes relacionadas.
Está correto o que se afirma em
(A) I e II
(B) *II e IV*
(C) I e IV
(D) II e III

8. [CESGRANRIO - 2024 - Banco da Amazônia - Técnico Científico - Tecnologia da Informação] No contexto de orientação a objeto, para as classes P, Q, R, S, T, U, sendo Q
uma classe declarada como abstrata, considere a hierarquia de classes a seguir:
• U e R herdam diretamente de S
• S e T herdam diretamente de Q
• P herda de T
Nesse contexto, é possível criar uma instância de
(A) P e associar a uma variável da classe S
(B) Q e associar a uma variável da classe Q
(C) Q e associar a uma variável da classe P
(D) S e associar a uma variável da classe U
*(E) U e associar a uma variável da classe Q*

8. [CESGRANRIO - 2024 - Banco da Amazônia - Técnico Científico - Tecnologia da Informação] No contexto de orientação a objeto, para as classes P, Q, R, S, T, U, sendo Q
uma classe declarada como abstrata, considere a hierarquia de classes a seguir:
• U e R herdam diretamente de S
• S e T herdam diretamente de Q
• P herda de T
Nesse contexto, é possível criar uma instância de
(A) P e associar a uma variável da classe S
(B) Q e associar a uma variável da classe Q
(C) Q e associar a uma variável da classe P
(D) S e associar a uma variável da classe U
*(E) U e associar a uma variável da classe Q*

9. [FGV - 2024 - CGM de Belo Horizonte - MG - Auditor Interno - Ciência da Computação -
Manhã] Com relação à programação orientada a objetos usando Java, avalie o código a
seguir.
public class Veiculo {
private String marca;
private String modelo;
public Veiculo(String marca, String modelo) {
this.marca = marca;
this.modelo = modelo;
}
public String getMarca() {
return marca;
}
public String getModelo() {
return modelo;
}
}
3
public class Mobi extends Veiculo {
private int portas;
public Mobi(String marca, String modelo, int portas) {
super(marca, modelo);
this.portas = portas;
}
public int getPortas() {
return portas;
}
}
Em relação ao código, analise as afirmativas a seguir e assinale (V) para a verdadeira e
(F) para a falsa.
( ) A classe Mobi é um exemplo de herança, um dos fundamentos da programação orientada a objetos.
( ) A classe Veiculo não pode ser instanciada porque é uma classe abstrata.
( ) O método getPortas() é um exemplo de encapsulamento, outro fundamento da programação orientada a objetos.
As afirmativas são, respectivamente,
(A) V – V – F.
*(B) V – F – V.*
(C) F – V – V.
(D) F – F – V.

10. [ IV - UFG - 2024 - Prefeitura de Rio Branco - AC - Analista de Sistemas - Especialização
em Desenvolvimento Front-End] Desenvolver aplicações eficientes requer reutilizar e estender o comportamento de classes existentes. No contexto da programação orientada
a objetos, qual conceito permite que uma classe adquira as propriedades e métodos de
outra classe?
(A) Encapsulamento.
(B) Abstração.
(C) Composição.
*(D) Herança.*
