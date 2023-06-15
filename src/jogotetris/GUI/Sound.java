/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogotetris.GUI;

import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


/**
 *
 * @author senti
 */
public class Sound {
    Clip clip;
    InputStream soundInputStream[] = new InputStream[3];
    
    public Sound(){
        soundInputStream[0] = ClassLoader.getSystemClassLoader().getResourceAsStream("jogotetris\\Sound\\gameClassicMusic.wav");
        soundInputStream[1] = ClassLoader.getSystemClassLoader().getResourceAsStream("jogotetris\\Sound\\gameChallengeMusic.wav");
        soundInputStream[2] = ClassLoader.getSystemClassLoader().getResourceAsStream("jogotetris\\Sound\\gamePiecesFalling.wav");
        
    }
    public void setFile(int i){
        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundInputStream[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        }
        catch(IOException | LineUnavailableException | UnsupportedAudioFileException e){
            
        }
    }
    public void play(){
        clip.start();
    }
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stop(){
        clip.stop();
    }
}
