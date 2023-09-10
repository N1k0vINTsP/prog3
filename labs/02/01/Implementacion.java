import java.util.Scanner;

public class Implementacion { 

  public static void main(String args[]) throws InterruptedException {
       Scanner leer = new Scanner(System.in);

       int opc;
       
       do{
       System.out.println("\n\t CALCULADORA MATRICIAL ");
       
            System.out.println("\n MENU DE OPERACIONES:");
            System.out.println(" 1. Suma de matrices ");
            System.out.println(" 2. producto de matrices ");
            System.out.println(" 3. Escalar por matriz ");
            System.out.println(" 4. Transponer una matriz ");
            System.out.println(" 5. Salir de la calculadora");
    
        
            System.out.print("\n ¿Que operacion desea realizar? ");
            opc = leer.nextInt();
            System.out.println("");
            
        if(opc == 1){
            
            System.out.println(" Matriz A: ");
            double[][] matA = Captura.readmat(0, 0);
            System.out.println("\n Matriz B: ");
            double[][] matB = Captura.readmat(0, 0);
            
            double[][] matR = Operacion.suma(matA, matB);
            
            if (matR.length == 0) {
                
                Imprimir.ErrorSuma(matR);
            }else{
                Imprimir.Impresora_Operacion_entre_Matrices(opc, matA, matB, matR);
            }
            
        }
        
        if(opc == 2){
            
            System.out.println(" Matriz A: ");
            double[][] matA = Captura.readmat(0, 0);
            System.out.println("\n Matriz B: ");
            double[][] matB = Captura.readmat(0, 0);
            
            double[][] matR = Operacion.producto(matA, matB);
            
            if (matR.length == 0) {
                
                Imprimir.ErrorProducto(matR);
            }else{
                Imprimir.Impresora_Operacion_entre_Matrices(opc, matA, matB, matR);
            }
            
            }
        
        if (opc == 3){
            
            System.out.print(" Escalar: ");
            double Escalar = Captura.nextDouble();
            System.out.println(" Matriz A: ");
            double[][] matA = Captura.readmat(0, 0);
            double[][] matR = Operacion.EscalarXMatriz(Escalar, matA);
            
            Imprimir.Impresora_Matriz(opc, Escalar, matA, matR);           
            
            }
        
        if (opc ==4){
            
            System.out.println(" Matriz A: ");
            double[][] matA = Captura.readmat(0, 0);
            double[][] matR = Operacion.MatrizTranspuesta(matA);
            
            Imprimir.Impresora_Matriz(opc, 0, matA, matR);
            
            }
        
        if(opc==5){
            
            System.out.println(" Hasta Luego!!! ");
            System.exit(0);
        }
        }while(opc > 0 || opc <5);
        
        }
}