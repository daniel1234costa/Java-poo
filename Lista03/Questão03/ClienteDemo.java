package javapoo.Lista03.Questão03;
import java.util.Scanner;
import java.util.ArrayList;

public class ClienteDemo {
    public static void main(String[] args){

    int idCliente, idadeCliente;
    String nomeCliente, telefoneCliente;
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    Scanner leitor = new Scanner(System.in);

    System.out.println("Cadastro de clientes, para finalizar informe um id negativo");

    int indice = 0;

    while(true){

        indice++;

          System.out.print("\nInforme os seguintes dados do " +indice+"º"+ " cliente: ");
            System.out.print("\n Id: ");
            idCliente = leitor.nextInt();
            leitor.nextLine();

             if(idCliente<0){
                System.out.println("\nCadastro de clientes encerrado!");
                break;
            }
               System.out.print(" Nome: ");
                nomeCliente = leitor.nextLine();

                   System.out.print(" Idade: ");
                   idadeCliente = leitor.nextInt();
                   leitor.nextLine();
                   

                      System.out.print(" Telefone: ");
                      telefoneCliente = leitor.nextLine();
        
       Cliente novoCliente = new Cliente(idCliente, idadeCliente,telefoneCliente, nomeCliente);
       listaClientes.add(novoCliente);

    }
    
    if(listaClientes.isEmpty()){
        System.out.println("Nenhum cliente cadastrado");

    }
    else{
        System.out.println("Clientes cadastrados:\n");
        for(Cliente meusclientes: listaClientes){
            System.out.println(meusclientes);

           }
    }
    



    leitor.close();
}
}
