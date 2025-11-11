package javapoo.Lista04.Questão02;

public class DataHora {
    private int  dia, mes, ano, hora;

    public DataHora(int dia, int mes, int ano, int hora){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
      
    }
    public String toString(){
        return "\nData/horário: "+dia+"/"+mes+"/"+ano+"\nAs "+hora+"h";
    }
    
}
