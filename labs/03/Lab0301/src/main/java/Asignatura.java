
public class Asignatura {
    
    int codigo;
    String Asignatura;
    int semestre;
    int Num_creditos;
    String horario;

    public Asignatura(int codigo, String Asignatura, int semestre, int Num_creditos, String horario) {
        this.codigo = codigo;
        this.Asignatura = Asignatura;
        this.semestre = semestre;
        this.Num_creditos = Num_creditos;
        this.horario = horario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNum_creditos() {
        return Num_creditos;
    }

    public void setNum_creditos(int Num_creditos) {
        this.Num_creditos = Num_creditos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    
}
