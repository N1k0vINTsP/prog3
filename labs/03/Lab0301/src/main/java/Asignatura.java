
public class Asignatura {
    
    int codigo;
    String nom_Asig;
    int semestre;
    int Num_creditos;
    String horario;

    Asignatura(int codigo, String nom_Asig, int semestre, int Num_creditos, String horario) {
        this.codigo = codigo;
        this.nom_Asig = nom_Asig;
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

    public String getnom_Asig() {
        return nom_Asig;
    }

    public void setnom_Asig(String nom_Asig) {
        this.nom_Asig = nom_Asig;
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
    
    @Override
    public String toString() {
        return String.format("%-7d  %-35s%5d%7s", codigo, nom_Asig, Num_creditos, horario);
    }    
}
