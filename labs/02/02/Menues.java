import java.util.Scanner;

public class Menues {
    
    private static Scanner in = new Scanner(System.in);
    public static int nextInt() {
    

        return in.nextInt();
    }

    public static void MenuPrincipal (){

            System.out.println("\t\n\nMETODOS DE ORDENAMIENTO ");
            System.out.println("\n******Menu de Opciones****** ");
            System.out.println("\n[1] Metodo Burbuja.");
            System.out.println("[2] Metodo Insercion.");
            System.out.println("[3] Metodo Seleccion.");
            System.out.println("[4] Metodo Mergesort.");
            System.out.println("[5] Salir del programa");

    }

    public static void submenu_CantidadNumsArray (){
        
            System.out.println("\n APARTADO: SELECCION DE CANTIDAD DE NUMEROS PARA SU ARRAY ");
            System.out.println("\n ******Menu de Opciones****** ");
            System.out.println("\n[1] Arreglo de 100 numeros.");
            System.out.println("[2] Arreglo de 500 numeros.");
            System.out.println("[3] Arreglo de 1000 numeros");
            System.out.println("[4] Arreglo de 5000 numeros.");
            System.out.println("[5] Arreglo de 10000 numeros.");
            System.out.println("[6] Cantidad personalizada.");
    }

    public static int Dame_la_opcion(){

            System.out.print("\n¿Que opcion desea realizar? ");
            return nextInt();

    }

    public static int Num_cant_perso(){

            System.out.print("\n Ingrese la cantidad de numeros que desea para el Arreglo: ");
            return nextInt();

    }


 }

