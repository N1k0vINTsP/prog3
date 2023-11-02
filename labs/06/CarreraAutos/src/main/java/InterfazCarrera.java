
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
        jLabel1 = new javax.swing.JLabel();
        Competidor1 = new javax.swing.JLabel();
        Competidor2 = new javax.swing.JLabel();
        Competidor3 = new javax.swing.JLabel();
        Competidor4 = new javax.swing.JLabel();
        Competidor5 = new javax.swing.JLabel();
        META = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jLabel1.setText("CARRERA DE AUTOS");

        Competidor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Competidores/Carro1.png"))); // NOI18N

        Competidor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Competidores/Carro2.png"))); // NOI18N

        Competidor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Competidores/Carro3.png"))); // NOI18N

        Competidor4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Competidores/Carro4.png"))); // NOI18N

        Competidor5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Competidores/Carro5.png"))); // NOI18N

        META.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MetaImg/MarcaMeta.jpg"))); // NOI18N

        jButton1.setText("En sus marcas, listos...FUERAA!!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Competidor4)
                    .addComponent(Competidor5)
                    .addComponent(Competidor2)
                    .addComponent(Competidor3)
                    .addComponent(Competidor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(META, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel1)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
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
                        .addGap(79, 79, 79)
                        .addComponent(META, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel Competidor1;
    private javax.swing.JLabel Competidor2;
    private javax.swing.JLabel Competidor3;
    private javax.swing.JLabel Competidor4;
    private javax.swing.JLabel Competidor5;
    private javax.swing.JLabel META;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
