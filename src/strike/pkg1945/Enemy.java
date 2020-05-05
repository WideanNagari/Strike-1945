/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.awt.image.BufferedImage;

/**
 *
 * @author Asus
 */
public abstract class Enemy {   
    BufferedImage gambar;
    BufferedImage gambar2;
    BufferedImage[] gambarKnalpot;
    protected int x,y,width,height,speed;
    protected int hp;
    protected int damage;
    protected int gold;
    protected int score;
    protected int animasi;
    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 200;
        this.height = 160;
        this.speed = 1;       
    }    

    public BufferedImage getGambar() {
        return gambar;
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
    
    public void mati() {
        this.hp = 0;
        this.animasi = 2;
//        this.gambar = this.gambarAnimasi[this.animasi];
    }
    
    public void ketabrak(){
        this.hp--;
        if(this.hp <= 0){
            this.mati();
        }
    }
    public abstract void gantiAnimasi();
}
