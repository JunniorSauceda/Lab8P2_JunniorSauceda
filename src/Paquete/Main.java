/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Paquete;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Junnior Sauceda
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        llenarEvt();
        llenarNad();
        llenarpaises();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tp_menu = new javax.swing.JTabbedPane();
        Pn_agregPais = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_Country = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Sp_CMedals = new javax.swing.JSpinner();
        bt_addCountry = new javax.swing.JButton();
        Pn_agregarNad = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_nom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_nacionalidad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Sp_edad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        tf_estatura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_estilo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cb_distancia = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tf_bestTemp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Sp_Nmedals = new javax.swing.JSpinner();
        bt_addNad = new javax.swing.JButton();
        Pn_agregarEvt = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cb_estiloEvt = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cb_distanciaEvt = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        tf_RecordEvt = new javax.swing.JTextField();
        bt_addEvt = new javax.swing.JButton();
        Pn_ListNada = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tb_listNad = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        cb_nacion = new javax.swing.JComboBox<>();
        Pn_listEvt = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tb_listEvt = new javax.swing.JTable();
        Pn_listWin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tp_menu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tp_menuStateChanged(evt);
            }
        });

        Pn_agregPais.setBackground(new java.awt.Color(51, 0, 102));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setText("Cantidad de Medallas:");

        Sp_CMedals.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        bt_addCountry.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        bt_addCountry.setText("Agregar Pais");
        bt_addCountry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addCountryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Pn_agregPaisLayout = new javax.swing.GroupLayout(Pn_agregPais);
        Pn_agregPais.setLayout(Pn_agregPaisLayout);
        Pn_agregPaisLayout.setHorizontalGroup(
            Pn_agregPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_agregPaisLayout.createSequentialGroup()
                .addGroup(Pn_agregPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pn_agregPaisLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(Pn_agregPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sp_CMedals, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(tf_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Pn_agregPaisLayout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(bt_addCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        Pn_agregPaisLayout.setVerticalGroup(
            Pn_agregPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_agregPaisLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sp_CMedals, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(bt_addCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        tp_menu.addTab("Agregar Pais", Pn_agregPais);

        Pn_agregarNad.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setText("Nacionalidad:");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel5.setText("Edad:");

        Sp_edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel6.setText("Estatura:");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel7.setText("Estilo:");

        cb_estilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Pecho", "Dorso", "Mariposa" }));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel8.setText("Distancia:");

        cb_distancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "200", "400", "800" }));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel9.setText("Mejor Tiempo:");

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel10.setText("Cantidad de Medallas:");

        Sp_Nmedals.setModel(new javax.swing.SpinnerNumberModel());

        bt_addNad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        bt_addNad.setText("Agregar Nadador");
        bt_addNad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addNadMouseClicked(evt);
            }
        });
        bt_addNad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addNadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pn_agregarNadLayout = new javax.swing.GroupLayout(Pn_agregarNad);
        Pn_agregarNad.setLayout(Pn_agregarNadLayout);
        Pn_agregarNadLayout.setHorizontalGroup(
            Pn_agregarNadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_agregarNadLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(Pn_agregarNadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(Sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cb_nacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(tf_nom)
                    .addComponent(tf_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addGroup(Pn_agregarNadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pn_agregarNadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cb_estilo, 0, 200, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addComponent(cb_distancia, 0, 200, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(tf_bestTemp))
                    .addComponent(Sp_Nmedals, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(141, 141, 141))
            .addGroup(Pn_agregarNadLayout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(bt_addNad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pn_agregarNadLayout.setVerticalGroup(
            Pn_agregarNadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_agregarNadLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(Pn_agregarNadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Pn_agregarNadLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pn_agregarNadLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_estilo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Pn_agregarNadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pn_agregarNadLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pn_agregarNadLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Pn_agregarNadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pn_agregarNadLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pn_agregarNadLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_bestTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Pn_agregarNadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Pn_agregarNadLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pn_agregarNadLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sp_Nmedals, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(bt_addNad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        tp_menu.addTab("Agregar Nadador", Pn_agregarNad);

        Pn_agregarEvt.setBackground(new java.awt.Color(0, 153, 153));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel11.setText("Estilo:");

        cb_estiloEvt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cb_estiloEvt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Pecho", "Dorso", "Mariposa" }));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel12.setText("Distancia:");

        cb_distanciaEvt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb_distanciaEvt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "200", "400", "800" }));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel13.setText("Record Actual:");

        tf_RecordEvt.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        bt_addEvt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        bt_addEvt.setText("Agregar Evento");
        bt_addEvt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addEvtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Pn_agregarEvtLayout = new javax.swing.GroupLayout(Pn_agregarEvt);
        Pn_agregarEvt.setLayout(Pn_agregarEvtLayout);
        Pn_agregarEvtLayout.setHorizontalGroup(
            Pn_agregarEvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_agregarEvtLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(Pn_agregarEvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_RecordEvt)
                    .addComponent(jLabel13)
                    .addComponent(cb_distanciaEvt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(cb_estiloEvt, 0, 250, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addComponent(bt_addEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        Pn_agregarEvtLayout.setVerticalGroup(
            Pn_agregarEvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_agregarEvtLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(cb_estiloEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(Pn_agregarEvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_distanciaEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_addEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(tf_RecordEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        tp_menu.addTab("Agregar Evento", Pn_agregarEvt);

        Pn_ListNada.setBackground(new java.awt.Color(0, 153, 0));

        Tb_listNad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Edad", "Estatura", "Estilo", "Distancia", "Record", "Medallas"
            }
        ));
        jScrollPane1.setViewportView(Tb_listNad);

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel14.setText("Nacionalidad:");

        cb_nacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_nacionItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout Pn_ListNadaLayout = new javax.swing.GroupLayout(Pn_ListNada);
        Pn_ListNada.setLayout(Pn_ListNadaLayout);
        Pn_ListNadaLayout.setHorizontalGroup(
            Pn_ListNadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_ListNadaLayout.createSequentialGroup()
                .addGroup(Pn_ListNadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pn_ListNadaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pn_ListNadaLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel14)
                        .addGap(40, 40, 40)
                        .addComponent(cb_nacion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        Pn_ListNadaLayout.setVerticalGroup(
            Pn_ListNadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_ListNadaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Pn_ListNadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cb_nacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );

        tp_menu.addTab("Listar Nadadores", Pn_ListNada);

        Pn_listEvt.setBackground(new java.awt.Color(0, 51, 102));

        Tb_listEvt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Estilo", "Distancia", "Record"
            }
        ));
        jScrollPane2.setViewportView(Tb_listEvt);

        javax.swing.GroupLayout Pn_listEvtLayout = new javax.swing.GroupLayout(Pn_listEvt);
        Pn_listEvt.setLayout(Pn_listEvtLayout);
        Pn_listEvtLayout.setHorizontalGroup(
            Pn_listEvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_listEvtLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        Pn_listEvtLayout.setVerticalGroup(
            Pn_listEvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_listEvtLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        tp_menu.addTab("Listar Eventos", Pn_listEvt);

        Pn_listWin.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout Pn_listWinLayout = new javax.swing.GroupLayout(Pn_listWin);
        Pn_listWin.setLayout(Pn_listWinLayout);
        Pn_listWinLayout.setHorizontalGroup(
            Pn_listWinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        Pn_listWinLayout.setVerticalGroup(
            Pn_listWinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        tp_menu.addTab("Listar Ganadores", Pn_listWin);

        jPanel1.add(tp_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 880, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addCountryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addCountryMouseClicked
        // TODO add your handling code here:
        try {
            String pais = tf_Country.getText();
            int medallas = Integer.parseInt(Sp_CMedals.getValue().toString());
            Pais P = new Pais(pais, medallas);
            Paises.add(P);
            adminPais addp = new adminPais("./Paises.secs");
            addp.cargarArchivo();
            addp.setpais(P);
            addp.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Agregado");
            tf_Country.setText("");
            Sp_CMedals.setValue(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_addCountryMouseClicked

    private void tp_menuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tp_menuStateChanged
        // TODO add your handling code here:
        if (tp_menu.getSelectedIndex() == 1) {
            llenarpaises();
            if (Paises.isEmpty()) {
                bt_addNad.setEnabled(false);
            } else {
                bt_addNad.setEnabled(true);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addAll(0, Paises);
                cb_nacionalidad.setModel(modelo);
            }
        }
        if (tp_menu.getSelectedIndex() == 3) {
            llenarpaises();
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            model.addAll(Paises);
            cb_nacion.setModel(model);
            
        }
        if (tp_menu.getSelectedIndex() == 4) {
            llenarEvt();
            Tb_listEvt.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{
                "Estilo", "Distancia", "Record"
            }));
            
            DefaultTableModel modelo = (DefaultTableModel) Tb_listEvt.getModel();
            
            for (Evento Evento1 : Eventos) {
                Object[] row={Evento1.getEstilo(),Evento1.getDistancia(),Evento1.getRecord()};
                modelo.addRow(row);
            }
            Tb_listEvt.setModel(modelo);
            
        }

    }//GEN-LAST:event_tp_menuStateChanged
    
    public void llenarpaises() {
        Paises.clear();
        adminPais p = new adminPais("./Paises.secs");
        p.cargarArchivo();
        Paises.addAll(p.getPaises());
    }
    
    public void llenarNad() {
        Nadadores.clear();
        adminNadador N = new adminNadador("./Nadadores.secs");
        N.cargarArchivo();
        Nadadores.addAll(N.getNadadores());
    }
    
    public void llenarEvt() {
        Eventos.clear();
        adminEventos Evt = new adminEventos("./Eventos.secs");
        Evt.cargarArchivo();
        Eventos.addAll(Evt.getEventos());
    }
    private void bt_addNadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addNadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_addNadActionPerformed

    private void bt_addNadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addNadMouseClicked
        // TODO add your handling code here:
        llenarpaises();
        if (Paises.isEmpty()) {
            
        } else {
            try {
                String nom = tf_nom.getText();
                Pais nacion = (Pais) cb_nacionalidad.getSelectedItem();
                int edad = Integer.parseInt(Sp_edad.getValue().toString());
                double altura = Double.parseDouble(tf_estatura.getText());
                String estilo = cb_estilo.getSelectedItem().toString();
                int distancia = Integer.parseInt(cb_distancia.getSelectedItem().toString());
                
                double tiempo = Double.parseDouble(tf_bestTemp.getText());
                int medallas = Integer.parseInt(Sp_Nmedals.getValue().toString());
                Nadador N = new Nadador(nom, nacion, edad, distancia, medallas, altura, tiempo, estilo);
                Nadadores.add(N);
                for (Pais Paise : Paises) {
                    if ((Paise.getNombre()).equals(nacion.getNombre())) {
                        Paise.getNadadores().add(N);
                    }
                }
                adminPais addp = new adminPais("./Paises.secs");
                addp.cargarArchivo();
                addp.setPaises(new ArrayList<>());
                for (Pais Paise : Paises) {
                    addp.setpais(Paise);
                }
                addp.escribirArchivo();
                
                adminNadador addN = new adminNadador("./Nadadores.secs");
                addN.cargarArchivo();
                addN.setnadador(N);
                addN.escribirArchivo();
                JOptionPane.showMessageDialog(this, "Agregado con exito");
                tf_nom.setText("");
                Sp_edad.setValue(0);
                tf_estatura.setText("");
                tf_bestTemp.setText("");
                Sp_Nmedals.setValue(0);
                cb_nacionalidad.setSelectedIndex(0);
                cb_distancia.setSelectedIndex(0);
                cb_estilo.setSelectedIndex(0);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bt_addNadMouseClicked

    private void bt_addEvtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addEvtMouseClicked
        // TODO add your handling code here:
        try {
            String style = cb_estiloEvt.getSelectedItem().toString();
            int Distancia = Integer.parseInt(cb_distanciaEvt.getSelectedItem().toString());
            double Record = Double.parseDouble(tf_RecordEvt.getText());
            Evento Ev = new Evento(style, Distancia, Record);
            Eventos.add(Ev);
            adminEventos addEvt = new adminEventos("./Eventos.secs");
            addEvt.cargarArchivo();
            addEvt.setevento(Ev);
            addEvt.escribirArchivo();
            JOptionPane.showMessageDialog(null, "Agregado con exito");
            tf_RecordEvt.setText("");
            cb_distanciaEvt.setSelectedIndex(0);
            cb_estiloEvt.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_addEvtMouseClicked

    private void cb_nacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_nacionItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 1) {
            llenarpaises();
            if (cb_nacion.getSelectedItem() != null) {
                Pais P = (Pais) cb_nacion.getSelectedItem();
                Tb_listNad.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{
                    "Nombre", "Edad", "Estatura", "Estilo", "Distancia", "Record", "Medallas"
                }));
                
                DefaultTableModel modelo = (DefaultTableModel) Tb_listNad.getModel();
                
                for (Nadador nad : P.getNadadores()) {
                    Object row[] = {nad.getNombre(), nad.getEdad(), nad.getEstatura(), nad.getEstilo(), nad.getDistancia(), nad.getTiempo(), nad.getMedallas()};
                    modelo.addRow(row);
                }
                Tb_listNad.setModel(modelo);
                
            }
        }
    }//GEN-LAST:event_cb_nacionItemStateChanged

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    ArrayList<Pais> Paises = new ArrayList<>();
    ArrayList<Nadador> Nadadores = new ArrayList<>();
    ArrayList<Nadador> Ganadores = new ArrayList<>();
    ArrayList<Evento> Eventos = new ArrayList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pn_ListNada;
    private javax.swing.JPanel Pn_agregPais;
    private javax.swing.JPanel Pn_agregarEvt;
    private javax.swing.JPanel Pn_agregarNad;
    private javax.swing.JPanel Pn_listEvt;
    private javax.swing.JPanel Pn_listWin;
    private javax.swing.JSpinner Sp_CMedals;
    private javax.swing.JSpinner Sp_Nmedals;
    private javax.swing.JSpinner Sp_edad;
    private javax.swing.JTable Tb_listEvt;
    private javax.swing.JTable Tb_listNad;
    private javax.swing.JButton bt_addCountry;
    private javax.swing.JButton bt_addEvt;
    private javax.swing.JButton bt_addNad;
    private javax.swing.JComboBox<String> cb_distancia;
    private javax.swing.JComboBox<String> cb_distanciaEvt;
    private javax.swing.JComboBox<String> cb_estilo;
    private javax.swing.JComboBox<String> cb_estiloEvt;
    private javax.swing.JComboBox<String> cb_nacion;
    private javax.swing.JComboBox<String> cb_nacionalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tf_Country;
    private javax.swing.JTextField tf_RecordEvt;
    private javax.swing.JTextField tf_bestTemp;
    private javax.swing.JTextField tf_estatura;
    private javax.swing.JTextField tf_nom;
    private javax.swing.JTabbedPane tp_menu;
    // End of variables declaration//GEN-END:variables
}
