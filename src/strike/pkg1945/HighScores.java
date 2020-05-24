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
public class HighScores<T1,T2> implements Serializable{
    private T1 nama;
    private T2 uang;
    private T2 skor;
    private T2 level;
    private T2 letak;

    public HighScores(T1 nama, T2 uang, T2 skor, T2 level, T2 letak) {
        this.nama = nama;
        this.uang = uang;
        this.skor = skor;
        this.level = level;
        this.letak = letak;
    }
    
    public T2 getLetak() {
        return letak;
    }

    public T1 getNama() {
        return nama;
    }

    public T2 getUang() {
        return uang;
    }

    public T2 getSkor() {
        return skor;
    }

    public T2 getLevel() {
        return level;
    }
    
}
