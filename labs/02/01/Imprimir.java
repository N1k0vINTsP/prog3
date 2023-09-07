
public class Imprimir {
    
    public static void Impresora_Matricial(double[][] matR){
        
        int filasM = matR.length;
        int columnasM = matR[0].length;
        
        System.out.println("\n Matriz resultante: ");

        for (int i = 0; i < filasM; i++) {
            for (int j = 0; j < columnasM; j++) {
                System.out.print(matR[i][j] + " ");
            }
            System.out.println();
        }
    }

 }

