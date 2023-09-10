import java.util.Scanner;

public class ValidadorPositivo {
    
    public static int Num_positivo_Obligatorio(String N){
        
        Scanner Ponum = new Scanner(System.in);
        int Num;
        
        do{
            
            System.out.print(N);
            while(!Ponum.hasNextInt()){
                System.out.print("   INGRESE UN NUMERO VALIDO: ");
                Ponum.next();
            }
            
            Num = Ponum.nextInt();
            if (Num <=0){
                System.out.print("   INGRESE UN NUMERO POSITIVO: ");
            }
        }while (Num <= 0);
        
        return Num;
    }
}
