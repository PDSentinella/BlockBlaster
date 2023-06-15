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
public class ChooseColor {
    //tema 1 (main theme) da cor das peças
    final Color[] teme1 = {Color.RED, Color.BLUE,Color.GREEN,Color.YELLOW,Color.PINK,Color.MAGENTA,Color.ORANGE};
    //tema 2 (peças brancas) da cor das peças
    final Color[] teme2 = {Color.WHITE,Color.WHITE,Color.WHITE,Color.WHITE,Color.WHITE,Color.WHITE,Color.WHITE};
    //tema shadown da cor das peças 
    public Color[] temeShadown = {getShadownColor(Color.RED),getShadownColor(Color.BLUE),getShadownColor(Color.GREEN),getShadownColor(Color.YELLOW),getShadownColor(Color.PINK),getShadownColor(Color.MAGENTA),getShadownColor(Color.ORANGE)};
    public ChooseColor(){
        
    }
    /**
     * 
     * @return the lColor
     */
    public Color getlColor() {
        return new Color(lColor.getRGB());
    }

    /**
     * @param lColor the lColor to set
     */
    public void setlColor(Color lColor) {
        this.lColor = lColor;
    }

    /**
     * @return the iColor
     */
    public Color getiColor() {
        return new Color(iColor.getRGB());
    }

    /**
     * @param iColor the iColor to set
     */
    public void setiColor(Color iColor) {
        this.iColor = iColor;
    }

    /**
     * @return the jColor
     */
    public Color getjColor() {
        return new Color(jColor.getRGB());
    }

    /**
     * @param jColor the jColor to set
     */
    public void setjColor(Color jColor) {
        this.jColor = jColor;
    }

    /**
     * @return the tColor
     */
    public Color gettColor() {
        return new Color(tColor.getRGB());
    }

    /**
     * @param tColor the tColor to set
     */
    public void settColor(Color tColor) {
        this.tColor = tColor;
    }

    /**
     * @return the oColor
     */
    public Color getoColor() {
        return new Color(oColor.getRGB());
    }

    /**
     * @param oColor the oColor to set
     */
    public void setoColor(Color oColor) {
        this.oColor = oColor;
    }

    /**
     * @return the sColor
     */
    public Color getsColor() {
        return new Color(sColor.getRGB());
    }

    /**
     * @param sColor the sColor to set
     */
    public void setsColor(Color sColor) {
        this.sColor = new Color(sColor.getRGB());
    }

    /**
     * @return the zColor
     */
    public Color getzColor() {
        return new Color(zColor.getRGB());
    }

    /**
     * @param zColor the zColor to set
     */
    public void setzColor(Color zColor) {
        this.zColor = zColor;
    }
    public Color getShadownColor(Color c){
        return new Color(   c.getRed(),c.getGreen(),c.getBlue(),100);
    }
    //cor das peças(enclusive o Empty) já pre setadas
    private Color lColor = Color.RED;
    private Color iColor= Color.BLUE;
    private Color jColor= Color.GREEN;
    private Color tColor= Color.YELLOW;
    private Color oColor= Color.PINK;
    private Color sColor= Color.MAGENTA;
    private Color zColor= Color.ORANGE;
    private Color eColor = new Color(125,125,125);
    private Color emptyColor = new Color(44,69,84);
    //retorna a cor setada  consoante aos caracteres
    public Color choose(char t){
        switch(t){
            case'L':
                return lColor;
            case'I':
                return iColor;
            case'J':
                return jColor;
            case'T':
                return tColor;
            case'O':
                return oColor;
            case'S':
                return sColor;
            case'Z':
                return zColor;
            case'.':
                return emptyColor; 
            case 'E':
                return eColor;
            default:
                return new Color(44,69,84);
        }
    }
    //seta a cor das atribuidas aos caracteres 
    public void setColor(char t,Color color){
        switch(t){
            case'L':
                this.setlColor(color);
                break;
            case'I':
                this.setlColor(color);
                break;
            case'J':
                this.setlColor(color);
                break;
            case'T':
                this.setlColor(color);
                break;
            case'O':
                this.setlColor(color);
                break;
            case'S':
                this.setlColor(color);
                break;
            case'Z':
                this.setlColor(color);
                break;       
            case'.':
                this.setEmptyColor(emptyColor);
        }
    }
    //seta o tema das peças do ChooseColor
    public void setColorTeme(Color[] c){
        this.setlColor(c[0]);
        this.setiColor(c[1]);
        this.setjColor(c[2]);
        this.settColor(c[3]);
        this.setoColor(c[4]);
        this.setsColor(c[5]);
        this.setzColor(c[6]);
    }
    //seta tema 0 (peças brancas)
    public void setTeme0(){
        setColorTeme(teme2);
    }
    //seta tema 1 (main), com Empyt main
    public void setTeme1(){
        setColorTeme(teme1);
        this.setEmptyColor(new Color(44,69,84));
    }
    //seta tema 2 (peças brancas), com Empyt green
    public void setTeme2(){
        setColorTeme(teme2);
        this.setEmptyColor(new Color(0,185,88));
    }
    //seta tema 2 (peças brancas), com Empyt cor (negativo main)
    public void setTeme3(){
        setColorTeme(teme2);
        this.setEmptyColor(new Color(200,204,193));
    }
    public void setShadownTeme(){
        setColorTeme(temeShadown);
    }
    /**
     * @return the emptyColor
     */
    public Color getEmptyColor() {
        return emptyColor;
    }

    /**
     * @param emptyColor the emptyColor to set
     */
    public void setEmptyColor(Color emptyColor) {
        this.emptyColor = emptyColor;
    }
    
    
}
