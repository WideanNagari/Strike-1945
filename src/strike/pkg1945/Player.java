/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.imageio.ImageIO;

/**
 *
 * @author TUF
 */
public class Player implements Serializable,animasi{
    protected int x,y,width,height,speed;
    protected int cooldown,cd;
    protected int animasi,animasiknalpot;
    protected int attack,defend,level,levell,chancemiss,maxhp,hp,skor,jumlahpeluru,gold;
    protected int xk,yk;
    protected int levelhp,levelattack,leveldefend;
    protected String jenispesawat;
    protected String nama;
    protected int jumEaglePotion,jumShieldofCrystal,jumMassiveSalve,jumSackofGold,jumAngelBox;
    protected int EaglePotion,ShieldofCrystal,SackofGold,AngelBox;
    protected int musuhTerbunuh, efek,mati,jumlahMusuh,bossKe;
    protected int posisiSave, retryChance, newp;
            
    public Player(String nama,int save) {
        this.posisiSave = save;
        this.bossKe = 1;
        this.nama = nama;
        this.x = 300;
        this.y = 440;
        this.width = 180;
        this.height = 140;
        this.animasi = 0;
        this.cooldown = 25;
        this.cd = 25;
        this.attack = 50;
        this.defend = 10;
        this.hp = 1500;
        this.level = 1;
        this.levell = 1;
        this.chancemiss = 5;
        this.maxhp = 1500;
        this.gold = 0;
        this.skor = 0;
        this.jumlahMusuh = 1;
        this.jumlahpeluru = 1;
        this.jumEaglePotion=0;this.jumShieldofCrystal=0;this.jumMassiveSalve=0;this.jumSackofGold=0;this.jumAngelBox=0;
        this.musuhTerbunuh = 0;
        this.efek = 0;
        this.mati = 0;
        this.retryChance = 0;this.newp = 1;
        this.EaglePotion = 0;this.ShieldofCrystal = 0;this.SackofGold = 0;this.AngelBox = 0;
        this.levelattack = 1; this.levelhp = 1; this.leveldefend = 1;
    }

    public int getNewp() {
        return newp;
    }

    public void setNewp(int newp) {
        this.newp = newp;
    }

    public int getRetryChance() {
        return retryChance;
    }

    public void setRetryChance(int retryChance) {
        this.retryChance = retryChance;
    }

    public void setPosisiSave(int posisiSave) {
        this.posisiSave = posisiSave;
    }

    public int getPosisiSave() {
        return posisiSave;
    }

    public int getBossKe() {
        return bossKe;
    }

    public void setBossKe(int bossKe) {
        this.bossKe = bossKe;
    }

    public int getEaglePotion() {
        return EaglePotion;
    }

    public void setEaglePotion(int EaglePotion) {
        this.EaglePotion = EaglePotion;
    }

    public int getShieldofCrystal() {
        return ShieldofCrystal;
    }

    public void setShieldofCrystal(int ShieldofCrystal) {
        this.ShieldofCrystal = ShieldofCrystal;
    }
    
    public int getSackofGold() {
        return SackofGold;
    }

    public void setSackofGold(int SackofGold) {
        this.SackofGold = SackofGold;
    }

    public int getAngelBox() {
        return AngelBox;
    }

    public void setAngelBox(int AngelBox) {
        this.AngelBox = AngelBox;
    }

    public int getJumlahMusuh() {
        return jumlahMusuh;
    }

    public void setJumlahMusuh(int jumlahMusuh) {
        this.jumlahMusuh = jumlahMusuh;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public void setJumlahpeluru(int jumlahpeluru) {
        this.jumlahpeluru = jumlahpeluru;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    public int getLevelhp() {
        return levelhp;
    }

    public void setLevelhp(int levelhp) {
        this.levelhp = levelhp;
    }

    public int getLevelattack() {
        return levelattack;
    }

    public void setLevelattack(int levelattack) {
        this.levelattack = levelattack;
    }

    public int getLeveldefend() {
        return leveldefend;
    }

    public void setLeveldefend(int leveldefend) {
        this.leveldefend = leveldefend;
    }

    public int getJumlahpeluru() {
        return jumlahpeluru;
    }

    public String getJenispesawat() {
        return jenispesawat;
    }

    public int getLevell() {
        return levell;
    }

    public void setLevell(int levell) {
        this.levell = levell;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMusuhTerbunuh() {
        return musuhTerbunuh;
    }

    public int getEfek() {
        return efek;
    }

    public void setEfek(int efek) {
        this.efek = efek;
    }
    
    public void setMusuhTerbunuh(int musuhTerbunuh) {
        this.musuhTerbunuh = musuhTerbunuh;
    }

    
    public int getDefend() {
        return defend;
    }

    public int getChancemiss() {
        return chancemiss;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public int getHp() {
        return hp;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public int getAttack() {
        return attack;
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

    public int getJumAngelBox() {
        return jumAngelBox;
    }

    public void setJumAngleBox(int jumAngelBox) {
        this.jumAngelBox = jumAngelBox;
    }

    public int getMati() {
        return mati;
    }

    public void setMati(int mati) {
        this.mati = mati;
    }

    public int getAnimasi() {
        return animasi;
    }
    
    @Override
    public BufferedImage gantiAnimasi(BufferedImage gambarKnalpot){
            if(this.animasi<3){
                this.animasi++;
            }else{
                this.animasi=0;
            }
            return gambarKnalpot;
    }
    @Override
    public BufferedImage ledak(BufferedImage gambarLedak){
            if (this.mati == 1) {
                this.animasi = 0;
            }
            if (this.animasi < 13) {
                this.animasi++;
                return gambarLedak;
            }else{
                return null;}
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
    
    public void ketabrak(int x){
        this.hp-=x;
    }
}