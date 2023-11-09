package CLASES_CASILLAS;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Casilla1 extends Thread {
    
    private int time;
    
    public Casilla1(int ms){
        
        this.time = ms;
    }
    
    public void run(){
        while(true){
            
            int num_Icono = (int)(Math.random()*(5)+ 1);
            String Arch = "src\\ICONOS\\Icono"+ num_Icono + ".png";
            ImageIcon imageIcon = new ImageIcon(Arch);
            DiseñoMaquina.Ico1.setIcon(imageIcon);
        }
    }
}
