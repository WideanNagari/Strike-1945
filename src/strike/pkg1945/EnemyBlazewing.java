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
public class EnemyBlazewing extends Enemy{
    public EnemyBlazewing(){
        this.damage=150;
    }
    public EnemyBlazewing(int x, int y) {
        super(x, y);
        this.width = 180;
        this.height = 100;
        this.xk = 110;
        this.yk = -10;
        this.animasi = 0;
        this.hp=300;
        this.damage=150;
        this.gold=150;
        this.score=5;
    }
    @Override
    public BufferedImage gantiAnimasi(BufferedImage gambarKnalpot){
            if(this.animasi<3){
                this.animasi++;
            }else{
                this.animasi=0;
            }
            return gambarKnalpot;
    }
    
    @Override
    public BufferedImage ledak(BufferedImage gambarLedak){
            if (this.mati == 1) {
                this.animasi = 0;
            }
            if (this.animasi < 11) {
                this.animasi++;
                return gambarLedak;
            }else{
                return null;}
    }
}
