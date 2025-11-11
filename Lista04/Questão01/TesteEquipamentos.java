package javapoo.Lista04.Questão01;

public class TesteEquipamentos {
    public static void main(String[]args){
        Equipamento equipamento1 = new Equipamento("817862", "Computador");
        System.out.println(equipamento1);

        equipamento1.setId("998117244");
        equipamento1.setNome("Celular");
        System.out.println("\nNovo id: "+equipamento1.getId()+"\nNome: "+equipamento1.getNome());

        Computador pc1 = new Computador("52456482", "Notebook asus", 8, "Windows 11");
        System.out.println(pc1);
       
        pc1.setRam(12);
        pc1.setSistemaOp("Windows 12");
        pc1.setId("7366533");
        pc1.setNome("Notebook dell");
        System.out.println("\nNovo id: "+pc1.getId()+"\nNovo nome: "+pc1.getNome()+"\nNova ram: "+pc1.getram()+"\nSistema operacional: "+pc1.getSistemaOp());
        
        
    }   
    
}
