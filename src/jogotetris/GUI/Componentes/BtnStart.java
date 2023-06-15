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
public class BtnStart extends JButton {

    public BtnStart() {
        // init color

        setColor(new Color(228,229,214));
        colorOver = new Color(179, 250, 160);
        colorClick = new Color(152, 184, 144);

        setContentAreaFilled(false);
        //add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                setBorderColor(colorOver);
                setForeground(colorOver);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                setBorderColor(getFixColor());
                setForeground(getFixColor());
            }
            /*public void mousePressed(MouseEvent e) {
                setBorderColor(colorOver);
                setForeground(colorOver);
                setBackground(colorClick);
            }
            public void mouseReleased(MouseEvent e) {
                setBorderColor(new Color(228,229,214));
                setForeground(new Color(228,229,214));
                setBackground(color);

            }*/
        });
    }

    private boolean over;
    private int sizeBorder;
    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
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
    private Color borderColor =new Color(179, 250, 160);;
    private int radius = 0;
    private Color fixColor = new Color(228,229,214);

    @Override
    public void paintComponent(Graphics gr) {

        Graphics2D g2 = (Graphics2D) gr;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Paint Border
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);
        g2.setColor(getBackground());
        //Border set 2 pixels
        g2.fillRoundRect(getSizeBorder(), getSizeBorder(), getWidth() - 2*getSizeBorder()-1, getHeight() - 2*getSizeBorder()-1, radius, radius);
        super.paintComponent(gr); //build component

    }

    /**
     * @return the sizeBorder
     */
    public int getSizeBorder() {
        return sizeBorder;
    }

    /**
     * @param sizeBorder the sizeBorder to set
     */
    public void setSizeBorder(int sizeBorder) {
        this.sizeBorder = sizeBorder;
    }

    /**
     * @return the fixColor
     */
    public Color getFixColor() {
        return fixColor;
    }

    /**
     * @param fixColor the fixColor to set
     */
    public void setFixColor(Color fixColor) {
        this.fixColor = fixColor;
    }
    

}
