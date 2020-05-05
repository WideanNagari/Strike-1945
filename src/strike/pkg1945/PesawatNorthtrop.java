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
    
    public PesawatNorthtrop(String nama) {
        super(nama);
        this.jenispesawat = "Northtrop F-5";
        gambarKnalpot = new BufferedImage[4];
        try{
            this.gambar = ImageIO.read(new File("./Player/Pesawat 1.png"));
            this.gambarKnalpot[0] = ImageIO.read(new File("./Player/northtrop/ntapi1.png"));
            this.gambarKnalpot[1] = ImageIO.read(new File("./Player/northtrop/ntapi2.png"));
            this.gambarKnalpot[2] = ImageIO.read(new File("./Player/northtrop/ntapi3.png"));
            this.gambarKnalpot[3] = ImageIO.read(new File("./Player/northtrop/ntapi4.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        this.xk = 157;
        this.yk = 10;
        this.speed = 15;
        this.gambar2 = gambarKnalpot[animasi];
    }
    
}
