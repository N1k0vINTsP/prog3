//VINCE NICOLAS PEREZ CASTILLO
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SemaforoInteligente extends javax.swing.JFrame {

    private List<Icono> sprites;
    private int FotogramaActual = 0;
    private static final int Num_Fotogramas = 8;
    
    public SemaforoInteligente(){
        // Carga las imágenes de sprites en un ArrayList
        sprites = new ArrayList<>();
        for (int i = 1; i <= Num_Fotogramas; i++) {
            Icono imagen = new Icono(getClass().getResource("Source Packages/Sprites/SpritesPeaton/peaton" + i + ".png"));
            sprites.add(imagen);
        }
        
        // Inicia un temporizador para controlar la animación
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FotogramaActual = (FotogramaActual + 1) % Num_Fotogramas;
                repaint(); // Vuelve a dibujar el componente
            }
        });
        timer.start();
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja el sprite actual en el JLabel
        IconoImg SpriteActual = sprites.get(FotogramaActual);
        g.drawImage(SpriteActual.getImage(), 0, 0, this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        HoraPico = new javax.swing.JSlider();
        PrioridadPeatonal = new javax.swing.JButton();
        AnimacionPeaton = new javax.swing.JLabel();
        AnimacionSemaforo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        PrioridadPeatonal.setText("jButton2");
        PrioridadPeatonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrioridadPeatonalActionPerformed(evt);
            }
        });

        AnimacionPeaton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/peaton1.png"))); // NOI18N

        AnimacionSemaforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Semaforo LuzRoja.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel1.setText("SEMAFORO INTELIGENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnimacionSemaforo)
                            .addComponent(AnimacionPeaton))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HoraPico, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(PrioridadPeatonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AnimacionSemaforo)
                        .addGap(18, 18, 18)
                        .addComponent(AnimacionPeaton)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(HoraPico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(PrioridadPeatonal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrioridadPeatonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrioridadPeatonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrioridadPeatonalActionPerformed

    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SemaforoInteligente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnimacionPeaton;
    private javax.swing.JLabel AnimacionSemaforo;
    private javax.swing.JSlider HoraPico;
    private javax.swing.JButton PrioridadPeatonal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
