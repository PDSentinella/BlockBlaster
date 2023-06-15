/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.App;

import java.util.TimerTask;
import jogotetris.GUI.MultiplayerGameMode;

/**
 *
 * @author senti
 */
public class MoveGameMultiplayer extends TimerTask {
    private TetrisGame t1 ;
    private TetrisGame t2;
    private MultiplayerGameMode m ;
    public MoveGameMultiplayer(TetrisGame t1,TetrisGame t2,MultiplayerGameMode m){
        super();
        this.t1 = t1;
        this.t2 = t2;
        this.m = m;
 
    }
    @Override
    public void run() {
        m.atualizaPlacar();
        if(!(t1.gameOver)){
            t1.moveDown();
        }
        if(!(t2.gameOver)){
            t2.moveDown();
        }
        int pontosGanhos1 = t1.deleteLines();
        int pontosGanhos2 = t2.deleteLines();
        if(pontosGanhos1 != 0  ){
            m.atualizaPontos(t1.player,pontosGanhos1);
            
        }
        
        if(pontosGanhos2 != 0 ){
            m.atualizaPontos(t2.player,pontosGanhos2);
        }
        if(t1.isGameOver()){
            t1.gameOver();
        }
        if(t2.isGameOver()){
            t2.gameOver();
        }
        if(t1.isGameOver() && t2.isGameOver()){
            m.gameOver();
        }
        
        t1.repaint();
        t2.repaint();
        t1.requestFocus();
        //teste
        //System.out.println("hello");    
    }
    
}
