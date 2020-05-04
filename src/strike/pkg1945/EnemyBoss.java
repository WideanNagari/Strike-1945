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
public class EnemyBoss extends Enemy{
    BufferedImage[] gambarAnimasi;
    Random r= new Random();
    
    public EnemyBoss(int hpPlayer, int x, int y){
        super(x, y);
        gambarAnimasi = new BufferedImage[4];
        try{
            this.gambarAnimasi[0]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss1.png"));
            this.gambarAnimasi[1]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss2.png"));
            this.gambarAnimasi[2]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss3.png"));
            this.gambarAnimasi[3]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss4.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        this.animasi = 0;
        this.gambar=gambarAnimasi[animasi];
        this.hp=hpPlayer*3;
        this.damage= r.nextInt(90)+10;
    }
    @Override
    public void gantiAnimasi(){
        if (this.hp <= 0) {
//            this.animasi =
        }else{
            if(animasi<3){
                this.animasi++;
            }else{
                this.animasi=0;
            }
        }
        this.gambar=this.gambarAnimasi[this.animasi];
    }
}
