/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.App;

import java.util.TimerTask;
import jogotetris.GUI.ChallengeGameMode1;

/**
 *
 * @author senti
 */
public class MoveGameChallenge1 extends TimerTask {
    private TetrisGame t ;
    private ChallengeGameMode1 challenge ;
    public MoveGameChallenge1(TetrisGame t,ChallengeGameMode1 challenge){
        super();
        this.t = t;
        this.challenge = challenge;
    }

    @Override
    public void run() {
        if(t.stop){
            challenge.gameOver();
        }
        t.moveDown();
        int pontosGanhos = t.deleteLines();
        
        if(pontosGanhos != 0){
            challenge.atualizaPontos(pontosGanhos);
            if(pontosGanhos > 500){
                challenge.Won();
            }
            t.pontos = 0;
        }
        
        if(t.isGameOver()){
            challenge.gameOver();
        }
        
        t.repaint();
        t.requestFocus();
    }
}

