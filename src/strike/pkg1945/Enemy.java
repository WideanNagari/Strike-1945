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
 * @author Asus
 */
public abstract class Enemy {   
    BufferedImage gambar;
    BufferedImage gambar2;
    BufferedImage[] gambarKnalpot;
    BufferedImage[] gambarLedak;
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
    public Enemy(){
        
    }
    public Enemy(int x, int y) {
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
        
        this.x = x;
        this.y = y;
        this.speed = 1;   
        this.cooldown = 200;
        this.cd = 500;
        this.mati = 0;
        this.tabrak = 0;
    }    

    public int getTabrak() {
        return tabrak;
    }

    public void setTabrak(int tabrak) {
        this.tabrak = tabrak;
    }

    public void setMati(int mati) {
        this.mati = mati;
    }

    public int getMati() {
        return mati;
    }

    public int getAnimasi() {
        return animasi;
    }

    public int getXk() {
        return xk;
    }

    public int getYk() {
        return yk;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public int getCooldown() {
        return cooldown;
    }

    public int getCd() {
        return cd;
    }

    public BufferedImage getGambar() {
        return gambar;
    }

    public BufferedImage getGambar2() {
        return gambar2;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getGold() {
        return gold;
    }

    public int getScore() {
        return score;
    }

    public void gerak(){
        this.x-=this.speed;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public void mati(){
        this.hp = 0;
    }
    
    public void ketabrak(int x){
        this.hp-=x;
    }
    public abstract void gantiAnimasi();
}
