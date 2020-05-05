/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

import java.awt.image.BufferedImage;

/**
 *
 * @author Jeffrey A
 */
public abstract class Benda {
        BufferedImage gambarAnimasi[];
    BufferedImage gambar;
    int x,y,width,height,speed;
    int animasi;
    int nyawa;
    int durasiMati;
    
    public abstract void gerak(int arah);
    public abstract void mati();
}
