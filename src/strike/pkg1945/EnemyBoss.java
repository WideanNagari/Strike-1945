/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author Asus
 */
public class EnemyBoss{
    BufferedImage[] gambarAnimasi;
    Random r= new Random();
    BufferedImage[] gambarLedak;
    BufferedImage gambar;
    protected int x,y,width,height,speed;
    protected int hp;
    protected int cooldown;
    protected int cd;
    protected int damage;
    protected int gold;
    protected int score;
    protected int animasi;
    protected int animasike;
    protected int xk;
    protected int yk;
    protected int mati;
    protected int tabrak;
    
    public EnemyBoss(int hpPlayer, int x, int y){
        gambarAnimasi = new BufferedImage[4];
        try{
            this.gambarAnimasi[0]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss1.png"));
            this.gambarAnimasi[1]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss2.png"));
            this.gambarAnimasi[2]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss3.png"));
            this.gambarAnimasi[3]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss4.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        gambarLedak = new BufferedImage[11];
        try{
            this.gambarLedak[0]=ImageIO.read(new File("./Explosion/Explosion1_1.png"));
            this.gambarLedak[1]=ImageIO.read(new File("./Explosion/Explosion1_2.png"));
            this.gambarLedak[2]=ImageIO.read(new File("./Explosion/Explosion1_3.png"));
            this.gambarLedak[3]=ImageIO.read(new File("./Explosion/Explosion1_4.png"));
            this.gambarLedak[4]=ImageIO.read(new File("./Explosion/Explosion1_5.png"));
            this.gambarLedak[5]=ImageIO.read(new File("./Explosion/Explosion1_6.png"));
            this.gambarLedak[6]=ImageIO.read(new File("./Explosion/Explosion1_7.png"));
            this.gambarLedak[7]=ImageIO.read(new File("./Explosion/Explosion1_8.png"));
            this.gambarLedak[8]=ImageIO.read(new File("./Explosion/Explosion1_9.png"));
            this.gambarLedak[9]=ImageIO.read(new File("./Explosion/Explosion1_10.png"));
            this.gambarLedak[10]=ImageIO.read(new File("./Explosion/Explosion1_11.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        this.animasi = 0;
        this.gambar=gambarAnimasi[animasi];
        this.hp = hpPlayer*3;
        this.x = x;
        this.y = y;
        this.mati = 0;
        this.width = 500;
        this.height = 500;
        this.cooldown = 300;
        this.cd = 300;
        this.animasike = 0;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAnimasike() {
        return animasike;
    }

    public int getCd() {
        return cd;
    }

    public int getHp() {
        return hp;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public BufferedImage getGambar() {
        return gambar;
    }
    
    public void gantiAnimasi(){
        if (this.hp > 0) {
            if(this.animasi<3){
                this.animasi++;
            }else{
                this.animasi=0;
            }
            this.gambar=this.gambarAnimasi[this.animasi];
        }else{
            if (this.mati == 1) {
                this.animasi = 0;
            }
            if (this.animasike == 0 ) {
                if (this.animasi < 3) {
                    this.animasi++;
                    if (this.animasi<=2) {
                        this.gambar = this.gambarLedak[this.animasi];
                    }else{
                        this.animasi = 0;
                        this.animasike++;
                    }
                }
            }else if (this.animasike == 1) {
                if (this.animasi < 6) {
                    this.animasi++;
                    if (this.animasi<=5) {
                        this.gambar = this.gambarLedak[this.animasi];
                    }else{
                        this.animasi = 0;
                        this.animasike++;
                    }
                }
            }else{
                if (this.animasi < 11) {
                    this.animasi++;
                    if (this.animasi<=10) {
                        this.gambar = this.gambarLedak[this.animasi];
                    }else{
                        this.animasike++;
                    }
                }
            }
        }
    }
}
