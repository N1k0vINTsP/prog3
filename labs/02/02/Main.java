import java.util.Random;

public class Main{

    public static void main(String[] args){

        boolean SaliendoProg = false;
        Random random = new Random();

        while(!SaliendoProg){

            Menues.MenuPrincipal();
            int opc = Menues.Dame_la_opcion();

            switch(opc){
                case 1:

                    Operar( "Burbuja", random );
                    break;

                case 2: 

                    Operar( "Insercion", random);
                    break;

                case 3:

                    Operar( "Seleccion", random);
                    break;

                case 4:

                    Operar( "Mergesort", random);
                    break;

                case 5:

                    System.out.println("\n¡HASTA LA PROXIMAAA! ");
                    SaliendoProg = true;
                    break;

                default:

                    System.out.print("\n Opcion no valida. Intente de nuevo: ");
                    return;

            }
        }
    }
        
    public static void Operar( String metodo, Random random){

        Menues.submenu_CantidadNumsArray();
        int OpcElementos = Menues.Dame_la_opcion();
        double [] ArrayResultante;

        switch(OpcElementos){
                case 1:

                    ArrayResultante = randomArray(random, 100);
                    break;

                case 2:

                    ArrayResultante = randomArray(random, 500);
                    break;

                case 3:

                    ArrayResultante = randomArray(random, 1000);
                    break;

                case 4:

                    ArrayResultante = randomArray(random, 5000);
                    break;

                case 5:

                    ArrayResultante = randomArray(random, 10000);
                    break;

                case 6:

                    int Cantperso = Menues.Num_cant_perso();
                    ArrayResultante = randomArray(random, Cantperso);
                    break;

                default:

                    System.out.print(" Opcion no valida. Intente de nuevo: ");
                    return;

            }

        double[] arregloPrint = null;

        long Deltatiempo = 0;
        long Tiempoinicial;
        long tiempoFinal;

        if (metodo.equals("Burbuja")) {

            Tiempoinicial = System.nanoTime();
            arregloPrint = Metodos.METDBurbuja(ArrayResultante);
            tiempoFinal = System.nanoTime();

            Deltatiempo = tiempoFinal - Tiempoinicial;

        } else if (metodo.equals("Inserción")) {
            
            Tiempoinicial = System.nanoTime();
            arregloPrint = Metodos.METDInsercion(ArrayResultante);
            tiempoFinal = System.nanoTime();

            Deltatiempo = tiempoFinal - Tiempoinicial;

        } else if (metodo.equals("Selección")) {

            Tiempoinicial = System.nanoTime();
            arregloPrint = Metodos.METDSeleccion(ArrayResultante);
            tiempoFinal = System.nanoTime();

            Deltatiempo = tiempoFinal - Tiempoinicial;

        } else if (metodo.equals("Mergesort")) {

            Tiempoinicial = System.nanoTime();
            arregloPrint = Metodos.METDMergesort(ArrayResultante, 0, 0);
            tiempoFinal = System.nanoTime();

            Deltatiempo = tiempoFinal - Tiempoinicial;

        }


        Impresion.Imprimir(arregloPrint, metodo, ArrayResultante.length, Deltatiempo);
            
    }

    public static double[] randomArray(Random random, int tamaño) {

        double[] ArrayAux = new double[tamaño];
        for (int i = 0; i < tamaño; i++) {
            ArrayAux[i] = random.nextDouble();
            
        }
        return ArrayAux;
    }


}