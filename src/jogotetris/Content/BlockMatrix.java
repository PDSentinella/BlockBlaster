/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.Content;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import jogotetris.GUI.Drawable;

/**
 *
 * @author senti
 */
public class BlockMatrix extends JPanel implements Drawable{
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g, 0, 0, getWidth()-1, getHeight()-1);
    }

    
    @Override
    public void draw(Graphics gr, int px, int py, int width, int height) {
        int sizeX = width/ getColumns();
        int sizeY = height/ getLines();
        for (int y = 0; y < getLines(); y++) {
            for (int x = 0; x < getColumns(); x++) {
                matrix[y][x].draw(gr, px + x * sizeX , py + y * sizeY, sizeX, sizeY);
            }
        }
    }
    protected Block[][] matrix;

    public BlockMatrix(Block[][] mat) {
        //new matrix
        this.matrix = new Block[mat.length][mat[0].length];
        //for each block in matrix
        for (int y = 0; y < mat.length; y++) {
            for (int x = 0; x < mat[y].length; x++) {
                //clone block
                this.matrix[y][x] = mat[y][x].getClone();
            }
        }
    }

    /**
     * one empty block
     */
    public BlockMatrix() {
        this(new Block[][]{{new Empty()}});
    }

    /**
     * copy constructor
     *
     * @param blockMat mat
     */
    public BlockMatrix(BlockMatrix blockMat) {
        this(blockMat.matrix);
    }
   
    public Block[][] getMatrix(){
        return matrix;
    }
    //muda a cor de fundo (border, quando executa o paint Block
    public void chageBackGroundColor(Color c){
        for(int i = 0;i<this.getColumns();i++){
            for(int j = 0;j<this.getLines();j++){
                matrix[j][i].setBackGroundColor(c);
            }
        }
    }
    //muda o tema do choserColor da peça(muda as possivis cores da peça de acordo com o tema) não muda o empty
    public void chageColorTeme0(){
        for(int i = 0;i<this.getColumns();i++){
            for(int j = 0;j<getLines();j++){
                matrix[j][i].c.setTeme0();
                
            }
        }
    }
    //muda o tema do choserColor da peça(muda as possivis cores da peça de acordo com o tema)muda o empty (main theme)
    public void chageColorTeme1(){
        for(int i = 0;i<this.getColumns();i++){
            for(int j = 0;j<getLines();j++){
                matrix[j][i].c.setTeme1();
                
            }
        }
    }
    //muda o tema do choserColor da peça(muda as possivis cores da peça de acordo com o tema) muda o empty (green theme)
    public void chageColorTeme2(){
        for(int i = 0;i<this.getColumns();i++){
            for(int j = 0;j<getLines();j++){
                matrix[j][i].c.setTeme2();
                
            }
        }
    }
    //muda o tema do choserColor da peça(muda as possivis cores da peça de acordo com o tema) muda o empty (menus theme)
    public void chageColorTeme3(){
        Block[][] m = new Block[getLines()][getColumns()];
        for(int i = 0;i<this.getColumns();i++){
            for(int j = 0;j<getLines();j++){
                matrix[j][i].c.setTeme3();
                
            }
        }
    }
    public void chageColorShadown(){
        for(int i = 0;i<this.getColumns();i++){
            for(int j = 0;j<getLines();j++){
                matrix[j][i].c.setShadownTeme();
                
            }
        }
    }
    
    public int getLines(){
        return matrix.length;
    }
    
    public int getColumns(){
        return matrix[0].length;
    }
    public int getXSize() {
        return this.matrix.length;
    }
    
    public int getYSize() {
        return this.matrix[0].length;
    }
    //roda a matriz
    public void rotate(){
        Block[][] m = new Block[this.getColumns()][this.getLines()];
        for(int i = 0;i<this.getColumns();i++){
            int k = 0;
            for(int j = getLines()-1;j>=0;j--){
                m[i][k] = matrix[j][i];
                k++;
            }
        }
        matrix  = m;
    }
    //retorna a matrix em forma de string
    @Override
    public String toString(){
        String s = "";
        for(int i = 0;i<this.getLines();i++){
            for(int j = 0;j<this.getColumns();j++){
                s += matrix[i][j];
            }
            s += "\n";
        }
        return s;
    }
    public void setMatrix(Block[][] m){
        this.matrix = m;
    }
    public BlockMatrix getClone(){
        return new BlockMatrix(this);
    }
    public static void main(String[] args) {
        Block bl[][] = {
 {new Block('L'), new Empty()},
 {new Block('L'), new Empty()},
 {new Block('L'), new Block('L')},};
 BlockMatrix b1 = new BlockMatrix(bl);
 BlockMatrix b2 = b1.getClone();

 System.out.println("b1\n" + b1);
 System.out.println("b2\n" + b2);

 System.out.println("N. Linhas " + b1.getLines());
 System.out.println("N. colunas " + b1.getColumns());

 b2.rotate();
 System.out.println("Original b1\n" + b1);
 System.out.println("Rotate b2\n" + b2);

}

    /**
     * @return the inicY
     */
   

}
