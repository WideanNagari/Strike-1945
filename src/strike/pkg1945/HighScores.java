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
public class HighScores implements Serializable{
    String nama;
    int uang;
    int skor;
    int level;
    int letak;

    public HighScores(String nama, int uang, int skor, int level, int letak) {
        this.nama = nama;
        this.uang = uang;
        this.skor = skor;
        this.level = level;
        this.letak = letak;
    }
    
    public int getLetak() {
        return letak;
    }

    public String getNama() {
        return nama;
    }

    public int getUang() {
        return uang;
    }

    public int getSkor() {
        return skor;
    }

    public int getLevel() {
        return level;
    }
    
}
