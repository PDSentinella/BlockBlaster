/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.Content;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author senti
 */
public class Board extends BlockMatrix{
   public boolean stop = false;
   private int teme = 1;
   
   private Color backGroundColor = new Color(18,48,65);
    @Override
    public void paintComponent(Graphics g) {
        draw(g, 0, 0, getWidth(), getHeight());
    }

    @Override
    public void draw(Graphics gr, int px, int py, int width, int height) {
        colorTeme();
        this.chageBackGroundColor(getBackGroundColor());
        super.draw(gr, px, py, width, height);
        int sizeX = width / getColumns();
        int sizeY = height / getLines();
        //current.chageColor();
        getCurrent().chageBackGroundColor(getBackGroundColor());
        //faz fall down shadow 
        Board b2 = new Board( this.getCurrent().getClone(),this.matrix);
        b2.getCurrent().setX(getCurrent().getX());
        b2.getCurrent().setY(getCurrent().getY());
        b2.fallDown();
        b2.getCurrent().chageBackGroundColor(getBackGroundColor());
        b2.setTeme(this.getTeme());
        b2.colorTeme();
        b2.getCurrent().chageColorShadown();
        //mudar cor da swadow 
        b2.getCurrent().draw(gr, px+ b2.getCurrent().getX()* sizeX, py + b2.getCurrent().getY()* sizeY,sizeX * getCurrent().getColumns(),sizeY * getCurrent().getLines());
        getCurrent().draw(gr, px + getCurrent().getX() * sizeX,
                py + getCurrent().getY() * sizeY,
                sizeX * getCurrent().getColumns(),
                sizeY * getCurrent().getLines());
        
    }
    //muda o tema dos tabuleiro(cor das peças, tabuleiro border)
    public void colorTeme(){
        switch(getTeme()){
            case 0:
                this.chageColorTeme0();
                getCurrent().chageColorTeme0();
                break;
            case 1:
                this.chageColorTeme1();
                getCurrent().chageColorTeme1();
                break;
            case 2: 
                this.chageColorTeme2();
                getCurrent().chageColorTeme2();
                break;
            case 3: 
                this.chageColorTeme3();
                getCurrent().chageColorTeme3();
                break;
        }
    }
    private Piece current;
    public Board(){
        this(14,14);
    }
    public Board(Piece current, Block[][] mat) {
        super(mat);
        this.current = current;
    }
    public Board(Board board){
        this(board.current, board.getMatrix());
    }
    public Board(int lines, int cols){
         //criar a matriz
        this.matrix = new Block[lines][cols];
        //iterar os elementos da matriz
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                //criar piecas vazias para o elemento
                matrix[y][x] = new Empty();
            }

 

        }
        generateRandomPiece();
    }
    //rezise tamaho do tabuleiro(board)
    @Override
    public void resize(int lines, int columns) {
        this.matrix = new Block[lines][columns];
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {

                matrix[y][x] = new Empty();
            }
        }
        generateRandomPiece();
    }
    //coloca a peça currento no tabuleiro
     public void freezePiece() {
        //iterar os blocos da peca corrent
        for (int y = 0; y < getCurrent().getLines(); y++) {
            for (int x = 0; x < getCurrent().getColumns(); x++) {
                //verificar se e vazio
                if( getCurrent().getMatrix()[y][x] instanceof Empty)
                    continue;
                
                //colocar um clone da peca na matriz
                matrix[y + getCurrent().getY()][x + getCurrent().getX()]
                        = getCurrent().getMatrix()[y][x].getClone();

 

            }

 

        }
    }
   
     
    public String toString() {
        //clonar o tabuleiro
        Board b = new Board(this);
        //colocar a peca no tabuleiro
        b.freezePiece();
        //calcular o texto do tabuleiro
        String txt = ""; //devia ser ujma stringbuilder
        //iterar os elementos da matriz
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                //criar piecas vazias para o elemento
                txt += b.matrix[y][x].toString();
            }
            txt += "\n";

 

        }
        return txt;
    }
//gera pela random
public void generateRandomPiece() {
        Piece[] a = {new PieceI(), new PieceL(), new PieceS(), new PieceT(), new PieceZ(),new PieceJ(), new PieceO()};
        int b = (int)(a.length * Math.random());
        this.setCurrent(a[b]);
        int c = (int) (Math.random()*(this.getColumns()-this.getCurrent().getColumns()+1));
        this.getCurrent().setX(c);
        for (int y = 0; y < getCurrent().getLines(); y++) {
            for (int x = 0; x < getCurrent().getColumns(); x++) {
                //verificar se e vazio
                if( !(current.getMatrix()[y][x] instanceof Empty)&&!(matrix[y + current.getY()][x + current.getX()] instanceof Empty)){
                    stop = true;
                    System.out.println("Stop");
                }
            }
        }
}
    //veirfica se a peça pode mudar
  public boolean canMove(int dy, int dx) {
        //iterate current piece block matrix
        for (int y = 0; y < getCurrent().getLines(); y++) {
            for (int x = 0; x < getCurrent().getColumns(); x++) {
                //if block is empty - continue to next
                if (getCurrent().getMatrix()[y][x] instanceof Empty) {
                    continue;
                }
                //new position
                int px = getCurrent().getX() + x + dx;
                int py = getCurrent().getY() + y + dy;

                //is within limits
                if (px >= getColumns() || px < 0 || py >= getLines() || py < 0
                        //not Empty
                        || !(matrix[py][px] instanceof Empty)) {
                    return false; // NOT MOVE
                }
            }
        }
        return true; //CAN MOVE
    } 
  //verifica se pode rodar a peça
 public boolean canRotate() {
        //clone piece
        Piece clone = getCurrent().getClone();
        //rotate clone
        clone.rotate();
        //piece is outside board
        if (clone.getX() + clone.getColumns() > getColumns()) {
            return false;
        }
        //verify all the block of the clone
        for (int y = 0; y < clone.getLines(); y++) {
            for (int x = 0; x < clone.getColumns(); x++) {
                //block is empty - continue to next
                if (clone.getMatrix()[y][x] instanceof Empty) {
                    continue;
                }
                //is in the limits 
                if (x < getColumns() && x >= 0 && y < getLines() && y >= 0
                        //is not empty
                        && !(matrix[y][x] instanceof Empty)) {
                    return false; // NOT Ratation avaiable
                }
            }
        }
        return true; // Can Rotate
    }

 //move a peça para a direita se possivel
 public void moveLeft() {
        if (canMove(0, -1)) {
            getCurrent().moveLeft();
        }
    }

 
 //move a peça para a direita se possivel
    public void moveRight() {
        if (canMove(0, 1)) {
            getCurrent().moveRight();
        }
    }

 
 //move a peça para baixo se possivel
    public void moveDown() {
        if (canMove(1, 0)) {
            getCurrent().moveDown();
        }else{
            freezePiece();
            generateRandomPiece();

            
        }
    }
     //move a peça para baixo até onde for possivel
    public void fallDown() {
        while (canMove(1, 0)) {
            getCurrent().moveDown();
        }
    }
    //roda a peça se posivel
    @Override
    public void rotate() {
        if (canRotate()) {
            getCurrent().rotate();
            repaint();
        }
    }
    public Piece getCurrent() {
        return current;
    }

    public void setCurrent(Piece current) {
        this.current = current;
    }
  public static void main(String[] args) {
        Board b = new Board(10, 10);
        System.out.println("ORIGINAL \n" + b);
        for (int i = 0; i < 100; i++) {
        b.moveLeft();
        }
        b.moveLeft();
        
        System.out.println("Left \n" + b);
        for (int i = 0; i < 100; i++) {
        b.moveRight();
        }
        System.out.println("Right \n" + b);
        b.fallDown();
        System.out.println("FALL \n" + b);
        b.freezePiece();
        b.generateRandomPiece();
        for (int i = 0; i < 100; i++) {
        b.moveRight();
        }
        System.out.println("Right \n" + b);
        b.fallDown();
        System.out.println("FALL \n" + b);
        b.freezePiece();
        
        System.out.println("Random \n" + b);
        
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

    /**
     * @return the teme
     */
    public int getTeme() {
        return teme;
    }
    public Board getClone(){
        return new Board(this);
    }
    /**
     * @param teme the teme to set
     */
    public void setTeme(int teme) {
        this.teme = teme;
    }
    public void setPiece(Piece p){
        this.current = p;
    }
}
