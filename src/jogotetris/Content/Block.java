/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.Content;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import jogotetris.GUI.Drawable;

/**
 *
 * @author senti
 */
public class Block extends JComponent implements Drawable{
    protected char txt;
    private Color mycolor;
    private Color backGroundColor = new Color(18,48,65);
    public ChooseColor c = new ChooseColor();
    private int round = 2;
    //construtor por defeito
    public Block(){
        mycolor = Color.BLUE;

    }
    //construtor com ch e cor como parametros
    public Block(char ch, Color color){
        txt = ch;
        mycolor = color;
    }
    //construtor com ch com o parametro
    public Block(char ch){
        txt = ch;
        mycolor = c.choose(ch);
    }
    //costrutor copia
    public Block(Block b){
        this(b.txt,b.mycolor);
    }
    //paint elemento
    @Override
    public void paintComponent(Graphics gr){
        super.paintComponent(gr); //build component
        draw(gr, 0, 0, getWidth()-1, getHeight()-1);
    }
     @Override
    public void draw(Graphics gr, int px, int py, int width, int height) {
    //color of fill
        //container "border" rgb(18,48,65)
        gr.setColor(getBackGroundColor());
        //fill container "border"
        gr.fillRect(px, py, width, height);
        //set Color --> cor do Block
        gr.setColor(c.choose(txt));
        //fill block
        gr.fillRoundRect(px, py, width, height,width/getRound(), height/getRound());
     
        //color of line "real border"
        gr.setColor(getBackGroundColor());
        //set stroke (tamanho)
        Graphics2D gr2 = (Graphics2D) gr;
        gr2.setStroke(new BasicStroke(2f));
        //draw line "desenha a border"
        gr2.drawRoundRect(px, py, width, height,width/getRound(), height/getRound());
    }
    //get txt for piece ("type piece")
    public char getTxt(){
        return txt;
    }
    //set txt for piece ("type piece")
    public void setTxt(char txt){
        this.txt = txt;
    }
    //retorna txt/type piece
    @Override
    public String toString(){
        return ""+txt;
    }
    //return clone from block
    public Block getClone(){
        return new Block(this);
    }
    //get color from block
    public Color getMycolor() {
        return mycolor;
    }
    //set block color
    public void setMycolor(Color mycolor) {
        this.mycolor = mycolor;
    }
    //teste
     public static void main(String[] args) {
        //construtor com parâmetros
        Block b1 = new Block('L');
        //construor cópia
        Block b2 = new Block(b1);
        //clonar um objeto
        Block b3 = b2.getClone();
        System.out.println("Construtores e clone");
        //tostring
        System.out.println("b1 = " + b1 + "\t b2 = " + b2 + "\t b3 = " + b3);
        //modificador
        b2.setTxt('X');
        System.out.println(" Modificador b2");
        System.out.println("b1 = " + b1 + "\t b2 = " + b2 + "\t b3 = " + b3);
    }

    /**
     * @return the round
     */
    public int getRound() {
        return round;
    }

    /**
     * @param round the round to set
     */
    public void setRound(int round) {
        this.round = round;
    }

    /**
     * @return the backGroundColor
     */
    public Color getBackGroundColor() {
        return backGroundColor;
    }

    /**
     * @param backGroundColor the backGroundColor to set
     */
    public void setBackGroundColor(Color backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

}
