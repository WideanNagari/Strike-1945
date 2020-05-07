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
 * @author Asus
 */
public class EnemyGlowstarKing extends Enemy{
    public EnemyGlowstarKing(){
        this.damage=80;
    }
    public EnemyGlowstarKing(int x, int y) {
        super(x, y);
        gambarKnalpot = new BufferedImage[4];
        try{
            this.gambar= ImageIO.read(new File("./src/strike/pkg1945/Gambar/EnemyGlowstarKing.png"));
            this.gambarKnalpot[0]=ImageIO.read(new File("./Enemy/Enemy2/Exhaust1/exhaust1.png"));
            this.gambarKnalpot[1]=ImageIO.read(new File("./Enemy/Enemy2/Exhaust1/exhaust2.png"));
            this.gambarKnalpot[2]=ImageIO.read(new File("./Enemy/Enemy2/Exhaust1/exhaust3.png"));
            this.gambarKnalpot[3]=ImageIO.read(new File("./Enemy/Enemy2/Exhaust1/exhaust4.png")); 
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        this.width = 180;
        this.height = 85;
        this.xk = 110;
        this.yk = -3;
        this.gambar2 = gambarKnalpot[0];
        this.animasi = 0;
        this.hp=200;
        this.damage=80;
        this.gold=75;
        this.score=2;
    }
    @Override
    public void gantiAnimasi(){
        if (this.hp > 0) {
            if(this.animasi<3){
                this.animasi++;
            }else{
                this.animasi=0;
            }
            this.gambar2=this.gambarKnalpot[this.animasi];
        }else{
            if (this.getMati() == 1) {
                this.animasi = 0;
            }
            if (this.animasi < 11) {
                this.animasi++;
                if (this.animasi<=10) {
                    this.gambar = this.gambarLedak[this.animasi];
                }
            }
        }
    }
}
