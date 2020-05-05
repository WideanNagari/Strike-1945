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
 * @author Jeffrey A
 */
public class Peluru {
    BufferedImage gambarP;
    BufferedImage gambarM;
    int x,y,width,height,speed;
    int animasi;
    int nyawa;
    int durasiMati;
    public Peluru(int x, int y){
        try{
            this.gambarM = ImageIO.read(new File("./Enemy/peluruM.png"));
            this.gambarP = ImageIO.read(new File("./Player/peluruP.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        this.x = x;
        this.y = y;
        this.width = 5;
        this.height = 10;
        this.speed = 1;
        this.nyawa = 1;
        this.durasiMati = 0;
    }
    
    public void gerakP() {
        this.x += this.speed;
    }
    
    public void gerakM(){
        this.x -= this.speed;
    }

    public void mati() {
        this.nyawa = 0;
    }
}
