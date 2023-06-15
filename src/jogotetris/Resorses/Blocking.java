/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.Resorses;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author senti
 */
public class Blocking extends Font{
    public Blocking(){
        super(getFont(30));
    }
    public Blocking(float size){
        super(getFont(size));
    }
    public static Font getFont(float size) {
        Font blocking = null ;
        try{
            blocking = Font.createFont(Font.TRUETYPE_FONT, new File("src\\jogotetris\\Resorses\\blocking.ttf")).deriveFont(size);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(blocking);
        }
        catch(IOException | FontFormatException e){
            
        }
        return blocking;
    }
}
