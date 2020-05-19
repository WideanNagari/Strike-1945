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
        gambarKnalpot = new BufferedImage[4];
        try{
            this.gambar = ImageIO.read(new File("./Player/Pesawat 3.png"));
            this.gambarKnalpot[0] = ImageIO.read(new File("./Player/thunderbold/tbapi1.png"));
            this.gambarKnalpot[1] = ImageIO.read(new File("./Player/thunderbold/tbapi2.png"));
            this.gambarKnalpot[2] = ImageIO.read(new File("./Player/thunderbold/tbapi3.png"));
            this.gambarKnalpot[3] = ImageIO.read(new File("./Player/thunderbold/tbapi4.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        this.xk = 150;
        this.yk = 10;
        this.speed = 20;
        this.gambar2 = gambarKnalpot[animasi];
    }
    public void specialEffect(){
        this.gold+=20;
    }
}
