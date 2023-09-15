
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

    DefaultTableModel Table = new DefaultTableModel();
    
    
    
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
        
        String[] TITULOS = new String[]{"\tMARCA ","\tMODELO ", "\tCOLOR ","\tKILOMETRAJE "};
        Table.setColumnIdentifiers(TITULOS);
        Tabla_de_Registro.setModel(Table);
    }

    public void AgregarData(){
        
        MarcasAutos.addItem("Audi");
        MarcasAutos.addItem("Bentley");
        MarcasAutos.addItem("BMW");
        MarcasAutos.addItem("Chevrolet");
        MarcasAutos.addItem("Fiat");
        MarcasAutos.addItem("Ford");
        MarcasAutos.addItem("Honda");
        MarcasAutos.addItem("Hyundai");
        MarcasAutos.addItem("Isuzu");
        MarcasAutos.addItem("Jeep");
        MarcasAutos.addItem("Kia");
        MarcasAutos.addItem("Land Rover");
        MarcasAutos.addItem("Lexus");
        MarcasAutos.addItem("Mazda");
        MarcasAutos.addItem("Mercedes-Benz");
        MarcasAutos.addItem("Mitsubishi Motors");
        MarcasAutos.addItem("Nissan");
        MarcasAutos.addItem("Opel");
        MarcasAutos.addItem("Renault");
        MarcasAutos.addItem("Seat");
        MarcasAutos.addItem("Suzuki");
        MarcasAutos.addItem("Tesla");
        MarcasAutos.addItem("Toyota");
        MarcasAutos.addItem("Volkswagen");
        MarcasAutos.addItem("Volvo");
         
        String marca = MarcasAutos.getSelectedItem().toString();
        
        Table.addRow(new Object[]{
            
             
            marca,AñoModelo.getText(), ColorAuto.getText(), Kilometraje.getText()});
    }
    
    public void EliminarData(){
    
    int fila = Tabla_de_Registro.getSelectedRow();
    Table.removeRow(fila);
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
        EliminarDataTabla = new javax.swing.JButton();
        VaciarTextF = new javax.swing.JButton();
        MarcasAutos = new javax.swing.JComboBox<>();
        AñoModelo = new javax.swing.JTextField();
        ColorAuto = new javax.swing.JTextField();
        Kilometraje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ActualizarData = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE AUTOMOVILES");

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONCESIONARIO VIN.SAS");

        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        Tabla_de_Registro.setBackground(new java.awt.Color(153, 153, 153));
        Tabla_de_Registro.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
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

        Ordenar_Por_Modelo.setBackground(new java.awt.Color(153, 153, 153));
        Ordenar_Por_Modelo.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        Ordenar_Por_Modelo.setForeground(new java.awt.Color(51, 51, 51));
        Ordenar_Por_Modelo.setText("Ordenar por Modelo");
        Ordenar_Por_Modelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        Ordenar_Por_Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ordenar_Por_ModeloActionPerformed(evt);
            }
        });

        Ordenar_Por_Kilometraje.setBackground(new java.awt.Color(153, 153, 153));
        Ordenar_Por_Kilometraje.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        Ordenar_Por_Kilometraje.setForeground(new java.awt.Color(51, 51, 51));
        Ordenar_Por_Kilometraje.setText("Ordenar por Kilometraje");
        Ordenar_Por_Kilometraje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        Ordenar_Por_Kilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ordenar_Por_KilometrajeActionPerformed(evt);
            }
        });

        Boton_METDMergesort.setBackground(new java.awt.Color(153, 153, 153));
        Boton_METDMergesort.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        Boton_METDMergesort.setForeground(new java.awt.Color(51, 51, 51));
        Boton_METDMergesort.setText("Metodo Mergesort");
        Boton_METDMergesort.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        Boton_METDMergesort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_METDMergesortActionPerformed(evt);
            }
        });

        Boton_METDBurbuja.setBackground(new java.awt.Color(153, 153, 153));
        Boton_METDBurbuja.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        Boton_METDBurbuja.setForeground(new java.awt.Color(51, 51, 51));
        Boton_METDBurbuja.setText("Metodo Burbuja");
        Boton_METDBurbuja.setToolTipText("");
        Boton_METDBurbuja.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        Boton_METDBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_METDBurbujaActionPerformed(evt);
            }
        });

        Agregar_ATabla.setBackground(new java.awt.Color(153, 153, 153));
        Agregar_ATabla.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        Agregar_ATabla.setForeground(new java.awt.Color(51, 51, 51));
        Agregar_ATabla.setText("Agregar fila");
        Agregar_ATabla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        Agregar_ATabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_ATablaActionPerformed(evt);
            }
        });

        EliminarDataTabla.setBackground(new java.awt.Color(153, 153, 153));
        EliminarDataTabla.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        EliminarDataTabla.setForeground(new java.awt.Color(51, 51, 51));
        EliminarDataTabla.setText("Eliminar fila");
        EliminarDataTabla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        EliminarDataTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarDataTablaActionPerformed(evt);
            }
        });

        VaciarTextF.setBackground(new java.awt.Color(153, 153, 153));
        VaciarTextF.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        VaciarTextF.setForeground(new java.awt.Color(51, 51, 51));
        VaciarTextF.setText("Vaciar Tabla");
        VaciarTextF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));

        MarcasAutos.setBackground(new java.awt.Color(153, 153, 153));
        MarcasAutos.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        MarcasAutos.setForeground(new java.awt.Color(51, 51, 51));
        MarcasAutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "Bentley", "BMW", "Chevrolet", "Fiat", "Ford", "Honda", "Hyundai", "Isuzu", "Jeep", "Kia", "Land Rover", "Lexus", "Mazda", "Mercedes-Benz", "Mitsubishi Motors", "Nissan", "Opel", "Renault", "Seat", "Suzuki", "Tesla", "Toyota", "Volkswagen", "Volvo" }));
        MarcasAutos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        MarcasAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcasAutosActionPerformed(evt);
            }
        });

        AñoModelo.setBackground(new java.awt.Color(153, 153, 153));
        AñoModelo.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        AñoModelo.setForeground(new java.awt.Color(51, 51, 51));
        AñoModelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        AñoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñoModeloActionPerformed(evt);
            }
        });

        ColorAuto.setBackground(new java.awt.Color(153, 153, 153));
        ColorAuto.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        ColorAuto.setForeground(new java.awt.Color(51, 51, 51));
        ColorAuto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        ColorAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorAutoActionPerformed(evt);
            }
        });

        Kilometraje.setBackground(new java.awt.Color(153, 153, 153));
        Kilometraje.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        Kilometraje.setForeground(new java.awt.Color(51, 51, 51));
        Kilometraje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        Kilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KilometrajeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MARCA:");

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MODELO:");

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("COLOR:");

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("KILOMETRAJE:");

        ActualizarData.setBackground(new java.awt.Color(153, 153, 153));
        ActualizarData.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        ActualizarData.setForeground(new java.awt.Color(51, 51, 51));
        ActualizarData.setText("Actualizar ");
        ActualizarData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        ActualizarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarDataActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Botones - Ajuste de tabla");

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Botonoces de encendio");

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BotonEs Ordenamiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(472, 472, 472))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Kilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ColorAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AñoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MarcasAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Agregar_ATabla, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(EliminarDataTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(ActualizarData, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(VaciarTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Ordenar_Por_Kilometraje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Ordenar_Por_Modelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Boton_METDBurbuja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Boton_METDMergesort, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MarcasAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AñoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ColorAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Kilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Boton_METDBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton_METDMergesort, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ordenar_Por_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ordenar_Por_Kilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Agregar_ATabla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EliminarDataTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ActualizarData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VaciarTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ColorAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColorAutoActionPerformed

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

    private void AñoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñoModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AñoModeloActionPerformed

    private void ActualizarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarDataActionPerformed

    private void KilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KilometrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KilometrajeActionPerformed

    private void Agregar_ATablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_ATablaActionPerformed
        // AGREGAR FILAS
        AgregarData();
    }//GEN-LAST:event_Agregar_ATablaActionPerformed

    private void EliminarDataTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarDataTablaActionPerformed
        // ELIMINAR FILAS
        
        EliminarData();
    }//GEN-LAST:event_EliminarDataTablaActionPerformed

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
    private javax.swing.JButton ActualizarData;
    private javax.swing.JButton Agregar_ATabla;
    private javax.swing.JTextField AñoModelo;
    private javax.swing.JButton Boton_METDBurbuja;
    private javax.swing.JButton Boton_METDMergesort;
    private javax.swing.JTextField ColorAuto;
    private javax.swing.JButton EliminarDataTabla;
    private javax.swing.JTextField Kilometraje;
    private javax.swing.JComboBox<String> MarcasAutos;
    private javax.swing.JToggleButton Ordenar_Por_Kilometraje;
    private javax.swing.JToggleButton Ordenar_Por_Modelo;
    private javax.swing.JTable Tabla_de_Registro;
    private javax.swing.JButton VaciarTextF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
