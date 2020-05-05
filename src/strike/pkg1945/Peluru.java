/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Jeffrey A
 */
public class Peluru extends Benda {
    public Peluru(int x, int y){
//        try{
//            this.gambar = ImageIO.read(new File("./asset/peluru.png"));
//        }catch(IOException ex){
//            ex.printStackTrace();
//        }
        this.x = x;
        this.y = y;
        this.width = 5;
        this.height = 10;
        this.speed = 1;
        this.nyawa = 1;
        this.durasiMati = 0;
    }
    
    @Override
    public void gerak(int arah) {
        this.x += this.speed;
    }

    @Override
    public void mati() {
        this.nyawa = 0;
    }
}
