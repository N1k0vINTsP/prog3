
import java.util.Scanner;

public class Quiz1_1{
    
    public static void main(String[] args){
        
        Scanner escribir = new Scanner(System.in);
        
        int n = escribir.nextInt();
        
        for(int i=0; i<n;i++){
           
           if((i+1)%3 == 0 && (i+1)%5 == 0){
               
               System.out.println("fizzbuzz");
               
           }else{
               
               if((i+1)%5 == 0){
                   
                   System.out.println("buzz");
                   
               }else{
                   
                   if((i+1)%3 == 0){
                       
                       System.out.println("fizz");
                       
                   }else{
                       
                       System.out.println(i+1);
                       
                   }
               }
               
           }
            
        }
        
        escribir.close();
    }
    
}
