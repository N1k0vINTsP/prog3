import java.text.DecimalFormat;

public class Imprimir {
    
    public static void Impresora_Operacion_entre_Matrices(int opc, double[][] matA, double[][] matB, double[][] matR) throws InterruptedException{
        
        int filasA = matA.length;
        int columnasA = matA[0].length;
        int filasB = matB.length;
        int columnasB = matB[0].length;
        int filasR = matR.length;
        int columnasR = matR[0].length;
        
        
        
        DecimalFormat df = new DecimalFormat("0.###");
        
        System.out.println("\n Proceso y resultado: ");
        System.out.println("");
        
        if(opc == 1 || opc ==2){
            for (int i = 0; i < filasA; i++) {
                System.out.print("[ ");
                for (int j = 0; j < columnasA; j++) {

                    System.out.print(" "+ df.format(matA[i][j]) + " ");
                }
                System.out.println(" ]");
                System.out.println();
            }

            if (opc == 1){
                System.out.println("    + ");
                System.out.println("");
            }else if (opc == 2){
                System.out.println("    X ");
                System.out.println("");  
            }

            
            for (int i = 0; i < filasB; i++) {
                System.out.print("[ ");
                for (int j = 0; j < columnasB; j++) {

                    System.out.print(" "+df.format(matB[i][j]) + " ");
                    }
                System.out.println(" ]");
                System.out.println();
            }

            System.out.println("    = ");
            System.out.println("");

            for (int i = 0; i < filasR; i++) {
                System.out.print("[ ");
                for (int j = 0; j < columnasR; j++) {

                    System.out.print(" "+df.format(matR[i][j]) + " ");
                    }

                System.out.println(" ]");
                System.out.println();

            }
        
        }
        
          
        Thread.sleep(5000);
           
    }
    
    public static void Impresora_Matriz(int opc, double Escalar, double[][] matA, double[][] matR) throws InterruptedException{
        
        int filasA = matA.length;
        int columnasA = matA[0].length;
        int filasR = matR.length;
        int columnasR = matR[0].length;
        
        DecimalFormat df = new DecimalFormat("0.###");
        
        if(opc==3){
            
            System.out.println("");
            System.out.println("    "+ df.format(Escalar));
            System.out.println("    * ");
            System.out.println("");
            
            for (int i = 0; i < filasA; i++) {
                System.out.print("[ ");
                for (int j = 0; j < columnasA; j++) {

                    System.out.print(" "+ df.format(matA[i][j]) + " ");
                }
                System.out.println(" ]");
                System.out.println();
            }
            
            System.out.println("    = ");
            System.out.println("");

            for (int i = 0; i < filasR; i++) {
                System.out.print("[ ");
                for (int j = 0; j < columnasR; j++) {

                    System.out.print(" "+df.format(matR[i][j]) + " ");
                    }

                System.out.println(" ]");
                System.out.println();
        
                }
        }else if(opc == 4){
            
            System.out.println("");
            for (int i = 0; i < filasA; i++) {
                System.out.print("[ ");
                for (int j = 0; j < columnasA; j++) {

                    System.out.print(" "+ df.format(matA[i][j]) + " ");
                }
                System.out.println(" ]");
                System.out.println();
            }
            
            System.out.println(" Matriz Transpuesta ");
            System.out.println("");

            for (int i = 0; i < filasR; i++) {
                System.out.print("[ ");
                for (int j = 0; j < columnasR; j++) {

                    System.out.print(" "+df.format(matR[i][j]) + " ");
                    }

                System.out.println(" ]");
                System.out.println();
            }
        }
        
        Thread.sleep(5000);
        
    }
    public static void ErrorSuma(double[][] matR) throws InterruptedException{
        
  
            System.out.println("\n Matrices incomplatibles. En la suma deden tener las mismas dimensiones ");
            System.out.println();
            Thread.sleep(5000);

              
    }
        
    public static void ErrorProducto(double[][] matR) throws InterruptedException{
        
            System.out.println("\n Matrices incomplatibles. En la multiplicacion el numero de columnas de la matriz A, debe ser igual al numero de filas de la matriz B ");
            System.out.println();
            Thread.sleep(5000);
        
    }

}

 

