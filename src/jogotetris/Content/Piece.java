/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.Content;

import java.awt.Graphics;

/**
 *
 * @author senti
 */
public class Piece extends BlockMatrix{
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g, 0, 0, getWidth()-1, getHeight()-1);
    }

    //@Override
    public void draw(Graphics gr, int px, int py, int width, int height) {
        int sizeX = width / getColumns();
        int sizeY = height / getLines();
        for (int y = 0; y < getLines(); y++) {
            for (int x = 0; x < getColumns(); x++) {
                if(!(matrix[y][x] instanceof Empty)){
                matrix[y][x].draw(gr, px + x * sizeX, py + y * sizeY, sizeX, sizeY);
                }
            }
        }
    }
    protected int x;
    protected int y;
    public Piece(Block[][] mat,int y,int x){
        super(mat);
        this.x = x;
        this.y = y;
    }
    public Piece(Piece p){
        this(p.matrix,p.x,p.y);
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    @Override
    public void setMatrix(Block[][] mat){
        matrix = mat ;
    }
    @Override
    public Piece getClone(){
        return new Piece(this);
    }
    public void moveLeft(){
        x-=1;
    }
    public void moveRight(){
        x += 1;
    }
    public void moveDown(){
        y+=1;
    }
    
    @Override
   public String toString(){
       String s = "("+y+","+x+")\n";
        for(int i = 0;i<this.getLines();i++){
            for(int j = 0;j<this.getColumns();j++){
                s += matrix[i][j];
            }
            s += "\n";
        }
        return s;
   }
  public static void main(String[] args) {
        Block[][] B = {
        {new Block('T'), new Block('T'), new Block('T')},
        {new Empty(), new Block('T'), new Empty()}
        };
        Piece p = new Piece(B, 1, 4);
        System.out.println("piece = " + p);
        p.moveRight();
        p.rotate();
        System.out.println("Right and rotate " + p);
}
   
}
