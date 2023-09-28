import java.util.LinkedList;
import java.util.Queue;

public class Lab0301 {
    
    static LinkedList<Asignatura> asignaturas = new LinkedList<>();
    static Queue<Registro> regis = new LinkedList<>(); //cola para registros de asignaturas por estudiante
    static Queue<String> codigos = new LinkedList<>();// cola de codigos de los estudiantes
    
    public static void main(String[] args) {
        
        carga_BaseDatos_Asignaturas(args[0]);
        registro_estudiante();
        registro_asignaturas();
        reporte_registro_final();
        
    }
    
    public static void carga_BaseDatos_Asignaturas(String ArchTexto){
        asignaturas = Entrada.loadFile(ArchTexto);
        
    }
    public static boolean registro_estudiante(){
        
        System.out.println(" DATOS PERSONALES ESTUDIANTILES\n\n ");
        String CodigoEstu = Entrada.readText(" CODIGO ESTUDIANTIL: ");
        
        if(CodigoEstu.equals("-")){
            return false;
        }
        
        if(codigos.contains(CodigoEstu)){
            System.out.println(" Codigo " + CodigoEstu + " se encuentra en uso \n\n");
            return true;
        }
        
        String nombre = Entrada.readText("NOMRBE DEL ESTUDIANTE: ");
        String Correo = Entrada.readText("CORREO ESTUDIANTE: ");
        int semestre = Entrada.readInt("SEMESTRE: ");
        
        Estudiante estud = new Estudiante(CodigoEstu, nombre, Correo, semestre);
        regis.add(new Registro(estud));
        codigos.add(CodigoEstu);
        
        return true;
    }
    
    public static void registro_asignaturas(){
         do {
            int sem = Entrada.readInt("\nVer asignaturas del semestre: ", 1, 10);
            mostrar_asignaturas(sem);
        } while (false);
    }
    
    public static void mostrar_asignaturas(int semestre){
            for (Asignatura s : asignaturas) {
            if (s.getSemestre() == semestre)
                System.out.println(s);
        }
        System.out.println();
    }
    public static void reporte_registro_final(){
        
    }
    
}
