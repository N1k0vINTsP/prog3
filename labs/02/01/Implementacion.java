import java.util.Scanner;

class Implementacion { 

  public static void main(String args[]) {
       Scanner leer = new Scanner(System.in);
       
       System.out.println("\n\t CALCULADORA MATRICIAL ");
       
            System.out.println("\n MENU DE OPERACIONES:");
            System.out.println(" 1. Suma de matrices ");
            System.out.println(" 2. producto de matrices ");
            System.out.println(" 3. Escalar por matriz ");
            System.out.println(" 4. Transponer una matriz ");
            System.out.println(" 5. Salir de la calculadora");
    
        do{
            System.out.print("\n ¿Que operacion desea realizar? ");
            int opc = leer.nextInt();
            System.out.println("");
            
        if(opc == 1){
            
            double[][] matA = Captura.readMat();
            double[][] matB = Captura.readMat();
            
        }
       
      
     


  }
}