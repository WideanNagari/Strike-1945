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
    private BufferedImage gambarP;
    private BufferedImage gambarM;
    private BufferedImage gambarB;
    private int x,y,width,height,speed,speedm;
    private int animasi;
    private int hp;
    public Peluru(int x, int y){
        try{
            this.gambarM = ImageIO.read(new File("./Enemy/peluruM.png"));
            this.gambarP = ImageIO.read(new File("./Player/peluruP.png"));
            this.gambarB = ImageIO.read(new File("./Enemy/peluruB.png"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        this.x = x;
        this.y = y;
        this.width = 70;
        this.height = 35;
        this.speed = 2;
        this.speedm = 3;
        this.hp = 1;
    }

    public BufferedImage getGambarB() {
        return gambarB;
    }
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public BufferedImage getGambarP() {
        return gambarP;
    }

    public BufferedImage getGambarM() {
        return gambarM;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getSpeed() {
        return speed;
    }
    
    public void gerakP() {
        this.x += this.speed;
    }
    
    public void gerakM(){
        this.x -= this.speed;
    }
    
    public void gerakB(){
        this.x -= this.speedm;
    }

}
