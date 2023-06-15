/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jogotetris.App;

/**
 *
 * @author senti
 */
public interface GameListener {
    public void onGameUpdate();
    public void OnGameOver();
    public int onDeleteLine(int line);
}
