/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.GUI.Componentes;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author senti
 */
public class BtnSwitch  extends Component {
    
    private Timer timer;
    private int border = 4;
    private float location = getBorder();
    private boolean selected;
    private boolean mouseOver;
    private float speed = 2f;
    private Color colorOf = Color.GRAY;
    private Color colorOn = new Color(0,174,255);
    private int radius = 25;
    
    public BtnSwitch(){
        
        this.setBackground(colorOn);
        this.setPreferredSize(new Dimension(70,30));
        this.setForeground(Color.WHITE);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        timer = new Timer(1, (ActionEvent e) -> {
            if(isSelected()){
                int endLocation = getWidth() - getHeight();
                if(location<endLocation){
                    location += speed;
                    repaint();
                }else{
                    timer.stop();
                    location = endLocation;
                    repaint();
                }
            } else{
                int endLocation = border;
                if(location>endLocation){
                    location -= speed;
                    repaint();
                }else{
                    timer.stop();
                    location = endLocation;
                    repaint();
                }
                
            }
        });
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent me){
                mouseOver = true;
            }
            @Override
             public void mouseExited(MouseEvent me){
                mouseOver = false;
            }
            @Override
            public void mouseReleased(MouseEvent me){
                if(SwingUtilities.isLeftMouseButton(me)){
                    if(mouseOver){
                        setSelected(!isSelected());
                        timer.start();
                    }
                }
            }
        });
    }
    @Override
    public void paint(Graphics gr){
         Graphics2D g2 = (Graphics2D) gr;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
        int width = getWidth();
        int height = getHeight();
        float alpha = getAlpha();
        if (alpha <1){
            g2.setColor(getColorof());
            g2.fillRoundRect(0, 0, width, height, radius, radius);
        }
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, width, height,radius, radius);
        g2.setColor(getForeground());
        g2.setComposite(AlphaComposite.SrcOver);
        g2.fillOval((int)location,(int)(border/2),height-border,height-border);
        super.paint(gr);
    }
    
    private float getAlpha(){
        float width = getWidth()-getHeight();
        float alpha = (location -2)/width;
        if(alpha<0){
            alpha = 0;
        }
        if (alpha >1){
            alpha = 1;
        }
        return alpha;
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

    /**
     * @return the colorof
     */
    public Color getColorof() {
        return colorOf;
    }

    /**
     * @param colorof the colorof to set
     */
    public void setColorof(Color colorof) {
        this.colorOf = colorof;
    }

    /**
     * @return the border
     */
    public int getBorder() {
        return border;
    }

    /**
     * @param border the border to set
     */
    public void setBorder(int border) {
        this.border = border;
    }

    /**
     * @return the selected
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
