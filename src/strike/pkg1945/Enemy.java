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
    public Enemy(int x, int y, int width, int height, int speed) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;       
    }    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAnimasi() {
        return animasi;
    }

    public void setAnimasi(int animasi) {
        this.animasi = animasi;
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
