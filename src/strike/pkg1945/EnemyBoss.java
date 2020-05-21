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
    protected int x,y,width,height,speed;
    protected int hp;
    protected int cooldown;
    protected int cd;
    protected int damage;
    protected int gold;
    protected int score;
    protected int animasi;
    protected int xk;
    protected int yk;
    protected int mati;
    protected int tabrak;
    
    public EnemyBoss(int hpPlayer, int x, int y){
        this.animasi = 0;
        this.hp = hpPlayer;
        this.x = x;
        this.y = y;
        this.mati = 0;
        this.width = 500;
        this.height = 500;
        this.cooldown = 300;
        this.cd = 300;
        this.mati = 0;
    }

    public int getAnimasi() {
        return animasi;
    }

    public int getMati() {
        return mati;
    }

    public void setMati(int mati) {
        this.mati = mati;
    }

    public void setHp(int hp) {
        this.hp = hp;
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
    
    public BufferedImage gantiAnimasi(BufferedImage gambar){
            if(this.animasi<3){
                this.animasi++;
            }else{
                this.animasi=0;
            }
            return gambar;
    }
    
    public BufferedImage ledak(BufferedImage gambarLedak){
            if (this.mati == 1) {
                this.animasi = 0;
            }
            if (this.animasi < 15) {
                this.animasi++;
                return gambarLedak;
            }else{
                return null;}
    }
}
