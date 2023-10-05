import java.util.Timer;
import java.util.TimerTask;

public class Temporizador extends TimerTask {
    public String msj;
    public Timer tempo;

    public Temporizador(String mensaje) {
        this.msj = mensaje;
        this.tempo = new Timer();
    }

    @Override
    public void run() {
        System.out.println("\n" + msj);
    }

    public void programarTempo(int segundos) {
        tempo.schedule(this, segundos * 1000);
    }

    public void detenerTempo_anterior() {
        this.cancel();
        tempo.cancel();
    }
}
