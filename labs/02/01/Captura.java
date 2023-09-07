

import java.util.Scanner;


class Captura {   
    private static Scanner leer = new Scanner(System.in);

  public static double nextDouble(String valor) {
    System.out.print(valor);
    return leer.nextDouble();
  }

  public static double [][] readMat(int filas, int cols) {
    
        
    System.out.println(" Ingrese la cantidad de filas de su matriz: ");
    filas = (int) nextDouble("");
    System.out.println(" Ingrese la cantidad de columnas de su matriz: ");
    cols = (int) nextDouble("");
   
    double [][] Maux = new double[filas][cols];
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < cols; j++) {
                System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                Maux[i][j] = (int) nextDouble("");
        }
     }
    return Maux;
  }
}
