/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogotetris.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jogotetris.Resorses.Blocking;

/**
 *
 * @author senti
 */
public class Main extends javax.swing.JFrame {
    public Sound sound = new Sound();
    public Font blockingFontBig = new Blocking(30);
    public Font blockingFontMedium = new Blocking(30);
    public Font blockingFontSmall = new Blocking(10);
    /**
     * Creates new form Main
     */
    public Main() {
        
        
        initComponents();
        setLocation(285,111);
        setSize(800,500);
        setShape(new RoundRectangle2D.Double(0,0,getWidth(), getHeight(),20,20));
        //btnClose1.setMargin(new Insets(0, 0, 0, 0));
        playMusic(0);
    }
    public void playMusic(int i){
        sound.setFile(i);
        sound.play();
        sound.loop();
    }
    public void stopMusic(){
        sound.stop();
    }
    public void playSE(int i){
        sound.setFile(i);
        sound.play();
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
        btnClose1 = new jogotetris.GUI.Componentes.BtnClose();
        btnClassic = new jogotetris.GUI.Componentes.BtnStart();
        btnMultiplayer = new jogotetris.GUI.Componentes.BtnStart();
        btnChallenge = new jogotetris.GUI.Componentes.BtnStart();
        btnHowToPlay = new jogotetris.GUI.Componentes.BtnStart();
        btnCredits = new jogotetris.GUI.Componentes.BtnnBorder();
        jLabel1 = new javax.swing.JLabel();
        btnStart1 = new jogotetris.GUI.Componentes.BtnStart();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelBg1.setBorderColor(new java.awt.Color(255, 255, 255));
        jPanelBg1.setColor(new java.awt.Color(0, 24, 41));
        jPanelBg1.setRadius(20);

        btnClose1.setForeground(new java.awt.Color(255, 0, 0));
        btnClose1.setToolTipText("");
        btnClose1.setBorderColor(new java.awt.Color(51, 51, 51));
        btnClose1.setColor(new java.awt.Color(51, 51, 51));
        btnClose1.setColorOver(new java.awt.Color(255, 102, 102));
        btnClose1.setFont(new java.awt.Font("Arial Narrow", 0, 8)); // NOI18N
        btnClose1.setMaximumSize(new java.awt.Dimension(50, 50));
        btnClose1.setPreferredSize(new java.awt.Dimension(15, 15));
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });

        btnClassic.setForeground(new java.awt.Color(228, 229, 214));
        btnClassic.setText("CLASSIC");
        btnClassic.setBorderColor(new java.awt.Color(228, 229, 214));
        btnClassic.setColor(new java.awt.Color(0, 24, 41));
        btnClassic.setColorOver(new java.awt.Color(252, 188, 0));
        btnClassic.setFont(new Blocking(30));
        btnClassic.setRadius(40);
        btnClassic.setSizeBorder(3);
        btnClassic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassicActionPerformed(evt);
            }
        });

        btnMultiplayer.setForeground(new java.awt.Color(228, 229, 214));
        btnMultiplayer.setText("MULTIPLAYER");
        btnMultiplayer.setBorderColor(new java.awt.Color(228, 229, 214));
        btnMultiplayer.setColor(new java.awt.Color(0, 24, 41));
        btnMultiplayer.setColorOver(new java.awt.Color(245, 116, 0));
        btnMultiplayer.setFont(new Blocking(30));
        btnMultiplayer.setRadius(40);
        btnMultiplayer.setSizeBorder(3);
        btnMultiplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplayerActionPerformed(evt);
            }
        });

        btnChallenge.setForeground(new java.awt.Color(228, 229, 214));
        btnChallenge.setText("CHALLENGE");
        btnChallenge.setBorderColor(new java.awt.Color(228, 229, 214));
        btnChallenge.setColor(new java.awt.Color(0, 24, 41));
        btnChallenge.setColorOver(new java.awt.Color(0, 164, 60));
        btnChallenge.setFont(new Blocking());
        btnChallenge.setRadius(40);
        btnChallenge.setSizeBorder(3);
        btnChallenge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChallengeActionPerformed(evt);
            }
        });

        btnHowToPlay.setForeground(new java.awt.Color(228, 229, 214));
        btnHowToPlay.setText("HOW TO PLAY");
        btnHowToPlay.setBorderColor(new java.awt.Color(228, 229, 214));
        btnHowToPlay.setColor(new java.awt.Color(0, 24, 41));
        btnHowToPlay.setColorOver(new java.awt.Color(0, 159, 202));
        btnHowToPlay.setFont(new Blocking());
        btnHowToPlay.setRadius(40);
        btnHowToPlay.setSizeBorder(3);
        btnHowToPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHowToPlayActionPerformed(evt);
            }
        });

        btnCredits.setBackground(new java.awt.Color(0, 24, 41));
        btnCredits.setForeground(new java.awt.Color(102, 102, 102));
        btnCredits.setText("credits");
        btnCredits.setColor(new java.awt.Color(65, 85, 94));
        btnCredits.setColorOver(new java.awt.Color(228, 229, 214));
        btnCredits.setFont( new Blocking(30));
        btnCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditsActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogotetris/Resorses/bb_icon_logo.png"))); // NOI18N

        btnStart1.setForeground(new java.awt.Color(102, 102, 102));
        btnStart1.setText("score");
        btnStart1.setBorderColor(new java.awt.Color(0, 24, 41));
        btnStart1.setColor(new java.awt.Color(0, 24, 41));
        btnStart1.setColorOver(new java.awt.Color(228, 229, 214));
        btnStart1.setFixColor(new java.awt.Color(102, 102, 102));
        btnStart1.setFont(new Blocking(30));
        btnStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBg1Layout = new javax.swing.GroupLayout(jPanelBg1);
        jPanelBg1.setLayout(jPanelBg1Layout);
        jPanelBg1Layout.setHorizontalGroup(
            jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBg1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBg1Layout.createSequentialGroup()
                        .addComponent(btnCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBg1Layout.createSequentialGroup()
                            .addComponent(btnClose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBg1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMultiplayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnChallenge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnHowToPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClassic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(172, Short.MAX_VALUE)))))
        );
        jPanelBg1Layout.setVerticalGroup(
            jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBg1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBg1Layout.createSequentialGroup()
                        .addComponent(btnClassic, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMultiplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChallenge, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHowToPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
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

    private void btnChallengeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChallengeActionPerformed
        // TODO add your handling code here:
        this.stopMusic();
        this.playMusic(1);
        ExplainChallenge challenge = new  ExplainChallenge(this,true,sound) ;
        challenge.setVisible(true);
    }//GEN-LAST:event_btnChallengeActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void btnClassicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassicActionPerformed
        // TODO add your handling code here:
        ClassicGameMode classic = new ClassicGameMode(this, true,sound);
        //this.setVisible(false);
        classic.setVisible(true);
        
    }//GEN-LAST:event_btnClassicActionPerformed

    private void btnHowToPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHowToPlayActionPerformed
        // TODO add your handling code here:
        HowToPlay htp = new HowToPlay(this,true);
        htp.setVisible(true);
    }//GEN-LAST:event_btnHowToPlayActionPerformed

    private void btnCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditsActionPerformed
        // TODO add your handling code here:
        Credits credits = new Credits(this,true);
        credits.setVisible(true);
    }//GEN-LAST:event_btnCreditsActionPerformed

    private void btnMultiplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplayerActionPerformed
        // TODO add your handling code here:
        MultiplayerGameMode multiplayer = new MultiplayerGameMode(this,true);
        multiplayer.setVisible(true);
    }//GEN-LAST:event_btnMultiplayerActionPerformed

    private void btnStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart1ActionPerformed
        // TODO add your handling code here:
        Score score = new Score(this,true);
        score.setVisible(true);
    }//GEN-LAST:event_btnStart1ActionPerformed
   
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jogotetris.GUI.Componentes.BtnStart btnChallenge;
    private jogotetris.GUI.Componentes.BtnStart btnClassic;
    private jogotetris.GUI.Componentes.BtnClose btnClose1;
    private jogotetris.GUI.Componentes.BtnnBorder btnCredits;
    private jogotetris.GUI.Componentes.BtnStart btnHowToPlay;
    private jogotetris.GUI.Componentes.BtnStart btnMultiplayer;
    private jogotetris.GUI.Componentes.BtnStart btnStart1;
    private javax.swing.JLabel jLabel1;
    private jogotetris.GUI.Componentes.JPanelBg jPanelBg1;
    // End of variables declaration//GEN-END:variables
}
