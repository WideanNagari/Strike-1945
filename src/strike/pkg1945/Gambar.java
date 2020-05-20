/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Widean Nagari
 */
public class Gambar {
    BufferedImage gambarLedak[];
    BufferedImage gambarLedakMusuh[];
    BufferedImage gambarLedakBoss[];
    BufferedImage gambarKnalpot1[];
    BufferedImage gambar1;
    BufferedImage gambarKnalpot2[];
    BufferedImage gambar2;
    BufferedImage gambarKnalpot3[];
    BufferedImage gambar3;
    
    public Gambar(){
        gambarLedak = new BufferedImage[13];
        try{
            this.gambarLedak[0]=ImageIO.read(new File("./Explosion/player/1.png"));
            this.gambarLedak[1]=ImageIO.read(new File("./Explosion/player/2.png"));
            this.gambarLedak[2]=ImageIO.read(new File("./Explosion/player/3.png"));
            this.gambarLedak[3]=ImageIO.read(new File("./Explosion/player/4.png"));
            this.gambarLedak[4]=ImageIO.read(new File("./Explosion/player/5.png"));
            this.gambarLedak[5]=ImageIO.read(new File("./Explosion/player/6.png"));
            this.gambarLedak[6]=ImageIO.read(new File("./Explosion/player/7.png"));
            this.gambarLedak[7]=ImageIO.read(new File("./Explosion/player/8.png"));
            this.gambarLedak[8]=ImageIO.read(new File("./Explosion/player/9.png"));
            this.gambarLedak[9]=ImageIO.read(new File("./Explosion/player/10.png"));
            this.gambarLedak[10]=ImageIO.read(new File("./Explosion/player/11.png"));
            this.gambarLedak[11]=ImageIO.read(new File("./Explosion/player/12.png"));
            this.gambarLedak[12]=ImageIO.read(new File("./Explosion/player/13.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        gambarKnalpot1 = new BufferedImage[4];
        try{
            this.gambar1 = ImageIO.read(new File("./Player/Pesawat 2.png"));
            this.gambarKnalpot1[0] = ImageIO.read(new File("./Player/lockheed/lhapi1.png"));
            this.gambarKnalpot1[1] = ImageIO.read(new File("./Player/lockheed/lhapi2.png"));
            this.gambarKnalpot1[2] = ImageIO.read(new File("./Player/lockheed/lhapi3.png"));
            this.gambarKnalpot1[3] = ImageIO.read(new File("./Player/lockheed/lhapi4.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        gambarKnalpot2 = new BufferedImage[4];
        try{
            this.gambar2 = ImageIO.read(new File("./Player/Pesawat 1.png"));
            this.gambarKnalpot2[0] = ImageIO.read(new File("./Player/northtrop/ntapi1.png"));
            this.gambarKnalpot2[1] = ImageIO.read(new File("./Player/northtrop/ntapi2.png"));
            this.gambarKnalpot2[2] = ImageIO.read(new File("./Player/northtrop/ntapi3.png"));
            this.gambarKnalpot2[3] = ImageIO.read(new File("./Player/northtrop/ntapi4.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        gambarKnalpot3 = new BufferedImage[4];
        try{
            this.gambar3 = ImageIO.read(new File("./Player/Pesawat 3.png"));
            this.gambarKnalpot3[0] = ImageIO.read(new File("./Player/thunderbold/tbapi1.png"));
            this.gambarKnalpot3[1] = ImageIO.read(new File("./Player/thunderbold/tbapi2.png"));
            this.gambarKnalpot3[2] = ImageIO.read(new File("./Player/thunderbold/tbapi3.png"));
            this.gambarKnalpot3[3] = ImageIO.read(new File("./Player/thunderbold/tbapi4.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public BufferedImage getGambarLedak(int i) {
        return gambarLedak[i];
    }

    public BufferedImage[] getGambarLedakMusuh() {
        return gambarLedakMusuh;
    }

    public BufferedImage[] getGambarLedakBoss() {
        return gambarLedakBoss;
    }

    public BufferedImage getGambarKnalpot1(int i) {
        return gambarKnalpot1[i];
    }

    public BufferedImage getGambar1() {
        return gambar1;
    }

    public BufferedImage getGambarKnalpot2(int i) {
        return gambarKnalpot2[i];
    }

    public BufferedImage getGambar2() {
        return gambar2;
    }

    public BufferedImage getGambarKnalpot3(int i) {
        return gambarKnalpot3[i];
    }

    public BufferedImage getGambar3() {
        return gambar3;
    }
    
    
}
