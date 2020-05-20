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
 * @author TUF
 */
public class PesawatLockheed extends Player{
    private int attack2;
    public PesawatLockheed(String nama, int a) {
        super(nama,a);
        this.jenispesawat = "Lockheed Martin F-35";
        this.attack2 = this.attack;
        this.xk = 140;
        this.yk = 10;
        this.speed = 10;
    }
    
    public int specialEffect(){
        if (this.efek>=3) {
            this.efek = 0;
            return 1;
        }else{
            return 0;
        }
    }
}
