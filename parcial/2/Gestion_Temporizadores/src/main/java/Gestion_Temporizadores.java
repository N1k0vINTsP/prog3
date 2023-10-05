//CODIGO DE ALLAWI ESALAS Y VINCE NICOLAS PEREZ CASTILLO

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestion_Temporizadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Temporizador> temporizadores = new ArrayList<>();

        while (true) {
            System.out.println("\n\tMULTI-TEMPORIZADOR");
            System.out.println("1. Crear un nuevo temporizador");
            System.out.println("2. Detener un temporizador");
            System.out.println("3. Salir");
            System.out.print("Elija una opción:");

            int opc = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea

            if (opc == 1) {
                System.out.print("\nIngrese el mensaje para el temporizador: ");
                String mensaje = scanner.nextLine();

                System.out.print("Ingrese el tiempo de espera en segundos: ");
                int segundos = scanner.nextInt();

                Temporizador temporizador = new Temporizador(mensaje);
                temporizadores.add(temporizador);
                Thread thread = new Thread(() -> {
                    temporizador.programarTempo(segundos);
                });
                thread.start();
                System.out.println("Temporizador creado.");
            } else if (opc == 2) {
                System.out.print("Ingrese el mensaje del temporizador que desea detener:");
                scanner.nextLine();
                String mensaje = scanner.nextLine();

                for (Temporizador temporizador : temporizadores) {
                    if (temporizador.msj.equals(mensaje)) {
                        temporizador.detenerTempo_anterior();
                        temporizadores.remove(temporizador);
                        System.out.println("Temporizador detenido.");
                        break;
                    }
                }
            } else if (opc == 3) {
                break;
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}
