/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.Content;

/**
 *
 * @author senti
 */
public class PieceX {
    
    public static Block[][] pieceL(){
        Block[][] b =   {
        {new Block('L'), new Block('L'), new Block('L')},
        {new Block('L'), new Empty(), new Empty()},};
       return b;
    }
   
    public static Block[][] pieceI(){
        Block[][] b =   {
        {new Block('I'), new Block('I'),new Block('I'),new Block('I'),},
        };
       return b;
    }
    
    public static Block[][] pieceS(){
        Block[][] b =    {
        {new Empty(), new Block('S'), new Block('S')},
        {new Block('S'), new Block('S'), new Empty()}
        };
       return b;
    }
    
    public static Block[][] pieceZ(){
        Block[][] b =    {
        {new Block('Z'), new Block('Z'), new Empty()},
        {new Empty(), new Block('Z'), new Block('Z')}
        };
       return b;
    }
    public static Block[][] pieceE(){
           Block[][] b = {{new Block('E')}} ;
            return b ;
    }
     public static Block[][] pieceM(){
           Block[][] b = {{new Block('E'),new Block('E'),new Block('E'),new Block('E'),new Block('E')},
           {new Block('.'),new Block('E'),new Block('.'),new Block('E'),new Block('.')},
           {new Block('E'),new Block('.'),new Block('E'),new Block('.'),new Block('E')}} ;
            return b ;
    }
    public static Block[][] pieceT(){
        Block[][] b =    {
        {new Block('T'), new Block('T'), new Block('T')},
        {new Empty(), new Block('T'), new Empty()}
        };
       return b;
    }
        public static Block[][] pieceJ(){
        Block[][] b =    {
        {new Block('J'), new Block('J'), new Block('J')},
        {new Empty(), new Empty(), new Block('J')}
        };
       return b;
    }
    
    public static Block[][] pieceO(){
        Block[][] b =    {
        {new Block('O'), new Block('O')},
        {new Block('O'), new Block('O')}
        };
       return b;
    }
    
   
}
