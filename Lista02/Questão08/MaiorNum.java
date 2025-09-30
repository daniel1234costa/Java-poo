package javapoo.Lista02.Questão08;

public class MaiorNum {

    public static int maior2 (int num1, int num2){
        if(num1 > num2){
            return num1;
        } 
        else{
            return num2;
        }

    }
    public static int maior3 (int num1, int num2, int num3){
        int maiornum = num1;
        if(num2 > maiornum){
            maiornum = num2;
        }
        if(num3 > maiornum){
            maiornum = num3;
        }
        return maiornum;
      
        
    }
    public static int maior4 (int num1, int num2, int num3, int num4){
        int maiornum = num1;
        if(num2 > maiornum){
            maiornum = num2;
        }
        if(num3 > maiornum){
            maiornum = num3;
        }
        if(num4 > maiornum){
            maiornum = num4;
        }
        return maiornum;
      
        
    }
        public static int maior5 (int num1, int num2, int num3, int num4, int num5){
        int maiornum = num1;
        if(num2 > maiornum){
            maiornum = num2;
        }
        if(num3 > maiornum){
            maiornum = num3;
        }
        if(num4 > maiornum){
            maiornum = num4;
        }
        if(num5 > maiornum){
            maiornum = num5;
        }
        return maiornum;
      
        
    }
    
    
    
    
}
