/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.App;

import java.awt.Color;
import java.util.TimerTask;
import jogotetris.GUI.ClassicGameMode;

/**
 *
 * @author senti
 */
public class MoveGame extends TimerTask {
    private TetrisGame t ;
    private ClassicGameMode c ;
    public MoveGame(TetrisGame t,ClassicGameMode c){
        super();
        this.t = t;
        this.c = c;
    }

    @Override
    public void run() {
        c.playSE(2);
        if(t.stop){
            //c.gameOver();
        }
        t.moveDown();
        int pontosGanhos = t.deleteLines();
        if(pontosGanhos != 0){
            c.atualizaPontos(pontosGanhos);
            t.pontos = 0;
        }
        if(t.isGameOver()){
            c.gameOver();
        }
        
        t.repaint();
        t.requestFocus();
        
        
       
    }
}
