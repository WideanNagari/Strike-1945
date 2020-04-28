/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

/**
 *
 * @author TUF
 */
public abstract class Player {
    protected int attack = 50;
    protected int defend = 10;
    protected int level = 1;
    protected int chancemiss = 5;
    protected int hp = 1500;
    protected int maxhp = 1500;
    protected int skor = 0;
    protected int jumlahpeluru = 1;
    protected int gold = 0;
    protected int xPlayer;
    protected int yPlayer;
    protected String jenispesawat;
    protected String nama;

    public Player(String nama) {
        this.nama = nama;
    }
    
    public void gerak(String x){
        if (x.equalsIgnoreCase("w")) {
            this.yPlayer--;
        }else if (x.equalsIgnoreCase("a")) {
            this.xPlayer--;
        }else if (x.equalsIgnoreCase("s")) {
            this.xPlayer++;
        }else if (x.equalsIgnoreCase("d")) {
            this.yPlayer++;
        }
    }
}
