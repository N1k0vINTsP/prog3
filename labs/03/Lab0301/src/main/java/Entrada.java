import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;


public class Entrada {
    private static Scanner input = new Scanner(System.in);
    
    public static int readInt(String mss){ 
    //VALIDADOR DE STRINGS EN NUM INT
        
        String cadenatxt = null;
        do {
            cadenatxt = readText(mss);
        } while (!cadenatxt.matches("-?\\d+(\\.\\d+)?"));
        return Integer.parseInt(cadenatxt);
        
    }
    
    public static int readInt(String mss, int min, int max) { 
    //VALIDADOR DE NUMERO ENTERO EN UN INTERVALO ESPECIFICO
        int Aux = 0;
        do {
            Aux = readInt(mss);
        } while (Aux < min || Aux > max);
        return Aux;
    }
    
    public static String readText(String mss){
        
        System.out.println(mss);
        return input.nextLine();
        
    }
    
    public static LinkedList<Asignatura> loadFile(String filename) {
        LinkedList<Asignatura> listAsignatura = new LinkedList<>();
        Scanner file = null;
        try {
            file = new Scanner(new File(filename));
            while (file.hasNextLine()) {
                String line[] = file.nextLine().split(";");
                System.out.println(Arrays.toString(line));
                listAsignatura.add(new Asignatura(Integer.parseInt(line[0]),
                    line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]),
                    line[4]));
            }
            System.out.println();
            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return listAsignatura;
    }
}
