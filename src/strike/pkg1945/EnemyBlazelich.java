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
 * @author Asus
 */
public class EnemyBlazelich extends Enemy{

    public EnemyBlazelich(int x, int y, int width, int height, int speed) {
        super(x, y, width, height, speed);
        try{
            this.gambar= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBlazelich.png"));
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        this.hp=150;
        this.damage=50;
        this.gold=50;
        this.score=1;
    }
    
}
