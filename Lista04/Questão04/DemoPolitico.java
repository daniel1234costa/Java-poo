package javapoo.Lista04.Questão04;

public class DemoPolitico {
    public static void main(String[]args){
        Pessoa pessoa1 = new Pessoa("Daniel","Pauferrence");
        System.out.println(pessoa1);

        Politico politico1 = new Politico("Jairo","Franciscodantense","PT");
        System.out.println(politico1);

        Prefeito jairo = new Prefeito("Jairo", "Franciscodantense","PT","Francisco Dantas");
        System.out.println(jairo);

        Governador fatima = new Governador("Fatima","Natalense","PT","Rio Grande do Norte");
        System.out.println(fatima);
    }
    
}
