

import java.util.Scanner;


public class Captura {   
    private static Scanner leer = new Scanner(System.in);

  public static double nextDouble() {
    

    return leer.nextDouble();
  }

  public static double [][] readmat(int filas, int cols) {
    
    
    System.out.print(" Ingrese la cantidad de filas de su matriz: ");
    filas = ValidadorPositivo.Num_positivo_Obligatorio("");
    System.out.print(" Ingrese la cantidad de columnas de su matriz: ");
    cols = ValidadorPositivo.Num_positivo_Obligatorio( "");

    
    double [][] Maux = new double[filas][cols];
    System.out.println("\n  Ingrese los elementos en: ");
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < cols; j++) {
                System.out.print("  La posición [" + i + "][" + j + "]: ");        
                Maux[i][j] = (double) nextDouble();
        }
     }
    return Maux;
  }
}
