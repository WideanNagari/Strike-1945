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
        this.width = 180;
        this.height = 85;
        this.xk = 110;
        this.yk = -3;
        this.animasi = 0;
        this.hp=200;
        this.damage=80;
        this.gold=75;
        this.score=2;
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
