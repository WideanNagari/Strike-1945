/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.imageio.ImageIO;

/**
 *
 * @author Asus
 */
public abstract class Enemy implements Serializable{
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
    public Enemy(){}
    public Enemy(int x, int y) {
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
    public abstract BufferedImage gantiAnimasi(BufferedImage g);
    public abstract BufferedImage ledak(BufferedImage g);
}
