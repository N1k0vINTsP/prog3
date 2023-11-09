package CLASES_CASILLAS;

import javax.swing.ImageIcon;

public class Casilla2 extends Thread {
    private int time;
    
    public Casilla2(int ms){
        
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
