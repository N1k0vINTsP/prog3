
import javax.swing.JLabel;


public class InterfazCarrera extends javax.swing.JFrame {

    public InterfazCarrera() {
        initComponents();
    }

    public JLabel getCompetidor1(){
        
        return Competidor1;
    }
    
    public JLabel getCompetidor2(){
        
        return Competidor2;
    }
    
    public JLabel getCompetidor3(){
        
        return Competidor3;
    }
    
    public JLabel getCompetidor4(){
        
        return Competidor4;
    }
    
    public JLabel getCompetidor5(){
        
        return Competidor5;
    }
    
    public JLabel getMETA(){
        
        return META;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Competidor1 = new javax.swing.JLabel();
        Competidor2 = new javax.swing.JLabel();
        Competidor3 = new javax.swing.JLabel();
        Competidor4 = new javax.swing.JLabel();
        Competidor5 = new javax.swing.JLabel();
        META = new javax.swing.JLabel();
        BOTON_INICIO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Competidor1.setIcon(new javax.swing.ImageIcon("D:\\UNIVERSIDAD\\DEBERES 3° Semestre\\PROGRAMACION III\\prog3-main\\labs\\06\\CarreraAutos\\src\\main\\java\\Carro1.png")); // NOI18N

        Competidor2.setIcon(new javax.swing.ImageIcon("D:\\UNIVERSIDAD\\DEBERES 3° Semestre\\PROGRAMACION III\\prog3-main\\labs\\06\\CarreraAutos\\src\\main\\java\\Carro2.png")); // NOI18N

        Competidor3.setIcon(new javax.swing.ImageIcon("D:\\UNIVERSIDAD\\DEBERES 3° Semestre\\PROGRAMACION III\\prog3-main\\labs\\06\\CarreraAutos\\src\\main\\java\\Carro3.png")); // NOI18N

        Competidor4.setIcon(new javax.swing.ImageIcon("D:\\UNIVERSIDAD\\DEBERES 3° Semestre\\PROGRAMACION III\\prog3-main\\labs\\06\\CarreraAutos\\src\\main\\java\\Carro4.png")); // NOI18N

        Competidor5.setIcon(new javax.swing.ImageIcon("D:\\UNIVERSIDAD\\DEBERES 3° Semestre\\PROGRAMACION III\\prog3-main\\labs\\06\\CarreraAutos\\src\\main\\java\\Carro5.png")); // NOI18N

        META.setIcon(new javax.swing.ImageIcon("D:\\UNIVERSIDAD\\DEBERES 3° Semestre\\PROGRAMACION III\\prog3-main\\labs\\06\\CarreraAutos\\src\\main\\java\\MarcaMeta.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Competidor4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Competidor5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Competidor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Competidor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Competidor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(META, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(Competidor1)
                        .addGap(18, 18, 18)
                        .addComponent(Competidor2)
                        .addGap(18, 18, 18)
                        .addComponent(Competidor3)
                        .addGap(18, 18, 18)
                        .addComponent(Competidor4)
                        .addGap(18, 18, 18)
                        .addComponent(Competidor5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(META, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BOTON_INICIO.setText("En sus marcas, listos...FUERAA!!!");
        BOTON_INICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_INICIOActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jLabel1.setText("CARRERA DE AUTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BOTON_INICIO, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358))
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel1)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BOTON_INICIO, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTON_INICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_INICIOActionPerformed
        // TODO add your handling code here:
        
        Competidor1.setLocation(0, Competidor1.getLocation().y);
        Competidor2.setLocation(0, Competidor2.getLocation().y);
        Competidor3.setLocation(0, Competidor3.getLocation().y);
        Competidor4.setLocation(0, Competidor4.getLocation().y);
        Competidor5.setLocation(0, Competidor5.getLocation().y);
        
        HilosCarrera Hilo1 = new HilosCarrera(Competidor1, this);
        HilosCarrera Hilo2 = new HilosCarrera(Competidor2, this);
        HilosCarrera Hilo3 = new HilosCarrera(Competidor3, this);
        HilosCarrera Hilo4 = new HilosCarrera(Competidor4, this);
        HilosCarrera Hilo5 = new HilosCarrera(Competidor5, this);
        
        Hilo1.start();
        Hilo2.start();
        Hilo3.start();
        Hilo4.start();
        Hilo5.start();
        
        
    }//GEN-LAST:event_BOTON_INICIOActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCarrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON_INICIO;
    private javax.swing.JLabel Competidor1;
    private javax.swing.JLabel Competidor2;
    private javax.swing.JLabel Competidor3;
    private javax.swing.JLabel Competidor4;
    private javax.swing.JLabel Competidor5;
    private javax.swing.JLabel META;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
