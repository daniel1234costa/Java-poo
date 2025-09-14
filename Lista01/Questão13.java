public class Questão13 {
    public static void main(String[] args) {
     for(int i = 1; i <= 60; i++){
        if(i % 10 == 0){
            System.out.printf("[%d] \n", i);
        }
        else if( i <= 9){
            System.out.printf("[0%d]", i);
        } 
        else{
            System.out.printf("[%d]", i);
        }
     
    }
    

}}
