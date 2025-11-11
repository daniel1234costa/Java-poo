package javapoo.Classes;
import java.util.ArrayList;

public class Extrato {
    private double saldo  = 0.0;
    private ArrayList <Double> transacoes;
    

public Extrato(){
    saldo = 0.0;
    transacoes = new ArrayList<>(); 
    }

public void transacoes(double valor){
    if(valor + saldo >= 0){
        saldo += valor;
        transacoes.add(valor);

    }
}
 public String toString() {
        String str = "================\n";
        for (int i = 0; i < transacoes.size(); i++) {
            str += (i + " : " + transacoes.get(i) + "\n");
        }
        // for (Double double1 : transacoes) {
        //     str += (double1 + "\n");          
        // }
        str += ("Saldo: " + saldo + "\n================\n");
        return str;
    }
}

