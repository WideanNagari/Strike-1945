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
        gambarKnalpot = new BufferedImage[4];
        try{
            this.gambar = ImageIO.read(new File("./Player/Pesawat 2.png"));
            this.gambarKnalpot[0] = ImageIO.read(new File("./Player/lockheed/lhapi1.png"));
            this.gambarKnalpot[1] = ImageIO.read(new File("./Player/lockheed/lhapi2.png"));
            this.gambarKnalpot[2] = ImageIO.read(new File("./Player/lockheed/lhapi3.png"));
            this.gambarKnalpot[3] = ImageIO.read(new File("./Player/lockheed/lhapi4.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        this.attack2 = this.attack;
        this.xk = 140;
        this.yk = 10;
        this.speed = 10;
        this.gambar2 = gambarKnalpot[animasi];
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
