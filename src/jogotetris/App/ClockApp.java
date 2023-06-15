/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.App;

import java.util.Timer;

/**
 *
 * @author senti
 */
public class ClockApp {
    public static void main(String[] args) {
        Timer t = new Timer();
        ClockTask task = new ClockTask();
        t.schedule(task, 0,1000);
        System.out.println("Fim do main");
        
    }
}
