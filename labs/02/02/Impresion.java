import java.util.Arrays;

public class Impresion {
    
    public static void Imprimir(double [] Array, String metodo, int tamaño, long tiempo){

        System.out.println("---------------------------------------");
        
        System.out.println("[ " + Arrays.toString(Array) + " ]");
        System.out.println("Tamaño del arreglo: " + tamaño);
        System.out.println("Tiempo de ejecución: " + tiempo + " nanosegundos");
        System.out.println("--------------------------");

    }
}
