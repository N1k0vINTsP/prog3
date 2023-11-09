
import javax.swing.JLabel;
import javax.swing.JOptionPane;


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
                
               if(IC.getCompetidor1() != null) {
                    competidor1 = IC.getCompetidor1().getLocation().x;
                }
               if(IC.getCompetidor2() != null) {
                    competidor2 = IC.getCompetidor2().getLocation().x;
                }
               if(IC.getCompetidor3() != null) {
                    competidor3 = IC.getCompetidor3().getLocation().x;
                }
               if(IC.getCompetidor4() != null) {
                    competidor4 = IC.getCompetidor4().getLocation().x;
                }
               if(IC.getCompetidor5() != null) {
                    competidor5 = IC.getCompetidor5().getLocation().x;
                }
                
                if(competidor1<IC.getMETA().getLocation().x-10 && competidor2<IC.getMETA().getLocation().x-10
                        && competidor3<IC.getMETA().getLocation().x-10 && competidor4<IC.getMETA().getLocation().x-10
                        && competidor5<IC.getMETA().getLocation().x-10){
                    
                    C.setLocation(C.getLocation().x+10, C.getLocation().y);
                    IC.repaint();
                }else{
                    
                    break;
                }
                    
                
            
            }catch (InterruptedException e){
            }    
            
            if(C.getLocation().x >= IC.getMETA().getLocation().x-10){
                
                if (competidor1 > competidor2 && competidor1 > competidor3 && competidor1 > competidor4
                        && competidor1 > competidor5) {

                        JOptionPane.showMessageDialog(null, "GANO EL COMPETIDOR 1");
                        
                    } else if (competidor2 > competidor1 && competidor2 > competidor3 && competidor2 > competidor4
                                && competidor2 > competidor5) {

                                JOptionPane.showMessageDialog(null, "GANO EL COMPETIDOR 2");
                        
                        } else if (competidor3 > competidor1 && competidor3 > competidor2 && competidor3 > competidor4
                                    && competidor3 > competidor5) {

                                         JOptionPane.showMessageDialog(null, "GANO EL COMPETIDOR 3");
                    
                            } else if (competidor4 > competidor1 && competidor4 > competidor2 && competidor4 > competidor3
                                        && competidor4 > competidor5) {

                                            JOptionPane.showMessageDialog(null, "GANO EL COMPETIDOR 4");
                        
                                } else if (competidor5 > competidor1 && competidor5 > competidor2 && competidor5 > competidor3
                                            && competidor5 > competidor4) {

                                                JOptionPane.showMessageDialog(null, "GANO EL COMPETIDOR 5");
                        
                                            } else {
                    
                                                    JOptionPane.showMessageDialog(null, "EMPATE");
                                                }
            }
        }
    }
}
