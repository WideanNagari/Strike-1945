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
public class PesawatNorthtrop extends Player{
    
    public PesawatNorthtrop(String nama,int a) {
        super(nama,a);
        this.jenispesawat = "Northtrop F-5";
        this.xk = 157;
        this.yk = 10;
        this.speed = 15;
    }
    public void specialEffect(){
        if (this.efek>=5) {
            this.hp+=200;
            if (this.hp>this.maxhp) {
                this.hp = this.maxhp;
            }
            this.efek = 0;
        }
    }
}
