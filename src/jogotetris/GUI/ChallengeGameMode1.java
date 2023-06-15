/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package jogotetris.GUI;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.RoundRectangle2D;
import jogotetris.App.MoveGameChallenge1;
import static jogotetris.App.Scores.AtualizaScores;
import jogotetris.App.TetrisGame;
import jogotetris.Content.PieceE;
import jogotetris.Content.PieceL;
import jogotetris.Content.PieceM;
import static jogotetris.Content.PieceX.pieceE;

/**
 *
 * @author senti
 */
public class ChallengeGameMode1 extends javax.swing.JDialog implements KeyListener{
    public Frame parent;
    public Sound sound;
    /**
     * Creates new form ChallengeGameMode1
     */
     @Override
    public void keyTyped(KeyEvent e) {
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
         int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_UP) {
            board1.rotate();
            board1.repaint();
        } else if (keyCode == KeyEvent.VK_DOWN) {
                board1.moveDown();   
                board1.repaint();
            } else if (keyCode == KeyEvent.VK_LEFT) {
                board1.moveLeft();board1.repaint();
                }else if (keyCode == KeyEvent.VK_RIGHT) {
                    board1.moveRight();
                    board1.repaint();
                    }else if(keyCode == KeyEvent.VK_SPACE){
                    board1.fallDown();
                    board1.repaint();
                    }
    }
    public ChallengeGameMode1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        initComponents();
        board1.addKeyListener(this);
        setLocation(285,111);
        setShape(new RoundRectangle2D.Double(0,0,getWidth(), getHeight(),20,20));
        board1.setPiece(new PieceE());
        board1.getCurrent().setX(0);
        board1.fallDown();
        board1.moveDown();
        board1.setPiece(new PieceE());
        board1.getCurrent().setX(3);
        board1.fallDown();
        board1.moveDown();
        board1.setPiece(new PieceE());
        board1.getCurrent().setX(6);
        board1.fallDown();
        board1.moveDown();
        board1.setTeme(1);
        board1.setPiece(new PieceM());
        board1.getCurrent().setX(9);
        board1.fallDown();
        board1.moveDown();
        
        
    
        startGame(1000,1000);
    }
     public ChallengeGameMode1(java.awt.Frame parent, boolean modal,Sound sound){
         this(parent,true);
         this.sound = sound;
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
        jPanelBgTetrisGame = new jogotetris.GUI.Componentes.JPanelBg();
        board1 = new jogotetris.App.TetrisGame();
        JPanelLeft = new jogotetris.GUI.Componentes.JPanelBg();
        btnFall = new jogotetris.GUI.Componentes.BtnStart();
        btnEndGame = new jogotetris.GUI.Componentes.BtnStart();
        btnPause = new jogotetris.GUI.Componentes.BtnStart();
        JPanelContainerPoints = new jogotetris.GUI.Componentes.JPanelBg();
        JPanelPoints = new jogotetris.GUI.Componentes.JPanelBg();
        labelPoints = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JPanelControls = new jogotetris.GUI.Componentes.JPanelBg();
        btnLeft = new jogotetris.GUI.Componentes.BtnStart();
        btnRight = new jogotetris.GUI.Componentes.BtnStart();
        btnRotate = new jogotetris.GUI.Componentes.BtnStart();
        btnDown = new jogotetris.GUI.Componentes.BtnStart();
        btnSettings = new jogotetris.GUI.Componentes.BtnnBorder();
        btnClose1 = new jogotetris.GUI.Componentes.BtnClose();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanelBg1.setBorderColor(new java.awt.Color(0, 24, 41));
        jPanelBg1.setColor(new java.awt.Color(0, 24, 41));

        jPanelBgTetrisGame.setBorderColor(new java.awt.Color(18, 48, 65));
        jPanelBgTetrisGame.setBorderWidth(0);
        jPanelBgTetrisGame.setColor(new java.awt.Color(18, 48, 65));
        jPanelBgTetrisGame.setRadius(20);

        javax.swing.GroupLayout board1Layout = new javax.swing.GroupLayout(board1);
        board1.setLayout(board1Layout);
        board1Layout.setHorizontalGroup(
            board1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        board1Layout.setVerticalGroup(
            board1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelBgTetrisGameLayout = new javax.swing.GroupLayout(jPanelBgTetrisGame);
        jPanelBgTetrisGame.setLayout(jPanelBgTetrisGameLayout);
        jPanelBgTetrisGameLayout.setHorizontalGroup(
            jPanelBgTetrisGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBgTetrisGameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(board1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelBgTetrisGameLayout.setVerticalGroup(
            jPanelBgTetrisGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBgTetrisGameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(board1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JPanelLeft.setBorderColor(new java.awt.Color(0, 24, 41));
        JPanelLeft.setBorderWidth(0);
        JPanelLeft.setColor(new java.awt.Color(0, 24, 41));
        JPanelLeft.setPreferredSize(new java.awt.Dimension(409, 432));
        JPanelLeft.setRadius(20);

        btnFall.setForeground(new java.awt.Color(228, 229, 214));
        btnFall.setText("FALL");
        btnFall.setBorderColor(new java.awt.Color(228, 229, 214));
        btnFall.setColor(new java.awt.Color(0, 24, 41));
        btnFall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFall.setRadius(20);
        btnFall.setSizeBorder(2);
        btnFall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFallActionPerformed(evt);
            }
        });

        btnEndGame.setForeground(new java.awt.Color(228, 229, 214));
        btnEndGame.setText("END GAME");
        btnEndGame.setBorderColor(new java.awt.Color(228, 229, 214));
        btnEndGame.setColor(new java.awt.Color(0, 24, 41));
        btnEndGame.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEndGame.setRadius(20);
        btnEndGame.setSizeBorder(2);
        btnEndGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndGameActionPerformed(evt);
            }
        });

        btnPause.setForeground(new java.awt.Color(228, 229, 214));
        btnPause.setText("PAUSE");
        btnPause.setBorderColor(new java.awt.Color(228, 229, 214));
        btnPause.setColor(new java.awt.Color(0, 24, 41));
        btnPause.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPause.setRadius(20);
        btnPause.setSizeBorder(2);
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        JPanelContainerPoints.setBorderColor(new java.awt.Color(18, 48, 65));
        JPanelContainerPoints.setBorderWidth(0);
        JPanelContainerPoints.setColor(new java.awt.Color(18, 48, 65));
        JPanelContainerPoints.setRadius(20);

        JPanelPoints.setBorderColor(new java.awt.Color(44, 69, 84));
        JPanelPoints.setBorderWidth(0);
        JPanelPoints.setColor(new java.awt.Color(44, 69, 84));
        JPanelPoints.setMaximumSize(new java.awt.Dimension(65, 58));
        JPanelPoints.setMinimumSize(new java.awt.Dimension(65, 58));
        JPanelPoints.setRadius(20);

        labelPoints.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        labelPoints.setForeground(new java.awt.Color(228, 229, 214));
        labelPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPoints.setText("0");

        javax.swing.GroupLayout JPanelPointsLayout = new javax.swing.GroupLayout(JPanelPoints);
        JPanelPoints.setLayout(JPanelPointsLayout);
        JPanelPointsLayout.setHorizontalGroup(
            JPanelPointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPoints, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );
        JPanelPointsLayout.setVerticalGroup(
            JPanelPointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPoints, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(228, 229, 214));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 229, 214));
        jLabel1.setText("Points");

        javax.swing.GroupLayout JPanelContainerPointsLayout = new javax.swing.GroupLayout(JPanelContainerPoints);
        JPanelContainerPoints.setLayout(JPanelContainerPointsLayout);
        JPanelContainerPointsLayout.setHorizontalGroup(
            JPanelContainerPointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelContainerPointsLayout.createSequentialGroup()
                .addGroup(JPanelContainerPointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelContainerPointsLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(JPanelPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelContainerPointsLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelContainerPointsLayout.setVerticalGroup(
            JPanelContainerPointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelContainerPointsLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(JPanelPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        JPanelControls.setBorderColor(new java.awt.Color(0, 24, 41));
        JPanelControls.setBorderWidth(0);
        JPanelControls.setColor(new java.awt.Color(0, 24, 41));

        btnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogotetris/Resorses/bb_icon_arrow_left_white.png"))); // NOI18N
        btnLeft.setBorderColor(new java.awt.Color(228, 229, 214));
        btnLeft.setColor(new java.awt.Color(0, 24, 41));
        btnLeft.setPreferredSize(new java.awt.Dimension(52, 52));
        btnLeft.setRadius(20);
        btnLeft.setSizeBorder(2);
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });

        btnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogotetris/Resorses/bb_icon_arrow_right_white.png"))); // NOI18N
        btnRight.setBorderColor(new java.awt.Color(228, 229, 214));
        btnRight.setColor(new java.awt.Color(0, 24, 41));
        btnRight.setPreferredSize(new java.awt.Dimension(52, 52));
        btnRight.setRadius(20);
        btnRight.setSizeBorder(2);
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });

        btnRotate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogotetris/Resorses/bb_icon_rotatearrow_darkblue.png"))); // NOI18N
        btnRotate.setBorderColor(new java.awt.Color(228, 229, 214));
        btnRotate.setMaximumSize(new java.awt.Dimension(72, 72));
        btnRotate.setPreferredSize(new java.awt.Dimension(52, 52));
        btnRotate.setRadius(20);
        btnRotate.setSizeBorder(2);
        btnRotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotateActionPerformed(evt);
            }
        });

        btnDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogotetris/Resorses/bb_icon_arrow_down_white.png"))); // NOI18N
        btnDown.setBorderColor(new java.awt.Color(228, 229, 214));
        btnDown.setColor(new java.awt.Color(0, 24, 41));
        btnDown.setPreferredSize(new java.awt.Dimension(52, 52));
        btnDown.setRadius(20);
        btnDown.setSizeBorder(2);
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelControlsLayout = new javax.swing.GroupLayout(JPanelControls);
        JPanelControls.setLayout(JPanelControlsLayout);
        JPanelControlsLayout.setHorizontalGroup(
            JPanelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelControlsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRotate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        JPanelControlsLayout.setVerticalGroup(
            JPanelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelControlsLayout.createSequentialGroup()
                .addGroup(JPanelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelControlsLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(JPanelControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanelControlsLayout.createSequentialGroup()
                        .addComponent(btnRotate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnSettings.setBackground(new java.awt.Color(0, 24, 41));
        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogotetris/Resorses/setting.png"))); // NOI18N
        btnSettings.setColor(new java.awt.Color(18, 48, 65));
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelLeftLayout = new javax.swing.GroupLayout(JPanelLeft);
        JPanelLeft.setLayout(JPanelLeftLayout);
        JPanelLeftLayout.setHorizontalGroup(
            JPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLeftLayout.createSequentialGroup()
                .addGroup(JPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanelLeftLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(JPanelControls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPanelLeftLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(JPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPanelLeftLayout.createSequentialGroup()
                                .addComponent(btnEndGame, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JPanelContainerPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        JPanelLeftLayout.setVerticalGroup(
            JPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLeftLayout.createSequentialGroup()
                .addGroup(JPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelLeftLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JPanelContainerPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addComponent(JPanelControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnFall, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEndGame, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanelBg1Layout = new javax.swing.GroupLayout(jPanelBg1);
        jPanelBg1.setLayout(jPanelBg1Layout);
        jPanelBg1Layout.setHorizontalGroup(
            jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(JPanelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanelBgTetrisGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBg1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBg1Layout.setVerticalGroup(
            jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBg1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBgTetrisGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void btnFallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFallActionPerformed
        // TODO add your handling code here:
        board1.fallDown();
        board1.repaint();
    }//GEN-LAST:event_btnFallActionPerformed

    private void btnEndGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndGameActionPerformed
        // TODO add your handling code here:
        this.board1.timer.cancel();
        this.dispose();

    }//GEN-LAST:event_btnEndGameActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        // TODO add your handling code here:
        this.board1.timer.cancel();
        BlurPause b = new BlurPause();
        b.setVisible(true);
        //ReStart r = new ReStart(b,true,this);
        //r.setVisible(true);

    }//GEN-LAST:event_btnPauseActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        // TODO add your handling code here:
        board1.moveLeft();
        board1.repaint();
    }//GEN-LAST:event_btnLeftActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        // TODO add your handling code here:
        board1.moveRight();
        board1.repaint();
    }//GEN-LAST:event_btnRightActionPerformed

    private void btnRotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotateActionPerformed
        // TODO add your handling code here:
        board1.rotate();
        board1.repaint();
    }//GEN-LAST:event_btnRotateActionPerformed

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
        // TODO add your handling code here:
        board1.moveDown();
        board1.repaint();
    }//GEN-LAST:event_btnDownActionPerformed

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        // TODO add your handling code here:
        this.board1.timer.cancel();
        Blur b = new Blur();
        b.setVisible(true);
        //Settings s = new Settings(b,true,this);
        //s.setVisible(true);
    }//GEN-LAST:event_btnSettingsActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnClose1ActionPerformed
    public void Won(){
         cancelTimer();
         ChallengeGameWon won = new ChallengeGameWon(parent,true);
         won.setVisible(true);
         this.dispose();
    }
    public void startGame(int i,int j){
        board1.newTimer();
        board1.timer.schedule(new MoveGameChallenge1(board1,this), i,j);
    }
    public String getPoints(){
        return this.labelPoints.getText();
    }
    public void atualizaPontos(int pontosGanhos){
        int s = (int) Integer.valueOf(this.labelPoints.getText())+pontosGanhos;
        this.labelPoints.setText(s+"");
    }
    public void gameOver(){
        parent.setVisible(true);
        cancelTimer();
        sound.setFile(0);
        sound.play();
        sound.loop();
        ChallengeGameLose lose = new ChallengeGameLose(parent,true);
        lose.setVisible(true);
        this.dispose();
        
    }
    public void cancelTimer(){
        board1.gameOver();
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
            java.util.logging.Logger.getLogger(ChallengeGameMode1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChallengeGameMode1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChallengeGameMode1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChallengeGameMode1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChallengeGameMode1 dialog = new ChallengeGameMode1(new javax.swing.JFrame(), true);
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
    private jogotetris.GUI.Componentes.JPanelBg JPanelContainerPoints;
    private jogotetris.GUI.Componentes.JPanelBg JPanelControls;
    private jogotetris.GUI.Componentes.JPanelBg JPanelLeft;
    private jogotetris.GUI.Componentes.JPanelBg JPanelPoints;
    private jogotetris.App.TetrisGame board1;
    private jogotetris.GUI.Componentes.BtnClose btnClose1;
    private jogotetris.GUI.Componentes.BtnStart btnDown;
    private jogotetris.GUI.Componentes.BtnStart btnEndGame;
    private jogotetris.GUI.Componentes.BtnStart btnFall;
    private jogotetris.GUI.Componentes.BtnStart btnLeft;
    private jogotetris.GUI.Componentes.BtnStart btnPause;
    private jogotetris.GUI.Componentes.BtnStart btnRight;
    private jogotetris.GUI.Componentes.BtnStart btnRotate;
    private jogotetris.GUI.Componentes.BtnnBorder btnSettings;
    private javax.swing.JLabel jLabel1;
    private jogotetris.GUI.Componentes.JPanelBg jPanelBg1;
    private jogotetris.GUI.Componentes.JPanelBg jPanelBgTetrisGame;
    private javax.swing.JLabel labelPoints;
    // End of variables declaration//GEN-END:variables
}
