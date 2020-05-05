/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author TUF
 */
public class Player {
    BufferedImage gambarKnalpot[];
    BufferedImage gambarLedak[];
    BufferedImage gambar;
    BufferedImage gambar2;
    protected int x,y,width,height,speed;
    protected int cooldown;
    protected int cd;
    protected int animasi;
    protected int animasiknalpot;
    protected int durasimati;
    protected int attack = 50;
    protected int defend = 10;
    protected int level = 1;
    protected int chancemiss = 5;
    protected int hp = 1500;
    protected int maxhp = 1500;
    protected int skor = 0;
    protected int jumlahpeluru = 1;
    protected int gold = 0;
    protected int xk;
    protected int yk;
    protected String jenispesawat;
    protected String nama;
    protected int jumEaglePotion=0;
    protected int jumShieldofCrystal=0;
    protected int jumMassiveSalve=0;
    protected int jumSackofGold=0;
    protected int jumAngleBox=0;

    public Player(String nama) {
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
        this.nama = nama;
        this.x = 300;
        this.y = 440;
        this.width = 180;
        this.height = 140;
        this.durasimati = 30;
        this.animasi = 0;
        this.cooldown = 25;
        this.cd = 25;
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
    
    
    
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public BufferedImage getGambar() {
        return gambar;
    }

    public BufferedImage getGambar2() {
        return gambar2;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXk() {
        return xk;
    }

    public int getYk() {
        return yk;
    }

    public int getGold() {
        return gold;
    }

    public String getNama() {
        return nama;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getJumEaglePotion() {
        return jumEaglePotion;
    }

    public void setJumEaglePotion(int jumEaglePotion) {
        this.jumEaglePotion = jumEaglePotion;
    }

    public int getJumShieldofCrystal() {
        return jumShieldofCrystal;
    }

    public void setJumShieldofCrystal(int jumShieldofCrystal) {
        this.jumShieldofCrystal = jumShieldofCrystal;
    }

    public int getJumMassiveSalve() {
        return jumMassiveSalve;
    }

    public void setJumMassiveSalve(int jumMassiveSalve) {
        this.jumMassiveSalve = jumMassiveSalve;
    }

    public int getJumSackofGold() {
        return jumSackofGold;
    }

    public void setJumSackofGold(int jumSackofGold) {
        this.jumSackofGold = jumSackofGold;
    }

    public int getJumAngleBox() {
        return jumAngleBox;
    }

    public void setJumAngleBox(int jumAngleBox) {
        this.jumAngleBox = jumAngleBox;
    }
    
    public void gantiAnimasi(){
        if (this.hp <= 0) {
//            this.animasi =
        }else{
            if(animasi<3){
                this.animasi++;
            }else{
                this.animasi=0;
            }
        }
        this.gambar2=this.gambarKnalpot[this.animasi];
    }
    
    public void gerak(int arah) {
        if(arah == 0){
            //atas
            this.y -= this.speed;
        }if(arah == 1){
            //kanan
            this.x += this.speed;
        }if(arah == 2){
            //bawah
            this.y += this.speed;
        }if(arah == 3){
            //kiri
            this.x -= this.speed;
        }
    }

    public void mati() {
        this.hp = 0;
        this.animasi = 2;
//        this.gambar = ;
    }
    
    public void ketabrak(){
        this.hp--;
        if(this.hp <= 0){
            this.mati();
        }
    }
}