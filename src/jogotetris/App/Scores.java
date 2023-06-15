/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.App;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author senti
 */
public class Scores {
    public static String[] readFile(String Caminho){
        String[] conteudo = {"","","","",""};
        try{
            FileReader arq = new FileReader(Caminho);
            
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "" ;
                try{
                    linha = lerArq.readLine();
                    for(int i = 0;i<5;i++){
                        conteudo[i] = linha;
                        linha = lerArq.readLine();
                    }
                }
                catch(IOException ex){
                    return null;
                }
        }
        catch(FileNotFoundException ex){
            return null;
        }
        return conteudo;
    }
    
    public static boolean Write(String caminho, String texto){
        File file = new File(caminho);
        
        try{
            FileWriter arq = new FileWriter(caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(texto);
            gravarArq.close();
            return true;
        }catch(IOException e){
            return false;
        }
       
    } 
    public static void AtualizaScores(String caminho,String name,String p){
        //String[] lines = readFile(caminho);
        String[] pontos = getScores();
        String[] nomes = getNames();
        String[][] text = new String[6][2];
        text[0][0] = name;
        text[0][1] = p;
        for(int i = 0;i<5;i++){
            text[i+1][0] = nomes[i];
            text[i+1][1] = pontos[i];
        }
        //ActualizaLista(text);
        String scores = "";
        String names = "";
        for(int i = 0;i<5;i++){
            scores += text[i][1]+"\n";
            names += text[i][0]+"\n";
        }
        setScores(scores);
        setNames(names);
        
    }
    
    public static void ActualizaLista(String[][] listaPontos){
        for(int i = listaPontos.length-2;i>=0;i--){
            if(Integer.parseInt(listaPontos[i][1])>Integer.parseInt(listaPontos[i+1][1])){
                String[] temp = listaPontos[i];
                listaPontos[i] = listaPontos[i+1];listaPontos[i+1] = temp;
            }
        }
        
    }
    public static String[] getNames(){
        return readFile("src\\jogotetris\\App\\Nomesfile.txt");
    }
    public static void setNames(String text){
        Write("src\\jogotetris\\App\\Nomesfile.txt",text);
    }
    public static String[] getScores(){
        return readFile("src\\jogotetris\\App\\Pontosfile.txt");
    }
    public static void setScores(String text){
        Write("src\\jogotetris\\App\\Pontosfile.txt",text);
    }
    public static void main(String[] args) {
        AtualizaScores( "caminho", "Paulo","3840");
    }

    
    
}
