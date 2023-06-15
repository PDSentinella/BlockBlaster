/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.Content;
import java.awt.Color;
/**
 *
 * @author senti
 */
public class Empty extends Block{
    public Empty(){
        super('.', new Color(44,69,84));
    }
    @Override
    public Empty getClone(){
        return new Empty();
    }
    public static void main(String[] args) {
        //construtor
        Empty e = new Empty();
        //to string
        System.out.println("e = " + e);
        //clone
        Block e2 = e.getClone();
        System.out.println("e2 = "+ e2.getClass());

}
}
