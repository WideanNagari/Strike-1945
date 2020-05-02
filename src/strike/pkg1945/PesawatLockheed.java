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
    
    public PesawatLockheed(String nama, int x, int y) {
        super(nama);
        this.jenispesawat = "Lockheed Martin F-35";
        gambarAnimasi = new BufferedImage[3];
        try{
            gambarAnimasi[0] = ImageIO.read(new File("./asset/player1.png"));
            gambarAnimasi[1] = ImageIO.read(new File("./asset/player2.png"));
            gambarAnimasi[2] = ImageIO.read(new File("./asset/duar.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        this.x=x;
        this.y=y;
        this.width = 64;
        this.height = 32;
        this.speed = 10;
        this.durasimati = 30;
        this.animasi = 0;
        this.gambar = gambarAnimasi[animasi];
    }
}
