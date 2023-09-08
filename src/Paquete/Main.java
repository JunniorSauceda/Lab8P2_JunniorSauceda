/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Paquete;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Pn_agregPais = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_Country = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Sp_CMedals = new javax.swing.JSpinner();
        bt_addCountry = new javax.swing.JButton();
        Pn_agregarNad = new javax.swing.JPanel();
        Pn_agregarEvt = new javax.swing.JPanel();
        Pn_ListPais = new javax.swing.JPanel();
        Pn_listNad = new javax.swing.JPanel();
        Pn_listEvt = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jTabbedPane1.addTab("Agregar Pais", Pn_agregPais);

        Pn_agregarNad.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout Pn_agregarNadLayout = new javax.swing.GroupLayout(Pn_agregarNad);
        Pn_agregarNad.setLayout(Pn_agregarNadLayout);
        Pn_agregarNadLayout.setHorizontalGroup(
            Pn_agregarNadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        Pn_agregarNadLayout.setVerticalGroup(
            Pn_agregarNadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Agregar Nadador", Pn_agregarNad);

        Pn_agregarEvt.setBackground(new java.awt.Color(204, 204, 0));

        javax.swing.GroupLayout Pn_agregarEvtLayout = new javax.swing.GroupLayout(Pn_agregarEvt);
        Pn_agregarEvt.setLayout(Pn_agregarEvtLayout);
        Pn_agregarEvtLayout.setHorizontalGroup(
            Pn_agregarEvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        Pn_agregarEvtLayout.setVerticalGroup(
            Pn_agregarEvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Agregar Evento", Pn_agregarEvt);

        Pn_ListPais.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout Pn_ListPaisLayout = new javax.swing.GroupLayout(Pn_ListPais);
        Pn_ListPais.setLayout(Pn_ListPaisLayout);
        Pn_ListPaisLayout.setHorizontalGroup(
            Pn_ListPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        Pn_ListPaisLayout.setVerticalGroup(
            Pn_ListPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listar Paises", Pn_ListPais);

        Pn_listNad.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout Pn_listNadLayout = new javax.swing.GroupLayout(Pn_listNad);
        Pn_listNad.setLayout(Pn_listNadLayout);
        Pn_listNadLayout.setHorizontalGroup(
            Pn_listNadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        Pn_listNadLayout.setVerticalGroup(
            Pn_listNadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listar Nadadores", Pn_listNad);

        Pn_listEvt.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout Pn_listEvtLayout = new javax.swing.GroupLayout(Pn_listEvt);
        Pn_listEvt.setLayout(Pn_listEvtLayout);
        Pn_listEvtLayout.setHorizontalGroup(
            Pn_listEvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        Pn_listEvtLayout.setVerticalGroup(
            Pn_listEvtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listar Eventos", Pn_listEvt);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 880, 590));

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
            String pais=tf_Country.getText();
            int medallas=Integer.parseInt(Sp_CMedals.getValue().toString());
            Pais P=new Pais(pais, medallas);
            Paises.add(P);
            JOptionPane.showMessageDialog(this, "Agregado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_addCountryMouseClicked

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
    ArrayList<Pais>Paises=new ArrayList<>();
    ArrayList<Nadador> Nadadores=new ArrayList<>();
    ArrayList<Evento> Eventos=new ArrayList<>();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pn_ListPais;
    private javax.swing.JPanel Pn_agregPais;
    private javax.swing.JPanel Pn_agregarEvt;
    private javax.swing.JPanel Pn_agregarNad;
    private javax.swing.JPanel Pn_listEvt;
    private javax.swing.JPanel Pn_listNad;
    private javax.swing.JSpinner Sp_CMedals;
    private javax.swing.JButton bt_addCountry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tf_Country;
    // End of variables declaration//GEN-END:variables
}
