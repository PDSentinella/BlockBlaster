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
public class BtnClose extends JButton {

    public BtnClose() {
        // init color

        setColor(Color.WHITE);
        colorOver = new Color(179, 250, 160);
        colorClick = new Color(152, 184, 144);
        borderColor = new Color(179, 250, 160);

        setContentAreaFilled(false);
        //add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                setBorderColor(colorOver);
                setForeground(colorOver);
                setColor(colorOver);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                setBorderColor(new Color(51,51,51));
                setColor(new Color(51,51,51));
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

    private boolean over;

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return new Color(color.getRGB());
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return new Color(colorOver.getRGB());
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return new Color(colorClick.getRGB());
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return new Color(borderColor.getRGB());
    }

    public void setBorderColor(Color boderColor) {
        this.borderColor = boderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;

    @Override
    public void paintComponent(Graphics gr) {

       Graphics2D g2 = (Graphics2D) gr;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Paint Border
        g2.setColor(borderColor);
        g2.fillArc(0, 0, getWidth() - 1, getHeight() - 1, 0, 360);
        
        
        g2.setColor(getBackground());
        //Border set 2 pixels
        g2.fillArc(2, 2, getWidth() - 5, getHeight() - 5, 0, 360);
        /*g2.setColor(borderColor);
        int x = (getWidth()-1) 0.701;
        int y = (getHeight()-1) 0.701;
        int x1 = (getWidth()-1)/2 - x;
        int x1 = (getWidth()-1)/2 - y;
        g2d.setStroke(new BasicStroke(4f));
        g2.drawLine( (int)getWidth()/3, (int)getHeight()/3, getWidth() -2*getWidth()/3, getHeight()-2*getHeight()/3);
        g2.drawLine(getWidth()/3,getHeight()-2*getWidth()/3,getWidth() -2*getHeight()/3,getHeight()/3);*/
        super.paintComponent(gr); //build component

    }

}
