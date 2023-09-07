
class Operacion {   // se recomienda guardarlo en un archivo .java separado
  public static double[][] suma(double [][]matA, double [][] matB) {

        int filasM = matA.length;
        int columnasM = matA[0].length;

        double[][] matR = new double[filasM][columnasM];

        for (int i = 0; i < filasM; i++) {
            for (int j = 0; j < columnasM; j++) {
                matR[i][j] = matA[i][j] + matB[i][j];
            }
        } 
 
    return matR;
  }

  public static double[][] producto(double [][]matA, double [][]matB) {
    
      int filasMA = matA.length;
      int columnasMA = matA[0].length;
      int columnasMB = matA[0].length;
      
      double[][] matR = new double[filasMA][columnasMA];
      
      for (int i = 0; i < filasMA; i++) {
            for (int j = 0; j < columnasMB; j++) {
                for (int k = 0; k < columnasMA; k++) {
                    matR[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }

        return matR;

  }

  // ... continuar con los demás métodos
}


