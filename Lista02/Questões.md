8. [FGV - 2024 - CVM - Analista CVM - Perfil 8 - TI / Sistemas e Desenvolvimento] Maria
está desenvolvendo um aplicativo desktop, com base em um ambiente de janelas, e
precisa que alguns processos sejam disponibilizados de forma global no aplicativo, sem
a necessidade de instanciar um objeto específico, e de forma que qualquer entidade
possa acessar.
Por estar trabalhando dentro da metodologia orientada a objetos, Maria precisará adicionar aos métodos globais os modificadores:
(A) privado e estático;
(B) protegido e sobrecarregado;
(C) público e abstrato;
(D) protegido e sobrescrito;
*(E) público e estático.*

9. [IV - UFG - 2024 - Prefeitura de Rio Branco - AC - Analista de Tecnologia da Informação]
Qual recurso da Análise e Projeto Orientado a Objetos separa os aspectos externos de
um objeto dos detalhes internos da implementação, possibilitando alterar a implementação de um objeto sem afetar as aplicações que o utilizam?
(A) Polimorfismo
*(B) Encapsulamento*
(C) Herança
(D) Especilização

10. [FAB - CIAAR - 2023 - Oficial de Apoio da Aeronáutica - Análise de Sistema] As classes
são fundamentais na orientação a objeto. Sobre esse assunto, marque a opção que
apresenta a composição de uma classe de forma correta.
(A) Nome da classe, operações e armazenamento de dados.
(B) Nome da classe, método construtor, armazenamento na sessão.
*(C) Nome da classe, atributos, métodos e visibilidade.*
(D) Nome da classe, configuração e implementação

11. [PR-4 UFRJ - 2023 - UFRJ - Técnico de Tecnologia da Informação - Desenvolvimento]
Considere o código em Java a seguir:
public class ContaCorrenteSobrecarga {
int conta;
int agencia;
double saldo;
void efetuarSaque(double valor) {
this.saldo = this.saldo - valor;
}
void efetuarDeposito(double valor) {
this.saldo = this.saldo + valor;
}
void imprimirAtributos(int a) {
System.out.println("Imprime Atributos!");
}
void imprimirAtributos(char a) {
System.out.println("Imprime Atributos!");
}
int imprimirAtributos(char a) {
System.out.println("Imprime Atributos!");
}
}
Baseado no código acima, assinale a alternativa correta.
*(A) Um erro de compilação será indicado, pois existem métodos com a mesma assinatura.*
(B) Os métodos efetuarSaque e efetuarDeposito não podem ter o mesmo parâmetro.
(C) A palavra this está sendo usada de forma incorreta.
(D) Um erro de compilação será indicado, pois não há um método construtor.
(E) Métodos de mesmo nome não podem ter parâmetros diferentes.

12. [IV - UFG - 2024 - Prefeitura de Rio Branco - AC - Analista de Sistemas - Especialização em Desenvolvimento Front-End] A programação orientada a objetos (POO) mudou
a forma como desenvolvedores criam aplicações, enfatizando a organização do código
em unidades lógicas. Qual é um dos principais princípios da programação orientada a
objetos?
(a) Evitar o uso de classes e objetos.
*(b) Encapsular de dados e funções em objetos.*
(c) Concentrar código em procedimentos únicos.
(d) Ignorar a herança e a reutilização de código.
