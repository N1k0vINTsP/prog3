
import javax.swing.JLabel;


public class HilosCarrera extends Thread {
    
    private JLabel C;
    private InterfazCarrera IC;
    
    public HilosCarrera(JLabel C, InterfazCarrera IC){
        
        this.C = C;
        this.IC = IC;
    }
    
    public void run(){
        
        int competidor1 = 0, competidor2 = 0, competidor3 = 0, competidor4 = 0, competidor5 = 0;
        
        while (true){
            try{
                sleep((int)(Math.random()*1000));
                competidor1 = IC.getCompetidor1().getLocation().x;
                competidor2 = IC.getCompetidor2().getLocation().x;
                competidor3 = IC.getCompetidor3().getLocation().x;
                competidor4 = IC.getCompetidor4().getLocation().x;
                competidor5 = IC.getCompetidor5().getLocation().x;
                
            
            }catch (Exception e){
            }        
        }
    }
}
