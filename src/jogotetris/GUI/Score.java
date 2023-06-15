/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package jogotetris.GUI;

import java.awt.Frame;
import java.awt.geom.RoundRectangle2D;
import static jogotetris.App.Scores.getNames;
import static jogotetris.App.Scores.getScores;

/**
 *
 * @author senti
 */
public class Score extends javax.swing.JDialog {
    public Frame parent;
    public Sound sound;
    /**
     * Creates new form Score
     */
    public Score(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        setLocation(332,151);
        this.setUndecorated(true);
        initComponents();
        setShape(new RoundRectangle2D.Double(0,0,getWidth(), getHeight(),20,20));
        updateScores();
    }
     public Score(java.awt.Frame parent, boolean modal,Sound sound) {
         this(parent,modal);
         this.sound = sound;
     }
     public void updateScores(){
         String[] s = getNames();
         String[] p = getScores();
         if(s!=null){
             
             LabelPlayerName1.setText(s[0]);
             LabelPoint1.setText(p[0]);
             LabelPlayerName2.setText(s[1]);
             LabelPoint2.setText(p[1]);
             LabelPlayerName3.setText(s[2]);
             LabelPoint3.setText(p[2]);
             LabelPlayerName4.setText(s[3]);
             LabelPoint4.setText(p[3]);
             LabelPlayerName5.setText(s[4]);
             LabelPoint5.setText(p[4]);
             
         }
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
        btnStart1 = new jogotetris.GUI.Componentes.BtnStart();
        jPanelBg2 = new jogotetris.GUI.Componentes.JPanelBg();
        jLabel2 = new javax.swing.JLabel();
        jPanelBg4 = new jogotetris.GUI.Componentes.JPanelBg();
        LabelPlayerName1 = new javax.swing.JLabel();
        LabelPoint1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelBg3 = new jogotetris.GUI.Componentes.JPanelBg();
        LabelPlayerName2 = new javax.swing.JLabel();
        LabelPoint2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelBg5 = new jogotetris.GUI.Componentes.JPanelBg();
        LabelPlayerName3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LabelPoint3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelBg6 = new jogotetris.GUI.Componentes.JPanelBg();
        LabelPlayerName4 = new javax.swing.JLabel();
        LabelPoint4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelBg7 = new jogotetris.GUI.Componentes.JPanelBg();
        LabelPlayerName5 = new javax.swing.JLabel();
        LabelPoint5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnStart2 = new jogotetris.GUI.Componentes.BtnStart();
        btnnBorder1 = new jogotetris.GUI.Componentes.BtnnBorder();
        jPanelBg8 = new jogotetris.GUI.Componentes.JPanelBg();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(705, 420));

        jPanelBg1.setBorderColor(new java.awt.Color(228, 229, 214));
        jPanelBg1.setColor(new java.awt.Color(228, 229, 214));

        btnStart1.setForeground(new java.awt.Color(0, 164, 60));
        btnStart1.setText("how to play ");
        btnStart1.setBorderColor(new java.awt.Color(0, 164, 60));
        btnStart1.setColorOver(new java.awt.Color(0, 164, 60));
        btnStart1.setFixColor(new java.awt.Color(0, 164, 60));
        btnStart1.setRadius(20);
        btnStart1.setSizeBorder(2);
        btnStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart1ActionPerformed(evt);
            }
        });

        jPanelBg2.setBorderColor(new java.awt.Color(228, 229, 214));
        jPanelBg2.setColor(new java.awt.Color(228, 229, 214));

        jLabel2.setFont(new java.awt.Font("Gill Sans Nova Ultra Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 164, 60));
        jLabel2.setText("1");

        jPanelBg4.setToolTipText("");
        jPanelBg4.setBorderColor(new java.awt.Color(0, 164, 60));
        jPanelBg4.setBorderWidth(2);
        jPanelBg4.setColor(new java.awt.Color(0, 164, 60));
        jPanelBg4.setRadius(20);

        LabelPlayerName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelPlayerName1.setForeground(new java.awt.Color(228, 229, 214));
        LabelPlayerName1.setText("Empty");

        LabelPoint1.setForeground(new java.awt.Color(228, 229, 214));
        LabelPoint1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(228, 229, 214));
        jLabel11.setText("Points");

        javax.swing.GroupLayout jPanelBg4Layout = new javax.swing.GroupLayout(jPanelBg4);
        jPanelBg4.setLayout(jPanelBg4Layout);
        jPanelBg4Layout.setHorizontalGroup(
            jPanelBg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelPlayerName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(LabelPoint1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addGap(32, 32, 32))
        );
        jPanelBg4Layout.setVerticalGroup(
            jPanelBg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelPlayerName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelPoint1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Gill Sans Nova Cond Ultra Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 164, 60));
        jLabel3.setText("2");

        jPanelBg3.setBorderColor(new java.awt.Color(0, 164, 60));
        jPanelBg3.setBorderWidth(2);
        jPanelBg3.setColor(new java.awt.Color(228, 229, 214));
        jPanelBg3.setRadius(20);

        LabelPlayerName2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelPlayerName2.setForeground(new java.awt.Color(0, 164, 60));
        LabelPlayerName2.setText("Empty");

        LabelPoint2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 164, 60));
        jLabel14.setText("Points");

        javax.swing.GroupLayout jPanelBg3Layout = new javax.swing.GroupLayout(jPanelBg3);
        jPanelBg3.setLayout(jPanelBg3Layout);
        jPanelBg3Layout.setHorizontalGroup(
            jPanelBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelPlayerName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(LabelPoint2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(32, 32, 32))
        );
        jPanelBg3Layout.setVerticalGroup(
            jPanelBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelPlayerName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelPoint2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Gill Sans Nova Cond Ultra Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 164, 60));
        jLabel4.setText("3");

        jPanelBg5.setBorderColor(new java.awt.Color(0, 164, 60));
        jPanelBg5.setBorderWidth(2);
        jPanelBg5.setColor(new java.awt.Color(228, 229, 214));
        jPanelBg5.setRadius(20);

        LabelPlayerName3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelPlayerName3.setForeground(new java.awt.Color(0, 164, 60));
        LabelPlayerName3.setText("Empty");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 164, 60));
        jLabel16.setText("Points");

        LabelPoint3.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanelBg5Layout = new javax.swing.GroupLayout(jPanelBg5);
        jPanelBg5.setLayout(jPanelBg5Layout);
        jPanelBg5Layout.setHorizontalGroup(
            jPanelBg5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelPlayerName3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelPoint3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(33, 33, 33))
        );
        jPanelBg5Layout.setVerticalGroup(
            jPanelBg5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg5Layout.createSequentialGroup()
                .addGroup(jPanelBg5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPlayerName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelPoint3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Gill Sans Nova Cond Ultra Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 164, 60));
        jLabel5.setText("4");

        jPanelBg6.setBorderColor(new java.awt.Color(0, 164, 60));
        jPanelBg6.setBorderWidth(2);
        jPanelBg6.setColor(new java.awt.Color(228, 229, 214));
        jPanelBg6.setRadius(20);

        LabelPlayerName4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelPlayerName4.setForeground(new java.awt.Color(0, 164, 60));
        LabelPlayerName4.setText("Empty");

        LabelPoint4.setForeground(new java.awt.Color(153, 153, 153));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 164, 60));
        jLabel20.setText("Points");

        javax.swing.GroupLayout jPanelBg6Layout = new javax.swing.GroupLayout(jPanelBg6);
        jPanelBg6.setLayout(jPanelBg6Layout);
        jPanelBg6Layout.setHorizontalGroup(
            jPanelBg6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelPlayerName4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelPoint4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(32, 32, 32))
        );
        jPanelBg6Layout.setVerticalGroup(
            jPanelBg6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBg6Layout.createSequentialGroup()
                .addGroup(jPanelBg6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelPoint4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelPlayerName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 164, 60));
        jLabel6.setText("5");

        jPanelBg7.setBorderColor(new java.awt.Color(0, 164, 60));
        jPanelBg7.setBorderWidth(2);
        jPanelBg7.setColor(new java.awt.Color(228, 229, 214));
        jPanelBg7.setRadius(20);

        LabelPlayerName5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelPlayerName5.setForeground(new java.awt.Color(0, 164, 60));
        LabelPlayerName5.setText("Empty");

        LabelPoint5.setForeground(new java.awt.Color(153, 153, 153));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 164, 60));
        jLabel23.setText("Points");

        javax.swing.GroupLayout jPanelBg7Layout = new javax.swing.GroupLayout(jPanelBg7);
        jPanelBg7.setLayout(jPanelBg7Layout);
        jPanelBg7Layout.setHorizontalGroup(
            jPanelBg7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelPlayerName5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelPoint5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(34, 34, 34))
        );
        jPanelBg7Layout.setVerticalGroup(
            jPanelBg7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBg7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBg7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPlayerName5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(LabelPoint5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelBg2Layout = new javax.swing.GroupLayout(jPanelBg2);
        jPanelBg2.setLayout(jPanelBg2Layout);
        jPanelBg2Layout.setHorizontalGroup(
            jPanelBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBg2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelBg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelBg5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelBg6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelBg7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelBg2Layout.createSequentialGroup()
                        .addGroup(jPanelBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelBg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelBg2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        jPanelBg2Layout.setVerticalGroup(
            jPanelBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jPanelBg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jPanelBg5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jPanelBg6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jPanelBg7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanelBg2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        btnStart2.setForeground(new java.awt.Color(228, 229, 214));
        btnStart2.setText("play again");
        btnStart2.setBorderColor(new java.awt.Color(0, 164, 60));
        btnStart2.setColor(new java.awt.Color(0, 164, 60));
        btnStart2.setColorOver(new java.awt.Color(228, 229, 214));
        btnStart2.setRadius(20);
        btnStart2.setSizeBorder(2);
        btnStart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart2ActionPerformed(evt);
            }
        });

        btnnBorder1.setBackground(new java.awt.Color(228, 229, 214));
        btnnBorder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogotetris/Resorses/x-mark.png"))); // NOI18N
        btnnBorder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnBorder1ActionPerformed(evt);
            }
        });

        jPanelBg8.setBorderColor(new java.awt.Color(228, 229, 214));
        jPanelBg8.setColor(new java.awt.Color(228, 229, 214));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 164, 60));
        jLabel7.setText("<html>Familiarize-se com os controles<html>");

        jLabel9.setForeground(new java.awt.Color(0, 164, 60));
        jLabel9.setText("<html>use as teclas de seta(ou as teclas A,S, D e W) para mover as pelas para a esquerda, direita ou para baixo<html>");

        javax.swing.GroupLayout jPanelBg8Layout = new javax.swing.GroupLayout(jPanelBg8);
        jPanelBg8.setLayout(jPanelBg8Layout);
        jPanelBg8Layout.setHorizontalGroup(
            jPanelBg8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBg8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelBg8Layout.setVerticalGroup(
            jPanelBg8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 164, 60));
        jLabel1.setText("Best Classic scores");

        javax.swing.GroupLayout jPanelBg1Layout = new javax.swing.GroupLayout(jPanelBg1);
        jPanelBg1.setLayout(jPanelBg1Layout);
        jPanelBg1Layout.setHorizontalGroup(
            jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelBg1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnnBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBg1Layout.createSequentialGroup()
                        .addComponent(jPanelBg8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBg1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(btnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnStart2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBg1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanelBg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanelBg1Layout.setVerticalGroup(
            jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnnBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBg1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanelBg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnStart2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBg1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelBg8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
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
        this.dispose();
    }//GEN-LAST:event_btnnBorder1ActionPerformed

    private void btnStart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart2ActionPerformed
        // TODO add your handling code here:
        ClassicGameMode classic = new ClassicGameMode(parent,true,sound);
        classic.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStart2ActionPerformed

    private void btnStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart1ActionPerformed
        // TODO add your handling code here:
        HowToPlay htp = new HowToPlay(parent,true);
        htp.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Score dialog = new Score(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel LabelPlayerName1;
    private javax.swing.JLabel LabelPlayerName2;
    private javax.swing.JLabel LabelPlayerName3;
    private javax.swing.JLabel LabelPlayerName4;
    private javax.swing.JLabel LabelPlayerName5;
    private javax.swing.JLabel LabelPoint1;
    private javax.swing.JLabel LabelPoint2;
    private javax.swing.JLabel LabelPoint3;
    private javax.swing.JLabel LabelPoint4;
    private javax.swing.JLabel LabelPoint5;
    private jogotetris.GUI.Componentes.BtnStart btnStart1;
    private jogotetris.GUI.Componentes.BtnStart btnStart2;
    private jogotetris.GUI.Componentes.BtnnBorder btnnBorder1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private jogotetris.GUI.Componentes.JPanelBg jPanelBg1;
    private jogotetris.GUI.Componentes.JPanelBg jPanelBg2;
    private jogotetris.GUI.Componentes.JPanelBg jPanelBg3;
    private jogotetris.GUI.Componentes.JPanelBg jPanelBg4;
    private jogotetris.GUI.Componentes.JPanelBg jPanelBg5;
    private jogotetris.GUI.Componentes.JPanelBg jPanelBg6;
    private jogotetris.GUI.Componentes.JPanelBg jPanelBg7;
    private jogotetris.GUI.Componentes.JPanelBg jPanelBg8;
    // End of variables declaration//GEN-END:variables
}