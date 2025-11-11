package javapoo.Lista03.Questão01;
public class EntradaEmAgenda{
    private int dia, mes, ano;
    private String hora, assunto;

    public EntradaEmAgenda(String hora, String assunto, int dia, int mes, int ano){
        this.hora = hora;
        this.assunto = assunto;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString(){
         return "Data: "+dia+"/"+mes+"/"+ano+"\n" + "Horário: "+hora+"\n"+  "Assunto "+assunto+"\n";
    
    }
    public boolean ehNoDia (int dia, int mes, int ano){
        if(this.dia == dia && this.mes == mes && this.ano == ano){
            return true;
        }
        else{
            return false;
        }
    }


}