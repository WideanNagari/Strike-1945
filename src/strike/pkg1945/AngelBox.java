/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strike.pkg1945;

/**
 *
 * @author Jeffrey A
 */
public class AngelBox {
    private int harga;
    public AngelBox(Enemy e,int attackEnemy, int defendEnemy) {
        this.harga = 2500;
        e.setDamage(attackEnemy/2);
        e.setHp(defendEnemy/2);
    }

    public int getHarga() {
        return harga;
    }
    
   
    
    
    
}
