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
    private BufferedImage gambarLedak[];
    private BufferedImage gambarLedakMusuh[];
    private BufferedImage gambarLedakBoss[];
    private BufferedImage gambarKnalpot1[];
    private BufferedImage gambar1;
    private BufferedImage gambarKnalpot2[];
    private BufferedImage gambar2;
    private BufferedImage gambarKnalpot3[];
    private BufferedImage gambar3;
    private BufferedImage ashpest;
    private BufferedImage morph;
    private BufferedImage lich;
    private BufferedImage wing;
    private BufferedImage glow;
    private BufferedImage Knalpot1[];
    private BufferedImage Knalpot2[];
    private BufferedImage Knalpot3[];
    private BufferedImage Knalpot4[];
    private BufferedImage Knalpot5[];
    private BufferedImage boss[];
    
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
        Knalpot1 = new BufferedImage[4];
        try{
            this.ashpest= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyAshpest.png"));
            this.Knalpot1[0]=ImageIO.read(new File("./Enemy/Enemy4/Exhaust1/exhaust1.png"));
            this.Knalpot1[1]=ImageIO.read(new File("./Enemy/Enemy4/Exhaust1/exhaust2.png"));
            this.Knalpot1[2]=ImageIO.read(new File("./Enemy/Enemy4/Exhaust1/exhaust3.png"));
            this.Knalpot1[3]=ImageIO.read(new File("./Enemy/Enemy4/Exhaust1/exhaust4.png")); 
        }catch(IOException ex){
            ex.printStackTrace();
        }
        Knalpot2 = new BufferedImage[4];
        try{
            this.morph=ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBlademorph.png"));
            this.Knalpot2[0]=ImageIO.read(new File("./Enemy/Enemy3/Exhaust1/exhaust1.png"));
            this.Knalpot2[1]=ImageIO.read(new File("./Enemy/Enemy3/Exhaust1/exhaust2.png"));
            this.Knalpot2[2]=ImageIO.read(new File("./Enemy/Enemy3/Exhaust1/exhaust3.png"));
            this.Knalpot2[3]=ImageIO.read(new File("./Enemy/Enemy3/Exhaust1/exhaust4.png")); 
        }catch(IOException ex){
            ex.printStackTrace();
        }
        Knalpot3 = new BufferedImage[4];
        try{
            this.lich= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBlazelich.png"));
            this.Knalpot3[0]=ImageIO.read(new File("./Enemy/Enemy1/Exhaust1/exhaust1.png"));
            this.Knalpot3[1]=ImageIO.read(new File("./Enemy/Enemy1/Exhaust1/exhaust2.png"));
            this.Knalpot3[2]=ImageIO.read(new File("./Enemy/Enemy1/Exhaust1/exhaust3.png"));
            this.Knalpot3[3]=ImageIO.read(new File("./Enemy/Enemy1/Exhaust1/exhaust4.png")); 
        }catch(IOException ex){
            ex.printStackTrace();
        }
        Knalpot4 = new BufferedImage[4];
        try{
            this.wing= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBlazewing.png"));
            this.Knalpot4[0]=ImageIO.read(new File("./Enemy/Enemy5/Exhaust1/exhaust1.png"));
            this.Knalpot4[1]=ImageIO.read(new File("./Enemy/Enemy5/Exhaust1/exhaust2.png"));
            this.Knalpot4[2]=ImageIO.read(new File("./Enemy/Enemy5/Exhaust1/exhaust3.png"));
            this.Knalpot4[3]=ImageIO.read(new File("./Enemy/Enemy5/Exhaust1/exhaust4.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        Knalpot5 = new BufferedImage[4];
        try{
            this.glow= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyGlowstarKing.png"));
            this.Knalpot5[0]=ImageIO.read(new File("./Enemy/Enemy2/Exhaust1/exhaust1.png"));
            this.Knalpot5[1]=ImageIO.read(new File("./Enemy/Enemy2/Exhaust1/exhaust2.png"));
            this.Knalpot5[2]=ImageIO.read(new File("./Enemy/Enemy2/Exhaust1/exhaust3.png"));
            this.Knalpot5[3]=ImageIO.read(new File("./Enemy/Enemy2/Exhaust1/exhaust4.png")); 
        }catch(IOException ex){
            ex.printStackTrace();
        }
        gambarLedakMusuh = new BufferedImage[11];
        try{
            this.gambarLedakMusuh[0]=ImageIO.read(new File("./Explosion/Explosion1_1.png"));
            this.gambarLedakMusuh[1]=ImageIO.read(new File("./Explosion/Explosion1_2.png"));
            this.gambarLedakMusuh[2]=ImageIO.read(new File("./Explosion/Explosion1_3.png"));
            this.gambarLedakMusuh[3]=ImageIO.read(new File("./Explosion/Explosion1_4.png"));
            this.gambarLedakMusuh[4]=ImageIO.read(new File("./Explosion/Explosion1_5.png"));
            this.gambarLedakMusuh[5]=ImageIO.read(new File("./Explosion/Explosion1_6.png"));
            this.gambarLedakMusuh[6]=ImageIO.read(new File("./Explosion/Explosion1_7.png"));
            this.gambarLedakMusuh[7]=ImageIO.read(new File("./Explosion/Explosion1_8.png"));
            this.gambarLedakMusuh[8]=ImageIO.read(new File("./Explosion/Explosion1_9.png"));
            this.gambarLedakMusuh[9]=ImageIO.read(new File("./Explosion/Explosion1_10.png"));
            this.gambarLedakMusuh[10]=ImageIO.read(new File("./Explosion/Explosion1_11.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        boss = new BufferedImage[4];
        try{
            this.boss[0]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss1.png"));
            this.boss[1]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss2.png"));
            this.boss[2]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss3.png"));
            this.boss[3]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss4.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        gambarLedakBoss = new BufferedImage[15];
        try{
            this.gambarLedakBoss[0]=ImageIO.read(new File("./Explosion/boss/1.png"));
            this.gambarLedakBoss[1]=ImageIO.read(new File("./Explosion/boss/2.png"));
            this.gambarLedakBoss[2]=ImageIO.read(new File("./Explosion/boss/3.png"));
            this.gambarLedakBoss[3]=ImageIO.read(new File("./Explosion/boss/4.png"));
            this.gambarLedakBoss[4]=ImageIO.read(new File("./Explosion/boss/5.png"));
            this.gambarLedakBoss[5]=ImageIO.read(new File("./Explosion/boss/6.png"));
            this.gambarLedakBoss[6]=ImageIO.read(new File("./Explosion/boss/7.png"));
            this.gambarLedakBoss[7]=ImageIO.read(new File("./Explosion/boss/8.png"));
            this.gambarLedakBoss[8]=ImageIO.read(new File("./Explosion/boss/9.png"));
            this.gambarLedakBoss[9]=ImageIO.read(new File("./Explosion/boss/10.png"));
            this.gambarLedakBoss[10]=ImageIO.read(new File("./Explosion/boss/11.png"));
            this.gambarLedakBoss[11]=ImageIO.read(new File("./Explosion/boss/12.png"));
            this.gambarLedakBoss[12]=ImageIO.read(new File("./Explosion/boss/13.png"));
            this.gambarLedakBoss[13]=ImageIO.read(new File("./Explosion/boss/14.png"));
            this.gambarLedakBoss[14]=ImageIO.read(new File("./Explosion/boss/15.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public BufferedImage getAshpest() {
        return ashpest;
    }

    public BufferedImage getMorph() {
        return morph;
    }

    public BufferedImage getLich() {
        return lich;
    }

    public BufferedImage getWing() {
        return wing;
    }

    public BufferedImage getGlow() {
        return glow;
    }

    public BufferedImage getBoss(int i) {
        return boss[i];
    }

    public BufferedImage getKnalpot1(int i) {
        return Knalpot1[i];
    }

    public BufferedImage getKnalpot2(int i) {
        return Knalpot2[i];
    }

    public BufferedImage getKnalpot3(int i) {
        return Knalpot3[i];
    }

    public BufferedImage getKnalpot4(int i) {
        return Knalpot4[i];
    }

    public BufferedImage getKnalpot5(int i) {
        return Knalpot5[i];
    }
    

    public BufferedImage getGambarLedak(int i) {
        return gambarLedak[i];
    }

    public BufferedImage getGambarLedakMusuh(int i) {
        return gambarLedakMusuh[i];
    }

    public BufferedImage getGambarLedakBoss(int i) {
        return gambarLedakBoss[i];
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
