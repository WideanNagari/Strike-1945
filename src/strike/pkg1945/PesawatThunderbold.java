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
    
    public PesawatThunderbold(String nama) {
        super(nama);
        this.jenispesawat = "Thunderbold P-47";
        gambarAnimasi = new BufferedImage[2];
        try{
            gambarAnimasi[0] = ImageIO.read(new File("./src/strike/pkg1945/Gambar/Pesawat 3.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        this.x=x;
        this.y=y;
        this.width = 64;
        this.height = 32;
        this.speed = 20;
        this.durasimati = 30;
        this.animasi = 0;
        this.gambar = gambarAnimasi[animasi];
    }
    
}
