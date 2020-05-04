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
    BufferedImage[] gambarAnimasi;
    Random r= new Random();
    protected int x,y,width,height,speed;
    protected int hp;
    protected int attack;
    protected int ctrGantiAnimasi=0;
    
    public EnemyBoss(int hpPlayer){
        try{
            this.gambarAnimasi[0]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss1.png"));
            this.gambarAnimasi[1]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss2.png"));
            this.gambarAnimasi[2]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss3.png"));
            this.gambarAnimasi[3]= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyBoss4.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        this.gambar=gantiAnimasi(gambar);
        this.hp=hpPlayer*3;
        this.attack= r.nextInt(90)+10;
    }
    public BufferedImage gantiAnimasi(BufferedImage gambar){
        if(ctrGantiAnimasi<3){
            gambar=gambarAnimasi[ctrGantiAnimasi];
            ctrGantiAnimasi++;
        }else{
            ctrGantiAnimasi=0;
            gambar=gambarAnimasi[0];
        }
        return gambar;
    }
}
