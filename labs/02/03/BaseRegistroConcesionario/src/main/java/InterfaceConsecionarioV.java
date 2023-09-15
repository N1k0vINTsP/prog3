
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class InterfaceConsecionarioV extends javax.swing.JFrame {

    public class Carro{
        
        String Marca;
        int Modelo;
        String Color;
        int Kilometraje;

        public Carro(String Marca, int Modelo, String Color, int Kilometraje) {
            this.Marca = Marca;
            this.Modelo = Modelo;
            this.Color = Color;
            this.Kilometraje = Kilometraje;
        }
                
    }
    public InterfaceConsecionarioV() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setVisible(true); 
    }

    //METODO BURBUJA
     public static double[] METDBurbuja(double[] Array) 
    {
        int l = Array.length;

        double[] ArrayOrdenado = Arrays.copyOf(Array, l);

        for (int i = 0; i < l - 1; i++) 
        {
            for (int j = 0; j < l - i - 1; j++) 
            {
                if (ArrayOrdenado[j] > ArrayOrdenado[j + 1]) 
                {
                    double ValorTemporal = ArrayOrdenado[j];
                    ArrayOrdenado[j] = ArrayOrdenado[j + 1];
                    ArrayOrdenado[j + 1] = ValorTemporal;

                }
            }
        }

        return ArrayOrdenado;
    }
    
    //METODO MERGESORT
    public static double[] METDMergesort(double[] Array, int Start_Point, int final_Point) 
    {

        if(Start_Point<=1){

            return Array;
        }

        if (Start_Point < final_Point) 
        {
            int Mid = (Start_Point + final_Point) / 2;
            double[] left = Arrays.copyOfRange(Array, Start_Point, Mid + 1);
            double[] right = Arrays.copyOfRange(Array, Mid + 1, final_Point + 1);
            left = METDMergesort(left, 0, left.length-1);
            right = METDMergesort(right, 0, right.length);

            return Fucion_merge(left, right);

        }

        return Array;
    }

    public static double[] Fucion_merge(double []left, double[]right){

        int l1 = left.length;
        int l2 = right.length;

        double[] ArrayFucionado = new double[l1+l2];
        int i = 0, j = 0, k=0;

        while (i < l1 && j < l2) 
        {
            if (left[i] <= right[j]) {

                ArrayFucionado[k++] = left[i++];

            } else {

                ArrayFucionado[k++] = right[j++];

            }
        }

        while (i < l1) 
        {

            ArrayFucionado[k++] = left[i++];
  
        }

        while (j < l2) 
        {

            ArrayFucionado[k++] = right[j++];

        }

        return ArrayFucionado;
    }
    
    public class Imprimir() {
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Color");
        modelo.addColumn("Kilometraje");
        this.tablaCarros.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_de_Registro = new javax.swing.JTable();
        Ordenar_Por_Modelo = new javax.swing.JToggleButton();
        Ordenar_Por_Kilometraje = new javax.swing.JToggleButton();
        Boton_METDMergesort = new javax.swing.JButton();
        Boton_METDBurbuja = new javax.swing.JButton();
        Agregar_ATabla = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        MarcasAutos = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE AUTOMOVILES");

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel2.setText("CONCESIONARIO VIN.SAS");

        Tabla_de_Registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla_de_Registro);

        Ordenar_Por_Modelo.setText("Ordenar por Modelo");
        Ordenar_Por_Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ordenar_Por_ModeloActionPerformed(evt);
            }
        });

        Ordenar_Por_Kilometraje.setText("Ordenar por Kilometraje");
        Ordenar_Por_Kilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ordenar_Por_KilometrajeActionPerformed(evt);
            }
        });

        Boton_METDMergesort.setText("Metodo Mergesort");
        Boton_METDMergesort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_METDMergesortActionPerformed(evt);
            }
        });

        Boton_METDBurbuja.setText("Metodo Burbuja");
        Boton_METDBurbuja.setToolTipText("");
        Boton_METDBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_METDBurbujaActionPerformed(evt);
            }
        });

        Agregar_ATabla.setText("Agregar datos");

        jButton4.setText("Eliminar datos");

        jButton5.setText("Vaciar casillas");

        MarcasAutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "Bentley", "BMW", "Chevrolet", "Fiat", "Ford", "Honda", "Hyundai", "Isuzu", "Jeep", "Kia", "Land Rover", "Lexus", "Mazda", "Mercedes-Benz", "Mitsubishi Motors", "Nissan", "Opel", "Renault", "Seat", "Suzuki", "Tesla", "Toyota", "Volkswagen", "Volvo" }));
        MarcasAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcasAutosActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("jTextField3");

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel3.setText("MARCA:");

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel4.setText("MODELO:");

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel5.setText("COLOR:");

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel6.setText("KILOMETRAJE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(MarcasAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Agregar_ATabla)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton5)
                                                .addGap(60, 60, 60))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Ordenar_Por_Modelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ordenar_Por_Kilometraje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton_METDBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_METDMergesort))
                        .addGap(61, 61, 61)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_METDBurbuja)
                    .addComponent(MarcasAutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_METDMergesort)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Ordenar_Por_Modelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ordenar_Por_Kilometraje)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar_ATabla)
                    .addComponent(jButton4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void MarcasAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcasAutosActionPerformed
        // SELECCION DE MARCA DE AUTOMOVIL
    }//GEN-LAST:event_MarcasAutosActionPerformed

    private void Boton_METDBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_METDBurbujaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_METDBurbujaActionPerformed

    private void Boton_METDMergesortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_METDMergesortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_METDMergesortActionPerformed

    private void Ordenar_Por_ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ordenar_Por_ModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ordenar_Por_ModeloActionPerformed

    private void Ordenar_Por_KilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ordenar_Por_KilometrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ordenar_Por_KilometrajeActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceConsecionarioV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceConsecionarioV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceConsecionarioV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceConsecionarioV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceConsecionarioV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_ATabla;
    private javax.swing.JButton Boton_METDBurbuja;
    private javax.swing.JButton Boton_METDMergesort;
    private javax.swing.JComboBox<String> MarcasAutos;
    private javax.swing.JToggleButton Ordenar_Por_Kilometraje;
    private javax.swing.JToggleButton Ordenar_Por_Modelo;
    private javax.swing.JTable Tabla_de_Registro;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
