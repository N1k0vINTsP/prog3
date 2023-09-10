

public class Operacion {  
    
    
  public static double[][] suma(double [][]matA, double [][] matB) {
     
        int filasA = matA.length;
        int columnasA = matA[0].length;
        int filasB = matB.length;
        int columnasB = matB[0].length;
     
        double[][] matR = new double[filasA][columnasA];
        
        if (filasA != filasB || columnasA != columnasB) {

            return new double[0][0];

        }
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                matR[i][j] = matA[i][j] + matB[i][j];
            }
        } 
 
    return matR;
  }

  public static double[][] producto(double [][]matA, double [][]matB) {
    
      int filasA = matA.length;
      int columnasA = matA[0].length;
      int filasB = matB.length;
      int columnasB = matB[0].length;
      
      double[][] matR = new double[filasA][columnasA];
      
      if (columnasA != filasB) {

            return new double[0][0];

      }
      
      for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    matR[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }

        return matR;

  }

    public static double[][] EscalarXMatriz(double Escalar, double [][]matA) {
        
        int filasA = matA.length;
        int columnasA = matA[0].length;
        
        
        double[][] matR = new double[filasA][columnasA];
        
         for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                    matR[i][j] = Escalar * matA[i][j];
                }
            }
         

        return matR;
        
    }
    
    public static double[][] MatrizTranspuesta (double [][]matA) {
        
        int filasA = matA.length;
        int columnasA = matA[0].length;
        
        double[][] matR = new double[filasA][columnasA];
        
         for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                    matR[j][i] = matA[i][j];
                }
            }
         

        return matR;
        
    }
    
}


