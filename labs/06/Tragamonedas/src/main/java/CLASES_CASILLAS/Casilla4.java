package CLASES_CASILLAS;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Casilla4 extends Thread {
    private int time;
    private volatile boolean detener = false; // Variable de control

    public Casilla4(int ms){
        
        this.time = ms;
    }
    
    public void detenerCasilla(){
        detener = true;
    }
    
    public void run(){
        while(!detener){
            
            int num_Icono = (int)(Math.random()*(5)+ 1);
            String Arch = "src\\ICONOS\\Icono"+ num_Icono + ".png";
            ImageIcon imageIcon = new ImageIcon(Arch);
            TragaMonedas.DiseñoMaquina.CasillaIco4.setIcon(imageIcon);
            
            try{
                Thread.sleep(time);
            }catch(InterruptedException ex){
                Logger.getLogger(Casilla1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
