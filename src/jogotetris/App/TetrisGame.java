/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.App;

import java.util.Timer;
import jogotetris.Content.Block;
import jogotetris.Content.Board;
import jogotetris.Content.Empty;
import jogotetris.Content.Piece;
import jogotetris.GUI.Sound;

/**
 *
 * @author senti
 */
public class TetrisGame extends Board{
    public Sound sound = new Sound();
    //pontos ganhos na "rodada" no classico se(multiplaye){pontos ganhos no jogo multiplayer}
    public int pontos = 0;
    //(mutlitplayer feature) player 1 e player 2
    public int player;
    public boolean gameOver = false;
    //pontos totais do classic game mode
    private int fPontos = 0;
    public GameListener lister;
    //pode tocar 'sound efect'(usado no settings do classic game)
    public boolean canPlaySE = true;
    public Timer timer = new Timer();
    
    public TetrisGame(int lines , int colunas){
        super(lines,colunas);
    }
     public TetrisGame(Piece current, Block[][] mat){
        super(current,mat);
    }
    public TetrisGame(){
        super();        
    }
    public boolean isGameOver(){
        //verifica se tem algum não empty na primeira linhas
        for(int j = 0;j<getColumns();j++){
            if(!(matrix[0][j] instanceof Empty)){
                //teste
                //System.out.println("game Over");
                return true;
            }
        
        }
        return false;
    }
    /*public boolean isGameOverChallenge1(){
        
    }*/
    //cria novo timer
    public void newTimer(){
        timer = new Timer();
    }
    //executa quando gameOver 
    public void gameOver(){
        stop = true;
        gameOver  = true;
        timer.cancel();
        
    }
    //toca musica 
    public void playMusic(int i){
        sound.setFile(i);
        sound.play();
        sound.loop();
    }
    //para musica
    public void stopMusic(){
        sound.stop();
    }
    //toca efeito de som
    public void playSE(int i){
        if(canPlaySE){
            sound = new Sound();
            sound.setFile(i);
            sound.play();
        }
    }
    public void setCanPlaySE(boolean modal){
        canPlaySE = modal;
    }
    public void setGameListener(GameListener listener){
        
    }
    public boolean isLineFull (int line){
        //verifica se a linha tem empty (se não a linhas está cheia
        for(int j = 0;j<getColumns();j++){
            if(matrix[line][j] instanceof Empty){
                return false;
            }
        }
        //usado para testes
        //System.out.println("full line "+line);
        return true;
    }
    //deleta a linha da matrix dado o seu indicie  na matrix
    public void deleteLine(int line){
       Block[][] m = new Block[getLines()][getColumns()];
       int k = 1;
       //cola na matrix do tetris game uma linha com empty's
        for(int j = 0; j<getColumns();j++){
               m[0][j] = new Empty();
           }
       //copia a matrix (inicial) da linha 0 até  a uma linhas antes da linha a ser deletada, na nova matrix(m)
       for(int i = 0; i <line;i++){
           for(int j = 0; j<getColumns();j++){
               m[k][j] = matrix[i][j].getClone();
           }
           k++;
       }
       //copia a matrix (inicial) da linha seguinte a ser deletada até o fim da matrix, na nova matrix(m)
       for(int i = line+1; i <getLines();i++){
           for(int j = 0; j<getColumns();j++){
               m[k][j] = matrix[i][j].getClone();
           }
           k++;
       }
       //seta a matrix (incial) como a nova matrix (m) 
       this.setMatrix(m);
    }
    //verifica se as linhas estão cheias, e deleta as linhas cheias
    public int deleteLines(){
        //numero de linhas a ser deletadas
        int lines = 0;
        //itera as linhas da matrix
        for(int i = 0; i<getLines();i++){
            //verifica se a linha esta "cheia" (sem empty's)
            if(isLineFull(i)){
                //deleta as linhas
                deleteLine(i);
                //soma as linhas que forão deletadas
                lines += 1;
            }
        }
        //calcula os pontos
        pontos =  calculaPontos(lines);
        return pontos;
    }
    public void untitledMethod(){
        
    }
    //os pontos não são lineares em função do numero de linhas deletdas(quanto mais linhas os pontos aumentão de acordo) a potencia
    public int calculaPontos(int lines){
        switch(lines){
            case 1:
                setfPontos(getfPontos() + 100);
                return 100;
            case 2:
                setfPontos(getfPontos() + 225);
                return 225;
            case 3: 
                setfPontos(getfPontos() + 370);
                return 370;
            case 4:
                setfPontos(getfPontos() + 545);
                return 545;
                
        }
        return lines*100;
    }

    public void setOpaque(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the fPontos
     */
    public int getfPontos() {
        return fPontos;
    }

    /**
     * @param fPontos the fPontos to set
     */
    public void setfPontos(int fPontos) {
        this.fPontos = fPontos;
    }
    
    
    
}

