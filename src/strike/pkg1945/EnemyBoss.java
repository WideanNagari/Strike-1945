/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author Asus
 */
public class EnemyBoss {
    BufferedImage gambar;    
    Random r= new Random();
    protected int x,y,width,height,speed;
    protected int hp;
    protected int attack;
    
    public EnemyBoss(int hpPlayer){
        try{
            this.gambar= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss1.png"));
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        this.hp=hpPlayer*3;
        this.attack= r.nextInt(90)+10;
    }
}
