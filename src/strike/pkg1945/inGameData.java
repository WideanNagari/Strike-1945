/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Widean Nagari
 */
public class inGameData implements Serializable{
    private ArrayList<Enemy> e;
    private EnemyBoss boss;
    private int count, ctr, ctrm,ctrm2,ctrboss,ctrjlabel2;
    private int eagle,angel,shield,sack;
    private boolean playing;
    public inGameData() {
        this.e = new ArrayList();
        this.boss = null;
        this.eagle = 0;this.angel = 0;this.shield = 0;this.sack = 0;
        this.playing = false;
        this.count = 3;this.ctrm = 5;this.ctrboss = 0;this.ctrm2 = 5;
        this.ctr = 0;this.ctrjlabel2 = 0;
    }

    public int getCtr() {
        return ctr;
    }

    public void setCtr(int ctr) {
        this.ctr = ctr;
    }

    public int getCtrjlabel2() {
        return ctrjlabel2;
    }

    public void setCtrjlabel2(int ctrjlabel2) {
        this.ctrjlabel2 = ctrjlabel2;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCtrm() {
        return ctrm;
    }

    public void setCtrm(int ctrm) {
        this.ctrm = ctrm;
    }

    public int getCtrm2() {
        return ctrm2;
    }

    public void setCtrm2(int ctrm2) {
        this.ctrm2 = ctrm2;
    }

    public int getCtrboss() {
        return ctrboss;
    }

    public void setCtrboss(int ctrboss) {
        this.ctrboss = ctrboss;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public int getEagle() {
        return eagle;
    }

    public int getAngel() {
        return angel;
    }

    public int getShield() {
        return shield;
    }

    public int getSack() {
        return sack;
    }

    public void setEagle(int eagle) {
        this.eagle = eagle;
    }

    public void setAngel(int angel) {
        this.angel = angel;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public void setSack(int sack) {
        this.sack = sack;
    }

    public EnemyBoss getBoss() {
        return boss;
    }

    public void setBoss(EnemyBoss boss) {
        this.boss = boss;
    }

    public ArrayList<Enemy> getE() {
        return e;
    }

    public void setE(ArrayList<Enemy> e) {
        this.e = e;
    }
    
}
