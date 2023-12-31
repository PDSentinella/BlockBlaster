/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package jogotetris.GUI;

import java.awt.Frame;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author senti
 */
public class AreUSure extends javax.swing.JDialog {
    public Frame parent;
    public ClassicGameMode classic;
    public Frame m;
    /**
     * Creates new form AreUSure
     */
    public AreUSure(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        setLocation(483,262);
        this.setUndecorated(true);
        initComponents();
        setShape(new RoundRectangle2D.Double(0,0,getWidth(), getHeight(),20,20));
    }
    public AreUSure(java.awt.Frame parent, boolean modal,ClassicGameMode classic,Frame f){
        this(parent,modal);
        this.classic = classic;
        this.m = f;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBg1 = new jogotetris.GUI.Componentes.JPanelBg();
        jLabel1 = new javax.swing.JLabel();
        btnStart1 = new jogotetris.GUI.Componentes.BtnStart();
        btnStart2 = new jogotetris.GUI.Componentes.BtnStart();
        jLabel2 = new javax.swing.JLabel();
        btnnBorder1 = new jogotetris.GUI.Componentes.BtnnBorder();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelBg1.setBorderColor(new java.awt.Color(0, 204, 204));
        jPanelBg1.setColor(new java.awt.Color(0, 204, 204));
        jPanelBg1.setPreferredSize(new java.awt.Dimension(410, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("are you sure you");

        btnStart1.setForeground(new java.awt.Color(255, 255, 255));
        btnStart1.setText("yes");
        btnStart1.setBorderColor(new java.awt.Color(255, 255, 255));
        btnStart1.setColor(new java.awt.Color(0, 204, 204));
        btnStart1.setFixColor(new java.awt.Color(255, 255, 255));
        btnStart1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnStart1.setMaximumSize(new java.awt.Dimension(72, 72));
        btnStart1.setMinimumSize(new java.awt.Dimension(32, 32));
        btnStart1.setPreferredSize(new java.awt.Dimension(73, 60));
        btnStart1.setRadius(20);
        btnStart1.setSizeBorder(3);
        btnStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart1ActionPerformed(evt);
            }
        });

        btnStart2.setForeground(new java.awt.Color(0, 204, 204));
        btnStart2.setText("nope");
        btnStart2.setBorderColor(new java.awt.Color(0, 204, 204));
        btnStart2.setColor(new java.awt.Color(255, 255, 255));
        btnStart2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnStart2.setMaximumSize(new java.awt.Dimension(72, 72));
        btnStart2.setMinimumSize(new java.awt.Dimension(32, 32));
        btnStart2.setPreferredSize(new java.awt.Dimension(73, 60));
        btnStart2.setRadius(20);
        btnStart2.setSizeBorder(2);
        btnStart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" want to quit this game ?");

        btnnBorder1.setBackground(new java.awt.Color(0, 204, 204));
        btnnBorder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogotetris/Resorses/x-mark.png"))); // NOI18N
        btnnBorder1.setColor(new java.awt.Color(0, 204, 204));
        btnnBorder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnBorder1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBg1Layout = new javax.swing.GroupLayout(jPanelBg1);
        jPanelBg1.setLayout(jPanelBg1Layout);
        jPanelBg1Layout.setHorizontalGroup(
            jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg1Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBg1Layout.createSequentialGroup()
                        .addComponent(btnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStart2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBg1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30))))
                .addGap(52, 52, 52)
                .addComponent(btnnBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBg1Layout.setVerticalGroup(
            jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg1Layout.createSequentialGroup()
                .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBg1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnnBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBg1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnBorder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnBorder1ActionPerformed
        // TODO add your handling code here:
        classic.startGame(1000,1000);
        close();
    }//GEN-LAST:event_btnnBorder1ActionPerformed

    private void btnStart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart2ActionPerformed
        // TODO add your handling code here:
        classic.startGame(1000,1000);
        close();
    }//GEN-LAST:event_btnStart2ActionPerformed

    private void btnStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart1ActionPerformed
        // TODO add your handling code here:
        classic.dispose();
        parent.setVisible(true);
        close(); 
    }//GEN-LAST:event_btnStart1ActionPerformed
    public void close(){
        parent.dispose();
        m.setVisible(true);
        this.dispose();
    }
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
            java.util.logging.Logger.getLogger(AreUSure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreUSure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreUSure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreUSure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AreUSure dialog = new AreUSure(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jogotetris.GUI.Componentes.BtnStart btnStart1;
    private jogotetris.GUI.Componentes.BtnStart btnStart2;
    private jogotetris.GUI.Componentes.BtnnBorder btnnBorder1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private jogotetris.GUI.Componentes.JPanelBg jPanelBg1;
    // End of variables declaration//GEN-END:variables
}
