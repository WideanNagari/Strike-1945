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
public class PesawatThunderbold extends Player{
    
    public PesawatThunderbold(String nama, int a) {
        super(nama,a);
        this.jenispesawat = "Thunderbold P-47";
        this.xk = 150;
        this.yk = 10;
        this.speed = 20;
    }
    public void specialEffect(){
        this.gold+=20;
    }
}
