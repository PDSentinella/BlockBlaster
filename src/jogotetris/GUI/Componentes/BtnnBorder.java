/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.GUI.Componentes;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author senti
 */
public class BtnnBorder extends JButton {

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the colorOver
     */
    public Color getColorOver() {
        return colorOver;
    }

    /**
     * @param colorOver the colorOver to set
     */
    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    /**
     * @return the colorClick
     */
    public Color getColorClick() {
        return colorClick;
    }

    /**
     * @param colorClick the colorClick to set
     */
    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }
    private int radius;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    
     public BtnnBorder() {
        // init color

        setColor(Color.WHITE);
        colorOver = new Color(179, 250, 160);
        colorClick = new Color(152, 184, 144);

        setContentAreaFilled(false);
        //add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setForeground(getColorOver());
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setForeground(Color.GRAY);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            /*public void mousePressed(MouseEvent e) {
                setBorderColor(colorOver);
                setForeground(colorOver);
                setBackground(colorClick);
            }
            public void mouseReleased(MouseEvent e) {
                setBorderColor(Color.WHITE);
                setForeground(Color.WHITE);
                setBackground(color);

            }*/
        });
    }
    @Override
    public void paintComponent(Graphics gr) {

        Graphics2D g2 = (Graphics2D) gr;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.setColor(getBackground());
        //Border set 2 pixels
        g2.fillRoundRect(0, 0, getWidth() -1, getHeight() -1, getRadius(), getRadius());
        super.paintComponent(gr); //build component

    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
