import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;




public class InterfazUsuario extends javax.swing.JFrame {

    TableRowSorter trs; 
    DefaultTableModel model;
    
    public InterfazUsuario() {
        initComponents();
        
        
    }
    
    private void aplicarFiltros() {
    // Inicializar el filtro
    RowFilter<DefaultTableModel, Object> filtro = null;

    // Aplicar filtro de municipio
    String seleccionMunicipio = FiltroMunicipio.getSelectedItem().toString();
    if (!"Ninguno...".equals(seleccionMunicipio)) {
        seleccionMunicipio = Pattern.quote(seleccionMunicipio);
        RowFilter<DefaultTableModel, Object> filtroMunicipio = RowFilter.regexFilter("(?i)" + seleccionMunicipio, 0);
        filtro = filtroMunicipio;
    }

    // Aplicar filtro de armas/medios
    String seleccionArmasMedios = FiltroArmasMedios.getSelectedItem().toString();
    if (!"Ninguno...".equals(seleccionArmasMedios)) {
        seleccionArmasMedios = Pattern.quote(seleccionArmasMedios);
        RowFilter<DefaultTableModel, Object> filtroArmasMedios = RowFilter.regexFilter("(?i)" + seleccionArmasMedios, 1);
        if (filtro == null) {
            filtro = filtroArmasMedios;
        } else {
            filtro = RowFilter.andFilter(Arrays.asList(filtro, filtroArmasMedios));
        }
    }

    // Aplicar filtro de Fecha Hecho
    String seleccionFechaHecho = FiltroFechaHecho.getSelectedItem().toString();
    if (!"Ninguno...".equals(seleccionFechaHecho)) {
        RowFilter<DefaultTableModel, Object> filtroFechaHecho = RowFilter.regexFilter(seleccionFechaHecho, 2);
        if (filtro == null) {
            filtro = filtroFechaHecho;
        } else {
            filtro = RowFilter.andFilter(Arrays.asList(filtro, filtroFechaHecho));
        }
    }
    
    // Aplicar filtro de Genero
    String seleccionGenero = FiltroGenero.getSelectedItem().toString();
    if (!"Ninguno...".equals(seleccionGenero)) {
        seleccionGenero = Pattern.quote(seleccionGenero);
        RowFilter<DefaultTableModel, Object> filtroGenero = RowFilter.regexFilter("(?i)" + seleccionGenero, 3);
        if (filtro == null) {
            filtro = filtroGenero;
        } else {
            filtro = RowFilter.andFilter(Arrays.asList(filtro, filtroGenero));
        }
    }
    
    // Aplicar filtro de Grupo Etario
    String seleccionGEtario = FiltroGrupoEtario.getSelectedItem().toString();
    if (!"Ninguno...".equals(seleccionGEtario)) {
        seleccionGEtario = Pattern.quote(seleccionGEtario);
        RowFilter<DefaultTableModel, Object> filtroGEtario = RowFilter.regexFilter("(?i)" + seleccionGEtario, 4);
        if (filtro == null) {
            filtro = filtroGEtario;
        } else {
            filtro = RowFilter.andFilter(Arrays.asList(filtro, filtroGEtario));
        }
    }

    // Aplicar filtro de Tipo de Hurto
    String seleccionTHurto = FiltroTipoHurto.getSelectedItem().toString();
    if (!"Ninguno...".equals(seleccionTHurto)) {
        seleccionTHurto = Pattern.quote(seleccionTHurto);
        RowFilter<DefaultTableModel, Object> filtroTHurto = RowFilter.regexFilter("(?i)" + seleccionTHurto, 5);
        if (filtro == null) {
            filtro = filtroTHurto;
        } else {
            filtro = RowFilter.andFilter(Arrays.asList(filtro, filtroTHurto));
        }
    }
    // Aplicar el filtro a la tabla
    trs.setRowFilter(filtro);
}
   
    private void crearYGuardarGrafica(boolean esGraficaDeTorta, String tituloGrafica) {
    int columnaX = jComboBoxEJEX.getSelectedIndex();
    int columnaY = jComboBoxEJEY.getSelectedIndex();

    if (columnaX == columnaY) {
        return; // Las columnas seleccionadas deben ser diferentes.
    }

    DefaultCategoryDataset barDataset = new DefaultCategoryDataset();
    DefaultPieDataset pieDataset = new DefaultPieDataset();

    for (int i = 0; i < TablaDeFiltros.getRowCount(); i++) {
        String categoria = TablaDeFiltros.getValueAt(i, columnaX).toString();
        double valor = Double.parseDouble(TablaDeFiltros.getValueAt(i, columnaY).toString());
        Comparable columnaYComparable = TablaDeFiltros.getColumnName(columnaY);
        barDataset.addValue(valor, categoria, columnaYComparable);
        pieDataset.setValue(categoria, valor);
    }

    JFreeChart chart;
    String chartTitle = tituloGrafica; // Utiliza el título proporcionado por el usuario.

    if (esGraficaDeTorta) {
        chart = ChartFactory.createPieChart(chartTitle, pieDataset, true, true, false);
    } else {
        chart = ChartFactory.createBarChart(chartTitle, TablaDeFiltros.getColumnName(columnaX), TablaDeFiltros.getColumnName(columnaY), barDataset);
    }

    String nombreArchivo = esGraficaDeTorta ? "grafica_torta.png" : "grafica_barra.png";

    try {
        ChartUtilities.saveChartAsPNG(new File(nombreArchivo), chart, 800, 600);
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}


        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FiltroMunicipio = new javax.swing.JComboBox<>();
        BotonGraficar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeFiltros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FiltroFechaHecho = new javax.swing.JComboBox<>();
        FiltroArmasMedios = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        OpcionTorta = new javax.swing.JCheckBox();
        OpcionBarra = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BotonCargar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        FiltroGenero = new javax.swing.JComboBox<>();
        FiltroGrupoEtario = new javax.swing.JComboBox<>();
        FiltroTipoHurto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxEJEX = new javax.swing.JComboBox<>();
        jComboBoxEJEY = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TituloGrafica = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FiltroMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno...", "Agua de Dios", "Albán", "Anapoima", "Anolaima", "Apulo", "Arbeláez", "Bogotá D.C. (CT)", "Cachipay", "Cajicá", "Caparrapí", "Carmen de Carupa", "Chaguaní", "Chía", "Chipaque", "Choachí", "Chocontá", "Cogua", "Cota", "El Colegio", "El Rosal", "Facatativá", "Funza", "Fúquene", "Fusagasugá", "Gachancipá", "Gachetá", "Girardot", "Guaduas", "Guasca", "La Calera", "La Mesa", "La Palma", "La Vega", "Lenguazaque", "Macheta", "Madrid", "Mosquera", "Nemocón", "Nilo", "Nimaima", "Pacho", "Paratebueno", "Ricaurte", "San Antonio del Tequendama", "San Francisco", "Sasaima", "Sibaté", "Silvania", "Simijaca", "Soacha", "Sopó", "Subachoque", "Suesca", "Supatá", "Susa", "Sutatausa", "Tabio", "Tausa", "Tena", "Tenjo", "Tocaima", "Tocancipá", "Une", "Villa de San Diego de Ubate", "Villeta", "Zipacón", "Zipaquirá" }));
        FiltroMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroMunicipioActionPerformed(evt);
            }
        });

        BotonGraficar.setText("Graficar");
        BotonGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGraficarActionPerformed(evt);
            }
        });

        TablaDeFiltros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MUNICIPIO", "ARMAS MEDIOS", "FECHA HECHO", "GENERO", "GRUPO ETARIO", "TIPO DE HURTO", "CANTIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaDeFiltros.setToolTipText("");
        jScrollPane1.setViewportView(TablaDeFiltros);

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel1.setText("GRAFICADORA DE DATOS");

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel2.setText("Filtros");

        FiltroFechaHecho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno...", "01/06/2023", "02/06/2023", "03/06/2023", "04/06/2023", "05/06/2023", "06/06/2023", "07/06/2023", "08/06/2023", "09/06/2023", "10/06/2023", "11/06/2023", "12/06/2023", "13/06/2023", "14/06/2023", "15/06/2023", "16/06/2023", "17/06/2023", "18/06/2023", "19/06/2023", "20/06/2023", "21/06/2023", "22/06/2023", "23/06/2023", "24/06/2023", "25/06/2023", "26/06/2023", "27/06/2023", "28/06/2023", "29/06/2023", "30/06/2023" }));
        FiltroFechaHecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroFechaHechoActionPerformed(evt);
            }
        });

        FiltroArmasMedios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno...", "ARMA DE FUEGO", "ARMA BLANCA / CORTOPUNZANTE", "CONTUNDENTES", "ESCOPOLAMINA", "PALANCAS", "NO REPORTADO", "CORTANTES", "LLAVE MAESTRA", "SIN EMPLEO DE ARMAS", " " }));
        FiltroArmasMedios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroArmasMediosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel4.setText("Reportes de Hurtos por Modalidades ---> ");

        OpcionTorta.setText("Grafica en torta");
        OpcionTorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionTortaActionPerformed(evt);
            }
        });

        OpcionBarra.setText("Grafica en barras");
        OpcionBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionBarraActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel5.setText("funcion graficar");

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel6.setText("CUNDINAMARCA, JUNIO 2023");

        BotonCargar.setText("Cargar Datos");
        BotonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel7.setText("Cargar datos a la tabla");

        FiltroGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno...", "NO APLICA", "NO REPORTADO", "MASCULINO", "FEMENINO", " " }));
        FiltroGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroGeneroActionPerformed(evt);
            }
        });

        FiltroGrupoEtario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno...", "NO APLICA", "NO REPORTADO", "ADULTOS", "ADOLESCENTES", "MENORES" }));
        FiltroGrupoEtario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroGrupoEtarioActionPerformed(evt);
            }
        });

        FiltroTipoHurto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno...", "HURTO RESIDENCIAS", "HURTO ENTIDADES COMERCIALES" }));
        FiltroTipoHurto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroTipoHurtoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel8.setText("Filtro MUNICIPIO");

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel9.setText("Filtro Armas medios");

        jLabel10.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel10.setText("Filtro FECHA HECHO");

        jLabel11.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel11.setText("Filtro GENERO");

        jLabel12.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel12.setText("Filtro GRUPO ETARIO");

        jLabel13.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel13.setText("Filtro TIPO DE HURTO");

        jComboBoxEJEX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", " " }));
        jComboBoxEJEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEJEXActionPerformed(evt);
            }
        });

        jComboBoxEJEY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", " " }));
        jComboBoxEJEY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEJEYActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel14.setText("Columna eje x");

        jLabel15.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel15.setText("Columna EJE Y");

        jLabel16.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel16.setText("Titurlo de la grafica");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(FiltroMunicipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FiltroFechaHecho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FiltroGenero, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FiltroGrupoEtario, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FiltroTipoHurto, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FiltroArmasMedios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(BotonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(BotonGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jComboBoxEJEX, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel14))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel15)
                                                .addComponent(jComboBoxEJEY, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(TituloGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(OpcionTorta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(OpcionBarra)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FiltroMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroArmasMedios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotonCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jComboBoxEJEX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxEJEY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(145, 145, 145)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(OpcionBarra)
                                    .addComponent(OpcionTorta))
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FiltroFechaHecho, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addGap(5, 5, 5)
                                        .addComponent(FiltroGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FiltroGrupoEtario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FiltroTipoHurto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BotonGraficar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addGap(10, 10, 10)
                                        .addComponent(TituloGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(128, 128, 128))))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FiltroFechaHechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroFechaHechoActionPerformed
        // TODO add your handling code here:
        aplicarFiltros();
    }//GEN-LAST:event_FiltroFechaHechoActionPerformed

    private void FiltroArmasMediosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroArmasMediosActionPerformed
        // TODO add your handling code here:
        aplicarFiltros();
    }//GEN-LAST:event_FiltroArmasMediosActionPerformed

    private void OpcionTortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionTortaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcionTortaActionPerformed

    private void OpcionBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcionBarraActionPerformed

    private void BotonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargarActionPerformed

        String ArchivoDatos = "Datos_Hurtos_Modalidades.csv";
         try {
            BufferedReader br = new BufferedReader(new FileReader(ArchivoDatos));
            model = (DefaultTableModel) TablaDeFiltros.getModel();
            
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                model.addRow(datos);
            }
            
            br.close();
        } catch (IOException e) {
            // Manejo de excepciones en caso de error de lectura del archivo
            e.printStackTrace();
        }
         
        trs = new TableRowSorter(TablaDeFiltros.getModel());
        TablaDeFiltros.setRowSorter(trs);
    }//GEN-LAST:event_BotonCargarActionPerformed

    private void FiltroGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroGeneroActionPerformed
        // TODO add your handling code here:
        aplicarFiltros();
    }//GEN-LAST:event_FiltroGeneroActionPerformed

    private void FiltroGrupoEtarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroGrupoEtarioActionPerformed
        // TODO add your handling code here:
        aplicarFiltros();
    }//GEN-LAST:event_FiltroGrupoEtarioActionPerformed

    private void FiltroTipoHurtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroTipoHurtoActionPerformed
        // TODO add your handling code here:
        aplicarFiltros();
    }//GEN-LAST:event_FiltroTipoHurtoActionPerformed

    private void FiltroMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroMunicipioActionPerformed
        // TODO add your handling code here:
        aplicarFiltros();

    }//GEN-LAST:event_FiltroMunicipioActionPerformed

    private void jComboBoxEJEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEJEXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEJEXActionPerformed

    private void jComboBoxEJEYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEJEYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEJEYActionPerformed

    private void BotonGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGraficarActionPerformed

         boolean esGraficaDeTorta = OpcionTorta.isSelected();
         String tituloGrafica = TituloGrafica.getText(); // Obtiene el título del JTextField.
        crearYGuardarGrafica(esGraficaDeTorta, tituloGrafica);
    }//GEN-LAST:event_BotonGraficarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCargar;
    private javax.swing.JButton BotonGraficar;
    private javax.swing.JComboBox<String> FiltroArmasMedios;
    private javax.swing.JComboBox<String> FiltroFechaHecho;
    private javax.swing.JComboBox<String> FiltroGenero;
    private javax.swing.JComboBox<String> FiltroGrupoEtario;
    private javax.swing.JComboBox<String> FiltroMunicipio;
    private javax.swing.JComboBox<String> FiltroTipoHurto;
    private javax.swing.JCheckBox OpcionBarra;
    private javax.swing.JCheckBox OpcionTorta;
    private javax.swing.JTable TablaDeFiltros;
    private javax.swing.JTextField TituloGrafica;
    private javax.swing.JComboBox<String> jComboBoxEJEX;
    private javax.swing.JComboBox<String> jComboBoxEJEY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
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
