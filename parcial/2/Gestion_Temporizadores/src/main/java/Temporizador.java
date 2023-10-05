import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temporizador extends TimerTask {
    private String msj;
    private Timer tempo;

    public Temporizador(String mensaje) {
        this.msj = msj;
        this.tempo = new Timer();
    }
       @Override
    public void run() {
        System.out.println(msj);
    }

    public void programarTempo(int segundos) {
        tempo.schedule(this, segundos * 1000);
    }

    public void detenerTempo_anterior() {
        this.cancel();
        tempo.cancel();
    }
}