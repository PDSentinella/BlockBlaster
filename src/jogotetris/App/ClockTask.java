/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.App;
import java.util.Date;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.Timer;
/**
 *
 * @author senti
 */
public class ClockTask extends TimerTask{

    @Override
    public void run() {
        System.out.println( new Date());
       }
    
    public static void main(String[] args) {
        //create timer
        Timer t = new Timer();
        //start execution
        // Clock task
        // 0 - starting now
        // 1000 - second by second
        t.schedule(new ClockTask(), 0, 1000);
        System.out.println("Prima enter para sair.");
        Scanner keyb = new Scanner(System.in);
        keyb.nextLine();
        t.cancel();
        System.out.println("Tarefa concluida");
    }

}
